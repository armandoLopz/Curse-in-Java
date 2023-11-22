package test;

import java.util.Scanner;

public class decimaltobinary {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int valueNumber = sc.nextInt();
        int rest, aux;
        aux = valueNumber;

        while (valueNumber > 0) {
            
            //Varable con la que se obtiene el residuo

            rest = valueNumber%2;

            //Division de la variable inicial entre 2 

            valueNumber = valueNumber /2;
            
        }

    }
}
