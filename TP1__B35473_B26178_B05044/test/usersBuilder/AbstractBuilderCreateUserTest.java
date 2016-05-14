/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usersBuilder;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.rules.ExpectedException;

/**
 *
 * @author Edgardo Quirós
 */
public class AbstractBuilderCreateUserTest {

    public AbstractBuilderCreateUserTest() {
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
     * Test of getUser method, of class AbstractBuilderCreateUser.
     */
    @Test
    public void testGetUser() throws CustomException {
        System.out.println("getUser");
        AbstractBuilderCreateUser abs = null;
        Director director = new Director();
        User user1 = director.createUser(abs, "207410170", "AnaTeresaQuesada", "ana.quesada@gmail.com", "123456A", new GregorianCalendar(1995, 6, 29), "87518238");
        assertNotNull(user1);
    }
    
     /**
     * Test of buildId method, of class AbstractBuilderCreateUser.
     */
    @Test(expected = CustomException.class)
    public void testBuildId() throws CustomException {
        System.out.println("getUser");
        AbstractBuilderCreateUser abs = new ConcreteBuilderCreateUser();
    String id=null;
        abs.buildId(id);
    }
     /**
     * Test of buildName method, of class AbstractBuilderCreateUser.
     */
    @Test(expected = CustomException.class)
    public void testBuildName() throws CustomException {
        System.out.println("getUser");
        AbstractBuilderCreateUser abs = new ConcreteBuilderCreateUser();
    String name=null;
        abs.buildName(name);
    }
    /**
     * Test of buildEmail method, of class AbstractBuilderCreateUser.
     */
    @Test(expected = CustomException.class)
    public void testBuildEmail() throws CustomException {
        System.out.println("getUser");
        AbstractBuilderCreateUser abs = new ConcreteBuilderCreateUser();
    String email=null;
        abs.buildEmail(email);
    }
    /**
     * Test of buildPassword method, of class AbstractBuilderCreateUser.
     */
    @Test(expected = CustomException.class)
    public void testBuildPassword() throws CustomException {
        System.out.println("getUser");
        AbstractBuilderCreateUser abs = new ConcreteBuilderCreateUser();
    String password=null;
        abs.buildPassword(password);
    }
    /**
     * Test of buildPhoneNumber method, of class AbstractBuilderCreateUser.
     */
    @Test(expected = CustomException.class)
    public void testBuildPhoneNumber() throws CustomException {
        System.out.println("getUser");
        AbstractBuilderCreateUser abs = new ConcreteBuilderCreateUser();
    String phoneNumber=null;
        abs.buildPhoneNumber(phoneNumber);
    }


    /**
     * Test of getUser method, of class AbstractBuilderCreateUser.
     */
    @Test(expected = CustomException.class)
    public void testGetUserNotId() throws CustomException {
        System.out.println("getUser");
        AbstractBuilderCreateUser abs = null;
        Director director = new Director();
        User user1 = director.createUser(abs, "2070170", "AnaTeresaQuesada", "ana.quesada@gmail.com", "123456A", new GregorianCalendar(1995, 6, 29), "87518238");
    }

    /**
     * Test of getUser method, of class AbstractBuilderCreateUser.
     */
    @Test(expected = CustomException.class)
    public void testGetUserNotName() throws CustomException {
        System.out.println("getUser");
        AbstractBuilderCreateUser abs = null;
        Director director = new Director();
        User user1 = director.createUser(abs, "207410170", "ass33", "ana.quesada@gmail.com", "123456A", new GregorianCalendar(1995, 6, 29), "87518238");
    }

    /**
     * Test of getUser method, of class AbstractBuilderCreateUser.
     */
    @Test(expected = CustomException.class)
    public void testGetUserNotEmail() throws CustomException {
        System.out.println("getUser");
        AbstractBuilderCreateUser abs = null;
        Director director = new Director();
        User user1 = director.createUser(abs, "207410170", "AnaTeresaQuesada", "ana.quesadagmail.com", "123456A", new GregorianCalendar(1995, 6, 29), "87518238");

    }

    /**
     * Test of getUser method, of class AbstractBuilderCreateUser.
     */
    @Test(expected = CustomException.class)
    public void testGetUserNotPassword() throws CustomException {
        System.out.println("getUser");
        AbstractBuilderCreateUser abs = null;
        Director director = new Director();
        User user1 = director.createUser(abs, "207410170", "AnaTeresaQuesada", "ana.quesada@gmail.com", "123", new GregorianCalendar(1995, 6, 29), "87518238");
    }

    /**
     * Test of getUser method, of class AbstractBuilderCreateUser.
     */

    @Test(expected = CustomException.class)
    public void testGetUserNotAdult() throws CustomException {
        System.out.println("getUser");
        AbstractBuilderCreateUser abs = null;
        Director director = new Director();
        User user1 = director.createUser(abs, "207410170", "AnaTeresaQuesada", "ana.quesada@gmail.com", "123456A", new GregorianCalendar(2000, 6, 29), "87518238");
    }

    /**
     * Test of getUser method, of class AbstractBuilderCreateUser.
     */

    @Test(expected = CustomException.class)
    public void testGetUserNotPhoneNumber() throws CustomException {
        System.out.println("getUser");
        AbstractBuilderCreateUser abs = null;
        Director director = new Director();
        User user1 = director.createUser(abs, "207410170", "AnaTeresaQuesada", "ana.quesada@gmail.com", "123456A", new GregorianCalendar(1995, 6, 29), "875188");
    }

    /**
     * Test of checkId method, of class AbstractBuilderCreateUser.
     */
    @Test
    public void testCheckId() throws CustomException {
        System.out.println("checkId");
        AbstractBuilderCreateUser builder = new ConcreteBuilderCreateUser();
        String id = "12345679";
        builder.buildId(id);
        boolean expResult = false;
        boolean result = builder.checkId();
        assertEquals(expResult, result);
    }

    /**
     * Test of checkName method, of class AbstractBuilderCreateUser.
     */
    @Test
    public void testCheckName() throws CustomException {
        System.out.println("checkName");
        AbstractBuilderCreateUser builder = new ConcreteBuilderCreateUser();
        String name = "edga1";
        builder.buildName(name);
        boolean expResult = false;
        boolean result = builder.checkName();
        assertEquals(expResult, result);

    }

    /**
     * Test of checkEmail method, of class AbstractBuilderCreateUser.
     */
    @Test
    public void testCheckEmail() throws CustomException {
        System.out.println("checkEmail");
        AbstractBuilderCreateUser builder = new ConcreteBuilderCreateUser();
        String email = "edgardo";
        builder.buildEmail(email);
        boolean expResult = false;
        boolean result = builder.checkEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of checkPassword method, of class AbstractBuilderCreateUser.
     */
    @Test
    public void testCheckPassword() throws CustomException {
        System.out.println("checkPassword");
        AbstractBuilderCreateUser builder = new ConcreteBuilderCreateUser();
        String password = "1234";
        builder.buildPassword(password);
        boolean expResult = false;
        boolean result = builder.checkPassword();
        assertEquals(expResult, result);
    }

    /**
     * Test of checkPhoneNumber method, of class AbstractBuilderCreateUser.
     */
    @Test
    public void testCheckPhoneNumber() throws CustomException {
        System.out.println("checkPhoneNumber");
        AbstractBuilderCreateUser builder = new ConcreteBuilderCreateUser();
        String phoneNumber = "24231212";
        builder.buildPhoneNumber(phoneNumber);
        boolean expResult = true;
        boolean result = builder.checkPhoneNumber();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetUserVoid() {
        AbstractBuilderCreateUser builder = new ConcreteBuilderCreateUser();
        User user = new User();
        User user1 = builder.getUserVoid();
        assertNotEquals(user1, user);

    }

}
