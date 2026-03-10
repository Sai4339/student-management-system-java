package com.sms;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StudentManager sm=new StudentManager();
        while(true) {
            System.out.println("\n-----Student Management System-----\n");
            System.out.println("1. Add Student \n");
            System.out.println("2. Display Student \n");
            System.out.println("3. Search Student \n");
            System.out.println("4. Delete Student \n");
            System.out.println("5. Update Students \n");
            System.out.println("6. Total Students \n");
            System.out.println("7 Sort Students By Name \n");
            System.out.println("8. Exiting... \n");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Student Name: ");
                    String name = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter Student Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Student Course: ");
                    String course = sc.nextLine();
                    Student s = new Student(id, name, age, course);
                    sm.addStudents(s);
                    break;
                case 2:
                    sm.displayStudents();
                    break;
                case 3:
                    System.out.println("Enter Search ID: ");
                    int sid = sc.nextInt();
                    sm.searchStudent(sid);
                    break;
                case 4:
                    System.out.println("Enter Student ID to delete: ");
                    int did = sc.nextInt();
                    sm.deleteStudent(did);
                    break;
                case 5:
                    System.out.println("Enter Student ID: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Student Name: ");
                    String uname = sc.nextLine();
                    sc.nextLine();
                    System.out.println("Enter Student Age: ");
                    int uage = sc.nextInt();
                    sc.nextLine();
                    System.out.println("Enter Student Course: ");
                    String ucourse = sc.nextLine();
                    sm.updateStudent(uid,uname,uage,ucourse);
                    break;
                case 6:
                    sm.totalStudents();
                    break;
                case 7:
                    sm.sortStudentsByName();
                    break;
                case 8:
                    System.out.println("Exiting... \n");
                    return;
                default:
                    System.out.println("Enter valid Choice: ");
            }
        }
    }
}
