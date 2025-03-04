package com.gihub.netroforge.opentelemetry_inspector.controller;

import com.gihub.netroforge.opentelemetry_inspector.controller.model.Contact;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@Controller
@RequestMapping("/public/inspect-traces")
public class InspectTracesController {

    @GetMapping
    public String start(Model model) {
        model.addAttribute("contact", new Contact("test1", "test2", "test3"));
        model.addAttribute("now", new Date().toInstant());

        return "inspect-traces";
    }

    @PostMapping("/edit/{id}")
    public String editForm(Contact contact, Model model, @PathVariable String id) {
        model.addAttribute("contact", contact);
        model.addAttribute("id", id);
        return "inspect-traces-form";
    }

    @PostMapping("/commit")
    public String editPost(Contact contact, Model model) {
        model.addAttribute("contact", contact);
        return "inspect-traces-default";
    }

}
