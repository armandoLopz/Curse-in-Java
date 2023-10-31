package vehiclesproyect;

public class vehiculo {

    private String tipovehiculo,motor, transmision, color, tipocaucho;
    private int ruedas, asientos;
    private boolean asientoscuero;

    public vehiculo(String tipovehiculo, String motor, String transmision , String color , int ruedas, int asientos){

        this.tipovehiculo = tipovehiculo;
        this.motor = motor;
        this.transmision = transmision;
        this.color = color;
        this.ruedas = ruedas;
        this.asientos = asientos;

    }

    public String datosgenerales(){

        if (tipovehiculo.equalsIgnoreCase("moto")) {
            
            return "la " + tipovehiculo + " posee un motor " + motor + ", una transmision de tipo " + transmision +
            " y ademas es de color " + color;
        }else{
            
            return "El " + tipovehiculo + " posee un motor " + motor + ", una transmision de tipo " + transmision +
            " y ademas es de color " + color;
        }

    }

    public void cauchos(String tiposcaucho){
        this.tipocaucho = tiposcaucho;
    }
    
    public String dimetiposcaucho(){

        return "El " + tipovehiculo + " tiene unos cauchos de " + tipocaucho;
    }

    public void colorvehiculo(String color){
        this.color = color;
    }

    public void tiposasiento(boolean asientoscuero){
       
        this.asientoscuero = asientoscuero;
    }

    public void ruedas (int ruedas){

        this.ruedas = ruedas;
    }

    public String dimetiposasientos(){

        if (asientoscuero == true) {

            return "El " + tipovehiculo + " tiene " + asientos + " asientos de cuero";
        }else{
            
            return "El " + tipovehiculo + " tiene " + asientos + " asientos de tela";
        }
    }
}
