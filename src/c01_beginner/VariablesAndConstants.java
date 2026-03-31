package c01_beginner;

public class VariablesAndConstants {

  public static void main(String[] args) {
    // Variables
    String Nombre = "Juan";
    System.out.println(Nombre);

    Nombre = "Carlos";
    System.out.println(Nombre);

    // Nombre = 17; error no se puede cambiar el tipo de dato

    int age = 19;
    System.out.println(age);

    // Constante
    final String EMAIL = "juancho@lopes.com";
    System.out.println(EMAIL);

    var email = "Hola Mundo";
    System.out.println(email);
  }
}
