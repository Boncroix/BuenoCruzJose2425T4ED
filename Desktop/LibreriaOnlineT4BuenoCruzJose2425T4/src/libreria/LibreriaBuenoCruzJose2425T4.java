package libreria;

/**
 * Esta clase representa una librería con libros. Permite gestionar información
 * sobre los libros disponibles, su precio, la cantidad en stock y el saldo de
 * la cuenta. Además, incluye métodos para aumentar el saldo de la librería y
 * para comprar libros.
 *
 * @author josebuenocruz
 */
public class LibreriaBuenoCruzJose2425T4 {

  private String nom;           // Nombre del libro
  private int cantidad;         // Cantidad de ejemplares del libro disponibles
  private double precio;        // Precio de un ejemplar del libro
  private double saldo;         // Saldo en la cuenta de la librería

  
  /**
   * Obtiene el nombre del libro.
   *
   * @return el nombre del libro
   */
  public String getNom() {
    return nom;
  }

  
  /**
   * Establece el nombre del libro.
   *
   * @param nom el nombre del libro
   */
  public void setNom(String nom) {
    this.nom = nom;
  }

  
  /**
   * Obtiene la cantidad de ejemplares del libro disponibles en stock.
   *
   * @return la cantidad de libros disponibles
   */
  public int getCantidad() {
    return cantidad;
  }

  
  /**
   * Establece la cantidad de ejemplares del libro disponibles en stock.
   *
   * @param cantidad la cantidad de libros disponibles
   */
  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  
  /**
   * Obtiene el precio unitario del libro.
   *
   * @return el precio del libro
   */
  public double getPrecio() {
    return precio;
  }

  
  /**
   * Establece el precio unitario del libro.
   *
   * @param precio el precio del libro
   */
  public void setPrecio(double precio) {
    this.precio = precio;
  }

  
  /**
   * Obtiene el saldo actual de la cuenta de la librería.
   *
   * @return el saldo de la librería
   */
  public double getSaldo() {
    return saldo;
  }

  
  /**
   * Establece el saldo de la cuenta d ela librería.
   *
   * @param saldo el saldo de la librería
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  
  /**
   * Constructor sin argumentos, inicializa el objeto sin establecer valores.
   */
  public LibreriaBuenoCruzJose2425T4() {
  }

  
  /**
   * Constructor con parámetros para inicializar todas las propiedades de la
   * librería.
   *
   * @param nom el nombre del libro
   * @param cantidad la cantidad de ejemplares en stock
   * @param precio el precio unitario del libro
   * @param saldo el saldo de la librería
   */
  public LibreriaBuenoCruzJose2425T4(String nom, int cantidad, double precio, double saldo) {
    this.nom = nom;                 //Nombre del libro
    this.cantidad = cantidad;       //Cantidad de ejemplares que hay en stock
    this.precio = precio;           //Precio unitario del libro
    this.saldo = saldo;             //Saldo en la cuenta de la librería
  }

  
  /**
   * Aumenta el saldo de la librería.
   *
   * @param saldomas el monto a añadir al saldo
   * @param concepto el concepto que justifica el aumento (aunque no se utiliza
   * en este código)
   * @throws Exception si el monto es menor o igual a 0
   */
  public void aumentarSaldo(double saldomas, String concepto) throws Exception {
    if (saldomas <= 0) {
      throw new Exception("No se puede ingresar 0 o una cantidad negativa");
    }
    setSaldo(getSaldo() + saldomas);
  }

  
  /**
   * Realiza la compra de un número específico de libros, actualizando el stock
   * y el saldo.
   *
   * @param canti la cantidad de libros a comprar
   * @throws Exception si se intenta comprar una cantidad negativa o si no hay
   * suficiente saldo o si no hay suficientes libros disponibles en stock
   */
  public void comprarLibro(int canti) throws Exception {
    if (canti <= 0) {
      throw new Exception("No se puede retirar una cantidad negativa de libros");
    }
    if (getCantidad() >= canti) {
      if (getSaldo() <= getPrecio()) {
        throw new Exception("No hay suficiente saldo para comprar");
      } else {
        setCantidad(getCantidad() - canti);
        setSaldo(getSaldo() + (getPrecio() * canti));
      }
    } else {
      throw new Exception("No se pueden comprar más libros de los que hay disponibles");
    }

  }
}
