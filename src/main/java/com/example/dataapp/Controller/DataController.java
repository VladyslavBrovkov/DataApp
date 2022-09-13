package com.example.dataapp.Controller;

import com.example.dataapp.Entity.Data;
import com.example.dataapp.Entity.DataResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataController {

    @PostMapping("/sendTime")
    public DataResult shorten(@RequestBody Data data) {
        String time = data.getUserDate();
        var result = new DataResult();
        result.setDaysBeforeNewYear(result.nDaysBetweenTwoDate(time));
        return result;
    }
}
