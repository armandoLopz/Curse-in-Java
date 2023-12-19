package test.UniversityActivities.Ecommerce;

public class product {

    private String id, name, description;
    private int amount;
    private double price;

    public product(String id, String name, String description, int amount, double price){

        this.id = id;
        this.name = name;
        this.description = description;
        this.amount = amount;
        this.price = price;

    }

    //METHODS

    public String detailsProduct(){

        return "ID: " + id + "\nNombre: " + name + "\nDescripcion: " + description + "\nCantidad " + amount + "\nPrecio: " + price;
    }

    public double totalPriceProduct(){
    
        return price*amount;
    }

    // GETTERS 

    public int getAmountProduct(){

        return amount;
    }

    public double getPriceProduct(){

        return price;
    }
    
}
