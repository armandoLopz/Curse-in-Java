package abstracsclass;

public class vendedor extends empleado {

    private String nombre,apellido, cargo;

    private int salario, edad, bonificaciongeneral ;

    private double bonificacionventa;

    public vendedor(String nombre, String apellido ,String cargo, int edad , int sueldo){

        super(nombre, apellido,cargo, edad, sueldo);


        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.edad = edad;
        salario = sueldo;

        if (edad >70) {

            System.out.println("Su edad es invalida");
            
        }

        if (salario != 200) {

            System.out.println("Su salario es invalido");
            
        }

        if (this.cargo.equalsIgnoreCase("vendedor") == false) {
            
            System.out.println("El cargo es invalido, ingrese su cargo correctamente");
        }
     
        bonificaciongeneral = 2000;
        bonificacionventa = 0.05;
        salario = 200;

    }

    //USO METODOS ABSTRACTOS

    public String datosempresa(){

        return "Mi cargo es " + cargo + " y mi sueldo es de " + salario;
    }
    
    public int bonificacion(){

        return bonificaciongeneral;
    }

    public double bonificacionventas(int precioproducto){

        double bonificacionabonar = bonificacionventa * precioproducto;

        return bonificacionabonar;
    }

    //Getters

    public String retornosueldo(){

        return "El sueldo mensual es de " + salario;
    }

    public String dimenombre(){

        return nombre;
    }

    public String dimecargo(){

        return this.cargo;
    }
} 
