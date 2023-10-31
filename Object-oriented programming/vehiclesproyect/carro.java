package vehiclesproyect;

public class carro extends vehiculo {

    private int largocarro , anchocarro, preciocarro;

    public carro(String colorcarro){

        super("Carro", "V8", "Automatica", colorcarro, 4, 5);

        largocarro = 4500;
        anchocarro = 1500;
        preciocarro = 5000;

    }

    public String medidascarro(){

        return "el largo del carro es de " + largocarro + " cm y el ancho es de " + anchocarro + " cm";
    }

    public String dimepreciocarro(){

        return "el precio del camion es de " + preciocarro;
    
    
}