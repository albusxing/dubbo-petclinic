package com.dobby.petclinic.web;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
public class LoginController {

    @RequestMapping(value = "/500")
    public String error500() {
        return "error/500";
    }

    @RequestMapping(value = "/404")
    public String error404() {
        return "error/404";
    }


}
