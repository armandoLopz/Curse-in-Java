package abstracsclass;

public abstract class empleado extends person{

    private String nombre, apellido, cargo;
    private int sueldo, edad;

    public empleado(String nombre, String apellido , String cargo, int edad, int sueldo ){
        
        super(nombre, apellido, edad);

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.cargo = cargo;
        this.sueldo = sueldo;
        
    }

    //Metodos abstractos 

    public abstract int bonificacion();

    public abstract int pagomensual(int montototalproductos);

    public abstract double bonificacionventas(int precioproducto);

    public String datosempresa(){

        return "Mi cargo es " + cargo + " y mi sueldo es de " + sueldo;
    }
}
