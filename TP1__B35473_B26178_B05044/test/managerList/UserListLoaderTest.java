/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerList;

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
public class UserListLoaderTest {
    
    public UserListLoaderTest() {
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
     * Test of loadList method, of class UserListLoader.
     */
    @Test
    public void testLoadList() {
        System.out.println("loadList");
        UserListLoader listLoader = new UserListLoader();
        List<User> list = listLoader.loadList();
        assertNotNull(list);
    
    
    }
    
}
