package com.company.sarvil_api;
public class Topics{
  private String id;
  private String name;
  private String desc;
  public Topics(String id, String name, String desc){
    this.id=id;
    this.name=name;
    this.desc=desc;
  }
  public String getId(){
    return id;
  }
  public String getName(){
    return name;
  }
  public String getDesc(){
    return desc;
  }
}

