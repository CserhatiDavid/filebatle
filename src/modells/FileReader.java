/*
* File: FileReader.java
* Author: Cserháti Dávid
* Copyright: 2023, Cserháti Dávid
* Group: Szoft 2
* Date: 2023-10-05
* Github: -
* Licenc: GNU GPL
*/
package modells;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {
    final String fileName="filbt.txt";
    public ArrayList<Employee>empArray=new ArrayList<>();

    public ArrayList<Employee> loadData() {
        try {
            tryLoadData();
        }
        catch (FileNotFoundException e) {
            System.err.println("File nem található!");   
            System.err.println(e.getMessage());   
        }
        return this.empArray;
    }
    
    public void tryLoadData() throws FileNotFoundException {
        
        File file=new File(fileName);
        Scanner sc=new Scanner(file,"utf-8");

        while (sc.hasNextLine()) {
            String line=sc.nextLine();
            String[]lineArray=line.split(":");
            
            Employee emp=new Employee();
            emp.setName(lineArray[0]);
            emp.setCity(lineArray[1]);
            emp.setAddress(lineArray[2]);
            // emp.setBirth(LocalDate.parse(lineArray[3]));
            emp.setBirth(lineArray[3]);
            emp.setSalary(Integer.parseInt(lineArray[4]));
            this.empArray.add(emp);
            // System.out.println(empArray);
        }
        sc.close();
        
    }
}
