package temporizador;
import java.util.Scanner;
import javax.swing.Timer;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        action horaactual = new action();
        
        Timer temporizador = new Timer(2000, horaactual );

        temporizador.start();
        
        System.out.println("Pulse true para salir");

        boolean salida = false;

        salida = sc.nextBoolean();

        if (salida) {

            System.exit(0);

        }else{
            
        }
        
    }
    
}
