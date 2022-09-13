package com.example.dataapp.Entity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {
    private String userDate;

    public Data(String userDate) {
        this.userDate = userDate;
    }

    public Data() {
    }

    public String getUserDate() {
        return userDate;
    }

    public void setUserDate(String userDate) {
        this.userDate = userDate;
    }


}
