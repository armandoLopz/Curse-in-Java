package test.DataStr.linkedlist;

public class students extends person{

    enum levelStudy{highSchool, secondary , university};

    private String name,lastName,nameSchool, levelStudy;
    private int age,yearStudy; 
    
    public students(String name, String lastName, int age, String nameSchool, int levelStudy){

        super(name, lastName, age);

        //Atributtes to superclass
        this.name = name;
        this.lastName = lastName;
        this.age = age;

        //Atributtes reference in this class

        this.levelStudy = levelStudy;
        this.nameSchool = nameSchool;
        
    }
}
