/*
* File: Tasks.java
* Author: Cserháti Dávid
* Copyright: 2023, Cserháti Dávid
* Group: Szoft 2
* Date: 2023-10-05
* Github: -
* Licenc: GNU GPL
*/
package modells;

import java.util.ArrayList;

public class Tasks {
    public int EmployeeSummSalary(ArrayList<Employee>empArray) {
        int sumSalary=0;
        for(Employee emp:empArray){
            sumSalary+=emp.getSalary();
        };
        return sumSalary;
    }
    public String LessSalaryThan10k(ArrayList<Employee>empArray) {
        String lessThan10kNames="";
        for(Employee emp:empArray){
            if (emp.getSalary() < 10000) {
                lessThan10kNames+=emp.getName();
            }
        };
        return lessThan10kNames;
    }
    public String LessThan100kHomes() {
        String lessThan100kHomes="";
        for(Employee emp:empArray){
            if (emp.getSalary()<100000) {
                lessThan100kHomes+=emp.getAddress();
            }
        };
        return lessThan100kHomes;
    }
    
}
