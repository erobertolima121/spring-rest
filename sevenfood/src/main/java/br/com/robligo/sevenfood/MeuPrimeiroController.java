package br.com.robligo.sevenfood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeiroController {

    @RequestMapping("/hello")
    @ResponseBody
    public String helloWorld() {
        return "Hello World Caroline Cassamatta";
    }
}
