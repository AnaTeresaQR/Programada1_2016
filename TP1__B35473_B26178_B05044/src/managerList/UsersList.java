package managerList;

import java.util.ArrayList;
import java.util.List;
import tp_subasta.Excepcion;
import tp_subasta.User;

/**
 *
 * @author Ana Teresa
 */
public class UsersList {

    private List<User> userslist;

    public UsersList() {
        userslist = new ArrayList<>();
        listLoader();
    }

    public boolean register(User user) {
        if (!exist(user)) {
            return userslist.add(user);
        }
        return false;
    }

    public User login(String email, String password) throws Excepcion {
        for (User temp : userslist) {
            // Pregunta si el email es correcto
            if (temp.getEmail().equals(email)) {
                // Pregunta si la contraseña es correcta
                if (temp.getPassword().equals(password)) {
                    // Retorna al jugado encontrado
                    return temp;
                }
            }
        }
        // No se encuentra al jugador
        throw new Excepcion("No se encontro el usuario");
    }

    public User getIndex(int i) {
        return userslist.get(i);
    }

    public boolean exist(User user) {
        for (User u : userslist) {
            if (u.getEmail().equals(user.getEmail())
                    || u.getId().equals(user.getId())) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return userslist.size();
    }

    private void listLoader() {
        UserListLoader loader = new UserListLoader();
        this.userslist = loader.loadList();
    }

    public void refresh() {
        userslist.clear();
        listLoader();
    }

    public void save() {
        UserListSaver save = new UserListSaver();
        save.saveList(this.userslist);
    }

}
