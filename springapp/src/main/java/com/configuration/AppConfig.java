package com.examly.springapp.configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Scanner;

import com.examly.springapp.Student;
public class AppConfig {
    public Student student(){
        Student student=new Student();
        Scanner input=new Scanner(System.in);
        int stdentId=input.nextInt();
        String firstName=input.nextLine();
        
        String lastName=input.nextLine();
        student.setstdentId(stdentId);
        student.setfirstName(firstName);
        student.setlastName(lastName);
        return student;

    }
}
