package abstracsclass;

public class Main {
    
    public static void main(String[] args) {

        //vendedor vendedortienda = new vendedor("Armando","Lopez",02-07-2002,04-11-2004);
        
        supervisor supervisor1 = new supervisor("Armando","Lopez", "Vendedor",22,200);

        System.out.println(supervisor1.bonificacionventas(10));
        
    }
    
}
