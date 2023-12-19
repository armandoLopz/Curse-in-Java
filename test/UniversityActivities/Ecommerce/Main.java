package test.UniversityActivities.Ecommerce;

public class Main {

    public static void main(String[] args) {

        product product1 = new product("1","Camisa", "Blanca, talla L", 2,20.55);
        product product2 = new product("2", "Pantalon", "Blue jeans talla 32", 2, 24.57);
        
        user user1 = new user("Armando", "Lopez", "arm@gmail.com", "Naguanagua");

        shoppingCart scart1 = new shoppingCart(product1, user1);

        scart1.addProducts(product2);


        System.out.println(scart1.ShowListProducts());

        System.out.println("El total a pagar por los productos listados son " + scart1.totalPayProducts());

        
        
    }
    
}
