package dao;

import modelo.Consulta;
import persistencia.ArchivoManager;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juanes Cardona
 */
public class ConsultaDAO {

   /* private ArchivoManager archivo;
    private ArrayList<Consulta> consultas;

    public ConsultaDAO() {
        archivo = new ArchivoManager("data/consultas.txt");
        consultas = obtenerTodas(); // Cargar desde archivo
    }

    public boolean guardarConsulta(Consulta consulta) {
        for (Consulta c : consultas) {
            if (c.getCodigo().equals(consulta.getCodigo())) {
                return false; // Ya existe
            }
        }
        consultas.add(consulta);
        guardarEnArchivo(consulta);
        return true;
    }

    private void guardarEnArchivo(Consulta consulta) {
        archivo.escribirLinea(consulta.toLineaArchivo());
    }

    public Consulta buscarConsulta(String codigo) {
        for (Consulta c : consultas) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }

    public boolean eliminarConsulta(String codigo) {
        for (Consulta c : consultas) {
            if (c.getCodigo().equals(codigo)) {
                consultas.remove(c);
                sobreescribirLista(consultas);
                return true;
            }
        }
        return false;
    }

    public boolean editarConsulta(String codigo, Consulta nuevaConsulta) {
        for (Consulta c : consultas) {
            if (c.getCodigo().equals(codigo)) {
                c.setFecha(nuevaConsulta.getFecha()); // Usa LocalDate directamente
                sobreescribirLista(consultas);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Consulta> obtenerTodas() {
        ArrayList<Consulta> lista = new ArrayList<>();
        List<String> lineas = archivo.leerLineas();

        for (String linea : lineas) {
            Consulta c = Consulta.desdeLineaArchivo(linea);
            if (c != null) lista.add(c);
        }

        return lista;
    }

    private void sobreescribirLista(List<Consulta> consultas) {
        List<String> lineas = new ArrayList<>();
        for (Consulta c : consultas) {
            lineas.add(c.toLineaArchivo());
        }
        archivo.sobrescribirArchivo(lineas);
    }*/
}
