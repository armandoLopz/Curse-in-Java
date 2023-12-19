package test.UniversityActivities.empleado;

public class Main {
    
    public static void main(String[] args) {
        
        empleado empleado1 = new empleado("Armando", "Lopez",1050);
        empleado empleado2 = new empleado("Juan", "Perez", 2000);

        System.out.println("Salario empleado1: " + empleado1.getSalary());
        System.out.println("Salario empleado2: " + empleado2.getSalary());

        System.out.println("Salarios despues de aumento del 10%: ");

        System.out.println("Salario final empleado1: " + empleado1.salaryWithIncrease());
        System.out.println("Salario final empleado2: " + empleado2.salaryWithIncrease());

        System.out.println("Monto del aumento:\nEmpleado1: " + empleado1.getAmountIncreaseSalary() + "\nEmpleado2: " + empleado2.getAmountIncreaseSalary());
    }
}
