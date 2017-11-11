package com.aniu.msg.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Home {
    @ResponseBody
    @GetMapping(value = "/rpc/a", produces = "application/json")
    public String managerIndex(Model model) {
        return "Hello";
    }
}
