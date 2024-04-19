package com.example.hobbycare.home;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {

        String title = "타이틀";
        String content = "내용";

        model.addAttribute("title", title);
        model.addAttribute("content", content);
        return "index";
    }
}
