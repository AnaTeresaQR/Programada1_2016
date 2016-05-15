package usersBuilder;

import java.util.GregorianCalendar;
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
public class DirectorTest {

    public DirectorTest() {
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
     * Test of createUser method, of class Director.
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testCreateUser() throws Exception {
        System.out.println("createUser");
        AbstractBuilderCreateUser abs = new ConcreteBuilderCreateUser();
        Director director = new Director();
        User user1 = director.createUser(abs, "207410170", "AnaTeresaQuesada", "ana.quesada@gmail.com", "123456A", new GregorianCalendar(1995, 6, 29), "87518238");
        assertNotNull(user1);

    }

}
