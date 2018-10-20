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
    private ArrayList<Module> Modules = new ArrayList<Module>();
    private DateTime StartDate;
    private DateTime EndDate;

    public CourseProgramme(String Name,Module Modules, DateTime StartDate, DateTime EndDate) {
        this.Name = Name;
        this.Modules.add(Modules);
        this.StartDate = StartDate;
        this.EndDate = EndDate;
    }

  

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Module[] getModules() {
        Module[] res = new Module[Modules.size()];
        for(int i = 0; i < Modules.size(); i++){
            res[i] = Modules.get(i);
        }
        return res;
    }

    public void setModules(Module[] Modules) {
        for(int i = 0; i < Modules.length; i++){
        this.Modules.add(Modules[i]);
                }
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
