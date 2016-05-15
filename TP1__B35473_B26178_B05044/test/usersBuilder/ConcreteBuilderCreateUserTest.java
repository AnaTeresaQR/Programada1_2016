package usersBuilder;

import java.util.Calendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Robert Sánchez, Edgardo Quirós, Ana Teresa Quesada.
 */
public class ConcreteBuilderCreateUserTest {

    public ConcreteBuilderCreateUserTest() {
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
     * Test of getUser method, of class ConcreteBuilderCreateUser.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testGetUser() throws Exception {
        System.out.println("getUser");
        ConcreteBuilderCreateUser instance = new ConcreteBuilderCreateUser();
        User expResult = null;
        User result = instance.getUser();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkName method, of class ConcreteBuilderCreateUser.
     */
    @Test
    public void testCheckName() {
        System.out.println("checkName");
        ConcreteBuilderCreateUser instance = new ConcreteBuilderCreateUser();
        boolean expResult = false;
//        boolean result = instance.checkName();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkId method, of class ConcreteBuilderCreateUser.
     */
    @Test
    public void testCheckId() {
        System.out.println("checkId");
        ConcreteBuilderCreateUser instance = new ConcreteBuilderCreateUser();
        boolean expResult = false;
//        boolean result = instance.checkId();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkEmail method, of class ConcreteBuilderCreateUser.
     */
    @Test
    public void testCheckEmail() {
        System.out.println("checkEmail");
        ConcreteBuilderCreateUser instance = new ConcreteBuilderCreateUser();
        boolean expResult = false;
//        boolean result = instance.checkEmail();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPassword method, of class ConcreteBuilderCreateUser.
     */
    @Test
    public void testCheckPassword() {
        System.out.println("checkPassword");
        ConcreteBuilderCreateUser instance = new ConcreteBuilderCreateUser();
        boolean expResult = false;
//        boolean result = instance.checkPassword();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkPhoneNumber method, of class ConcreteBuilderCreateUser.
     */
    @Test
    public void testCheckPhoneNumber() {
        System.out.println("checkPhoneNumber");
        ConcreteBuilderCreateUser instance = new ConcreteBuilderCreateUser();
        boolean expResult = false;
//        boolean result = instance.checkPhoneNumber();
//        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildId method, of class ConcreteBuilderCreateUser.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testBuildId() throws Exception {
        System.out.println("buildId");
        String id = "";
        ConcreteBuilderCreateUser instance = new ConcreteBuilderCreateUser();
        instance.buildId(id);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildName method, of class ConcreteBuilderCreateUser.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testBuildName() throws Exception {
        System.out.println("buildName");
        String name = "";
        ConcreteBuilderCreateUser instance = new ConcreteBuilderCreateUser();
        instance.buildName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildEmail method, of class ConcreteBuilderCreateUser.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testBuildEmail() throws Exception {
        System.out.println("buildEmail");
        String email = "";
        ConcreteBuilderCreateUser instance = new ConcreteBuilderCreateUser();
        instance.buildEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildPassword method, of class ConcreteBuilderCreateUser.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testBuildPassword() throws Exception {
        System.out.println("buildPassword");
        String password = "";
        ConcreteBuilderCreateUser instance = new ConcreteBuilderCreateUser();
        instance.buildPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildBirthdate method, of class ConcreteBuilderCreateUser.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testBuildBirthdate() throws Exception {
        System.out.println("buildBirthdate");
        Calendar birthdate = null;
        ConcreteBuilderCreateUser instance = new ConcreteBuilderCreateUser();
        instance.buildBirthdate(birthdate);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buildPhoneNumber method, of class ConcreteBuilderCreateUser.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testBuildPhoneNumber() throws Exception {
        System.out.println("buildPhoneNumber");
        String phoneNumber = "";
        ConcreteBuilderCreateUser instance = new ConcreteBuilderCreateUser();
        instance.buildPhoneNumber(phoneNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
