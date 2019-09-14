package com.my.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 把字符串转换为日期格式
 *
 * @author gjq
 * @create 2019-09-10-13:44
 */
public class StringToDateConverter implements Converter<String, Date> {


    /**
     * @param source 传入进来的字符串
     * @return
     */
    @Override
    public Date convert(String source) {

        //判断
        if (source == null) {
            throw new RuntimeException("请输入数据");
        }
        DateFormat ds = new SimpleDateFormat("yyyy-MM-dd");

        try {
            //把字符串转换为日期
            return ds.parse(source);
        } catch (Exception e) {
            throw new RuntimeException("数据类型转换异常");
        }
    }
}
