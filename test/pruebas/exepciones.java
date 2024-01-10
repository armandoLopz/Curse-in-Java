package test.pruebas;

import java.util.Scanner;

public class exepciones {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        try {

            System.out.println("Ingrese un numero");
            int a = sc.nextInt();

            System.out.println("Ingrese otro numero");
            int b = sc.nextInt();
            
            int resultado = a/b;

            System.out.println("El resultado de la division de " + a + " " + b + "es : " + resultado);

        } catch (Exception e) {

            System.out.println("La division entre 0 no existe");
        }
    }
}
