/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;
import modelo.Mascota;
import modelo.Propietario;
import dao.*;
/**
 *
 * @author Juanes Cardona
 */




public class PropietarioControlador {

    private PropietarioDAO dao;

    public PropietarioControlador(PropietarioDAO dao) {
        this.dao = dao;
    }

    public boolean registrarPropietario(String nombre, String documento, String telefono) {
        // Validar que los campos no estén vacíos y tengan longitud adecuada
        if ((nombre == null || nombre.isBlank()) ||
            (documento == null || documento.length() < 5) ||
            (telefono == null || telefono.length() < 7)) {
            return false;
        }

        Propietario nuevo = new Propietario(nombre, documento, telefono);
        return dao.guardarPropietario(nuevo);
    }

    public Propietario buscarPropietario(String documento) {
        // Validar que el documento no esté vacío
        if (documento == null || documento.isBlank()) {
            return null;
        }
        return dao.buscarPropietario(documento);
    }

    public boolean editarPropietario(String documentoActual, String nuevoNombre, String nuevoTelefono) {
        // Validar datos nuevos y actuales
        if ((documentoActual == null || documentoActual.isBlank()) ||
            (nuevoNombre == null || nuevoNombre.isBlank()) ||
            (nuevoTelefono == null || nuevoTelefono.length() < 7)) {
            return false;
        }

        Propietario actualizado = new Propietario(nuevoNombre, documentoActual, nuevoTelefono);
        return dao.editarPropietario(documentoActual, actualizado);
    }

    public boolean eliminarPropietario(String documento) {
        // Validar documento antes de eliminar
        if (documento == null || documento.isBlank()) {
            return false;
        }
        return dao.eliminarPropietario(documento);
    }
}

