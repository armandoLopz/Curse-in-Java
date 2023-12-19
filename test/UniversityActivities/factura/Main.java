package test.UniversityActivities.factura;

public class Main {

    public static void main(String[] args){

        factura facture = new factura("a212","Zapatos",-1,-10.50);

        //facture.setcountP(5);

        System.out.println(facture.detailsFacture());

        System.out.println(facture.totalAmount());

        

    }
}
