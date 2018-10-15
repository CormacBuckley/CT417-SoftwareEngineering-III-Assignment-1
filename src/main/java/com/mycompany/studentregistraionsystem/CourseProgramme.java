/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.studentregistraionsystem;
import java.util.ArrayList;
import org.joda.time.DateTime;


/**
 *
 * @author I342042
 */
public class CourseProgramme {
    private String Name;
    private ArrayList Modules = new ArrayList();
    private DateTime StartDate;
    private DateTime EndDate;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public ArrayList getModules() {
        return Modules;
    }

    public void setModules(String Modules) {
        this.Modules.add(Modules);
    }

    public DateTime getStartDate() {
        return StartDate;
    }

    public void setStartDate(DateTime StartDate) {
        this.StartDate = StartDate;
    }

    public DateTime getEndDate() {
        return EndDate;
    }

    public void setEndDate(DateTime EndDate) {
        this.EndDate = EndDate;
    }
}
