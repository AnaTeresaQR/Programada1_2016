/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package files;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

/**
 *
 * @author Ana Teresa
 */
public class FileLoader {

    URL url = null; // Unified resource located
    File userFile;
    String fileName;

    public FileLoader(String fileName) {
        this.fileName = fileName;
        load();
    }

    private void load() {
        try {

            this.url = getClass().getResource(fileName);
            this.userFile = new File(url.toURI());

        } catch (URISyntaxException e) {
            System.err.println("Error en el URI");
        }
    }

    /**
     * Envia un File para ser cargado
     *
     * @return File conteniendo información sobre el userFile de jugadores
     */
    public File getFile() {

        return this.userFile;

    } // Fin enviar

    public void clear() throws IOException {
        userFile.delete();
        userFile.createNewFile();
    }
}
