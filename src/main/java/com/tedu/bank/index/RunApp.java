package com.tedu.bank.index;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class RunApp {
    @RequestMapping("index")
        public int login_in(){
            return 123213;
        }
}
