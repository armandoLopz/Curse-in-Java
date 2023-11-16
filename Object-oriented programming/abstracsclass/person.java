package abstracsclass;

public class person {

    private String nombre,apellido;

    private int edad;

    public person(String nombre, String apellido, int edad ){

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }

    // GETTERS

    public String nombrepersona(){

        return nombre + " " + apellido;
    }

    public int edadpersona(){

        return edad;
    }

    public String datospersona(){

        return "Mi nombre es " + nombre + " " + apellido + " y tengo " + edad + " años de " + edad;
    }
}
