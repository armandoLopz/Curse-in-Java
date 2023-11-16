package abstracsclass;

import java.util.Arrays;
import java.util.Scanner;

import abstracsclass.method_interfaces.gerente_interfaz;
import abstracsclass.notisapersonal.cliente;
import abstracsclass.notisapersonal.provedor;

public class Main {

    enum tallaproductos{ XS,S , M, L, XL };
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        

        tallaproductos [] ListTalls = tallaproductos.values();

        // Instancia de los objetos empleados

        //Instancia de objetos de tipo vendedor

        empleado vendedor1 = new vendedor("Armando", "Lopez", "Vendedor", 22, 200);

        empleado vendedor2 = new vendedor("Ricardo", "Garcia", "Vendedor", 42, 200);
       
        //Instancia de objeto de tipo supervisor

        empleado supervisor1 = new supervisor("Juan" , "Gonzales" , "Supervisor", 46, 350);

        //Instancia de objeto de tipo Gerente 

        empleado gerente1 = new gerente("Armando","Apellido", "Gerente" , 57 , 450);


        // Instancia de los objetos not is a personal 

        //Instancia del objeto cliente 
 
        person cliente1 = new cliente("Pedro", "Ramos" , 24);
        
        //Instancia del objeto provedor

        person provedor1 = new provedor("Juan" , "Dos Santos" , 37 , "Vidralven"); 

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

            // CREACION DE LA MATRIZ PARA EL USAR EL MOTODO SORT

            empleado [] misempleados = new empleado[4];

            // COMPLETACION DE LA MATRIZ 

            misempleados[0] = gerente1;
            misempleados[1] = vendedor2;
            misempleados[2] = vendedor1;
            misempleados[3] = supervisor1;


            // USO DEL METODO SORT PARA ORDENAR LOS SALARIOS
            
            Arrays.sort(misempleados);

            for (empleado miseEmpleado : misempleados) {

                System.out.println(miseEmpleado.datosempresa());
                
            }

            System.out.println("----------------------------------------------------");

            System.out.println("Comprobacion de la instancia de los tipos empleados de la tienda:");


            System.out.println((vendedor1 instanceof empleado)? "Instancia de la clase empleado": "No instancia de la clase empleado");
            System.out.println((vendedor2 instanceof empleado)? "Instancia de la clase empleado": "No instancia de la clase empleado");

            System.out.println((supervisor1 instanceof empleado)? "Instancia de la clase empleado": "No instancia de la clase empleado");

            System.out.println((gerente1 instanceof empleado)?"Instancia de la clase empleado": "No instancia de la clase empleado");

            System.out.println("Comprobacion de la instancia de los tipos not is a personal");

            System.out.println((provedor1 instanceof empleado)? "Instancia de la clase empleado": "No instancia de la clase empleado" );
            System.out.println((cliente1 instanceof empleado)? "Instancia de la clase empleado " : "No instancia de la clase empleado");
    
            System.out.println("_________________________________________");

            gerente_interfaz aplicaciondelmetodo = (gerente_interfaz)gerente1;

            System.out.println(aplicaciondelmetodo.despedir(vendedor1.nombrepersona(), vendedor1.dimecargo()));

            gerente gerente2 = new gerente("Armando", "Lopez", "Gerente", 35,450);

            System.out.println(gerente2.despedir(vendedor2.nombrepersona(), vendedor2.dimecargo()));
            
            
    }
    
}
