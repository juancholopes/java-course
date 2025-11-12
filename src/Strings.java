import java.nio.charset.StandardCharsets;

public class Strings {
    public static void main(String[] args) {

        var string = "Hola Mundo";

        // Para hacer que el string se convierta en minúsculas
        System.out.println(string.toLowerCase());

        // Para hacer que el string se convierta en mayúsculas
        System.out.println(string.toUpperCase());

        // Concatenación
        System.out.println("Hola".concat(" Mundo"));
        System.out.println("Juan" + " " + "Mundo");

        // Allar la longitud de una cadena de texto
        System.out.println("Que tan larga es esta cadena de texto".length());

        // Buscar un caracter por posición
        System.out.println(string.charAt(1));
        System.out.println(string.charAt(0));

        // Obtener una subcadena
        System.out.println("NameHolaMundo".substring(2));

        String name = "juan";

        // Subcadena
        System.out.println(name.substring(1, 4 ));

        // Obtener los byter en utf.16
        System.out.println("hola mundo".getBytes(StandardCharsets.UTF_16));

        //Contains --> devulve true o false
        System.out.println("Hola Java".contains("Hola"));
    }
}
