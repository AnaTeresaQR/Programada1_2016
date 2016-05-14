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
public class UserListSaverTest {
    
    public UserListSaverTest() {
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
     * Test of saveList method, of class UserListSaver.
     */
    @Test
    public void testSaveList() {
        System.out.println("saveList");
        List<User> list = null;
        UserListSaver instance = new UserListSaver();
        instance.saveList(list);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
