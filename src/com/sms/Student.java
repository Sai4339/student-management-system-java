package com.sms;

public class Student {
    private int id;
    private String name;
    private int age;
    private String course;
    public Student(int id,String name,int age,String course){
        this.id=id;
        this.name=name;
        this.age=age;
        this.course=course;
    }
    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public String getCourse(){
        return course;
    }
    public int setId(int id){
        this.id=id;
        return id;
    }
    public String setName(String name){
        this.name=name;
        return name;
    }
    public int setAge(int age){
        this.age=age;
        return age;
    }
    public String setCourse(String course){
        this.course=course;
        return course;
    }
    @Override
    public String toString(){
        return "Id: "+id+", Name: "+name+", Age: "+age+", Course:"+course;
    }
}
