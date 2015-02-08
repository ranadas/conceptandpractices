package com.rdas.webappinit.utils;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by rdas on 08/02/2015.
 */
@Component
public class DateUtils {

    public Date getDate(String string) {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm");
        if (StringUtils.isNotBlank(string)) {
            DateTime dt = formatter.parseDateTime(string);
            return dt.toDate();
        } else {
            return new Date();
        }
    }

    public Map<String, String> getDateWithString() {
        DateTime dateTime = new DateTime();
        DateTimeFormatter formatter = DateTimeFormat.forPattern("M|d|yyyy(hh:mm)");
        Map<String, String> list = Maps.newConcurrentMap();
        list.put("dateString", formatter.print(dateTime.getMillis()));
        return list;
    }

    public DateTime getDate() {
        DateTime dateTime = new DateTime();
        DateTimeFormatter formatter = DateTimeFormat.forPattern("M|d|yyyy(hh:mm)");
        //return formatter.print(dateTime.getMillis());
        return dateTime;
    }
}
