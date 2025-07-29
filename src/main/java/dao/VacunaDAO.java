package dao;

import modelo.Vacuna;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juanes Cardona
 */
public class VacunaDAO {

    // Lista que almacena todas las vacunas registradas
   /* private List<Vacuna> vacunas = new ArrayList<>();

    // Constructor vacío
    public VacunaDAO() {}

    // Método para guardar una vacuna
    public boolean guardarVacuna(Vacuna vacuna) {
        if (vacuna != null) {
            vacunas.add(vacuna);
            return true;
        }
        return false;
    }

    // Buscar por tipo y lote
    public Vacuna buscarVacuna(String tipo, String lote) {
        for (int i = 0; i < vacunas.size(); i++) {
            Vacuna v = vacunas.get(i);
            if (v.getTipo().equals(tipo) && v.getLote().equals(lote)) {
                return v;
            }
        }
        return null;
    }

    // Eliminar vacuna por tipo y lote 
    public boolean eliminarVacuna(String tipo, String lote) {
        for (int i = 0; i < vacunas.size(); i++) {
            Vacuna v = vacunas.get(i);
            if (v.getTipo().equals(tipo) && v.getLote().equals(lote)) {
                vacunas.remove(i);
                return true;
            }
        }
        return false;
    }

    // Editar datos de una vacuna
    public boolean editarVacuna(String tipo, String lote, Vacuna nueva) {
        for (int i = 0; i < vacunas.size(); i++) {
            Vacuna v = vacunas.get(i);
            if (v.getTipo().equals(tipo) && v.getLote().equals(lote)) {
                v.setFechaAplicacion(nueva.getFechaAplicacion());
                v.setProximaDosis(nueva.getProximaDosis());
                return true;
            }
        }
        return false;
    }

    // Obtener todas las vacunas 
    public List<Vacuna> obtenerTodas() {
        return new ArrayList<>(vacunas);
    }*/
}
