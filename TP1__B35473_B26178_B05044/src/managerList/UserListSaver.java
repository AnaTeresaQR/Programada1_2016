package managerList;

import files.FileWriter;
import java.io.IOException;
import java.util.List;
import usersBuilder.User;

/**
 * Class writes the list stored in the collection in a binary file
 *
 * @author Robert Sánchez, Edgardo Quirós, Ana Teresa Quesada.
 */
public class UserListSaver {

    private final FileWriter<User> fileWriter;
    private final String FILE_NAME = "usersFile.bin"; // users binary file

    public UserListSaver() {
        fileWriter = new FileWriter<>(FILE_NAME);
    }

    /**
     * Method loops through the list and is responsible for storing each item in
     * binary files of users
     *
     * @param list, receives the list to write in the file
     */
    public void saveList(List<User> list) {
        try {
            fileWriter.clear(); // first clear the file
            fileWriter.open();

            for (User userTemp : list) {
                fileWriter.write(userTemp); // write a user in the binary file
            }

            fileWriter.close();
        } catch (IOException e) {
            System.out.println("No se puede guardar la lista\n" + e.getMessage());
        }
    }
}
