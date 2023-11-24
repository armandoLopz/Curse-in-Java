package test.DataStr.linkedlist;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class linked {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
         
 
        List <person> linked = new LinkedList<person>();

        int createPersons = 0;

        
        do {
            System.out.println("Ingrese: \n 1- Si desea crear un estudiante \n 2- Si desea crear un profesor \n Ingrese cualquier otro numero para salir del programa");

            createPersons = sc.nextInt();

            if (createPersons == 1) {

                System.out.println("Ingrese su nombre");

                String nameStudent = sc.nextLine();

                System.out.println("Ingrese su apellido");

                String lastnameStudent = sc.nextLine();

                System.out.println("Ingrese su edad");

                int ageStudent = sc.nextInt();

                System.out.println("Ingrese el nombre de su escuela");

                String nameSchool = sc.nextLine();

                System.out.println("Ingrese el grado que cursa");

                int levelStudy = sc.nextInt();

                linked.add(new students(nameStudent, lastnameStudent, ageStudent, nameSchool, levelStudy));
                
            }else if (createPersons == 2) {

                 System.out.println("Ingrese su nombre");

                String name = sc.nextLine();

                System.out.println("Ingrese su apellido");

                String lastname = sc.nextLine();

                System.out.println("Ingrese su edad");

                int age = sc.nextInt();

                System.out.println("Ingrese el nombre de su escuela");

                String nameSchool = sc.nextLine();

                System.out.println("Ingrese la asignatura que imparte");

                String asignature = sc.nextLine();

                linked.add(new teachers(name, lastname, age, nameSchool, asignature));
                
            }else{

                System.out.println("Vuelva pronto");
            }
            
        } while (createPersons == 1  || createPersons == 2);
        
    }
    
}
