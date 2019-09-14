package com.my.controller;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.List;
import java.util.UUID;

/**
 * 文件上传的控制器类
 *
 * @author gjq
 * @create 2019-09-13-15:19
 */
@Controller
@RequestMapping("/fileupload")
public class FileUploadController {


    /**
     * 传统的文件上传
     *
     * @return
     */
    @RequestMapping("/fileUpload1")
    public String fileUpload1(HttpServletRequest request) throws Exception {
        System.out.println("fileUpload1方法执行");
        //使用fileupload组件完成文件的上传
        //指定上传的位置
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        //判断该路径是否存在
        File file = new File(path);
        if (!file.exists()) {
            //该路径不存在，创建该文件夹
            file.mkdirs();
        }
        //解析request对象，获取文件上传项
        // 创建磁盘文件项工厂
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload upload = new ServletFileUpload(factory);
        //解析request
        List<FileItem> items = upload.parseRequest(request);
        for (FileItem item : items) {
            //进行判断，判断当前item对象是否是上传文件项
            if (item.isFormField()) {
                //说明是普通文件项
            } else {
                //说明是上传文件项
                //获取上传文件的名称
                String filename = item.getName();
                //把文件的名称设置成唯一的值
                String uuid = UUID.randomUUID().toString().replace("-", "");
                filename = uuid + "_" + filename;
                //完成文件上传
                item.write(new File(path, filename));
                //删除临时文件
                item.delete();

            }
        }
        return "success";
    }

    /**
     * Springmvc的文件上传
     *
     * @return
     */
    @RequestMapping("/fileUpload2")
    public String fileUpload2(HttpServletRequest request, MultipartFile upload) throws Exception {
        System.out.println("fileUpload2方法执行");
        //使用fileupload组件完成文件的上传
        //指定上传的位置
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        //判断该路径是否存在
        File file = new File(path);
        if (!file.exists()) {
            //该路径不存在，创建该文件夹
            file.mkdirs();
        }
        //说明是上传文件项
        //获取上传文件的名称
        String filename = upload.getOriginalFilename();
        //把文件的名称设置成唯一的值
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid + "_" + filename;
        //完成文件上传
        upload.transferTo(new File(path, filename));

        return "success";
    }


    /**
     * 跨服务器的文件上传
     *
     * @return
     */
    @RequestMapping("/fileUpload3")
    public String fileUpload3(MultipartFile upload) throws Exception {
        System.out.println("fileUpload3方法执行");

        //定义上传文件服务器的路径
        String path = "http://localhost:9090/fileUploadServer/uploads/";

        //说明是上传文件项
        //获取上传文件的名称
        String filename = upload.getOriginalFilename();
        //把文件的名称设置成唯一的值
        String uuid = UUID.randomUUID().toString().replace("-", "");
        filename = uuid + "_" + filename;
        //完成文件上传，跨服务器上传

        //创建客户端的对象
        Client client = Client.create();
        //和文件服务器进行连接
        WebResource webResource = client.resource(path + filename);
        //上传文件
        webResource.put(upload.getBytes());

        return "success";
    }


}
