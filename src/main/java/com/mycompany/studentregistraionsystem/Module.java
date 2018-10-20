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
    private ArrayList<CourseProgramme> Courses = new ArrayList<CourseProgramme>();

    public Module(String Name,Student Students,CourseProgramme Courses ) {
        this.Name = Name;
        this.Students.add(Students);
        this.Courses.add(Courses);
    }

    
   

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Student[] getStudents() {
        Student[] res = new Student[Students.size()];
        for(int i = 0; i < Students.size(); i++){
            res[i] = Students.get(i);
        }
        return res;
    }

    public void setStudents(Student[] stud) {
        for(int i = 0; i < stud.length; i++){
        this.Students.add(stud[i]);
                }
    }

    public CourseProgramme[] getCourses() {
         CourseProgramme[] res = new CourseProgramme[Courses.size()];
        for(int i = 0; i < Courses.size(); i++){
            res[i] = Courses.get(i);
        }
        return res;
    }

    public void setCourses(CourseProgramme[] cp) {
         for(int i = 0; i < cp.length; i++){
        this.Courses.add(cp[i]);
                }
    }
    
}
