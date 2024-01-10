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

        listProducts = lista;
        
        this.user = user;
    }

    //METHODS

    public void addProducts(product product){

        if (product.getAmountProduct() > 0 && product.getPriceProduct() > 0) {

            listProducts.add(product);

            System.out.println("Se agrego el producto " + product.getNameProduct() + " a la lista correctamente!!!");
            
        }else if (product.getAmountProduct() < 0 && product.getPriceProduct() > 0){

            System.out.println("Debe ingresar una cantidad de productos validas en el producto " + product.getNameProduct()+ ", la cantidad debe ser mayor a 0");
            
        }else if (product.getAmountProduct() > 0 && product.getPriceProduct() < 0){

            System.out.println("Debe ingresar un precio del producto valido en el producto " + product.getNameProduct() + ", el precio debe ser mayor a 0");
            
        }
    }

    public void setAmountProduct(int id,int amount){

        for (product product2 : listProducts) {
            
            if (product2.getIdProduct() == id) {

                product2.setAmount(amount);
                break;
                
            }
        }

    }

    public String removeProduct(product product, int amountDelete){

        for (product product1 : listProducts) {

            if (product.getIdProduct() == product1.getIdProduct()) {

                product1.setAmount(amountDelete);
                listProducts.remove(product1);
                break;
            }
        }
        
        return "Se elimino el producto con exito";

    }

    public String ShowListProducts(){

        if (listProducts.isEmpty()) {

            return "Su lista de compras se encuentra vacia, agregue productos para ver los detalles de los mismos";
            
        }

        for (product product : listProducts) {

            System.out.println(product.detailsProduct()); 
            
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

    public String detailsUserShoppingCart(){

        return "Este carrito pertenece al usuario:\n" + user.detailsUser();
    }

    
}
