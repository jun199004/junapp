package com.app.loginsvr.controller;


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
        return "loginsvr当前时间："+df.format(d);
        //ssh-rsa AAAAB3NzaC1yc2EAAAADAQABAAABAQDJzOf/Gmqj2ZHbxyRLnun7qgGbMHVP4pW/dkXjPt+eSmdFmANkFx2FvCP7quZSo4cGnQcPaXeaGdkDXFUz9kVrJqVgcDe6mwjBo6J3O4yC9vqCbInPMeZZ5UxpVAAK2r2Jjw2L4+VetGvFkjcxqtVS1U+ykFArBo+XgmAV/fhmU5NYoPboGbi2tyZUGhYFAmIWXXDd6QMl3VFLzqVk/qpIcQTP53UfWST5qL3vJZl7MkKPQsZzWBi1eQLUQZAU/ezAdhHml1Fed1CJvz17V8JiLrJG/kg+nTbSumkwaIgv5M4dcDww5rAlxIqQqYyUMFtQPuqHBbdXN9RF9ZMXjQwd
    }
}

