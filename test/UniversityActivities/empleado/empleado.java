package test.UniversityActivities.empleado;

import exercise_polygon.Objects.father.sons.rectangule;

public class empleado {
    
    private String name,lastName;
    private double salary;

    public empleado(String name, String lastName, double salary){

        this.name = name;
        this.lastName = lastName;
        this.salary = salary;

        if (this.salary < 0) {

            this.salary = 0;
            
        }
    }

    // SETTERS 

    public void setName(String name){

        this.name = name;
    }

    public void setLastName(String lastName){

        this.lastName = lastName;
    }
    
    public void setSalary(double salary){

        this.salary = salary;
    }

    //GETTERS

    public String getName(){

        return name;
    }

    public String getLastname(){

        return lastName;
    }

    public double getSalary(){

        return salary;
    }

    public double getAmountIncreaseSalary(){

        return salary*0.10;
    }

    //Methods

    public double salaryWithIncrease(){

        double increase = salary*0.10;

        return salary+increase;
    }
    
}
