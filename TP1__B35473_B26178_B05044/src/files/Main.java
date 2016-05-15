package files;

import usersBuilder.CustomException;
import usersBuilder.AbstractBuilderCreateUser;
import usersBuilder.Director;
import java.io.EOFException;
import java.io.IOException;
import java.util.GregorianCalendar;
import java.util.List;
import objectLists.UsersList;
import usersBuilder.User;

/**
 *
 * @author Robert Sánchez, Edgardo Quirós, Ana Teresa Quesada.
 */
public class Main {

    public static void main(String[] args) throws CustomException, IOException, EOFException, ClassNotFoundException {
        String fileNameUser = "usersFile.bin";
        FileWriter<User> fileWriter = new FileWriter<>(fileNameUser);
        FileReader<User> fileReader = new FileReader<>(fileNameUser);

        AbstractBuilderCreateUser abs = null;

        Director director = new Director();

        User user1 = director.createUser(abs, "207410170", "AnaTeresaQuesada", "ana.quesada@gmail.com", "123456A", new GregorianCalendar(1995, 6, 29), "87518238");
        User user2 = director.createUser(abs, "207440892", "Chester", "chester@gmail.com", "123456A", new GregorianCalendar(1995, 9, 17), "88888888");

        UsersList list = UsersList.getUniqueInstance();
        list.register(user1);
        list.register(user2);

        fileWriter.open();
        fileWriter.write((List<User>) list); // write a list of users
        fileWriter.close();

        fileReader.open();
        System.out.println(fileReader.read()); // Obtains a list
        fileReader.close();

    }
}
