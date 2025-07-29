/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;
import dao.DaoMedicina;
import dao.MascotaDAO;
import dto.DtoMedicina;
import dto.MascotaDTO;
import java.util.List;

/**
 *
 * @author Juanes Cardona
 */
public class ControladorMedicina {
    private final DaoMedicina dao;

    public ControladorMedicina() {
        this.dao = DaoMedicina.getInstancia();
    }

    public boolean registrarMedicina(DtoMedicina nueva) {
        try {

            dao.guardarMedicina(nueva);
            return true;
        } catch (IllegalArgumentException ex) {
            System.err.println("Error al registrar mascota: " + ex.getMessage());
            return false;
        }
    }

    public boolean editarMedicina(DtoMedicina medicina) {
        try {
            return dao.editarMedicina(medicina);
        } catch (IllegalArgumentException ex) {
            System.err.println("Error al editar mascota: " + ex.getMessage());
            return false;
        }
    }

    public boolean eliminarMedicina(String codigo) {
        try {
            dao.eliminarMedicina(codigo);
            return true;
        } catch (IllegalArgumentException ex) {
            System.err.println("Error al eliminar mascota: " + ex.getMessage());
            return false;
        }
    }

    public List<DtoMedicina> obtenerMedicina() {
        return dao.listar();
    }

    public DtoMedicina buscarMedicinaPorcodigo(String codigo) {
        return dao.buscarPorCodigo(codigo);
    }

}

