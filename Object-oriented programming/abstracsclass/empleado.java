package abstracsclass;

public abstract class empleado extends person implements Comparable{

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

    // Metodo Comparable To de la interfaz
    
    public int compareTo(Object Objeto){

        empleado diferentesempleados = (empleado)Objeto;

        if (this.sueldo < diferentesempleados.sueldo) {

            return -1;
        }else if (this.sueldo > diferentesempleados.sueldo) {
            
            return 1 ;
        }

        return 0;
    }

    //Metodos abstractos 

    // Agregar diferentes cosas en los metodos para que se pueda visualizar la abstraccion

    public abstract int bonificacion();

    public abstract int pagomensual(int montototalproductos);

    public abstract double bonificacionventas(int precioproducto);

    public String datosempresa(){

        return "Mi cargo es " + cargo + " y mi sueldo es de " + sueldo;
    }

    // GETTERS 

    public String dimecargo(){

        return cargo;
    }

    public String retornosueldo(){

        return "El sueldo mensual es de " + sueldo;
    }
}
