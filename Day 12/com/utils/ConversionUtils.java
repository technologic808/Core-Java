package com.utils;

import static java.time.LocalDate.*;

import java.time.LocalDate;

public class ConversionUtils {
    public static LocalDate stringToDate(String dateString) {
        return parse(dateString);
    }
}