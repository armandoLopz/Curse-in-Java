package abstracsclass;

public class gerente extends supervisor{
    
    private String nombre, apellido, cargo;
    private int salario,edad, bonificaciongerente;
    private double comisionporventatienda;
    
    public gerente(String nombre, String apellido, String cargo , int edad, int salario){

        super( nombre, apellido, cargo, edad, salario);

        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.edad = edad;
        this.salario = salario;

        comisionporventatienda = 0.030;
        bonificaciongerente = 4250;

        if (edad >80) {

            System.out.println("Su edad es invalida");
            
        }

        if (salario != 450) {

            System.out.println("Su salario es invalido");
            this.salario = 450;
            
        }

        if (this.cargo.equalsIgnoreCase("gerente") == false) {
            
            System.out.println("El cargo es invalido, ingrese su cargo correctamente");
        }
    }

    // Metodo abstracto de la clase empleado 

    public int pagomensual(int montoventasproductos){

        double comisionporventas = comisionporventatienda*montoventasproductos;

        return this.salario + this.bonificaciongerente + (int)Math.round(comisionporventas);
    }

    //Metodo abstracto de la clase persona 
    
    public String datospersona(){

        return "Mi nombre es " + nombre + " " + apellido + ", tengo " + edad + " de edad";
    }

    // Getters 

    public int bonificaciongerente(){

        return bonificaciongerente;
    }

    public int salariogerente(){

        return salario;
    }

    public double comisionventasgerente(){

        return comisionporventatienda;
    }

}
