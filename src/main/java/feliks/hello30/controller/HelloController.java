package feliks.hello30.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    @RequestMapping("/api")
    public String hello(){
        return "hello";
    }
}
