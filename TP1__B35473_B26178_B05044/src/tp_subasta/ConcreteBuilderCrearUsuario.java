package tp_subasta;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase que implementa de AbstractBuilderCrearJugador y redefine sus métodos
 * para crear un jugador.
 *
 * @author Robert Sánchez, Edgardo Quirós, Ana Teresa Quesada.
 */
public class ConcreteBuilderCrearUsuario implements AbstractBuilderCreateUser {

    private User user;
    private boolean check;
//    private ManejoListaJugadores listaJugadores = ManejoListaJugadores.intanciaManejoLista();

    /**
     * Costructor de la clase.
     */
    public ConcreteBuilderCrearUsuario() {
        user = new User();
    }

    /**
     *
     * @return @throws Excepcion
     */
    @Override
    public User getUser() throws Excepcion {

        if (!checkName()) {
            throw new Excepcion("La extensión del nombre excede el tamaño permitido, debe ser menor a 100 caracteres.");
        }

        if (!checkId()) {
            throw new Excepcion("Formato incorrecto de cédula, utilice el formato de cédula costarricense");
        }

        if (!checkEmail()) {
            throw new Excepcion("Formato incorrecto de email, Ingrese de nuevo. Ejemplo: ejemplo1@ejemplo.com");
        }

        if (!checkPassword()) {
            throw new Excepcion("Formato incorrecto de contraseña. Ingrese de nuevo, no debe contener caracteres especiales y debe tener una extensión mínima de 5 caracteres.");
        }

        if (!checkPhoneNumber()) {
            throw new Excepcion("Formato incorrecto de teléfono. Ingrese de nuevo, utilizar formato constarricense");
        }

        return user;

    }

    /**
     *
     * @return
     */
    public boolean checkName() {

        Pattern pat = Pattern.compile("[a-zA-Z]{0,100}");
        Matcher mat = pat.matcher(user.getName());
        if (mat.matches()) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    /**
     *
     * @return
     */
    public boolean checkId() {

        Pattern pat = Pattern.compile("[0-9]{9}");
        Matcher mat = pat.matcher(user.getId());
        if (mat.matches()) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    /**
     *
     * @return
     */
    public boolean checkEmail() {

        Pattern pat = Pattern.compile("^[\\w-]+(\\.[\\w-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = pat.matcher(user.getEmail());
        if (mat.find()) {
            check = true;
        } else {
            check = false;
        }
        return check;
    }

    /**
     *
     * @return
     */
    public boolean checkPassword() {
        Pattern pat = Pattern.compile("[a-zA-Z0-9]{5,}");
        Matcher mat = pat.matcher(user.getPassword());
        if (mat.matches()) {
            System.out.println("Contraseña correcto");
            check = true;
        } else {
            check = false;
            System.out.println("Contraseña incorrecto");
        }
        return check;
    }

    /**
     *
     * @return
     */
    public boolean checkPhoneNumber() {
        Pattern pat = Pattern.compile("[0-9]{8}");
        Matcher mat = pat.matcher(user.getPhoneNumber());
        if (mat.matches()) {
            System.out.println("teléfono correcto");
            check = true;
        } else {
            check = false;
            System.out.println("teléfono incorrecto");
        }
        return check;
    }

    /**
     *
     * @param id
     * @throws Excepcion
     */
    @Override
    public void buildId(String id) throws Excepcion {
        if (id != null && !id.equals("")) {
            user.setId(id);
        } else {
            throw new Excepcion("No es posible guardar la cédula");
        }

    }

    /**
     *
     * @param name
     * @throws Excepcion
     */
    @Override
    public void buildName(String name) throws Excepcion {
        if (name != null && !name.equals("")) {
            user.setName(name);
        } else {
            throw new Excepcion("No es posible guardar el nombre");
        }
    }

    /**
     *
     * @param email
     * @throws Excepcion
     */
    @Override
    public void buildEmail(String email) throws Excepcion {
        if (email != null && !email.equals("")) {
            user.setEmail(email);
        } else {
            throw new Excepcion("No es posible guardar el correo");
        }
    }

    /**
     *
     * @param password
     * @throws Excepcion
     */
    @Override
    public void buildPassword(String password) throws Excepcion {
        if (password != null && !password.equals("")) {
            user.setPassword(password);
        } else {
            throw new Excepcion("No es posible guardar la contraseña");
        }
    }

    /**
     *
     * @param birthday
     * @throws Excepcion
     */
    @Override
    public void buildBirthday(Calendar birthday) throws Excepcion {
        if (birthday != null && validateAdult(birthday)) {
            user.setBirthday(birthday);
        } else {
            throw new Excepcion("No es posible guardar la fecha de nacimiento");
        }
    }

    /**
     *
     * @param phoneNumber
     * @throws Excepcion
     */
    @Override
    public void buildPhoneNumber(String phoneNumber) throws Excepcion {
        if (phoneNumber != null && !phoneNumber.equals("")) {
            user.setPhoneNumber(phoneNumber);
        } else {
            throw new Excepcion("No es posible guardar el número de teléfono");
        }
    }

    /**
     *
     * @param date
     * @return
     */
    private boolean validateAdult(Calendar date) {
        Calendar actual = Calendar.getInstance();
        int age = actual.get(Calendar.YEAR) - date.get(Calendar.YEAR);
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

}
