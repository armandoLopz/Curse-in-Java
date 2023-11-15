package abstracsclass.notisapersonal;

import abstracsclass.person;

public class cliente extends person{

    private String nombre, apellido;
    private int edad;

    public cliente(String nombre, String apellido, int edad){

        super(nombre, apellido, edad);

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }

    public String datospersona(){

        return "Mi nombre es " + nombre + " " + apellido + ", tengo " + edad + " de edad";
    }

    
    
}
