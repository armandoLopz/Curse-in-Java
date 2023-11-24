package test.DataStr.linkedlist;

public class teachers extends person{

    private String name, lastname, asignature, nameCollege;
    private int age, yearsExperience;

    public teachers(String name, String lastName, int age, String nameCollege, String asignature){

        super(name, lastName, age);

        this.name  = name;
        this.lastname = lastName;
        this.age = age;
        this.nameCollege = nameCollege;
        this.asignature = asignature;
    }
}
