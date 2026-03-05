package com.company.sarvil_api;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloController {
    private List<Topics> topics=new ArrayList<>(
      Arrays.asList(
          new Topics("101","Spring","heljfal"),
          new Topics("102","Tick","kahdsfk;ajdf;ka")
          
      )  
    );
    @GetMapping("/")
    public String home() {
        return "Sarvil API ";
    }
    @GetMapping("/topics")
    public List<Topics> getTopic(){
        return topics;
    }
    @GetMapping("/topic/{id}")
    public Topics getTopicById(@PathVariable String id){
        return topics.stream().filter(t->t.getId().equals(id)).findFirst().orElse(null);
    }
    // @GetMapping("/user")
    // public JSONObject users(){
    //     return new JSONObject("{'aa':'bb'}");
    // }
}
