/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import dao.VacunaDAO;
import modelo.Vacuna;

import java.time.LocalDate;

/**
 * Juanes Cardona
 */
public class VacunaControlador {

  /*  private VacunaDAO dao;

    public VacunaControlador(VacunaDAO dao) {
        this.dao = dao;
    }

    public boolean registrarVacuna(String tipo, String lote, LocalDate fechaAplicacion, LocalDate proximaDosis) {
        try {
            if (tipo == null || tipo.isBlank()) return false;
            if (lote == null || lote.isBlank()) return false;
            if (fechaAplicacion == null || proximaDosis == null) return false;

            Vacuna nueva = new Vacuna(tipo, lote, fechaAplicacion, proximaDosis);
            return dao.guardarVacuna(nueva);
        } catch (IllegalArgumentException e) {
            System.out.println("Argumento inválido al registrar vacuna: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Faltan datos obligatorios al registrar vacuna.");
        } catch (Exception e) {
            System.out.println("Error inesperado al registrar vacuna: " + e.getMessage());
        }
        return false;
    }

    public Vacuna buscarVacuna(String tipo, String lote) {
        try {
            if (tipo == null || tipo.isBlank()) return null;
            if (lote == null || lote.isBlank()) return null;

            return dao.buscarVacuna(tipo, lote);
        } catch (Exception e) {
            System.out.println("Error al buscar vacuna: " + e.getMessage());
            return null;
        }
    }

    public boolean editarVacuna(String tipo, String lote, LocalDate nuevaFecha, LocalDate nuevaProxima) {
        try {
            if (tipo == null || tipo.isBlank()) return false;
            if (lote == null || lote.isBlank()) return false;
            if (nuevaFecha == null || nuevaProxima == null) return false;

            Vacuna actualizada = new Vacuna(tipo, lote, nuevaFecha, nuevaProxima);
            return dao.editarVacuna(tipo, lote, actualizada);
        } catch (IllegalArgumentException e) {
            System.out.println("Argumento inválido al editar vacuna: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Faltan datos obligatorios al editar vacuna.");
        } catch (Exception e) {
            System.out.println("Error inesperado al editar vacuna: " + e.getMessage());
        }
        return false;
    }

    public boolean eliminarVacuna(String tipo, String lote) {
        try {
            if (tipo == null || tipo.isBlank()) return false;
            if (lote == null || lote.isBlank()) return false;

            return dao.eliminarVacuna(tipo, lote);
        } catch (Exception e) {
            System.out.println("Error al eliminar vacuna: " + e.getMessage());
            return false;
        }
    }*/
}
