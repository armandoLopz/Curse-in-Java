package abstracsclass;

public class gerente extends empleado{
    
    private String nombre, apellido, cargo;
    int salario,edad;
    
    public gerente(String nombre, String apellido, String cargo , int edad, int salario){

        super( nombre, apellido, cargo, edad, salario);

        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.edad = edad;
        this.salario = salario;
    }

    


    
}
