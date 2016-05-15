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
 * @author Edgardo Quirós
 */
public class ListLoaderTest {

    public ListLoaderTest() {
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
     * Test of loadList method, of class ListLoader.
     */
    @Test
    public void testLoadList() {
        System.out.println("loadList");
        ListLoader listLoader = new ListLoader(EnumFiles.USER_FILE_NAME.getValue());
        List<User> list = listLoader.loadList();
        assertNotNull(list);

    }

}
