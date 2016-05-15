package usersBuilder;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Edgardo Quirós
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({usersBuilder.DirectorTest.class, usersBuilder.MainBuilderUserTest.class, usersBuilder.CustomExceptionTest.class, usersBuilder.AbstractBuilderCreateUserTest.class, usersBuilder.ConcreteBuilderCreateUserTest.class, usersBuilder.UserTest.class})
public class UsersBuilderSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

}
