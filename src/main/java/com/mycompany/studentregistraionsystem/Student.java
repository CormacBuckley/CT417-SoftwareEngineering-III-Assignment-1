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
public class Student {
    private String Name;
    private int Age;
    private String DOB;
    private String ID;
    private String Username;
    private ArrayList Courses = new ArrayList();

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUsername() {
        this.Username = this.Name + this.Age;
        return Username;
    }

    public ArrayList getCourses() {
        return Courses;
    }

    public void setCourses(String Courses) {
        this.Courses.add(Courses);
    }
    
    
}
