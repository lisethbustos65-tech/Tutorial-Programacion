import java.io.FileWriter;
import java.io.IOException;


public class EscribirArchivo {


    public static void main(String[] args) {


        try {


            FileWriter archivo = new FileWriter("ejemplo.txt");


            archivo.write("Este archivo fue creado usando Java");


            archivo.close();


            System.out.println("Archivo creado correctamente");


        } catch(IOException e) {


            System.out.println("Error al crear archivo");


        }

    }
}
