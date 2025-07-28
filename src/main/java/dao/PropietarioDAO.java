package dao;

import dto.PropietarioDTO;
import java.util.ArrayList;
import java.util.List;
import modelo.Propietario;
import persistencia.ArchivoManager;
import persistencia.GestorPersistencia;

/**
 *
 * @author Janes Cardona
 */
public class PropietarioDAO {

    private final String ruta = "data/propietarios.dat";
    private final GestorPersistencia gestor = GestorPersistencia.getInstance();

    private static PropietarioDAO instancia;

    private PropietarioDAO() {}

    public static PropietarioDAO getInstancia() {
        if (instancia == null) {
            instancia = new PropietarioDAO();
        }
        return instancia;
    }

    // Guardar nuevo propietario
    public void guardarPropietario(PropietarioDTO propietario) {
        ArrayList<PropietarioDTO> lista = listar();

        for (PropietarioDTO p : lista) {
            if (p.getDocumento().equalsIgnoreCase(propietario.getDocumento())) {
                throw new IllegalArgumentException("Ya existe un propietario con ese documento.");
            }
        }

        lista.add(propietario);
        gestor.guardarLista(ruta, lista);
    }

    // Listar todos los propietarios
    public ArrayList<PropietarioDTO> listar() {
        ArrayList<PropietarioDTO> lista = gestor.cargarLista(ruta);
        return lista != null ? lista : new ArrayList<>();
    }

    // Editar propietario por documento
    public boolean editarPropietario(String documento, PropietarioDTO actualizado) {
        ArrayList<PropietarioDTO> lista = listar();

        for (int i = 0; i < lista.size(); i++) {
            PropietarioDTO actual = lista.get(i);
            if (actual.getDocumento().equalsIgnoreCase(documento)) {
                lista.set(i, actualizado);
                gestor.guardarLista(ruta, lista);
                return true;
            }
        }

        throw new IllegalArgumentException("No se encontró el propietario con documento: " + documento);
    }

    // Eliminar propietario por documento
    public void eliminarPropietario(String documento) {
        ArrayList<PropietarioDTO> lista = listar();

        PropietarioDTO encontrado = null;
        for (PropietarioDTO p : lista) {
            if (p.getDocumento().equalsIgnoreCase(documento)) {
                encontrado = p;
                break;
            }
        }

        if (encontrado != null) {
            lista.remove(encontrado);
            gestor.guardarLista(ruta, lista);
        } else {
            throw new IllegalArgumentException("No se encontró el propietario con documento: " + documento);
        }
    }

    // Buscar propietario por documento
    public PropietarioDTO buscarPorDocumento(String documento) {
        for (PropietarioDTO p : listar()) {
            if (p.getDocumento().equalsIgnoreCase(documento)) {
                return p;
            }
        }
        return null;
    }
}
