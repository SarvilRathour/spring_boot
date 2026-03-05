package com.company.sarvil_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Sarvil API ";
    }
    // @GetMapping("/user")
    // public JSONObject users(){
    //     return new JSONObject("{'aa':'bb'}");
    // }
}
