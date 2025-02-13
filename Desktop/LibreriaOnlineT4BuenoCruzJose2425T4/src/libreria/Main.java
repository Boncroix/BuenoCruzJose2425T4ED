package libreria;

public class Main {

  public static void main(String[] args) {
    LibreriaBuenoCruzJose2425T4 miLibreriaBuenoCruzJose2425T4;
    String x;
    int stock;
    double saldoActual;

    miLibreriaBuenoCruzJose2425T4 = new LibreriaBuenoCruzJose2425T4("Don Quijote de la Mancha", 10, 45, 120);

    compraQuijoteBuenoCruzJose2425T4(miLibreriaBuenoCruzJose2425T4);

    saldoActual = miLibreriaBuenoCruzJose2425T4.getSaldo();
    System.out.println("El saldo al comprar el libro es de " + saldoActual);
    x = miLibreriaBuenoCruzJose2425T4.getNom();
    stock = miLibreriaBuenoCruzJose2425T4.getCantidad();
    System.out.println("El libro " + x + " tiene un stock de " + stock + " unidades ahora");

    anadeIngresoBuenoCruzJose2425T4(miLibreriaBuenoCruzJose2425T4);
  }

  public static void anadeIngresoBuenoCruzJose2425T4(LibreriaBuenoCruzJose2425T4 miLibreriaBuenoCruzJose2425T4) {
    double ingreso;
    double saldoActual;
    try {
      ingreso = 30.5; //Ingreso que se va a realizar en el saldo de la librería
      miLibreriaBuenoCruzJose2425T4.aumentarSaldo(ingreso, "Libro vendido");
      saldoActual = miLibreriaBuenoCruzJose2425T4.getSaldo();
      System.out.println("Tu saldo actual después de ingresar es de " + saldoActual + "€");
    } catch (Exception e) {
      System.out.println("Fallo al obtener el saldo al ingresar");
    }
  }

  public static void compraQuijoteBuenoCruzJose2425T4(LibreriaBuenoCruzJose2425T4 miLibreriaBuenoCruzJose2425T4) {
    String x;
    int num;
    double dinero;
    double saldoActual;
    try {
      x = "Don Quijote de la Mancha";
      num = 2;    //Número de ejemplares a comprar
      dinero = miLibreriaBuenoCruzJose2425T4.getPrecio();
      saldoActual = miLibreriaBuenoCruzJose2425T4.getSaldo();
      System.out.println("El libro " + x + " vale " + dinero + "€");
      System.out.println("El saldo actual de la librería es de " + saldoActual + "€");
      miLibreriaBuenoCruzJose2425T4.comprarLibro(num);
    } catch (Exception e) {
      System.out.println("Error en la compra del libro");
    }
  }
}
