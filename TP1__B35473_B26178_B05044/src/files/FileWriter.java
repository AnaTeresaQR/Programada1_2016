/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import tp_subasta.User;

/**
 *
 * @author Ana Teresa
 * @param <T> object
 */
public class FileWriter <T>{
    private ObjectOutputStream writer;
    private final FileLoader loader;
    
    public FileWriter(String fileName){
        loader = new FileLoader(fileName);
    }
    
    /**
     * Abre el archivo de registro
     *
     * @throws java.io.IOException excepción si hubo error al abrir el archivo
     */
    public void open() throws IOException {
        FileOutputStream fileOutputStream = new FileOutputStream(loader.load());
        writer = new ObjectOutputStream(fileOutputStream);
    }
    
     /**
     * Se encarga de escribir en el archivo
     * @param object
     * @throws java.io.IOException si se da un error al escribir
     */
    public void writeUser(T object) throws IOException {
        writer.writeObject(object);
    }
    
    /**
     * Cierra el archivo
     *
     * @throws java.io.IOException si hubo error al cerrar el archivo
     */
    public void close() throws IOException {
        if (writer != null) {
            writer.close();
        }
    }
}
