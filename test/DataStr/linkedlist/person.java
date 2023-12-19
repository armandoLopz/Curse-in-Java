package test.DataStr.linkedlist;

public class person {

    private String name,lastName;
    private int age, heigth;
    private final String cm;

    public person(String nombre, String lastName, int edad){

        // Inicialization var in the construct

        this.name = nombre;
        this.lastName = lastName;
        this.age = edad;

        //Declation const atributte

        cm = "cm";

    }

    //Abstract methods

    public String getPersonalInformation(){

        return "Mi nombre es " + name + " " + lastName + ", tengo " + age + " años de edad";
    
    }

    public String getPhysicInformation(){

        return "Mido " + heigth + " " + cm ;
    }
    
}
