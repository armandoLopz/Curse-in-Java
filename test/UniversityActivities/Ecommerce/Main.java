package test.UniversityActivities.Ecommerce;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<product> listP = new LinkedList<product>();

        //VER COMO PUEDO AGREGAR VARIOS PRODUCTOS AL INSTANCIAR EL CARRITO
        //VERIFICAR QUE LOS OBJETOS INSTANCIADOS CUMPLEN LAS CONDICIONES PARA SER AGREGADOS AL CARRITO

        product product1 = new product("1","Camisa", "Blanca, talla L", -2,20.55);
        product product2 = new product("2", "Pantalon", "Blue jeans talla 32", 2, 24.57);

        //user user2 = new user("Pedro","Gonzales", "arm@gmail.com", "El trigal");
        user user1 = new user("Armando", "Lopez", "arm@gmail.com", "Naguanagua");

        listP.add(product2);
        listP.add(product1);

        shoppingCart scart1 = new shoppingCart(listP, user1);

        scart1.addProducts(product2);

        System.out.println(scart1.ShowListProducts());

        System.out.println("El total a pagar por los productos listados son " + scart1.totalPayProducts());

        //shoppingCart sh2Cart = new shoppingCart((product1, product2), user2);
        
    }
    
}
