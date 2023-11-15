package abstracsclass;

public abstract class person {

    private String nombre,apellido;

    private int edad;

    public person(String nombre, String apellido, int edad ){

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }

    public abstract String datospersona();
}
