package abstracsclass;

import abstracsclass.method_interfaces.vendedor_interfaz;

public class vendedor extends empleado implements vendedor_interfaz {

    private String nombre,apellido, cargo;

     int salario, edad, bonificacionvendedor;

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
            salario = 200;

            System.out.println("El salario asignado para su cargo es de " + salario);
            
        }

        if (this.cargo.equalsIgnoreCase("vendedor") == false) {
            
            System.out.println("El cargo es invalido, ingrese su cargo correctamente");
            this.cargo = "Vendedor";
        }
     
        bonificacionvendedor = 2000;
        bonificacionventa = 0.05;

    }

    // USO METODO DE LA INTERFAZ EMPLEADO

    public String atendercliente(){

        return "Un vendedor esta atendiendo a un cliente";

    }


    //USO METODOS ABSTRACTOS DE LA CLASE EMPLEADO
    
    public int bonificacion(){

        return bonificacionvendedor;
    }

    public double bonificacionventas(int precioproducto){

        double bonificacionabonar = bonificacionventa * precioproducto;

        return bonificacionabonar;
    }

    public int pagomensual(int montoventasproductos){

        double comisionporventas = bonificacionventa* montoventasproductos;

        return this.salario + this.bonificacionvendedor + (int)Math.round(comisionporventas);
    }

    public String datospersona(){

        return "Mi nombre es " + nombre + " " + apellido + ", tengo " + edad + " de edad";
    }

    //Getters

} 
