package vehiclesproyect;
import java.util.*;

public class uso {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        vehiculo vehiculosventa [] = new vehiculo[4];       
                 

        vehiculosventa[0] = new camion("White");

        vehiculosventa[1] = new carro("Azul");
        
        vehiculosventa[2] = new moto("Manual", "Navy");

        vehiculosventa[3] = new moto("Automatica", "Red");

        for (vehiculo vehiculo2 : vehiculosventa) {

           System.out.println(vehiculo2.datosgenerales() + "\n");
            
        }

        vehiculosventa[1].tiposasiento(true);

        System.out.println(vehiculosventa[1].dimetiposasientos());

        carro carro1 = (carro) vehiculosventa[1];

        camion camion1 = (camion) vehiculosventa[0];

        System.out.println( carro1.dimepreciocarro() + ", " + carro1.dimetiposasientos());

        camion1.tiposasiento(true);

        System.out.println(camion1.dimepreciocamion() + ", " + camion1.dimetiposasientos());

        System.out.println(camion1.datosgenerales());
    } 
    
}
