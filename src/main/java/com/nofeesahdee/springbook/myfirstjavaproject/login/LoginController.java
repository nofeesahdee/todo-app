package com.nofeesahdee.springbook.myfirstjavaproject.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * LoginController
 */
@Controller
public class LoginController {

    @RequestMapping(value="login", method = RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value="login", method = RequestMethod.POST)
    public String welcome(@RequestParam String name, 
        @RequestParam String password, 
        ModelMap model) {
            model.put("name", name);
            model.put("password", password);
        return "welcome";
    }
}