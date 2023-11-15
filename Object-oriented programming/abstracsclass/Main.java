package abstracsclass;

import java.util.Scanner;

import abstracsclass.notisapersonal.cliente;
import abstracsclass.notisapersonal.provedor;

public class Main {

    enum tallaproductos{ XS,S , M, L, XL };
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        tallaproductos [] ListTalls = tallaproductos.values();

        // Instancia de los objetos empleados

        //Instancia de objetos de tipo vendedor

        vendedor vendedor1 = new vendedor("Armando", "Lopez", "Vendedor", 22, 200);
        vendedor vendedor2 = new vendedor("Ricardo", "Garcia", "Vendedor", 42, 200);
        
        //Instancia de objeto de tipo supervisor

        supervisor supervisor1 = new supervisor("Juan" , "Gonzales" , "Supervisor", 46, 350);

        //Instancia de objeto de tipo Gerente 

        gerente gerente1 = new gerente("Armando","Apellido", "Gerente" , 57 , 450);


        // Instancia de los objetos not is a personal 

        //Instancia del objeto cliente 
 
        cliente cliente1 = new cliente("Pedro", "Ramos" , 24);
        
        //Instancia del objeto provedor

        provedor provedor1 = new provedor("Juan" , "Dos Santos" , 37 , "Vidralven"); 

        //Cantidad pago nomina

        System.out.println("Pago nomina: Vendedor1: " + vendedor1.pagomensual(2000) + ", vendedor 2: " + vendedor2.pagomensual(2240));

        System.out.println("La bonificacion del vendedor es igual a " + vendedor1.bonificacion() + ", la bonificacion del gerente es igual a " + gerente1.bonificacion());
        

        System.out.println(gerente1.datosempresa());

        System.out.println(vendedor1.datosempresa());

        System.out.println(supervisor1.datosempresa());


        System.out.println("Nuestras tallas disponibles son : ");

        int NumberTall = 1;

        for (int i = 0; i < ListTalls.length; i++) {
            
            System.out.println("Numero " + NumberTall + ": talla " +  ListTalls[i]);

            NumberTall++;
        }

        System.out.println("Seleccione su numero de talla");

        int SelectTall = sc.nextInt();

        switch (SelectTall) {

            case 1:

                System.out.println("Seleccionaste la talla " + ListTalls[0]);
                
                break;
        
            case 2:

                System.out.println("Seleccionaste la talla " + ListTalls[1]);
                break;

            case 3:

                System.out.println("Seleccionaste la talla " + ListTalls[2]);
                break;

            case 4:

                System.out.println("Seleccionaste la talla " + ListTalls[3]);
                break;

            case 5:

                System.out.println("Seleccionaste la talla " + ListTalls[4]);
                break;

            default: System.out.println("Ingrese una talla correcta");
                break;
        }
    }
    
}
