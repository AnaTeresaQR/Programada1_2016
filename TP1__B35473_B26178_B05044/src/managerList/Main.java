package managerList;

import java.util.GregorianCalendar;
import tp_subasta.AbstractBuilderCreateUser;
import tp_subasta.Director;
import tp_subasta.Excepcion;
import tp_subasta.User;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) throws Excepcion {

        AbstractBuilderCreateUser abs = null;

        Director director = new Director();

        User user3 = director.createUser(abs, "207410170", "AnaTeresa", "ana.quesada@ucrso.info", "ana123", new GregorianCalendar(1995, 9, 9), "84590688");
        UsersList userList = new UsersList();
        // Guardamos la list
        userList.register(user3);
        userList.save();
        // Se refresca
        userList.refresh();

        System.out.println(userList.getIndex(0));
        System.out.println("Login user: " + userList.login("ana.quesada@ucrso.info", "ana123"));
        System.out.println("");

    }

}
