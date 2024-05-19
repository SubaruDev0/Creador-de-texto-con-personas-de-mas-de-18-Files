Creador de texto con personas de más de 18 (Archivos)
Este programa lee un archivo de texto que contiene una lista de personas con su nombre y edad, y crea un nuevo archivo de texto que incluye solo los nombres de las personas mayores de 18 años.

Contenido del repositorio
src: Contiene el código fuente del programa.
Persona.java: Clase que representa una persona con nombre y edad.
LeerYEscribirFichero.java: Clase principal que realiza las operaciones de lectura y escritura de archivos.
Cómo utilizar el programa
Descarga el archivo .zip que contiene el código fuente del programa.
Descomprime el archivo en tu computadora.
Abre tu IDE preferido, como NetBeans o Eclipse.
Importa el proyecto descomprimido en tu IDE y compílalo.
Ejecuta el programa. Los resultados se mostrarán en la consola.
Explicación del código
El programa realiza las siguientes tareas:

Lee un archivo de texto llamado entrada.txt que contiene una lista de personas con su nombre y edad, separados por un espacio.
Crea una lista de objetos Persona a partir de la información leída del archivo.
Escribe un nuevo archivo de texto llamado salida.txt que contiene solo los nombres de las personas mayores de 18 años.
Las principales funciones del programa son:

leerArchivo(File archivo): Lee el archivo de entrada y crea una lista de objetos Persona.
escribirArchivo(List<Persona> personas, File archivo): Escribe un nuevo archivo de texto con los nombres de las personas mayores de 18 años.
El código maneja las excepciones de E/S utilizando bloques try-catch para garantizar un manejo adecuado de los errores.
