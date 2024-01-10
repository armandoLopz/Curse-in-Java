package test.UniversityActivities.Ecommerce;

public class product {

    private String name, description;
    private int id,amount;
    private double price;

    public product(int id, String name, String description, int amount, double price){

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
    
        return (double)price*amount;
    }

    public String detailsSellProduct(){

        return "ID: " + id + "\nNombre: " + name + "\nDescripcion: " + description + "\nPrecio: " + price;
    }

    // GETTERS 

    public int getIdProduct(){

        return id;
    }

    public String getNameProduct(){

        return name;
    }

    public String getDescription(){

        return description;
    }

    public int getAmountProduct(){

        return amount;
    }

    public double getPriceProduct(){

        return price;
    }

    //SETTERS 

    public void setIdProduct(int id){
    
        this.id = id;
    }

    public void setNameProduct(String name){
    
        this.name = name;
    }
    
    public void setDescriptipn(String description){
    
        this.description = description;
    }

    public void setAmount(int amount){
    
        this.amount = amount;
    }
    
    public void setPrice(int price){
    
        this.price = price;
    }
}
