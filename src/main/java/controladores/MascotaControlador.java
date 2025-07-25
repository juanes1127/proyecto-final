/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import dao.MascotaDAO;
import dto.MascotaDTO;
import modelo.Mascota;

import java.util.List;

/**
 * Juanes Cardona
 */
public class MascotaControlador {

    private MascotaDAO dao;

    public MascotaControlador(MascotaDAO dao) {
        this.dao = dao;
    }

    // Registrar mascota usando D
   

// package controlador;



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
}

   






        
