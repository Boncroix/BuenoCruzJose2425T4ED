package libreria;

/**
 * Esta clase contiene el método principal que simula la compra y el manejo de
 * una librería.
 *
 * @author josebuenocruz
 */
public class Main {

  /**
   * El método principal que ejecuta las operaciones sobre la librería, como
   * comprar libros y añadir ingresos al saldo.
   *
   * @param args los argumentos de la línea de comandos (no utilizados en este
   * programa)
   */
  public static void main(String[] args) {
    LibreriaBuenoCruzJose2425T4 miLibreriaBuenoCruzJose2425T4;
    String x;
    int stock;
    double saldoActual;

    // Se crea una instancia de la librería con un libro inicial
    miLibreriaBuenoCruzJose2425T4 = new LibreriaBuenoCruzJose2425T4("Don Quijote de la Mancha", 10, 45, 120);

    // Se simula la compra de 2 libros
    compraQuijoteBuenoCruzJose2425T4(miLibreriaBuenoCruzJose2425T4);

    // Se obtiene el saldo actual después de la compra
    saldoActual = miLibreriaBuenoCruzJose2425T4.getSaldo();
    System.out.println("El saldo al comprar el libro es de " + saldoActual);

    // Se obtiene el nomnbre del libro y el stock disponible
    x = miLibreriaBuenoCruzJose2425T4.getNom();
    stock = miLibreriaBuenoCruzJose2425T4.getCantidad();
    System.out.println("El libro " + x + " tiene un stock de " + stock + " unidades ahora");

    // Se añade un ingreso al saldo de la librería
    anadeIngresoBuenoCruzJose2425T4(miLibreriaBuenoCruzJose2425T4);
  }

  /**
   * Método para añadir un ingreso al saldo de la librería. Este método aumenta
   * el saldo de la librería por una cantidad determinada.
   *
   * @param miLibreriaBuenoCruzJose2425T4 la librería a la que se le va a añadir
   * el ingreso
   */
  public static void anadeIngresoBuenoCruzJose2425T4(LibreriaBuenoCruzJose2425T4 miLibreriaBuenoCruzJose2425T4) {
    double ingreso;
    double saldoActual;
    try {
      ingreso = 30.5; //Ingreso que se va a realizar en el saldo de la librería
      // Aumentar saldo con el ingreso especificado
      miLibreriaBuenoCruzJose2425T4.aumentarSaldo(ingreso, "Libro vendido");
      // Obtener y mostrar el saldo actualizado
      saldoActual = miLibreriaBuenoCruzJose2425T4.getSaldo();
      System.out.println("Tu saldo actual después de ingresar es de " + saldoActual + "€");
    } catch (Exception e) {
      System.out.println("Fallo al obtener el saldo al ingresar");
    }
  }

  /**
   * Método para simular la compra de un libro. Este método reduce el stock de
   * libros disponibles y actualiza el saldo de la librería.
   *
   * @param miLibreriaBuenoCruzJose2425T4 la librería en la que se va a realizar
   * la compra
   */
  public static void compraQuijoteBuenoCruzJose2425T4(LibreriaBuenoCruzJose2425T4 miLibreriaBuenoCruzJose2425T4) {
    String x;
    int num;
    double dinero;
    double saldoActual;
    try {
      x = "Don Quijote de la Mancha";
      num = 2;    //Número de ejemplares a comprar
      dinero = miLibreriaBuenoCruzJose2425T4.getPrecio(); //Precio del libro
      saldoActual = miLibreriaBuenoCruzJose2425T4.getSaldo(); // Saldo actual de la librería
      // Mostrar información sobre la compra
      System.out.println("El libro " + x + " vale " + dinero + "€");
      System.out.println("El saldo actual de la librería es de " + saldoActual + "€");
      // Realizar la compra
      miLibreriaBuenoCruzJose2425T4.comprarLibro(num);
    } catch (Exception e) {
      System.out.println("Error en la compra del libro");
    }
  }
}
