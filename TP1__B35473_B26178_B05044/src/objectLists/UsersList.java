package objectLists;

import enums.EnumFiles;
import java.util.ArrayList;
import java.util.List;
import managerList.ListLoader;
import managerList.ListSaver;
import usersBuilder.CustomException;
import usersBuilder.User;

/**
 * Class that is responsible for handling the user list, is responsible for
 * registering a user or logging a user in the system. Only this class can
 * create an instance of itself. Singleton pattern
 *
 * @author Robert Sánchez, Edgardo Quirós, Ana Teresa Quesada.
 */
public class UsersList {

    private List<User> userslist;
    private static UsersList uniqueInstance;

    private UsersList() {
        userslist = new ArrayList<>();
        listLoader();
    }

    /**
     * Method that creates a single instance of class
     *
     * @return the unique instance of this class
     */
    public static UsersList getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new UsersList();
        }
        return uniqueInstance;
    }

    /**
     * registers a user, adds a user into the list, returns true if can
     * register, or false if failing to register
     *
     * @param user, receives the user to register
     * @return true, if a user could register, false if a user failed to
     * register
     */
    public boolean register(User user) {
        if (!exist(user)) {
            return userslist.add(user);
        }
        return false;
    }

    /**
     * Login a user, search in the user list
     *
     * @param email receives the email to search in the list, if the user exist
     * @param password receives the password to search in the list, if the user
     * exist with the email and the password is correct too
     * @return the user found
     * @throws CustomException if the user is not found
     */
    public User login(String email, String password) throws CustomException {
        for (User temp : userslist) {
            // ask if the email is correct
            if (temp.getEmail().equals(email)) {
                // ask if the password is correct
                if (temp.getPassword().equals(password)) {
                    // return the user found
                    return temp;
                }
            }
        }
        // the user is not found 
        throw new CustomException("No se encontro el usuario");
    }

    /**
     * Returns a user in the list with the index in this list
     *
     * @param i ,the index for search in the list
     * @return the user that matches the list
     */
    public User getIndex(int i) {
        return userslist.get(i);
    }

    /**
     * Check if a user already exist in the list with te same email or with the
     * same id
     *
     * @param user, receives the user to compare with the elements of the list
     * @return, true if have the same attributes with another object in the
     * list, false if does not existe the local object
     */
    public boolean exist(User user) {
        for (int i = 0; i < userslist.size(); i++) {
            if (userslist.get(i).getEmail().equals(user.getEmail())
                    || userslist.get(i).getId().equals(user.getId())) {
                return true;
            }
        }
        return false;
    }

    /**
     * Contains the size of the list
     *
     * @return the size of the list
     */
    public int size() {
        return userslist.size();
    }

    /**
     * Refreshes the list if new users are added
     */
    public void refresh() {
        userslist.clear();
        listLoader();
    }

    /**
     * Load the list with file elements
     */
    private void listLoader() {
        ListLoader<User> loader = new ListLoader<>(EnumFiles.USER_FILE_NAME.getValue());
        this.userslist = loader.loadList();
    }

    /**
     * Save the list in the binary file
     */
    public void save() {
        ListSaver<User> save = new ListSaver<>(EnumFiles.USER_FILE_NAME.getValue());
        save.saveList(this.userslist);
    }

}
