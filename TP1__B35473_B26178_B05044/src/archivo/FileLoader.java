/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivo;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;

/**
 *
 * @author Ana Teresa
 */
public class FileLoader {
    URL url = null; // Unified resource located
    File userFile;

    /**
     * Envia un File para ser cargado
     *
     * @return File conteniendo información sobre el userFile de jugadores
     */
    public File load() {

        try {

            this.url = getClass().getResource("usersFile.bin");
            this.userFile = new File(url.toURI());

            return this.userFile;

        } catch (URISyntaxException e) {
            System.err.println("Error en el URI");
        }
        return null;

    } // Fin enviar
}
