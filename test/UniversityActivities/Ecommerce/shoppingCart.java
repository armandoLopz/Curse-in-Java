package test.UniversityActivities.Ecommerce;

import java.util.LinkedList;
import java.util.List;

public class shoppingCart {

    private List<product> listProducts = new LinkedList<product>();

    public shoppingCart(product product, user user1){

        if (product.getAmountProduct() > 0 && product.getPriceProduct() > 0) {

            listProducts.add(product);
            
        }

    }

    //METHODS

    public void addProducts(product product){

        if (product.getAmountProduct() > 0 && product.getPriceProduct() > 0) {

            listProducts.add(product);
            
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

    
}
