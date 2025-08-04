public class Operators {
    public static void main(String[] args) {
        // Operadores

        // Aritméticos
        var a = 5;
        var b = 3;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        // Asignación

        a = b; // 3
        System.out.println(a);

        a = b * 2; // 6
        System.out.println(a);

        a += 1; // 6 + 1
        System.out.println(a);

        a -= 1; // 6
        System.out.println(a);

        a *= 2; // 12
        System.out.println(a);

        a /= 2; // 6
        System.out.println(a);

        a %= 2; // 0
        System.out.println(a);

        // Comparación o Relacionales

        System.out.println(a == b); // False
        System.out.println(a == 6); // False
        System.out.println(a == 0); // True
        System.out.println(a != b); // True

        System.out.println(a > 6); // False
        System.out.println(a >= 6); // False
        System.out.println(a <= 6); // True
        System.out.println(a < 6); // True


        System.out.println( "----------------- AND ");

        // Operadores lógicos
        // Operador AND (Conjunción)
        System.out.println( true && true); // TRUE
        System.out.println( true && false);// FALSE
        System.out.println( false && true);// FALSE
        System.out.println( false && false);// FALSE

        System.out.println( 2 > 3 && 3 < 1); // False

        System.out.println( "----------------- OR");

        // Operador OR (Disyunción)
        System.out.println( true || true); // TRUE
        System.out.println( true || false); // TRUE
        System.out.println( false || true); // TRUE
        System.out.println( false || false); // FALSE

        System.out.println( 3 > 2 || 5 == 2); // TRUE

        System.out.println( "----------------- NOT");

        // Operador NOT (Negación)
        System.out.println(!true); // FALSE
        System.out.println(!false);// TRUE

        System.out.println( !(3 > 2) || 5 == 2); // FALSE

        // Operadores Unarios
        System.out.println( "----------------- unarios");
        System.out.println(b);
        System.out.println(b++);
        System.out.println(++b);
        System.out.println(b--);
        System.out.println(--b);

    }
}
