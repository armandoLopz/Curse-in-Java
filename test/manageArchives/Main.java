package test.manageArchives;
import java.io.FileInputStream;
import java.io.IOException;

class Main {

    public static void main(String[] args) {

        try {

            FileInputStream inputArchive = new FileInputStream("C:\\Users\\Lenovo\\OneDrive\\Documentos\\GitHub\\Curse-in-Java\\test\\manageArchives\\texto.txt");

            byte[] buffer = new byte[2050];
            int bytesReaded = inputArchive.read(buffer);
            System.out.println(bytesReaded);

            String text = new String(buffer, 0 , bytesReaded);
            System.out.println(text);

            inputArchive.close();
        } catch (IOException e) {
            System.out.println("Se produjo un error al leer el archivo ingresado " + e.getMessage());
        }
    }
}