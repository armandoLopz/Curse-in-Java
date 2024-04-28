package programmingfunctional;

public class Main {
    
    public static void main(String[] args) {
        
        new bike(){

            private int number = 5;

            public void driveBikes(){

                System.out.println("Estoy conduciendo " + number + " bicicletas el dia de hoy ");
            }

        }.driveBikes();
    }
}
