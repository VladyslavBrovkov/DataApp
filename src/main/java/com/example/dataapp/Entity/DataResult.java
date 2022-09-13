package com.example.dataapp.Entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DataResult {
    private int daysBeforeNewYear;

    public DataResult(int daysBeforeNewYear) {
        this.daysBeforeNewYear = daysBeforeNewYear;
    }

    public DataResult() {
    }

    public int getDaysBeforeNewYear() {
        return daysBeforeNewYear;
    }

    public void setDaysBeforeNewYear(int daysBeforeNewYear) {
        this.daysBeforeNewYear = daysBeforeNewYear;
    }

    public int nDaysBetweenTwoDate(String date) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date firstDate = null;
        Date secondDate = null;
        try {
            firstDate = df.parse(date);
            secondDate = df.parse("2023-01-01");
        } catch (Exception e) {
            System.out.println("Mistake Format");
        }
        int nDay = (int) ((secondDate.getTime() - firstDate.getTime()) / (24 * 60 * 60 * 1000));
        return nDay;
    }
}

