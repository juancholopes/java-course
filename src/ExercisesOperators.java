public class ExercisesOperators {
  public static void main(String[] args) {
    // 1. Crea una variable con el resultado de cada operación aritmética.

    System.out.println("-------------- 1");

    var a = 5;
    var b = 3;

    a = a + b;
    System.out.println(a);

    a = a - b;
    System.out.println(a);

    a = a * b;
    System.out.println(a);

    a = a / b;
    System.out.println(a);

    a = a % b;
    System.out.println(a);

    // 2. Crea una variable para cada tipo de operación de asignación.

    System.out.println("-------------- 2");
    var c = 6;
    var d = 8;
    var e = 7;
    var f = 3;

    c += b;
    d -= b;
    e /= b;
    f %= b;

    System.out.println(c);
    System.out.println(d);
    System.out.println(e);
    System.out.println(f);

    // 3. Imprime 3 comparaciones verdaderas con diferentes operadores de comparación.
    System.out.println("-------------- 3");

    System.out.println(6 > 4);
    System.out.println(2 <= 2);
    System.out.println(!(2 > 3));

    // 4. Imprime 3 comparaciones falsas con diferentes operadores de comparación.

    System.out.println("-------------- 4");

    System.out.println(3 != 3);
    System.out.println(2 > 5);
    System.out.println(!(2 < 3));

    // 5. Utiliza el operador lógico and.
    System.out.println("-------------- 5");
    System.out.println(2 != 2 || 3 > 3);

    // 6. Utiliza el operador lógico or.
    System.out.println("-------------- 6");
    System.out.println(2 != 3 || 3 == 2);

    // 7. Combina ambos operadores lógicos.

    System.out.println("-------------- 7");
    System.out.println((2 == 3 && 4 == 5) || (2 == 1 || 5 > 4));

    // 8. Añade alguna negación.
    System.out.println("-------------- 8");
    System.out.println(!((2 == 3 && 4 == 5) || (2 == 2 || 5 > 4)));

    // 9. Imprime 3 ejemplos de uso de operadores unarios.
    System.out.println("-------------- 9");
    var g = 0;
    System.out.println(++g);
    System.out.println(--g);
    System.out.println(g++);
    System.out.println(g);


    // 10. Combina operadores aritméticos, de comparación y lógicos.
    System.out.println("-------------- 10");
    System.out.println(((1 * 3 == 3 ) && (2 % 5 != 10)) && !((2 / 4) > 10));

  }
}
