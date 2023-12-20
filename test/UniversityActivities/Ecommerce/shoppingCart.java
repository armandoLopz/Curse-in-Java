package test.UniversityActivities.Ecommerce;

import java.util.LinkedList;

public class shoppingCart {

    private LinkedList<product> listProducts = new LinkedList<product>();
    private user user;
    

    public shoppingCart(LinkedList <product> lista, user user){
        
        for (product product : lista) {

            if (product.getAmountProduct() > 0 && product.getPriceProduct() > 0) {

                listProducts.add(product);
            }
        }
        
        this.user = user;
    }

    //METHODS

    public String addProducts(product product){

        if (product.getAmountProduct() > 0 && product.getPriceProduct() > 0) {

            listProducts.add(product);

            return "Se agrego el producto a la lista correctamente!!!";
            
        }else if (product.getAmountProduct() < 0 && product.getPriceProduct() > 0){

            System.out.println("Debe ingresar una cantidad de productos validas, la cantidad debe ser mayor a 0");

            return "";
            
        }else if (product.getAmountProduct() > 0 && product.getPriceProduct() < 0){

            return "Debe ingresar un precio del producto valido, el precio debe ser mayor a 0";
            
        }else{

            return "La cantidad y el precio deben ser mayores a 0";
        }
    }

    public String ShowListProducts(){

        for (product product : listProducts) {

            System.out.println(product.detailsProduct() + "\n");
            
        }

        return "";

    }

    public double totalPayProducts(){

        double total = 0;

        for (product product : listProducts) {

            total += product.totalPriceProduct();
            
        }

        return total;
    
    }

    public String detailsUser(){

        return "Este carrito pertenece al cliente:\nNombre: " + user.detailsUser();
    }

    
}
