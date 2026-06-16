import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class LeerArchivo {


    public static void main(String[] args) {


        try {


            File archivo = new File("ejemplo.txt");


            Scanner lector = new Scanner(archivo);


            while(lector.hasNextLine()) {


                String texto = lector.nextLine();


                System.out.println(texto);


            }


            lector.close();


        } catch(FileNotFoundException e) {


            System.out.println("No se encontró el archivo");


        }

    }
}
