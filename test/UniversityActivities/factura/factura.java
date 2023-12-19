package test.UniversityActivities.factura;

public class factura {

    private String numberpieze, descriptionPieze;
    private int countProducts;
    private double priceProduct;

    public factura (String numberpieze, String descriptionPieze, int countProducts, double priceProduct){

        this.numberpieze = numberpieze;
        this.descriptionPieze = descriptionPieze;
        this.countProducts = countProducts;
        this.priceProduct = priceProduct;

        if (this.priceProduct < 0) {

            this.priceProduct = 0.0;

        }

        if (this.countProducts < 0 ) {

            this.countProducts = 0;
            
        }
    }

    //SETTERS

    public void setNumberpieze(String numberP){

        numberpieze = numberP;
    }

    public void setDescriptionP(String descriptionP){

        descriptionPieze = descriptionP;
    }

    public void setcountP(int countP){

        if (countP < 0 ) {

            countProducts = 0;
            
        }else{

            countProducts = countP;
        }

    }

    public void setpriceP(double priceP){

        if (priceProduct < 0 ) {

            countProducts = 0;
            
        }else{

            priceProduct = priceP;
        }
    }

    //GETTERS 

    public String getNumberPieze(){

        return numberpieze;
    }

    public String getdescriptionPieze(){

        return descriptionPieze;
    }

    public int getcountProducts(){

        return countProducts;
    }
    
    public double getpriceProduct(){

        return priceProduct;
    }

    //METHODS

    public double totalAmount(){

        if (priceProduct* countProducts <= 0) {

            return 0;  
        }

        return priceProduct*countProducts;
    }

    public String detailsFacture(){

        return "Numbero de pieza: " + numberpieze + "\nDescripcion: " + descriptionPieze + "\nCantidad de articulos: " + countProducts + "\nPrecio articulo " + priceProduct ;
    }
}
