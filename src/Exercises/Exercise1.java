package Exercises;

public class Exercise1 {
    public static void main(String[] args) {
        int numero = 12;

        boolean numeroEsPar = numero % 2 == 0;

        System.out.println("El número es par? " + numeroEsPar);

        boolean entre10y20 = numero >= 10 && numero <= 20;

        System.out.println("El número esta entre  10 y 20? " + entre10y20);

        boolean cumpleCondiciones = numeroEsPar && entre10y20;

        System.out.println("El número cumple con ambas condiciones? " + cumpleCondiciones);
    }
}
