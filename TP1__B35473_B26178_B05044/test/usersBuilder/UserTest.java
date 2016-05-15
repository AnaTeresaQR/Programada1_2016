package usersBuilder;

import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Edgardo Quirós
 */
public class UserTest {

    public UserTest() {
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

//    /**
//     * Test of getId method, of class User.
//     */
//    @Test
//    public void testGetId() {
//        System.out.println("getId");
//        User instance = new User();
//        String expResult = "";
//        String result = instance.getId();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setId method, of class User.
//     */
//    @Test
//    public void testSetId() {
//        System.out.println("setId");
//        String id = "";
//        User instance = new User();
//        instance.setId(id);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getName method, of class User.
//     */
//    @Test
//    public void testGetName() {
//        System.out.println("getName");
//        User instance = new User();
//        String expResult = "";
//        String result = instance.getName();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setName method, of class User.
//     */
//    @Test
//    public void testSetName() {
//        System.out.println("setName");
//        String name = "";
//        User instance = new User();
//        instance.setName(name);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getEmail method, of class User.
//     */
//    @Test
//    public void testGetEmail() {
//        System.out.println("getEmail");
//        User instance = new User();
//        String expResult = "";
//        String result = instance.getEmail();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setEmail method, of class User.
//     */
//    @Test
//    public void testSetEmail() {
//        System.out.println("setEmail");
//        String email = "";
//        User instance = new User();
//        instance.setEmail(email);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPassword method, of class User.
//     */
//    @Test
//    public void testGetPassword() {
//        System.out.println("getPassword");
//        User instance = new User();
//        String expResult = "";
//        String result = instance.getPassword();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPassword method, of class User.
//     */
//    @Test
//    public void testSetPassword() {
//        System.out.println("setPassword");
//        String password = "";
//        User instance = new User();
//        instance.setPassword(password);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getBirthdate method, of class User.
//     */
//    @Test
//    public void testGetBirthdate() {
//        System.out.println("getBirthdate");
//        User instance = new User();
//        Calendar expResult = null;
//        Calendar result = instance.getBirthdate();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setBirthdate method, of class User.
//     */
//    @Test
//    public void testSetBirthdate() {
//        System.out.println("setBirthdate");
//        Calendar birthdate = null;
//        User instance = new User();
//        instance.setBirthdate(birthdate);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPhoneNumber method, of class User.
//     */
//    @Test
//    public void testGetPhoneNumber() {
//        System.out.println("getPhoneNumber");
//        User instance = new User();
//        String expResult = "";
//        String result = instance.getPhoneNumber();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPhoneNumber method, of class User.
//     */
//    @Test
//    public void testSetPhoneNumber() {
//        System.out.println("setPhoneNumber");
//        String phoneNumber = "";
//        User instance = new User();
//        instance.setPhoneNumber(phoneNumber);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of toString method, of class User.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        User user = new User("207410170", "AnaTeresaQuesada", "ana.quesada@gmail.com", "123456A", new GregorianCalendar(1995, 6, 29), "87518238");
        String expResult = "";
        String result = user.toString();
        //assertNotEquals(expResult, result);

    }

}
