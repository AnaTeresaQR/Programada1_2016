package archivo;

import java.io.EOFException;
import java.io.IOException;
import java.util.GregorianCalendar;
import tp_subasta.User;
import tp_subasta.*;

/**
 *
 * @author Ana Teresa
 */
public class Main {

    public static void main(String[] args) throws Excepcion, IOException, EOFException, ClassNotFoundException {
        FileWriter fileWriter = new FileWriter();
        FileReader fileReader = new FileReader();
        
         AbstractBuilderCreateUser abs = null;

        Director director = new Director();

         User user1 = director.createUser(abs, "207410170", "AnaTeresaQuesada", "ana.quesada@gmail.com", "123456A", new GregorianCalendar(1995, 6, 29), "87518238");
         
         fileWriter.open();
         fileWriter.writeUser(user1);
         fileWriter.close();
         
         fileReader.open();
         System.out.println(fileReader.read()); // Obtains an user
         fileReader.close();
         
    }
}
