package com.gihub.netroforge.opentelemetry_inspector.controller;

import com.gihub.netroforge.opentelemetry_inspector.controller.model.Contact;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class IndexController {

    @GetMapping("/")
    public String overview(Model model) {
        model.addAttribute("now", new Date());
        model.addAttribute("contact", new Contact(
                "test1",
                "test2",
                "test3"
        ));
        return "index";
    }

}
