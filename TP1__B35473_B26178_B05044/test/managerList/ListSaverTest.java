package managerList;

import enums.EnumFiles;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import usersBuilder.User;

/**
 *
 * @author Robert Sánchez, Edgardo Quirós, Ana Teresa Quesada.
 */
public class ListSaverTest {

    public ListSaverTest() {
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
     * Test of saveList method, of class ListSaver.
     */
    @Test
    public void testSaveList() {
        System.out.println("saveList");
        List<User> list = null;
        ListSaver instance = new ListSaver(EnumFiles.USER_FILE_NAME.getValue());
        instance.saveList(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}
