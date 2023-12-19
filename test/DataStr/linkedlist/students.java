package test.DataStr.linkedlist;

import exercise_polygon.Objects.father.sons.rectangule;

public class students extends person{

    private String name,lastName,nameSchool, levelStudy;
    private int age,yearStudy; 
    
    public students(String name, String lastName, int age, String nameSchool, String levelStudy){

        super(name, lastName, age);

        //Atributtes to superclass
        this.name = name;
        this.lastName = lastName;
        this.age = age;

        //Atributtes reference in this class

        this.levelStudy = levelStudy;
        this.nameSchool = nameSchool;
        
    }

    //GETTERS

    public String informationStudent(){

        return "Veo clases en " + nameSchool + " estoy cursando " + levelStudy + " y llevo estudiando " + yearStudy;
    }
}
