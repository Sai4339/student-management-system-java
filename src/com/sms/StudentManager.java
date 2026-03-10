package com.sms;
import java.util.Collections;
import java.util.Comparator;
import java.util.ArrayList;
public class StudentManager {
    ArrayList<Student> students=new ArrayList<>();
    private final String FILE_NAME="students.txt";
    public void addStudents(Student student) {
        for(Student s:students){
            if(s.getId()==student.getId()){
                System.out.println("Student already exist!");
                return;
            }
        }
        students.add(student);
        System.out.println("Student added Successfully!!");
    }
    public void displayStudents(){
        if(students.isEmpty()){
            System.out.println("No Students found!");
            return;
        }
        for(Student s:students){
            System.out.println(s);
        }
    }
    public void searchStudent(int id){
        for(Student s:students){
            if(s.getId()==id) {
                System.out.println(s);
                break;
            }
        }
        System.out.println("Student not found!");
    }
    public void deleteStudent(int id){
        for(Student s:students){
            if(s.getId()==id) {
                students.remove(s);
                System.out.println("Student deleted Successfully!!");
                return;
            }
        }
        System.out.println("Student not found");
    }
    public void updateStudent(int id,String name,int age,String course){
        for(Student s:students){
            if(s.getId()==id){
                s.setName(name);
                s.setAge(age);
                s.setCourse(course);
                System.out.println("Students Updated Successfully!!");
                return;
            }
            System.out.println("Student not found!");
        }
    }
    public void totalStudents(){
        System.out.println("Total Students: "+students.size());
    }
    public void sortStudentsByName(){
        Collections.sort(students,Comparator.comparing(Student::getName));
        System.out.println("Students sorted successfully!");
    }

}
