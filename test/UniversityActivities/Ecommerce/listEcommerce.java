package test.UniversityActivities.Ecommerce;

import java.util.LinkedList;

public class listEcommerce {

    private LinkedList<product> listEcommerce;

    public listEcommerce(LinkedList<product> listEcommerce) {

        this.listEcommerce = listEcommerce;

    }

    //GETTERS

    public LinkedList<product> getListEcommerce(){

        return listEcommerce;
    }
    
    // METHODS

    public void addProduct(product product){

        if (product.getAmountProduct() > 0 && product.getPriceProduct() > 0) {

            listEcommerce.add(product);
         
        }
    }


    public void showProductsEcommerce() {

        // METODO DONDE SE VISUALIZA LA CANTIDAD DE PRODUCTOS QUE HAY EN LA LISTA DEL
        // CLIENTE O DEL ECOMMERCE

        if (listEcommerce.isEmpty()) {

            System.out.println("La lista se encuentra vacia.\nAgregue productos a la lista para poder visualizarlos");

        } else {

            for (product product : listEcommerce) {

                if (product.getAmountProduct() > 0) {
                    
                    System.out.println(product.detailsProduct());
                    System.out.println();
                }
            }
        }
    }

    // Muestra los productos disponibles sin mostrar las cantidades
    public void showInfoSellProduct(LinkedList<product> list) {

        for (product product : list) {

            System.out.println(product.detailsSellProduct());
            System.out.println();
        }
    }

    // Actualiza la cantidad de Stock que hay en el Ecommerce
    public void updateAmountProductsEcommerce(int id, int newAmount) {

        for (product product : listEcommerce) {

            if (product.getIdProduct() == id) {
                // Actualiza la cantidad de stock que hay en el comercio
                
                int amount = product.getAmountProduct() - newAmount;
                product.setAmount(amount);

                break;

            }

        }
    }
}
