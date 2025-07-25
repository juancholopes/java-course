public class BeginnerExercises {
    public static void main(String[] args) {
        // 1. Declara una variable de tipo String y asígnale tu nombre.
        String name = "Juan Carlos";

        // 2. Crea una variable de tipo int y asígnale tu edad.
        int age = 19;

        // 3. Crea una variable double con tu altura en metros.
        double height = 1.71;

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.
        boolean like = true;

        // 5. Declara una constante con tu email.

        final String EMAIL = "juancarloslopezmoreno@proton.me";

        // 6. Crea una variable de tipo char y guárdale tu inicial.
        char myInit = 'J';

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.
        String myLocality = "Guadalupe";
        System.out.println(myLocality);
        myLocality = "Bogotá";
        System.out.println(myLocality);

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.
        int a = 6;
        int b = 13;
        int result = a + b;
        System.out.println(result);

        // 9. Imprime el tipo de dos variables creadas anteriormente.
        System.out.println(EMAIL.getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int C;
        C = 10;
        System.out.println(C);

    }
}
