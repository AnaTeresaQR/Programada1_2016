package managerList;

import objectLists.UsersList;
import java.util.GregorianCalendar;
import usersBuilder.AbstractBuilderCreateUser;
import usersBuilder.Director;
import usersBuilder.CustomException;
import usersBuilder.User;

/**
 *
 * @author Robert Sánchez, Edgardo Quirós, Ana Teresa Quesada.
 */
public class Main {

    public static void main(String[] args) throws CustomException {

        AbstractBuilderCreateUser abs = null;

        Director director = new Director();

        User user3 = director.createUser(abs, "201740170", "AnaTeresa", "ana.quesada@ucrso.info", "ana123", new GregorianCalendar(1995, 9, 9), "84590688");
        UsersList userList = UsersList.getUniqueInstance();
        // save the list
        userList.register(user3); // register an user
        userList.save();
        // refresh
        userList.refresh();

//        System.out.println(userList.getIndex(0));
        System.out.println("Login user: " + userList.login("ana.quesada@ucrso.info", "ana123")); // login a user

    }

}
