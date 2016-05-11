/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_subasta;

import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author robert
 */
public class MainBuilderUser {

    public static void main(String[] args) {

        AbstractBuilderCreateUser abs = null;

        Director director = new Director();

        try {
           
            
            
            User user1 = director.createUser(abs, "207410170", "AnaTeresaQuesada", "ana.quesada@gmail.com", "123456A", new GregorianCalendar(1995, 6, 29), "87518238");
            System.out.println("" + user1.toString());
        
        
        
        } catch (Excepcion ex) {
            System.out.println("" + ex.getMessage());
        }

    }

}
