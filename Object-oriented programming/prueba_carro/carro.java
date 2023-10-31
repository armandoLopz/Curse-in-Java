package prueba_carro;
import java.util.*;


public class carro {
    
    public int costo_carro;
    public int decision_comprador;

    public void efectuar_compra() {

        System.out.println("El costo total de vehiculo es igual a ");
    }

    public static void main(String[] args) {
        
        chasis mazda = new chasis();
        pago procesopago = new pago();

        Scanner sc = new Scanner(System.in);

        int costo_carro = 2000;
        int decision_comprador = 100;
        String moneda = "$";

        System.out.println("Bienvenido a tu carro ideal por favor proporcionanos los siguientes datos");

        System.out.println("Indiquenos su nombre y apellido");

        String nombre_comprador = sc.nextLine();

        System.out.println("Indiquenos su edad por favor");
        
        int edad_comprador = sc.nextInt();

        if (edad_comprador<18) {

            System.out.println("Lo sentimos no tiene la edad sufiicente para solicitar nuestros sevicios, feliz día");

            System.exit(1);
        
        }else{

            System.out.println(mazda.infocarro());
            System.out.println(nombre_comprador + ", el carro sin modificaciones saldría con un costo de: " + costo_carro + moneda);

            do {
                
                System.out.println("Si desea realizar modificaciones pulse 1 o si no desea realizarlas pulse 2");
                
                decision_comprador = sc.nextInt();

            } while(decision_comprador == 1 &&  decision_comprador == 0);
            
        }

        int asientos_cuero = 0; int audio_estereo = 0 ; int cauchos_tuneados = 0 ; int modificaciones;
        
       if (decision_comprador == 1) {
           System.out.println("Las modificaciones que están disponibles para realizarle al vehículo son: ");
           System.out.println(" Opción 1: Asientos de cuero, Costo: 20"+ moneda + "\n Opción 2: Audio estereo, Costo: 10" + moneda + "\n Opción 3: Cauchos tuneados, Costo 10" + moneda +
           "\n Opción 4: Realizar todas las modificaciones mecionadas anteriormente (asientos de cuero, audio estereo, cauchos tuneados), costo total del paquete de modificaciones: 40"+ moneda);
        
                 modificaciones = sc.nextInt();

           if (modificaciones == 1) {

            // INICIO DEL CODIGO CON LA OPCION DE LOS ASIENTOS DE CUERO COMO PRIMERA OPCION

            System.out.println("Usted ha seleccionado implementar asientos de cuero al vehiculo"); asientos_cuero+=20;

            System.out.println("Si desea realizar las modificaciones del audio estereo y los cauchos tuneados pulse 3 " + 
            "\n Si desea realizar solo una de las modificaciones que quedan disponibles pulse 4 y si no desea realizar más modificaciones pulse 0");

            modificaciones = sc.nextInt();

            switch (modificaciones) {
                case 3: System.out.println("Usted ha escogido realizar todas las modificaciones"); cauchos_tuneados+=10; audio_estereo+=10;
                
                        System.out.println("El costo total del vehiculo será de: " + procesopago.compra(costo_carro, asientos_cuero, audio_estereo, cauchos_tuneados));
                    break;

                case 4: System.out.println("Seleccione 1 si desea realizar la modificación del audio estereo y 2 si desea realizar la modificación de los cauchos tuneados");
                
                        int modificacion_individual = sc.nextInt();

                        if (modificacion_individual == 1) {
                            audio_estereo+=10;
                            System.out.println("Las modificaciones que se van a realizar serán: \n Implementación de asientos de cuero y audio estereo");
                            System.out.println("El costo total del vehiculo sera de: " + procesopago.compra(costo_carro, asientos_cuero, audio_estereo) + moneda);
                        
                        }else if (modificacion_individual == 2) {

                            cauchos_tuneados+=10;
                            System.out.println("Las modificaciones que se van a realizar serán: \n Implementación de asientos de cuero y se van a tunear los cauchos del automovil");
                            System.out.println("El costo total del vehiculo será de: " + procesopago.compra(costo_carro, asientos_cuero, cauchos_tuneados) + moneda);
                        }
                            break;

                case 0: System.out.println("El costo total del vehiculo será de: " + procesopago.compra(costo_carro, asientos_cuero));

                    break;
              
                 default: System.out.println("Seleccione una opción correcta");           
                    break;}  // CULMINACION DEL CODIGO CON LA OPCION DE LOS ASIENTOS DE CUERO
                    
                    } else if(modificaciones == 2){ //  INICIALIZACION DEL CODIGO CON LA OPCION DE 2 (AUDIO ESTEREO)

                System.out.println("Usted ha seleccionado implementar el audio estereo al vehiculo"); audio_estereo+=10;
    
                System.out.println("Si desea realizar las modificaciones de los asientos de cuero y los cauchos tuneados pulse 3 " + 
                "\n Si desea realizar solo una de las modificaciones que quedan disponibles pulse 4 y si no desea realizar más modificaciones pulse 0");
    
                     modificaciones = sc.nextInt();

                     switch (modificaciones) {

                        case 3:  System.out.println("Usted ha escogido realizar todas las modificaciones"); cauchos_tuneados+=10; asientos_cuero+=20;
                
                        System.out.println("El costo total del vehiculo será de: " + procesopago.compra(costo_carro, asientos_cuero, audio_estereo, cauchos_tuneados));
                            break;

                        case 4: System.out.println("Seleccione 1 si desea realizar la modificación de los asientos de cuero y 2 si desea realizar la modificación de los cauchos tuneados");
                                
                         int modificacion_individual = sc.nextInt();

                         if (modificacion_individual == 1) {
                            asientos_cuero+=20;
                            System.out.println("Las modificaciones que se van a realizar serán: \n Implementación de asientos de cuero y audio estereo");
                            System.out.println("El costo total del vehiculo sera de: " + procesopago.compra(costo_carro, asientos_cuero, audio_estereo) + moneda);
                            
                        }else if(modificacion_individual == 2) {

                            cauchos_tuneados+=10;
                            System.out.println("Las modificaciones que se van a realizar serán: \n Implementación de los audios estereos y se van a tunear los cauchos del automovil");
                            System.out.println("El costo total del vehiculo será de: " + procesopago.compra(costo_carro, asientos_cuero, cauchos_tuneados) + moneda);
                        }
                            break;

                        case 0: System.out.println("El costo total del vehiculo será de: " + procesopago.compra(costo_carro, audio_estereo));

                             break;
                     
                        default: System.out.println("Seleccione una opción correcta");  
                            break;}//CULMINACIÓN DEL CODIGO CON LA SEGUNDA OPCIÓN 

                    }else if (modificaciones == 3) { //INICIALIZACIÓN DEL CÓDIGO CON LA 3ERA OPCIÓN (Cauchos tuneados)
                        
                        System.out.println("Usted ha seleccionado implementar la modificación de los cauchos tuneados al vehiculo"); cauchos_tuneados+=10;

                        System.out.println("Si desea realizar las modificaciones de los asientos de cuero y el audio estereo pulse 3 " + 
                        "\n Si desea realizar solo una de las modificaciones que quedan disponibles pulse 4 y si no desea realizar más modificaciones pulse 0");
                     
                        modificaciones = sc.nextInt();

                        switch (modificaciones) {
                            case 3: System.out.println("Usted ha escogido realizar todas las modificaciones"); asientos_cuero+=20; audio_estereo+=10;
                
                            System.out.println("El costo total del vehiculo será de: " + procesopago.compra(costo_carro, asientos_cuero, audio_estereo, cauchos_tuneados));
                                break;

                            case 4:  System.out.println("Seleccione 1 si desea realizar la modificación de los asientos de cuero y 2 si desea realizar la modificación del audio estereo");
                                
                            int modificacion_individual = sc.nextInt();

                        if (modificacion_individual == 1) {
                            asientos_cuero+=20;
                            System.out.println("Las modificaciones que se van a realizar serán: \n Implementación de asientos de cuero y audio estereo");
                            System.out.println("El costo total del vehiculo sera de: " + procesopago.compra(costo_carro, asientos_cuero, audio_estereo) + moneda);
                            
                        }else if(modificacion_individual == 2) {

                            audio_estereo+=10;
                            System.out.println("Las modificaciones que se van a realizar serán: \n Implementación de los audios estereos y se van a tunear los cauchos del automovil");
                            System.out.println("El costo total del vehiculo será de: " + procesopago.compra(costo_carro, cauchos_tuneados, audio_estereo) + moneda);
                        }
                            break;

                            case 0: System.out.println("El costo total del vehiculo será de: " + procesopago.compra(costo_carro, cauchos_tuneados));

                            break;
                        
                            default: System.out.println("Seleccione una opción correcta");  
                                break;} //CULMINACIÓN DEL CÓDIGO CON LA 3ERA OPCIÓN (CAUCHOS TUNEADOS)
                            
                        }else if (modificaciones == 4) {

                            asientos_cuero+=20;audio_estereo+=10;cauchos_tuneados+=10;

                            System.out.println("****Paquete completo de modificaciones encargado****");
                            System.out.println("El costo total del vehiculo será de: " + procesopago.compra(costo_carro, asientos_cuero, audio_estereo, cauchos_tuneados));
                        }else{
                            System.out.println("Intentenlo de nuevo y seleccione una opción correcta");
                        }
                    
                    } else if (decision_comprador == 2){
            
                 System.out.println("El resultado de su compra es: "+ procesopago.compra1(costo_carro));
            
            }else{

            System.out.println("Seleccione una opción correcta y intentelo de nuevo");

        }

        sc.close();
    }}