/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import dto.DtoMedicina;
import java.util.List;
import persistencia.GestorPersistencia;

/**
 *
 * @author Juanes Cardona
 */
public class DaoMedicina {
  private final String ruta = "data/medicina.dat";
  
    private final GestorPersistencia gestor = GestorPersistencia.getInstance();

    private static DaoMedicina instancia;

    private DaoMedicina() {}

    public static DaoMedicina getInstancia() {
        if (instancia == null) {
            instancia = new DaoMedicina();
        }
        return instancia;
    }
    // Método para agregar una medicina (consulta o vacuna)
    public void guardarMedicina(DtoMedicina medicina) {
        List<DtoMedicina> listamedicina = listar();

        for (DtoMedicina m : listamedicina) {
            if (m.getCodigo().equalsIgnoreCase(medicina.getCodigo())) {
                throw new IllegalArgumentException("Ya existe un registro con el codigo: "+ m.getCodigo());
            }
        }

        listamedicina.add(medicina);
        gestor.guardarLista(ruta, listamedicina);
    }

    public List<DtoMedicina> listar() {
        List<DtoMedicina> lista = gestor.cargarLista(ruta);
        return lista != null ? lista : new ArrayList<>();
    }

    public boolean editarMedicina(DtoMedicina medicinaNueva) {
        List<DtoMedicina> listaMedicina = listar();

        for (int i = 0; i < listaMedicina.size(); i++) {
            DtoMedicina actual = listaMedicina.get(i);
            if (actual.getCodigo().equalsIgnoreCase(medicinaNueva.getCodigo())) {
                listaMedicina.set(i, medicinaNueva);
                gestor.guardarLista(ruta, listaMedicina);
                return true;
            }
        }

        throw new IllegalArgumentException("No se encontró el registro: " + medicinaNueva.getCodigo());
    }

    public void eliminarMedicina(String codigo) {
        List<DtoMedicina> listaMedicina = listar();

        DtoMedicina encontrada = null;
        for (DtoMedicina m : listaMedicina) {
            if (m.getCodigo().equalsIgnoreCase(codigo)) {
                encontrada = m;
                break;
            }
        }

        if (encontrada != null) {
            listaMedicina.remove(encontrada);
            gestor.guardarLista(ruta, listaMedicina);
        } else {
            throw new IllegalArgumentException("No se encontró el registro con el codigo: " + codigo);
        }
    }

    public DtoMedicina buscarPorCodigo(String codigo) {
        for (DtoMedicina m : listar()) {
            if (m.getCodigo().equalsIgnoreCase(codigo)) {
                return m;
            }
        }
        return null;
    }
}


