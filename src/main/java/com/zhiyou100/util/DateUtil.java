package com.zhiyou100.util;

import ch.qos.logback.core.net.SyslogOutputStream;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

    /**
     * 返回String类型的时间
     * @return
     */
    public static String getDate(String regex){
        //获取当前时间
        Date date = new Date();
        //格式化
        SimpleDateFormat dateFormat = new SimpleDateFormat(regex);
        String time = dateFormat.format(date);
        return time;
    }

}

