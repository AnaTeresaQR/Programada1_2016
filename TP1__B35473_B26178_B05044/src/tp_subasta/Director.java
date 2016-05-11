package tp_subasta;

import java.util.Calendar;

/**
 *
 * @author Robert Sánchez, Edgardo Quirós, Ana Teresa Quesada.
 */
public class Director {

    public User createUser(AbstractBuilderCreateUser builder, String id, String name, String email, String password, Calendar birthday, String phoneNumber) throws Excepcion {
        
        if (builder == null) {
            builder = new ConcreteBuilderCreateUser();
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
