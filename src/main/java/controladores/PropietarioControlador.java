/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import dao.PropietarioDAO;
import dto.PropietarioDTO;
import java.util.ArrayList;
import modelo.Propietario;

/**
 * Juanes Cardona
 */
public class PropietarioControlador {


    private final PropietarioDAO dao;

    public PropietarioControlador() {
        this.dao = PropietarioDAO.getInstancia();
    }

    // Registrar propietario
    public boolean registrarPropietario(PropietarioDTO nuevo) {
        try {
            dao.guardarPropietario(nuevo);
            return true;
        } catch (IllegalArgumentException ex) {
            System.err.println("Error al registrar propietario: " + ex.getMessage());
            return false;
        }
    }

    // Editar propietario
    public boolean editarPropietario(String documento, PropietarioDTO propietarioActualizado) {
        try {
            return dao.editarPropietario(documento, propietarioActualizado);
        } catch (IllegalArgumentException ex) {
            System.err.println("Error al editar propietario: " + ex.getMessage());
            return false;
        }
    }

    // Eliminar propietario
    public boolean eliminarPropietario(String documento) {
        try {
            dao.eliminarPropietario(documento);
            return true;
        } catch (IllegalArgumentException ex) {
            System.err.println("Error al eliminar propietario: " + ex.getMessage());
            return false;
        }
    }

    // Listar todos los propietarios
    public ArrayList<PropietarioDTO> obtenerPropietarios() {
        return dao.listar();
    }

    // Buscar un propietario por documento
    public PropietarioDTO buscarPropietarioPorDocumento(String documento) {
        return dao.buscarPorDocumento(documento);
    }
}

