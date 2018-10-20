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
    private ArrayList<CourseProgramme> Courses;

    public Student(String Name, int Age, String DOB, String ID, ArrayList<CourseProgramme> Course) {
        this.Name = Name;
        this.Age = Age;
        this.DOB = DOB;
        this.ID = ID;
        this.Username = Username;
        this.Courses = Course;
    }
    
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

    public String[] getCourses() {
        String[] output = new String[Courses.size()];
        for(int i = 0; i < Courses.size(); i++){
            output[i] = Courses.get(i).toString();
        }
       return output; 
    }

    public void setCourses(CourseProgramme Courses) {
        this.Courses.add(Courses);
    }
    
    
}
