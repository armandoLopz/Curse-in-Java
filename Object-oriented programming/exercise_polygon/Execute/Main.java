package exercise_polygon.Execute;

import java.util.Scanner;

import exercise_polygon.Objects.father.polygon;
import exercise_polygon.Objects.father.sons.rectangule;
import exercise_polygon.Objects.father.sons.triangle;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de triangulos que desea crear");

        int number_triangles = sc.nextInt();

        System.out.println("Ingrese la cantidad de rectangulos que desea crear");
        
        int number_rectangles = sc.nextInt();

        // int triangles_rectangles [][] = new int [number_triangles][number_rectangles];

        polygon triangles_rectangles[] = new polygon [number_rectangles+number_triangles];

        System.out.println("Pulse 1- Para crear un triangulo || Pulse 2- para crear un rectangulo");

         int decision_Create =  sc.nextInt();

         int rectangle_generate = 0;
         int triangle_generate = 0;

        for (int i = 0; i < triangles_rectangles.length; i++) {
            
            for (int j = 0; j < triangles_rectangles.length; j++) {

                switch (decision_Create) {

                    case 1:

                    if (triangle_generate != number_triangles) {
                        
                        System.out.println("Los siguientes datos seran para el " + i++ + " triangulo");
    
                               System.out.println("Inserte el tamaño de la hipotenusa");
    
                               int hipotenusa = sc.nextInt();
    
                               System.out.println("Inserte el ángulo de la hipotenusa " );
    
                               int angle_hipo = sc.nextInt();
    
                               System.out.println("Inserte el tamaño del cateto adyacente");
    
                               int catetoadyacente = sc.nextInt();
    
                               System.out.println("Inserte el ángulo del cateto adyacente " );
    
                               int angle_catetoad = sc.nextInt();
    
                               System.out.println("Inserte el tamaño del cateto opuesto");
    
                               int cateto_opuesto = sc.nextInt();
    
                               System.out.println("Inserte el ángulo del cateto adyacente " );
    
                               int angle_opuesto  = sc.nextInt();
    
                               triangles_rectangles[i] = new triangle(hipotenusa,angle_hipo,catetoadyacente,angle_catetoad,cateto_opuesto,angle_opuesto);
                           
                           break;
                    }else{

                        System.out.println("Los cantidad de triangulo que fue escogida, ya fue creada");
                        
                        if (rectangle_generate == number_rectangles) {
                            
                            break;

                        }else{

                            System.out.println("Los cantidad de rectangulos que fue escogida, ya fue creada");
                           System.out.println("Pulse 2 para crear los rectangulos que faltan");

                            decision_Create = sc.nextInt();

                            break;
                        }
                    }

                    case 2: 

                    if (rectangle_generate != number_rectangles) {
                        
                        System.out.println("Los siguientes datos seran para el " + j++ + " rectangulo" );
        
                        System.out.println("Ingrese la longitud de la base y el lado superior del rectangulo");
        
                        int base_bottom_rectangle = sc.nextInt();
        
                        System.out.println("Inserta la longitud de los costados del rectangulo");
        
                        int left_rigth_rectangle = sc.nextInt();
    
                          triangles_rectangles[i] = new rectangule( base_bottom_rectangle, left_rigth_rectangle);
                    
                    }else{

                         System.out.println("Los cantidad de rectangulos que fue escogida, ya fue creada");
                        
                        if (triangle_generate == number_triangles) {
                            
                            break;

                        }else{

                            System.out.println("Los cantidad de rectangulos que fue escogida, ya fue creada");
                            System.out.println("Pulse 1 para crear los triangulos que faltan");

                            decision_Create = sc.nextInt();
    
                        }
                    }
                    
                    default: System.out.println("Seleccione una opcion valida");
                        break;
                }


                
            }
        }
        
    }
    
}
