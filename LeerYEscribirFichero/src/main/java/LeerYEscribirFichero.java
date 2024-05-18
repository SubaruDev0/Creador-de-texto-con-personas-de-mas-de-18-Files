import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LeerYEscribirFichero {

    public static void main(String[] args) {
        File entrada = new File("C:\\Users\\subar\\OneDrive\\Escritorio\\LeerYEscribirFichero\\LeerYEscribirFichero\\entrada.txt");
        File salida = new File("./salida.txt");
        List<Persona> personas = new ArrayList<>();
        personas = leerArchivo(entrada);
        escribirArchivo(personas, salida);
    }

    public static List<Persona> leerArchivo(File archivo) {
        List<Persona> personas = new ArrayList<>();
        
        try {
            FileReader lector = new FileReader(archivo);
            BufferedReader buffer = new BufferedReader(lector);
            String linea;
            
            while ((linea = buffer.readLine()) != null) {
                String[] partes = linea.split(" ");
                if (partes.length >= 2) {
                    String nombre = partes[0];
                    int edad = Integer.parseInt(partes[1]);
                    Persona persona = new Persona(nombre, edad);
                    personas.add(persona);
                }
            }

            buffer.close();
            
        } catch (IOException e) {
            e.printStackTrace();
        }

        return personas;
    }

    public static void escribirArchivo(List<Persona> personas, File archivo) {
        try {
            FileWriter escritor = new FileWriter(archivo);
                    escritor.write("     Mayores de 18:\n");
            for (Persona persona : personas) {
                if (persona.getEdad() >= 18) {
                    escritor.write(persona.getNombre() + "\n");
                }
            }

            escritor.close();
            System.out.println("Se ha creado el nuevo archivo con los nombres de los mayores de 18 anios");
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}