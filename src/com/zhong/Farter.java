package com.zhong;

public class Farter {
    protected  String name;
    protected  Integer age;

    public Farter(){

    }

    Farter(String name,Integer age){
        this.name = name;
        this.age  = age;
    }
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void say(){
        System.out.print("say");
    }
}
