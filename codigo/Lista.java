import java.util.ArrayList;


public class Lista {

    public static void main(String[] args) {


        ArrayList<String> lista = new ArrayList<>();


        lista.add("Java");
        lista.add("Python");
        lista.add("HTML");


        for(String elemento : lista) {

            System.out.println(elemento);

        }

    }
}
