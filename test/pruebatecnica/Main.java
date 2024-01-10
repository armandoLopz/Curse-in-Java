package test.pruebatecnica;

public class Main {


    public static void main(String[] args) {
        
        char asientos [][] = new char[10][10];

        //Se vacian los asientos del programa

        int nroAsientos = 0;
        int posicionAsiento = 1;
        for (int i = 0; i < asientos.length; i++) {
            
            for (int j = 0; j < asientos.length; j++) {

                asientos[i][j] = 1;
                System.out.print(asientos[i][j]);
                nroAsientos++;


                if (nroAsientos == 10) {

                    System.out.println("");
                    nroAsientos=0;
                }
            }
        }

        System.out.println("Bienvenido a Cines Unidos estos son los asientos disponibles para la pelicula");


    }
    
}
