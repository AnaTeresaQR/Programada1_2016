/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;


/**
 *
 * @author Ana Teresa
 * @param <T>
 */
public class FileReader <T>{
    private ObjectInputStream reader;
    private final FileLoader loader;
    
    public FileReader(String fileName){
        loader = new FileLoader(fileName);
    }
    
      /**
     * Abrir para poder leer el archivo
     *
     * @throws java.io.IOException si no se abre correctamente
     */
    public void open() throws IOException {
        try {
            FileInputStream fileInputStream = new FileInputStream(loader.getFile());
            reader = new ObjectInputStream(fileInputStream);

        } catch (EOFException e) {
            System.out.println(e.getMessage());
        }
    }
    
    /**
     * Método que se encarga de leer el archivo
     *
     * @return el jugador leido
     * @throws java.io.IOException error en el archivo
     * @throws java.lang.ClassNotFoundException si no encuentra la clase que
     * busca
     * @throws java.io.EOFException si se encuentra al final del archivo
     */
    public T read() throws IOException, EOFException, ClassNotFoundException {
        return (T) reader.readObject();
    }
    
    /**
     * Cerrar el archivo luego de la lectura
     *
     * @throws java.io.IOException si hay problemas al cerrar el archivo
     */
    public void close() throws IOException {
        if (reader != null) {
            reader.close();
        }
    }
    
}
