package managerList;

import objectLists.UsersList;
import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import usersBuilder.AbstractBuilderCreateUser;
import usersBuilder.CustomException;
import usersBuilder.Director;
import usersBuilder.User;

/**
 *
 * @author Robert Sánchez, Edgardo Quirós, Ana Teresa Quesada.
 */
public class UsersListTest {

    public UsersListTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getUniqueInstance method, of class UsersList.
     */
    @Test
    public void testGetUniqueInstance() {
        System.out.println("getUniqueInstance");
        UsersList list1 = UsersList.getUniqueInstance();
        UsersList list2 = UsersList.getUniqueInstance();
        assertEquals(list1, list2);

    }

    /**
     * Test of register method, of class UsersList.
     */
    @Test
    public void testRegisterFalse() throws CustomException {
        System.out.println("register");
        AbstractBuilderCreateUser abs = null;

        Director director = new Director();

        User user = director.createUser(abs, "207410170", "AnaTeresa", "ana.quesada@ucrso.info", "ana123", new GregorianCalendar(1995, 9, 9), "84590688");
        UsersList userList = UsersList.getUniqueInstance();

        boolean prueba1 = userList.register(user);
        assertEquals(false, prueba1);
    }

    /**
     * Test of login method, of class UsersList.
     */
    public void testLogin() throws Exception {
        System.out.println("login");
        AbstractBuilderCreateUser abs = null;

        Director director = new Director();

        User user3 = director.createUser(abs, "207410170", "AnaTeresa", "ana.quesada@ucrso.info", "ana123", new GregorianCalendar(1995, 9, 9), "84590688");
        UsersList userList = UsersList.getUniqueInstance();
        // save the list
        userList.register(user3); // register an user
        userList.save();
        // refresh
        userList.refresh();

        User newUser = userList.login("ana.quesada@ucrso.info", "ana123"); // login a user

    }

    /**
     * Test of login method, of class UsersList.
     */
    @Test(expected = CustomException.class)
    public void testLoginFalsePassword() throws Exception {
        System.out.println("login");
        AbstractBuilderCreateUser abs = null;

        Director director = new Director();

        User user3 = director.createUser(abs, "207410170", "AnaTeresa", "ana.quesada@ucrso.info", "ana123", new GregorianCalendar(1995, 9, 9), "84590688");
        UsersList userList = UsersList.getUniqueInstance();
        // save the list
        userList.register(user3); // register an user
        userList.save();
        // refresh
        userList.refresh();

        User newUser = userList.login("ana.quesada@ucrso.info", "ana"); // login a user

    }

    /**
     * Test of login method, of class UsersList.
     */
    @Test(expected = CustomException.class)
    public void testLoginFalseEmail() throws Exception {
        System.out.println("login");
        AbstractBuilderCreateUser abs = null;

        Director director = new Director();

        User user3 = director.createUser(abs, "207410170", "AnaTeresa", "ana.quesada@ucrso.info", "ana123", new GregorianCalendar(1995, 9, 9), "84590688");
        UsersList userList = UsersList.getUniqueInstance();
        // save the list
        userList.register(user3); // register an user
        userList.save();
        // refresh
        userList.refresh();

        User newUser = userList.login("ana.quesada@ucrso", "ana123"); // login a user

    }

    /**
     * Test of exist method, of class UsersList.
     */
    @Test
    public void testExistId() throws CustomException {
        System.out.println("exist");
        AbstractBuilderCreateUser abs = null;
        AbstractBuilderCreateUser abs1 = null;

        Director director = new Director();
        Director director1 = new Director();

        User user3 = director.createUser(abs, "207410170", "AnaTeresa", "ana.quesada@ucrso.info", "ana123", new GregorianCalendar(1995, 9, 9), "84590688");
        User user2 = director1.createUser(abs1, "402090984", "AnaTeresa", "edgardo.quiros@ucrso.info", "ana123", new GregorianCalendar(1995, 9, 9), "84590688");

        UsersList userList = UsersList.getUniqueInstance();
        // save the list
        userList.register(user3); // register an user
        boolean exist = userList.exist(user2);
        assertEquals(false, exist);

    }

    @Test
    public void testExistEmail() throws CustomException {
        System.out.println("exist");
        AbstractBuilderCreateUser abs = null;
        AbstractBuilderCreateUser abs1 = null;

        Director director = new Director();
        Director director1 = new Director();

        User user3 = director.createUser(abs, "207410170", "AnaTeresa", "ana.quesada@ucrso.info", "ana123", new GregorianCalendar(1995, 9, 9), "84590688");
        User user2 = director1.createUser(abs1, "207410170", "Edgardo", "edgardo.quiros@ucrso.info", "ana123", new GregorianCalendar(1995, 9, 9), "84590688");

        UsersList userList = UsersList.getUniqueInstance();
        // save the list
        userList.register(user3); // register an user
        boolean exist = userList.exist(user2);

    }

    /**
     * Test of size method, of class UsersList.
     */
    @Test
    public void testSize() {
        System.out.println("size");
        UsersList userList = UsersList.getUniqueInstance();
        int size = userList.size();
        //assertNotEquals(0, size);
    }

}
