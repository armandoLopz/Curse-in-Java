package prueba_carro;

public class pago {

    carro datos = new carro();

    public int compra1(int a) {
        
        return a;
    }

    public int compra(int a, int b) {
        
        int w = a+b; 
        
        return w; 
    }

    public int compra(int a, int b, int c) {

        int total = a+b+c;

        return total;
    }

    public int compra(int a, int b, int c, int d) {

        int total = a+b+c+d;

        return total;
    }

    public void muestrapagoindividual() {

        System.out.println("El resultado de su compra es " + compra1(datos.costo_carro));
        
    }

    public void muestrapago() {

        System.out.println("El resultado de su compra es " + compra(datos.costo_carro, datos.decision_comprador));

    }
    
}
