/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp_subasta;

import java.util.Calendar;

/**
 *
 * @author robert
 */
public interface AbstractBuilderCreateUser {

    public void buildId(String id) throws Excepcion;

    public void buildName(String name) throws Excepcion;

    public void buildEmail(String email) throws Excepcion;

    public void buildPassword(String password) throws Excepcion;

    public void buildBirthday(Calendar birthday) throws Excepcion;

    public void buildPhoneNumber(String phoneNumber) throws Excepcion;

    public User getUser() throws Excepcion;
}
