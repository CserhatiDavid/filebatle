/*
* File: MainController.java
* Author: Cserháti Dávid
* Copyright: 2023, Cserháti Dávid
* Group: Szoft 2
* Date: 2023-10-05
* Github: -
* Licenc: GNU GPL
*/
package controllers;

import java.util.ArrayList;

import modells.Employee;
import modells.FileReader;
import modells.Tasks;
import views.MainConsole;

public class MainController {
    public void mainController(){
        ArrayList<Employee>loadedList=new FileReader().loadData();
        new Tasks().EmployeeSummSalary(loadedList);
        new MainConsole().showData(loadedList);
    }
}
