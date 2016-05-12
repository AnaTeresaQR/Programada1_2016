/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerList;

import files.FileReader;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import tp_subasta.User;

/**
 *
 * @author Ana Teresa
 */
public class UserListLoader {

    private FileReader<User> reader;
    private final String FILE_NAME = "usersFile.bin";

    public UserListLoader() {
        reader = new FileReader<>(FILE_NAME);
    }

    public List<User> loadList() {

        List<User> list = new ArrayList<>();

        try {
            reader.open();
            while (true) {
                list.add(reader.read());
            }

            // If we read the file end
        } catch (EOFException e) {
            return list;
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("Hubo un error en el arhico o no se encontro la clase que se buscaba\n" + ex.getMessage());
        } catch (NullPointerException e) {
            return new ArrayList<>();
        } finally {
            try {
                reader.close();
            } catch (IOException ex) {
                reader = null;
            }
        }
        return list;
    }
}
