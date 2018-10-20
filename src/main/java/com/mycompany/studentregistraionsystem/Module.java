/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.studentregistraionsystem;

import java.util.ArrayList;

/**
 *
 * @author I342042
 */
public class Module {
    private String Name;
    private ArrayList<Student> Students = new ArrayList<Student>();
    private ArrayList Courses = new ArrayList();

    public Module(String Name,ArrayList<Student> Students,ArrayList Courses ) {
        this.Name = Name;
        this.Students = Students;
        this.Courses = Courses;
    }

    
   

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList getStudents() {
        return Students;
    }

    public void setStudents(Student name) {
        Students.add(name);
    }

    public ArrayList getCourses() {
        return Courses;
    }

    public void setCourses(String Courses) {
        this.Courses.add(Courses);
    }
    
}
