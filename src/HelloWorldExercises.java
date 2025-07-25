public class HelloWorldExercises {
    public static void main (String[] args) {
        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".

        System.out.println("Juan Carlos Lopez Moreno"); // Juan Carlos Lopez Moreno

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.

        System.out.println("Hola\nMundo");
        /*
        Hola
        Mundo
         */

        // 3. Añade un comentario sobre lo que hace cada línea del programa. OK

        // 4. Crea un comentario en varias líneas. OK

        // 5. Imprime tu edad, tu color favorito y tu ciudad.

        System.out.println("Edad: 18\nColor: Azul\nGuadalupe");

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".

        System.console().readLine(); // Para leer una línea de código
        System.err.println("Hola\nMundo");// Imprime errores

        // 7. Utiliza varios println para imprimir una frase.

        System.out.println("Edad: 18\nColor: Azul\nGuadalupe");

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).

        System.out.println(" _._     _,-'\"\"`-._\n" +
                "(,-.`._,'(       |\\`-/|\n" +
                "    `-.-' \\ )-`( , o o)\n" +
                "          `-    \\`_`\"'-");

        // 9. Intenta ejecutar el programa sin el metodo main y observa el error. OK


        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
    }
}
