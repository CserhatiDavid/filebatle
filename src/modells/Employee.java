/*
* File: Employee.java
* Author: Cserháti Dávid
* Copyright: 2023, Cserháti Dávid
* Group: Szoft 2
* Date: 2023-10-05
* Github: -
* Licenc: GNU GPL
*/
package modells;

public class Employee {
    String name;
    String city;
    String address;
    String birth;
    int salary;
    public String getName() {
        return name;
    }
    public String getCity() {
        return city;
    }
    public String getAddress() {
        return address;
    }
    public String getBirth() {
        return birth;
    }
    public int getSalary() {
        return salary;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setBirth(String birth) {
        this.birth = birth;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
