/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerList;

import java.util.GregorianCalendar;
import tp_subasta.AbstractBuilderCreateUser;
import tp_subasta.Director;
import tp_subasta.Excepcion;
import tp_subasta.User;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) throws Excepcion {

        AbstractBuilderCreateUser abs = null;

        Director director = new Director();

        User user3 = director.createUser(abs, "207670378", "Chester", "chester7@ucrso.info", "chester123", new GregorianCalendar(1995, 9, 9), "84590688");
        UsersList userList = new UsersList();
        // Guardamos la lista
        userList.save();
        // Se refresca
        userList.refresh();

        System.out.println(userList.getIndex(0));
        System.out.println("");

    }

}
