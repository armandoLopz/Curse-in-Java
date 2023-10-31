package vehiclesproyect;

public class camion extends vehiculo {

    private int largocamion , anchocamion, capacidaddecarga, preciocamion;
    
    public camion(String colorcamion){

        super("Camion", "7/8 Diesel", "Sincronica", colorcamion, 8, 3);

        largocamion = 600;
        anchocamion = 200;
        capacidaddecarga = 6000;
        preciocamion = 9000;

    }

    public String dimecapacidadcarga(){

        return "El camion posee una capacidad de carga de " + capacidaddecarga + " Kg";
    }

    public String medidascamion(){

        return "el largo del camion es de " + largocamion + " cm y el ancho es de " + anchocamion + " cm";
    }

    public String dimepreciocamion(){

        return "el precio del camion es de " + preciocamion;
    }


}
