package test.pruebas;

public class test2 {
    public static void main(String[] args) {

        String text = "";
        int num = 2002;

        System.out.println(text.getClass().getSimpleName());

        if (text.getClass().getSimpleName().equals("String")) {

            System.out.println("La variable es de tipo String");
            
        }else{

            System.out.println("La variable no es de tipo String es de tipo " + text.getClass().getSimpleName());
        }

        if ( (Integer)num instanceof Number) {
            System.out.println("La variable num es de tipo numérico");
        }
    }
}
