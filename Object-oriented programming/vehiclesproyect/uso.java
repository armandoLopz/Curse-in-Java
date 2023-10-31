package vehiclesproyect;
import java.util.*;

public class uso {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        vehiculo vehiculo = new vehiculo("Carro", "v8", "Manual", "Rojo" , 4 , 5);        

        vehiculo vehiculosventa [] = new vehiculo[4];

        vehiculosventa[0] = new camion("White");

        vehiculosventa[1] = new carro("Azul");
        
        vehiculosventa[2] = new moto("Manual", "Navy");

        vehiculosventa[3] = new moto("Automatica", "Red");

        //System.out.println( vehiculosventa[1].dimetiposasientos());

        for (vehiculo vehiculo2 : vehiculosventa) {

           System.out.println(vehiculo2.datosgenerales() + "\n");
            
        }
              
    } 
    
}
