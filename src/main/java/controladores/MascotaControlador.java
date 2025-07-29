/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import dao.MascotaDAO;
import dto.MascotaDTO;
import java.util.ArrayList;
import modelo.Mascota;

import java.util.List;
import javax.swing.JOptionPane;
import utiles.Generator;

/**
 * Juanes Cardona
 */
public class MascotaControlador {

 private final MascotaDAO dao;

    public MascotaControlador() {
        this.dao = MascotaDAO.getInstancia();
    }

    // Registrar mascota
    public boolean registrarMascota(MascotaDTO nueva) {
        try {

            dao.guardarMascots(nueva);
            return true;
        } catch (IllegalArgumentException ex) {
            System.err.println("Error al registrar mascota: " + ex.getMessage());
            return false;
        }
    }

    // Editar mascota
    public boolean editarMascota(String idMas, MascotaDTO mascotaActualizada) {
        try {
            return dao.editarMascota(idMas, mascotaActualizada);
        } catch (IllegalArgumentException ex) {
            System.err.println("Error al editar mascota: " + ex.getMessage());
            return false;
        }
    }

    // Eliminar mascota
    public boolean eliminarMascota(String idMas) {
        try {
            dao.eliminarMascota(idMas);
            return true;
        } catch (IllegalArgumentException ex) {
            System.err.println("Error al eliminar mascota: " + ex.getMessage());
            return false;
        }
    }

    // Listar todas las mascotas
    public List<MascotaDTO> obtenerMascotas() {
        return dao.listar();
    }

    // Buscar una mascota por ID
    public MascotaDTO buscarMascotaPorId(String id) {
        return dao.buscarPorId(id);
    }
    // o el método que uses

}
   /* private MascotaDAO dao;

    public MascotaControlador(MascotaDAO dao) {
        this.dao = dao;
    }
    
       public boolean guardarMascota(Mascota nueva) {
        try {
            if (nueva == null) return false;
            if (nueva.getId() == null || nueva.getId().isBlank()) return false;
            if (nueva.getNombre() == null || nueva.getNombre().isBlank()) return false;
            if (nueva.getDocumentoProp() == null || nueva.getDocumentoProp().isBlank()) return false;

            return dao.guardarMascota(nueva);
        } catch (IllegalArgumentException e) {
            System.out.println("Argumento inválido al guardar mascota: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Faltan datos obligatorios al guardar mascota.");
        } catch (Exception e) {
            System.out.println("Error inesperado al guardar mascota: " + e.getMessage());
        }
        return false;
    }

    public boolean editarMascota(Mascota nueva) {
        try {
            if (nueva == null) return false;
            if (nueva.getId() == null || nueva.getId().isBlank()) return false;
            if (nueva.getNombre() == null || nueva.getNombre().isBlank()) return false;
            if (nueva.getDocumentoProp() == null || nueva.getDocumentoProp().isBlank()) return false;

            return dao.editarMascota(nueva);
        } catch (IllegalArgumentException e) {
            System.out.println("Argumento inválido al editar mascota: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Faltan datos obligatorios al editar mascota.");
        } catch (Exception e) {
            System.out.println("Error inesperado al editar mascota: " + e.getMessage());
        }
        return false;
    }

    public Mascota buscarMascota(String id) {
        try {
            if (id == null || id.isBlank()) return null;
            return dao.buscarMascota(id);
        } catch (Exception e) {
            System.out.println("Error al buscar mascota: " + e.getMessage());
            return null;
        }
    }

    public boolean eliminarMascota(String id) {
        try {
            if (id == null || id.isBlank()) return false;
            return dao.eliminarMascota(id);
        } catch (Exception e) {
            System.out.println("Error al eliminar mascota: " + e.getMessage());
            return false;
        }
    }
   
    /*public boolean guardarMascota(Mascota nueva) {
        try {
            // Validaciones básicas
    if (nueva == null) return false;
    if (nueva.getId() == null || nueva.getId().isBlank()) return false;
    if (nueva.getNombre() == null || nueva.getNombre().isBlank()) return false;
    if (nueva.getDocumentoProp() == null || nueva.getDocumentoProp().isBlank()) return false;


            return dao.guardarMascota(nueva);

        } catch (Exception e) {
            System.out.println("Error al guardar la mascota: " + e.getMessage());
            return false;
        }
    }
    
    
   public boolean editarMascota(Mascota nueva) {  
    if (nueva == null) return false;
    if (nueva.getId() == null || nueva.getId().isBlank()) return false;
    if (nueva.getNombre() == null || nueva.getNombre().isBlank()) return false;
    if (nueva.getDocumentoProp() == null || nueva.getDocumentoProp().isBlank()) return false;

    return dao.editarMascota(nueva);
}
   
   
   public Mascota buscarMascota(String id ){
    if (id == null || id.isBlank()) {    
          return null;
    }
    return dao.buscarMascota(id);
   }
   
   public boolean eliminarMascota(String id){
         if (id == null || id.isBlank()) {    
          return false;
    }
         return dao.eliminarMascota(id);
       
   }*/


   






        
