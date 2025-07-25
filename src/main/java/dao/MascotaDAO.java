package dao;

import modelo.Mascota;
import persistencia.ArchivoManager;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juanes Cardona
 */
public class MascotaDAO {

    private ArchivoManager archivo;
    private ArrayList<Mascota> mascotas;

    public MascotaDAO() {
        archivo = new ArchivoManager("data/mascotas.txt");
        mascotas = obtenerTodas(); // Carga todas al inicio
    }

    public boolean guardarMascota(Mascota nueva) {
        for (Mascota m : mascotas) {
            if (m.getNombre().equalsIgnoreCase(nueva.getNombre())) {
                return false; // Ya existe por nombre
            }
        }
        mascotas.add(nueva);
        guardarEnArchivo(nueva);
        return true;
    }

    private void guardarEnArchivo(Mascota mascota) {
        archivo.escribirLinea(mascota.toLineaArchivo());
    }

    public Mascota buscarMascota(String id) {
        for (Mascota m : mascotas) {
            if (m.getNombre().equalsIgnoreCase(id)) {
                return m;
            }
        }
        return null;
    }

    public boolean eliminarMascota(String id) {
        for (Mascota m : mascotas) {
            if (m.getNombre().equalsIgnoreCase(id)) {
                mascotas.remove(m);
                sobreescribirLista(mascotas);
                return true;
            }
        }
        return false;
    }

   public boolean editarMascota(Mascota nueva) {
    if (nueva == null || nueva.getId() == null || nueva.getId().isBlank()) {
        return false;
    }

    for (int i = 0; i < mascotas.size(); i++) {
        if (mascotas.get(i).getId().equals(nueva.getId())) {
            mascotas.set(i, nueva);
            sobreescribirLista(mascotas);
            return true;
        }
    }
    return false;
}


    public ArrayList<Mascota> obtenerTodas() {
        ArrayList<Mascota> lista = new ArrayList<>();
        List<String> lineas = archivo.leerLineas();

        for (String linea : lineas) {
            Mascota m = Mascota.desdeLineaArchivo(linea);
            if (m != null) lista.add(m);
        }

        return lista;
    }

    private void sobreescribirLista(List<Mascota> mascotas) {
        List<String> lineas = new ArrayList<>();
        for (Mascota m : mascotas) {
            lineas.add(m.toLineaArchivo());
        }
        archivo.sobrescribirArchivo(lineas);
    }
}
