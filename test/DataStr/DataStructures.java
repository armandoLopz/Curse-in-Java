package test.DataStr;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataStructures {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserte un numero");        

        //List<binario> numbersBinary = new ArrayList<binario>();

        List<Integer> binaryNumbers = new ArrayList<Integer>();

        int valueNumber = sc.nextInt();
        int rest, aux;
        aux = valueNumber;

        while (valueNumber > 0) {
            
            //Varable con la que se obtiene el residuo

            rest = valueNumber%2;

            //numbersBinary.add(new binario(rest));

            binaryNumbers.add(rest);
            //Division de la variable inicial entre 2 

            valueNumber = valueNumber /2;

        }

        // Variables que van a servir de indice para asignar los valores

        int a = 0;
        int b = binaryNumbers.size()-1;

        int ordenedNumbers [] = new int[binaryNumbers.size()];

        for (Integer numer : binaryNumbers) {
            
            ordenedNumbers[a] = binaryNumbers.get(b); 

            b--;
            a++;
        }

        System.out.println("El numero " + aux + " en decimal es igual a: ");
        
        // Impresion de los valores del array ordenados
        
        for (int i = 0; i < ordenedNumbers.length; i++) {
            
            System.out.print(ordenedNumbers[i]);
        }

    
    }
    
}
