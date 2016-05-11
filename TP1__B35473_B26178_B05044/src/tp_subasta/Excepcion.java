package tp_subasta;

/**
 * Clase que extiende de interfaz de Java Exception para cubrir excepciones en
 * el sistema.
 *
  *Robert Sánchez, Edgardo QuirósRobert,edgardo
*/
public class Excepcion extends Exception {

    /**
     * Costructor de la clase.
     *
     * @param mensaje Mesaje que se muestra cuando aparece una excepcion
     * cubierta.
     */
    public Excepcion(String mensaje) {
        super(mensaje);
    }
}
