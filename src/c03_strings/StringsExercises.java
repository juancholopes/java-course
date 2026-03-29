package c03_strings;

public class StringsExercises {

  public static void main(String[] args) {
    // 1. Concatena dos cadenas de texto.

    System.out.println("Esto es una cadena" + " concatenada");

    // 2. Muestra la longitud de una cadena de texto.

    System.out.println("Mostrar la longitud de una cadena".length());

    // 3. Muestra el primer y último carácter de un string.

    String string = "Hola";
    System.out.println(string.charAt(0));

    System.out.println(string.charAt(string.length() - 1));

    // 4. Convierte a mayúsculas y minúsculas un string.

    System.out.println(string.toUpperCase());
    System.out.println(string.toLowerCase());

    // 5. Comprueba si una cadena de texto contiene una palabra concreta.

    System.out.println(string.contains("ola"));

    // 6. Formatea un string con un entero.
    var number = 19;
    System.out.printf("Hola tengo %d%n", number);

    // 7. Elimina los espacios en blanco al principio y final de un string.

    var StringWithSpaces = "   Espacios al inicio, similar en algunos inputs ";
    System.out.println(StringWithSpaces);
    System.out.println(StringWithSpaces.trim());

    // 8. Sustituye todos los espacios en blanco de un string por un guión (-).

    System.out.println(StringWithSpaces.replace(" ", "-"));

    // 9. Comprueba si dos strings son iguales.

    System.out.println(string.equals(StringWithSpaces));
    // 10. Comprueba si dos strings tienen la misma longitud.
    System.out.println(string.length() == StringWithSpaces.length());
  }
}
