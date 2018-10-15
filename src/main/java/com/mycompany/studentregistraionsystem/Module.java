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
    private ArrayList Students = new ArrayList();
    private ArrayList Courses = new ArrayList();

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList getStudents() {
        return Students;
    }

    public void setStudents(String name) {
        Students.add(name);
    }

    public ArrayList getCourses() {
        return Courses;
    }

    public void setCourses(String Courses) {
        this.Courses.add(Courses);
    }
    
}
