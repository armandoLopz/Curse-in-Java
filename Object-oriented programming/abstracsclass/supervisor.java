package abstracsclass;

public class supervisor extends vendedor {

    private String nombre, apellido, cargo;
    int salario,edad,bonificaciongeneral;
    double comisionventavendedor;
    
    public supervisor(String nombre, String apellido, String cargo , int edad, int salario){

        super( nombre, apellido, cargo, edad, salario);

        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.edad = edad;
        this.salario = salario;

        double comisionventavendedor = 0.025;
        bonificaciongeneral = 3000;
    }

    public int bonificacion(){

        return bonificaciongeneral;
    }

    
}
