/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistencia;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Juanes Cardona
 */
public class GestorPersistencia {
     private static GestorPersistencia instancia;

    private GestorPersistencia() {}

    public static synchronized GestorPersistencia getInstance() {
        if (instancia == null) {
            instancia = new GestorPersistencia();
        }
        return instancia;
    }

    public <T extends Serializable> void guardarLista(String ruta, ArrayList<T> lista) {
        try {
            //crea archivo
            File archivo = new File(ruta);
            archivo.getParentFile().mkdirs(); //crea carpeta
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(ruta))) {
                oos.writeObject(lista);
            }
        } catch (IOException e) {
                System.err.println("❌ Error al guardar datos: " + e.getMessage());
            }

    }

    public <T extends Serializable> ArrayList<T> cargarLista(String ruta) {
        File archivo = new File(ruta);
        if (!archivo.exists()) {
            return new ArrayList<>();
            //return null; //No hay datos, cuando el archivo no existe todavia

        }

               try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta))) {
            return (ArrayList<T>) ois.readObject();
               } catch (EOFException e) { //retorna lista vacia
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("❌ Error al leer datos: " + e.getMessage());
        }
        return new ArrayList<>();
               //return null;
    }
}

