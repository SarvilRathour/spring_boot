package com.company.sarvil_api;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
@Service
public class TopicsService{
  private List<Topics> topics=new ArrayList<>(
      Arrays.asList(
          new Topics("101","Spring","heljfal"),
          new Topics("102","Tick","kahdsfk;ajdf;ka")
          
      )  
    );
    public List<Topics> getTopic(){
        return topics;
    }
    public Topics getTopicById(String id){
        return topics.stream().filter(t->t.getId().equals(id)).findFirst().orElse(null);
        // if(op.isPresent()){
                
        // }
    }
}
