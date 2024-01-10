package test.pruebas;

public class test1 {

    public static void main(String[] args) {

        // Array de enteross de 20 numeros aleatorios

        int original_list [] = new int[20];

        int parenumbers = 0;

        for (int i = 0; i < original_list.length; i++) {

            double number = Math.random()*100;

            original_list[i] = (int)number;

            System.out.println(original_list[i]);

            if (original_list[i] % 2 == 0) {

                parenumbers++;
                
            }
            
        }

        // Hacer arrays con solo los pares
        int pare_listnumbers [] = new int[parenumbers];
        int bb = 0;

        for (int index = 0; index < original_list.length; index++) {

            if (original_list[index] % 2 == 0) {

                pare_listnumbers[bb] = original_list[index];
                
                System.out.println("Numeros pares: " + pare_listnumbers[bb]);
                bb++;

            }
            
        }

        // Elevar los arrays pares al cuadrado

        for (int index = 0; index < pare_listnumbers.length; index++) {

            System.out.println(Math.pow(pare_listnumbers[index], 2));
            
        }

        // Mostrar la lista original y la de los nums pares

        for (int index = 0; index < original_list.length; index++) {

            System.out.println("Lista original "  + original_list[index]);

            
        }
        
        for (int j = 0; j < pare_listnumbers.length; j++) {

            System.out.println("Lista de numeros pares " + pare_listnumbers[j]);
            
        }
      
    }
    
}

