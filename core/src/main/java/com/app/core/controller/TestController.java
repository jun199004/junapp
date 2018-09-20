package com.app.core.controller;

import com.app.comm.helper.CommMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.text.SimpleDateFormat;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("data")
    public String getdate(){
        Date d= CommMethod.getCurDate();
        SimpleDateFormat df=new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        return "当前时间："+df.format(d);
    }
}
