package com.example.kamil.androidlogger;

import android.widget.TextView;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Logger {
    private static String logsText = "";
    private static StringBuilder stringBuilder = new StringBuilder(logsText);

    public static void addLog(String text) {
        stringBuilder.append(getCurrentDate());
        stringBuilder.append(" | ");
        stringBuilder.append(text);
        stringBuilder.append("\n");
    }

    public static void logsToTextView(TextView textView){
        textView.setText(stringBuilder.toString());
    }

    private static String getCurrentDate(){
        String string = "";
        Date date = new Date();
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(date);
        string = calendar.get(Calendar.HOUR_OF_DAY)
                + ":" + calendar.get(Calendar.MINUTE)
                + ":" + calendar.get(Calendar.SECOND);

        return string;
    }
}
