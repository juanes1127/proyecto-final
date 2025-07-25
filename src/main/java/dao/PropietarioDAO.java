package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.Propietario;
import persistencia.ArchivoManager;

/**
 *
 * @author Janes Cardona
 */
public class PropietarioDAO {

    private ArchivoManager archivo;
    private ArrayList<Propietario> propietarios = new ArrayList<>();

    public PropietarioDAO() {
        archivo = new ArchivoManager("data/propietarios.data");
        propietarios = obtenerTodos(); // Carga los datos desde el archivo al iniciar
    }

    public boolean guardarPropietario(Propietario propietario) {
        for (Propietario p : propietarios) {
            if (p.getDocumento().equals(propietario.getDocumento()) ||
                p.getDocumento().equals("-1") || p.getDocumento().equals("200000000")) {
                return false; // Documento inválido o duplicado
            }
        }
        propietarios.add(propietario);
        guardarEnArchivo(propietario);
        return true;
    }

    public void guardarEnArchivo(Propietario propietario) {
        archivo.escribirLinea(propietario.toLineaArchivo());
    }

    public Propietario buscarPropietario(String documento) {
        for (Propietario p : propietarios) {
            if (p.getDocumento().equals(documento)) {
                return p;
            }
        }
        return null;
    }

    public boolean eliminarPropietario(String documento) {
        for (Propietario p : propietarios) {
            if (p.getDocumento().equals(documento)) {
                propietarios.remove(p);
                sobreescribirLista(propietarios);
                return true;
            }
        }
        return false;
    }

    public boolean editarPropietario(String documento, Propietario nuevoPropietario) {
        for (Propietario p : propietarios) {
            if (p.getDocumento().equals(documento)) {
                p.setNombre(nuevoPropietario.getNombre());
                p.setTelefono(nuevoPropietario.getTelefono());
                sobreescribirLista(propietarios);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Propietario> obtenerTodos() {
        ArrayList<Propietario> lista = new ArrayList<>();
        List<String> lineas = archivo.leerLineas();

        for (String linea : lineas) {
            Propietario propietario = Propietario.desdeLineaArchivo(linea);
            lista.add(propietario);
        }
        return lista;
    }

    public void sobreescribirLista(ArrayList<Propietario> propietarios) {
        List<String> lineas = new ArrayList<>();
        for (Propietario p : propietarios) {
            lineas.add(p.toLineaArchivo());
        }
        archivo.sobrescribirArchivo(lineas);
    }
}
