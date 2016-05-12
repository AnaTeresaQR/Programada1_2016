/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerList;

import files.FileWriter;
import java.io.IOException;
import java.util.List;
import tp_subasta.User;

/**
 *
 * @author Ana Teresa
 */
public class UserListSaver {
    private final FileWriter<User> fileWriter;
    private final String FILE_NAME = "usersFile.bin";
    
    public  UserListSaver(){
         fileWriter = new FileWriter<>(FILE_NAME);
    }
    
    public void saveList(List<User> list){
        try {
            fileWriter.clear();
            fileWriter.open();
            
            for(User u: list){
                fileWriter.write(u);
            }
            
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("No se puede guardar la lista\n" + e.getMessage());
        }
    }
}
