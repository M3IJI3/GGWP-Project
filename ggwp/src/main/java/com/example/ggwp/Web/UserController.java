package com.example.ggwp.Web;

import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
@AllArgsConstructor
public class UserController {
    @GetMapping(path = "/")
    public String InitialPage(Model model)
    {
        return "welcome";
    }
}
