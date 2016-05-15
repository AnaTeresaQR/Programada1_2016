package usersBuilder;

import java.util.GregorianCalendar;

/**
 *
 * @author Robert Sánchez, Edgardo Quirós, Ana Teresa Quesada.
 */
public class MainBuilderUser {

    public static void main(String[] args) {

        AbstractBuilderCreateUser abs = null;

        Director director = new Director();

        try {

            User user1 = director.createUser(abs, "206780357", "Chester", "chester112@gmail.com", "123456A", new GregorianCalendar(1995, 6, 29), "88888888");
            System.out.println("" + user1.toString());

        } catch (CustomException ex) {
            System.out.println("" + ex.getMessage());
        }

    }

}
