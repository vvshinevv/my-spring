package my.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloUiController {

    @GetMapping("")
    public String hello() {
        return "/WEB-INF/hello.jsp";
    }
}
