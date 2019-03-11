package dev.bobscott.springmavenmvcexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

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

    @RequestMapping("processformv2")
    public String processFormv2(HttpServletRequest request, Model model) {
        String theName = request.getParameter("studentName");
        model.addAttribute("theName", theName.toUpperCase());
        return "welcomePage";
    }
}
