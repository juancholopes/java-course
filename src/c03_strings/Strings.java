package c03_strings;

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

        String name = "Juan";

        // Subcadena
        System.out.println(name.substring(1, 4 ));

        // Obtener los byter en utf.16
        System.out.println("hola mundo".getBytes(StandardCharsets.UTF_16));

        //Contains --> devulve true o false
        System.out.println("Hola Java".contains("Hola"));

        // Comparación
        System.out.println("Comparación ----- ");
        System.out.println("juan".equals("juan"));

        var a = "Juan";
        var b = "Juan";
        var c = new String("Juan");


        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(c));

        // Trim => Para limpiar espacios en blanco alrededor de una cadena de texto
        System.out.println(" Hola, mi nombre es Juan ".trim());

        // Replace ==> remplazar un caracter por otro o un string específico por otro
        System.out.println("Hola me llamo Juan".replace("Juan", "Carlos"));

        // Format ==> para hacer interpolación es decir incluir valores en una cadena de texto
        var age = 20;
        System.out.println(String.format("Hola mi nombre es %s y tengo %d", name, age));

    }
}
