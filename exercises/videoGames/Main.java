package exercises.videoGames;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void set2GamesAtributtes(List<videoGames> listVideoGames){

        Scanner sc = new Scanner(System.in);
        int amountGames = 0;

            for (videoGames videoGames : listVideoGames) {
    
                try {
                    System.out.println("Inserte el nuevo nombre de los jugadores seleccionados");
                    String title = sc.nextLine();
                    videoGames.setTtitle(title);

                    System.out.println("Ingrese la cantidad de jugadores");
                    int amountPlayers = sc.nextInt();
                    videoGames.setAmountPlayers(amountPlayers);
                    amountGames++;

                    if (amountGames == 2) {
                        
                        break;
                    }
                } catch (Exception e) {
                    
                    System.out.println("Ingrese el tipo de dato adecuado");
                } 
            }

            sc.close();
    }

    public static void showListGames(List<videoGames> lisVideoGames){

        for (videoGames videoGames : lisVideoGames) {
           videoGames.detailsVideoGame();
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        List <videoGames> listVideoGames = new ArrayList<videoGames>();

        listVideoGames.add(new videoGames(1, "Xbox", "Dark Souls", "Accion", 1));
        listVideoGames.add(new videoGames(2, "Pc", "Counter Strike " , "Accion", 1));
        listVideoGames.add(new videoGames(3, "Nintendo 64", "Mario", "Aventura", 2 ));
        listVideoGames.add(new videoGames(4, "Xbox", "Gran Turismo", "Carros", 1));
        listVideoGames.add(new videoGames(5,"Nintendo 64", "Marios Tenis", "Deporte", 1));

        for (videoGames videoGames : listVideoGames) {
            
            System.out.println("Titulo: " + videoGames.getTitle() + "\nConsola: " + videoGames.getConsole() + "\nCantidad de jugadores: " + videoGames.getAmountPlayers());
            System.out.println("");
        }

        //CAMBIAR EL TITULO Y NUMERO DE JUGADORES DE 2 JUEGOS 

        set2GamesAtributtes(listVideoGames);

        //DATOS DE TODOS LOS JUGOS 

        showListGames(listVideoGames);

        //Se muestran los videojugos para consolas de nintendo 64
        
        System.out.println("Videojuegos para consolas Nintendo 64");

        for (videoGames videoGames : listVideoGames) {
            
            if (videoGames.getConsole().toLowerCase().equals("nintendo 64")) {

                videoGames.detailsVideoGame();
                
            }
        }

        
        sc.close();
    }
}