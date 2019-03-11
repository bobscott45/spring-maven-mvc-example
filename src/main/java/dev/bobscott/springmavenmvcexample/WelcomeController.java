package dev.bobscott.springmavenmvcexample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

    @RequestMapping("showform")
    public String showForm() {
        return "helloForm";
    }

    @RequestMapping("processform")
    public String processForm() {
        return "welcomePage";
    }
}
