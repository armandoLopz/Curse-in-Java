package vehiclesproyect;
import java.util.*;

public class uso {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String colorvehiculo, transmisionvehiculo;

        colorvehiculo = "Rojo";
        transmisionvehiculo = "Automatica";

        moto tumoto = new moto(transmisionvehiculo,colorvehiculo);

        System.out.println(tumoto.datosgenerales()+ ", el " + tumoto.costomoto());
        
        
        
    }
    
}
