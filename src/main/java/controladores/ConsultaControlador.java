/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import dao.ConsultaDAO;
import modelo.Consulta;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 * Juanes Cardona
 */
public class ConsultaControlador {

   /* private ConsultaDAO dao;

    public ConsultaControlador(ConsultaDAO dao) {
        if (dao == null) {
            throw new IllegalArgumentException("ConsultaDAO no puede ser null");
        }
        this.dao = dao;
    }

    public boolean registrarConsulta(String codigo, String fechaTexto) {
        try {
            if (codigo == null || codigo.isBlank()) return false;
            if (fechaTexto == null || fechaTexto.isBlank()) return false;

            // Validar formato y valor de fecha
            LocalDate.parse(fechaTexto); // Lanza excepción si es inválida

            // Verificar que no exista una consulta con el mismo código
            if (dao.buscarConsulta(codigo) != null) {
                System.out.println("Ya existe una consulta con ese código.");
                return false;
            }

            Consulta nueva = new Consulta(String codigo, ;
            return dao.guardarConsulta(nueva);
        } catch (DateTimeParseException e) {
            System.out.println("Formato de fecha inválido: " + fechaTexto);
        } catch (IllegalArgumentException e) {
            System.out.println("Argumento inválido al registrar consulta: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Faltan datos obligatorios al registrar consulta.");
        } catch (Exception e) {
            System.out.println("Error inesperado al registrar consulta: " + e.getMessage());
        }
        return false;
    }

    public Consulta buscarConsulta(String codigo) {
        try {
            if (codigo == null || codigo.isBlank()) return null;
            return dao.buscarConsulta(codigo);
        } catch (Exception e) {
            System.out.println("Error al buscar consulta: " + e.getMessage());
            return null;
        }
    }

    public boolean editarConsulta(String codigoOriginal, String nuevaFechaTexto) {
        try {
            if (codigoOriginal == null || codigoOriginal.isBlank()) return false;
            if (nuevaFechaTexto == null || nuevaFechaTexto.isBlank()) return false;

            LocalDate.parse(nuevaFechaTexto); // Validar fecha

            Consulta actualizada = new Consulta(codigoOriginal, LocalDate.EPOCH, codigoOriginal, nuevaFechaTexto)codigoOriginal, nuevaFechaTexto);
            return dao.editarConsulta(codigoOriginal, actualizada);
        } catch (DateTimeParseException e) {
            System.out.println("Formato de fecha inválido: " + nuevaFechaTexto);
        } catch (IllegalArgumentException e) {
            System.out.println("Argumento inválido al editar consulta: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Faltan datos obligatorios al editar consulta.");
        } catch (Exception e) {
            System.out.println("Error inesperado al editar consulta: " + e.getMessage());
        }
        return false;
    }

    public boolean eliminarConsulta(String codigo) {
        try {
            if (codigo == null || codigo.isBlank()) return false;
            return dao.eliminarConsulta(codigo);
        } catch (Exception e) {
            System.out.println("Error al eliminar consulta: " + e.getMessage());
            return false;
        }
    }*/
}
