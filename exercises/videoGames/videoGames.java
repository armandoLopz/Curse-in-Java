package exercises.videoGames;

public class videoGames {

    private String console, categorie, title;
    private int id, amountPlayers;

    public videoGames(){

        // Constructor para poder crear un objeto de tipo video juego vacio
    }
    public videoGames(int id, String console, String title, String categorie, int amountPlayers ){

        this.id = id;
        this.console = console;
        this.title = title;
        this.categorie = categorie;
        this.amountPlayers = amountPlayers;
    }

    //METHODS

    public void detailsVideoGame(){

        System.out.println("ID: " + id + "\nTitulo: " + title + "\nCategoria: " + categorie +"\nConsola: " + console + 
           "\nCantidad de jugadores: " + amountPlayers);
            System.out.println("");
    }

    //GETTERS 

    public String getConsole(){

        return console;
    }

    public String getTitle(){

        return title;
    }

    public String getCategorie(){

        return categorie;
    }

    public int getId(){

        return id;
    }

    public int getAmountPlayers(){

        return amountPlayers;
    }

    //Setters 

    public void setConsole(String console){

        this.console = console;
    }

    public void setTtitle(String title){

        this.title = title;
    }

    public void setCategorie(String categorie){

        this.categorie = categorie;
    }

    public void setId(int id){

        this.id = id;
    }

    public void setAmountPlayers(int amountPlayers){

        this.amountPlayers = amountPlayers;
    }
}
