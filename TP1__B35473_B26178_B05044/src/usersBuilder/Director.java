package usersBuilder;

import java.util.Calendar;

/**
 * Class is responsible for creating the user object completely, with all its
 * parts verified
 *
 * @author Robert Sánchez, Edgardo Quirós, Ana Teresa Quesada.
 */
public class Director {

    /**
     * Method that is responsible for validating every part of creation, before
     * returning the object
     *
     * @param builder, the instance of the concrete parts creator
     * @param id, the user schedule
     * @param name, the user name
     * @param email, the user email
     * @param password, the user email password
     * @param birthdate, the user birthdate
     * @param phoneNumber, the user phoneNumber
     * @return the user completely validate
     * @throws CustomException if could not create one of the parties
     */
    public User createUser(AbstractBuilderCreateUser builder, String id, String name, String email, String password, Calendar birthdate, String phoneNumber) throws CustomException {

        if (builder == null) {
            builder = new ConcreteBuilderCreateUser();
        }

        builder.buildId(id);
        builder.buildName(name);
        builder.buildEmail(email);
        builder.buildPassword(password);
        builder.buildBirthdate(birthdate);
        builder.buildPhoneNumber(phoneNumber);

        return builder.getUser();
    }

}
