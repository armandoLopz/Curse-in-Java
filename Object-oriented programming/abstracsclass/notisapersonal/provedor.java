package abstracsclass.notisapersonal;

import abstracsclass.person;

public class provedor extends person{

    private String nombre, apellido, empresa;
    private int edad;

    public provedor(String nombre, String apellido, int edad, String empresa){

        super(nombre, apellido, edad);
    
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.empresa = empresa;
    
    }

    //Getters 

    public String identifacacionprovedor(){

        return "Mi nombre es " + nombre + " " + apellido + ", vengo de la empresa " + empresa;
    }

    public String datospersona(){

        return "Mi nombre es " + nombre + " " + apellido + ", tengo " + edad + " de edad";
    }
    
}
