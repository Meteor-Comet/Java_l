package com.util;

import com.静态.Student;

import java.util.ArrayList;

public class StudentUtil {
    private StudentUtil() {}

    public static int getMaxAge(ArrayList<Student>  students) {
        int maxAge = students.get(0).getAge();
        for(Student s : students){
            if(s.getAge() > maxAge){
                maxAge = s.getAge();
            }
        }
        return maxAge;
    }
}
