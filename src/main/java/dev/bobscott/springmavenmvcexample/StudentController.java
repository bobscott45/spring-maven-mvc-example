package dev.bobscott.springmavenmvcexample;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/showform")
    public String showForm(Model model) {

        model.addAttribute(new Student());
        return "studentForm";

    }

    @RequestMapping("/processform")
    public String processForm(@ModelAttribute("student") Student student) {
        return "studentConfirmation";
    }
}
