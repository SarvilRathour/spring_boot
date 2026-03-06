package com.company.sarvil_api;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

// import org.springframework.web.bind.annotation.Autowi;
@RestController
public class HelloController {
    @Autowired
    TopicsService topicService;
    @GetMapping("/")
    public String home() {
        return "Sarvil API ";
    }
    @GetMapping("/topics")
    public List<Topics> getTopic(){
        return topicService.getTopic();
    }
    @GetMapping("/topic/{id}")
    public Topics getTopicById(@PathVariable String id){
        return topicService.getTopicById(id);
    }
    // @GetMapping("/user")
    // public JSONObject users(){
    //     return new JSONObject("{'aa':'bb'}");
    // }
}
