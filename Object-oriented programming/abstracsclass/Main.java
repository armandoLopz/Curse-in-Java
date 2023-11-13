package abstracsclass;

public class Main {
    
    public static void main(String[] args) {

        //vendedor vendedortienda = new vendedor("Armando","Lopez",02-07-2002,04-11-2004);
        
        vendedor vendedorr = new vendedor("Armando","lopes","JEFE",227,2000);
        
        System.out.println("El cargo es " + vendedorr.dimecargo() + " " + vendedorr.dimenombre());

        supervisor sip = new supervisor("Armando","Lopez","Supervisor",22 ,1000);

        System.out.println(sip.bonificacion());

        System.out.println("Salario del vendedor " + vendedorr.salario);
        
        gerente gerentetienda = new gerente("Armando" , "Lopez" , "Gerente" , 47 , 450 );

        System.out.println(gerentetienda.pagomensual(10000));
        
    }
    
}
