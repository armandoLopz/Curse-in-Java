package abstracsclass;

public class supervisor extends vendedor {

    private String nombre, apellido, cargo;
    private int salario,edad, bonificacionsupervisor;
    private double comisionsupervision;
    
    public supervisor(String nombre, String apellido, String cargo , int edad, int salario){

        super( nombre, apellido, cargo, edad, salario);

        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.edad = edad;
        this.salario = salario;

        comisionsupervision = 0.025;
        bonificacionsupervisor = 3000;

        if (edad >80) {

            System.out.println("Su edad es invalida");
            
        }

        if (salario != 350) {

            System.out.println("Su salario es invalido");
            
        }

        if (this.cargo.equalsIgnoreCase("supervisor") == false) {
            
            System.out.println("El cargo es invalido, ingrese su cargo correctamente");
        }
    }

    public int bonificacion(){

        return bonificacionsupervisor;
    }

    public int pagomensual( int montoventasproductos){

        double comisionporventas = comisionsupervision*montoventasproductos;

        return this.salario + this.bonificacionsupervisor + (int)Math.round(comisionporventas);
    }

    public String datospersona(){

        return "Mi nombre es " + nombre + " " + apellido + ", tengo " + edad + " de edad";
    }

    
}
