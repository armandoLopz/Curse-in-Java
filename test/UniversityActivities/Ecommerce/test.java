package test.UniversityActivities.Ecommerce;

import java.util.LinkedList;
import java.util.Scanner;

public class test {

    public void setAmountProduct(LinkedList<product> listProducts,product product, int amount){

        for (product product2 : listProducts) {
            
            if (product2.getIdProduct() == product.getIdProduct()) {

                product.setAmount(amount);
                
            }
        }

    }
    public static void main(String[] args) {
        
        LinkedList<product> listProductsEcommerce = new LinkedList<product>();
        LinkedList<product> listProductsUser = new LinkedList<product>(); 

        Scanner sc = new Scanner(System.in);
        
        
        listProductsEcommerce.add(new product(1, "Camisa", "Blanca, talla L", 4, 20.55));
        listProductsEcommerce.add(new product(2, "Pantalon", "Blue jeans talla 32", 5, 24.57));
        listProductsEcommerce.add(new product(3, "Short", "Short cargo de color gris", 3, 12));

        listProductsUser.add(new product(1, "Camisa", "Blanca, talla L", 4, 20.55));
        listProductsUser.add(new product(2, "Pantalon", "Blue jeans talla 32", 5, 24.57));
        listProductsUser.add(new product(3, "Short", "Short cargo de color gris", 3, 12));

        System.out.println("Ingrese un id del producto");

        int idProduct = sc.nextInt();

        System.out.println("Lista de productos del usuario: ");
        for (product product : listProductsUser) {

            System.out.println(product.detailsProduct());
        }

        System.out.println("Lista de productos del comercio: ");
        for (product product : listProductsEcommerce) {

            System.out.println(product.detailsProduct());
        }
    }
    
}
