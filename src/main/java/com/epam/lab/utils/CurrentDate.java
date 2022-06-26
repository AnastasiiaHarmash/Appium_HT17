package com.epam.lab.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDate {

    public String getCurrentDateAndTime() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dateTimeFormatter.format(now);
    }
}
