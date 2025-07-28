package dao;

import dto.MascotaDTO;
import modelo.Mascota;
import persistencia.ArchivoManager;
import java.util.ArrayList;
import java.util.List;
import persistencia.GestorPersistencia;

/**
 *
 * @author Juanes Cardona
 */
public class MascotaDAO {
    
    private final String ruta = "data/mascotas.dat";
    private final GestorPersistencia gestor = GestorPersistencia.getInstance();

    private static MascotaDAO instancia;

    private MascotaDAO() {}

    public static MascotaDAO getInstancia() {
        if (instancia == null) {
            instancia = new MascotaDAO();
        }
        return instancia;
    }

    public void guardarMascots(MascotaDTO mascota) {
        ArrayList<MascotaDTO> lista = listar();

        for (MascotaDTO m : lista) {
            if (m.getId().equalsIgnoreCase(mascota.getId())) {
                throw new IllegalArgumentException("Ya existe una mascota con ese ID.");
            }
        }

        lista.add(mascota);
        gestor.guardarLista(ruta, lista);
    }

    public ArrayList<MascotaDTO> listar() {
        ArrayList<MascotaDTO> lista = gestor.cargarLista(ruta);
        return lista != null ? lista : new ArrayList<>();
    }

    public boolean editarMascota(String idMas, MascotaDTO mascotaActualizada) {
        ArrayList<MascotaDTO> lista = listar();

        for (int i = 0; i < lista.size(); i++) {
            MascotaDTO actual = lista.get(i);
            if (actual.getId().equalsIgnoreCase(idMas)) {
                lista.set(i, mascotaActualizada);
                gestor.guardarLista(ruta, lista);
                return true;
            }
        }

        throw new IllegalArgumentException("No se encontró la mascota con ID: " + idMas);
    }

    public void eliminarMascota(String idMas) {
        ArrayList<MascotaDTO> lista = listar();

        MascotaDTO encontrada = null;
        for (MascotaDTO m : lista) {
            if (m.getId().equalsIgnoreCase(idMas)) {
                encontrada = m;
                break;
            }
        }

        if (encontrada != null) {
            lista.remove(encontrada);
            gestor.guardarLista(ruta, lista);
        } else {
            throw new IllegalArgumentException("No se encontró la mascota con ID: " + idMas);
        }
    }

    public MascotaDTO buscarPorId(String id) {
        for (MascotaDTO m : listar()) {
            if (m.getId().equalsIgnoreCase(id)) {
                return m;
            }
        }
        return null;
    }
}



  /*  private ArchivoManager archivo;
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
    }*/

