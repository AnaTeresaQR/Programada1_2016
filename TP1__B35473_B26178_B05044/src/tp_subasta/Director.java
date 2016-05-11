package tp_subasta;

import java.util.Calendar;

/**
 *
 * @author robert
 */
public class Director {

    public User createUser(AbstractBuilderCreateUser builder, String id, String name, String email, String password, Calendar birthday, String phoneNumber) throws Excepcion {
        
        if (builder == null) {
            builder = new ConcreteBuilderCrearUsuario();
        }
        
        builder.buildId(id);
        builder.buildName(name);
        builder.buildEmail(email);
        builder.buildPassword(password);
        builder.buildBirthday(birthday);
        builder.buildPhoneNumber(phoneNumber);
        
        return builder.getUser();
    }
    
}
