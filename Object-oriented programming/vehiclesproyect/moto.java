package vehiclesproyect;

public class moto extends vehiculo {

    private int largomoto, preciomoto;

    public moto(String transmisionmoto, String colormoto){
        
        super("Moto", "650cc", transmisionmoto, colormoto, 2, 1);

        largomoto = 150;
        preciomoto = 3500;

    }

    public String costomoto(){

        return "costo de la moto es de " + preciomoto;
    }

    public String dimensionesmoto(){

        return "El largo de la moto es de " + largomoto;
    }
   
}
