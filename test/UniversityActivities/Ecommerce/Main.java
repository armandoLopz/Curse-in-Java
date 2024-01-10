package test.UniversityActivities.Ecommerce;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void showProductsEcommerce(LinkedList<product> list) {

        //METODO DONDE SE VISUALIZA LA CANTIDAD DE PRODUCTOS QUE HAY EN LA LISTA DEL CLIENTE O DEL ECOMMERCE

        for (product product : list) {

            System.out.println(product.detailsProduct());
            System.out.println();
        }
    }

    // Actualiza la cantidad de Stock que hay en el Ecommerce
    public static void updateAmountProductsEcommerce(LinkedList<product> listEcommerce, int id, int newAmount){

        for (product product : listEcommerce) {

            if (product.getIdProduct() == id ) {

                product.setAmount(product.getAmountProduct() - newAmount);            
                break;
                
            }
            
        }

    }

    // Muestra los productos disponibles sin mostrar las cantidades
    public static void showInfoSellProduct(LinkedList<product> list){

        for (product product : list) {

            System.out.println(product.detailsSellProduct());
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinkedList<product> listProductsEcommerce = new LinkedList<product>();
        LinkedList<product> listProductsUser = new LinkedList<product>();

        // Se registra los datos del usuario

        System.out.println("Bienvenido, ingrese sus datos para registrar su usuario");

        System.out.println("Ingrese su nombre: ");
        String nameUser = sc.nextLine();

        System.out.println("Ingrese su apellido: ");
        String lastNameUser = sc.nextLine();

        System.out.println("Ingrese su correo: ");
        String emailUser = sc.nextLine();

        System.out.println("Ingrese su direccion corta: ");
        String directionUser = sc.nextLine();

        user user1 = new user(nameUser, lastNameUser, emailUser, directionUser);

        // Se crea el carrito del usuario

        shoppingCart scart1 = new shoppingCart(listProductsUser, user1);

        // Se crean Objetos de tipo producto y se agregan a la lista de los productos del negocio

        listProductsEcommerce.add(new product(1, "Camisa", "Blanca, talla L", 4, 20.55));
        listProductsEcommerce.add(new product(2, "Pantalon", "Blue jeans talla 32", 5, 24.57));
        listProductsEcommerce.add(new product(3, "Short", "Short cargo de color gris", 3, 12));
        listProductsEcommerce.add(new product(4, "Zapato", "New balance 9060", 4, 180));
        listProductsEcommerce.add(new product(5, "Franela", "Franela slim", 7, 14));

        //ALGORITMO DE COMPRA PARA EL CLIENTE

        int buyClient = 0;

        do {

            try {

                //OPCIONES DISPONIBLES PARA EL USUARIO

                System.out.println(
                        "\n1- Agregar los productos al carrito\n2- Borrar un producto del carrito\n3- Pagar productos del carrito"
                                +
                                "\n4- Ver productos del carrito \n5- Salir de la tienda");

                buyClient = sc.nextInt();

                switch (buyClient) {

                    case 1:

                        try {

                            boolean productSelect = false;
                            int decitionBuyProducts = 0;

                            System.out.println("Los productos disponibles en la tienda son: ");
                            //showInfoSellProduct(listProductsEcommerce);
                            showProductsEcommerce(listProductsEcommerce);

                            System.out.println("Ingrese el Nro del ID del producto que desea agregar al carrito");
                            decitionBuyProducts = sc.nextInt();

                            for (product product : listProductsEcommerce) {

                                if (decitionBuyProducts == product.getIdProduct()) {

                                    System.out.println("Ingrese la cantidad " + product.getNameProduct() + ", que desea agregar al producto");
                                    int amountProduct = sc.nextInt();

                                    if (product.getAmountProduct() == 0) {

                                        System.out.println("El producto " + product.getNameProduct() + ", se encuentra fuera de stock");
                                           
                                    
                                    }else if(amountProduct <= product.getAmountProduct() && amountProduct > 0) {
                                        
                                        //PROBLEMAS CON LOS METODOS DE ACTUALIZAR INDIVIDUALMENTE FUNCIONAN BIEN 
                                        //AL USARLOS A LOS 2 NO FUNCIONAN BIEN

                                        //Se agrega el producto al carrito del usuario
                                        scart1.addProducts(product);
                                        
                                        //Cantidad de productos que va a agregar el usuario a su carrito

                                        scart1.setAmountProduct(decitionBuyProducts, amountProduct);
                                        
                                        //Se actualiza el stock de productos que quedan en la tienda
                                        updateAmountProductsEcommerce(listProductsEcommerce,decitionBuyProducts, amountProduct); 
                                                                              
                                        
                                    }else if (amountProduct > product.getAmountProduct()) {
                                        
                                        System.out.println("La cantidad ingresa es mayor a la disponible");
                                        System.out.println("La cantidad disponbible en la tienda es de " + product.getAmountProduct() + 
                                        ", ingrese una cantidad igual o menor a la disponible para poder agregar el producto correctamente" );
                                    
                                    }else if (amountProduct <= 0) {

                                        System.out.println("Debe ingresar una cantidad mayor a 0");
                                        
                                    }                               
                                                                        
                                    productSelect = true;
                                    break;
                                }

                                productSelect = false;

                            }

                            if (productSelect == false) {

                                System.out.println(
                                        "Debe seleccionar un Nro de ID correspondiente a los productos disponibles");
                            }

                        } catch (Exception e) {

                            System.out.println("Ingrese una opcion de tipo numerica valida");
                        }

                        break;

                    case 2:

                        try {

                            if (listProductsUser.isEmpty()) {

                                System.out.println(
                                        "No se pueden eliminar productos de su carrito porque se encuentra vacio");

                            } else {

                                boolean correctSelectDelete = false;
                                showProductsEcommerce(listProductsUser);

                                System.out.println(
                                        "SELECCIONE EL NRO DEL ID DEL PRODUCTO QUE DESEA ELIMINAR DEL CARRITO");
                                int deleteProduct = sc.nextInt();

                                for (product product : listProductsUser) {

                                    if (deleteProduct == product.getIdProduct()) {

                                        try {
                                            
                                            System.out.println("Seleccione la cantidad de " + product.getNameProduct() + " que desea eliminar: ");
                                            int amountDelete = sc.nextInt();

                                            if (amountDelete > product.getAmountProduct()) {

                                                System.out.println("La cantidad que desea eliminar es mayor a la que se encuentra en el carrito");
                                                System.out.println("Cantidad de productos que se encuentra en el carrito es de: " + product.getAmountProduct());
                                                
                                            }else if (amountDelete <= 0 ) {

                                                System.out.println("Debe ingresar una cantidad mayor a 0 ");
                                                
                                            }else{
 
                                                scart1.removeProduct(product, amountDelete);
                                                System.out.println("Se ha eliminado el producto del carrito correctamente");
                                                
                                            }
                                            
                                        } catch (Exception e) {
                                            
                                            System.out.println("Ingrese un dato de tipo numerico");
                                        }
                                                                            
                                        correctSelectDelete = true;
                                        break;

                                    }

                                    correctSelectDelete = false;
                                }

                                if (correctSelectDelete == false) {

                                    System.out.println(
                                            "Debe seleccionar un Nro de ID correspondiente a los productos de su lista");

                                }

                            }

                        } catch (Exception e) {

                            System.out.println("Debe ingresar un tipo de dato numerico");
                        }

                        break;

                    case 3:

                        if (listProductsUser.isEmpty()) {

                            System.out.println("La lista se encuentra vacia y no hay productos a cancelar ");

                        }else {

                            System.out.println("El total a pagar es de " + scart1.totalPayProducts());
                        }

                        break;
                    
                    case 4:

                        if (listProductsUser.isEmpty()) {
                            
                            System.out.println("El carrito se encuentra vacia, pulse 1 para agregar productos");
                        
                        }else{

                            System.out.println("PRODUCTOS DENTRO DEL CARRITO:");
                            scart1.ShowListProducts();

                        }
                        break;
                    case 5:

                        System.out.println("Vuelva pronto, feliz dia!!!");

                        break;

                    default:
                        System.out.println("Debe seleccionar una opcion correcta");
                        break;
                }

            } catch (Exception e) {

                System.out.println("Debe ingresar un tipo de dato numerico");
                System.exit(0);
            }

        } while (buyClient != 5);

        sc.close();
    }
}