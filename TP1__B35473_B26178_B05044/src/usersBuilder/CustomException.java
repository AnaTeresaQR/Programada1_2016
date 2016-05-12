package usersBuilder;

/**
 * Clase que extiende de interfaz de Java Exception para cubrir excepciones en
 * el sistema.
 *
 * @author Robert Sánchez, Edgardo Quirós, Ana Teresa Quesada.
 */
public class CustomException extends Exception {

    /**
     * Costructor de la clase.
     *
     * @param mensaje Mesaje que se muestra cuando aparece una excepcion
     * cubierta.
     */
    public CustomException(String mensaje) {
        super(mensaje);
    }
}
