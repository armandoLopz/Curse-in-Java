package prueba_carro;

 class chasis {

    private int largo_carro, ancho_carro, ruedas_carro, ventanas_carro;

    private String tipo_motor, color_carro, marca_carro;

    private String  maletero_carro;

    String cm = "cm";

public chasis() {
    
    // inicializacion de variables de tipo int

    largo_carro = 2000; 
    ancho_carro = 1200;
    ruedas_carro = 4;
    ventanas_carro = 4;
    maletero_carro = "100x100";

    // inicialiacion de varibles de tipo string

    tipo_motor = "De gasolina";
    color_carro = "a escoger";
    marca_carro = "Mazda";

}

    // Declaration methods getters and setter 

    public String infocarro(){
        
        //Terminar de colocar las características del carro, terminar los métodos, preguntar si el cliente desea realizar modificaciones
        //calcular un valor total al carro sin modificaciones y con las modificaciones 

        return "El carro que tenemos disponible posee las siguientes medidas y características:\n Largo del carro: "+
         largo_carro + cm  + " \n Ancho del carro " + ancho_carro + cm + "\n Ruedas del carro: " + ruedas_carro +
         "\n Ventanas del carro: " + ventanas_carro + "\n Tipo del motor: " + tipo_motor + "\n Color del carro: " + color_carro +
         "\n Marca del carro: " + marca_carro + "\n Maletero del carro: " + maletero_carro;
    }
}
