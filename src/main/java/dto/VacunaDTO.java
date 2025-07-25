/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.time.LocalDate;

/**
 *
 * @author Juanes Cardona
 */
public class VacunaDTO {
    private String tipo;
    private String lote;
    private LocalDate fechaAplicacion;
    private LocalDate proximaDosis;
    
 public VacunaDTO(String tipo, String lote, LocalDate fechaAplicacion, LocalDate proximaDosis) {
        setTipo(tipo);
        setLote(lote);
        setFechaAplicacion(fechaAplicacion);
        setProximaDosis(proximaDosis);
    }

    // Getter y Setter para tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo != null && !tipo.isBlank()) {
          throw new IllegalArgumentException("El tipo no puede estar vacio");
        }
        this.tipo = tipo;
    }
        
    // Getter y Setter para lote
    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        if (lote != null && !lote.isBlank()) {
            this.lote = lote;
        }
    }

    // Getter y Setter para fechaAplicacion
    public LocalDate getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(LocalDate fechaAplicacion) {
        if (fechaAplicacion != null) {
            this.fechaAplicacion = fechaAplicacion;
        }
    }

    // Getter y Setter para proximaDosis
    public LocalDate getProximaDosis() {
        return proximaDosis;
    }

    public void setProximaDosis(LocalDate proximaDosis) {
        if (proximaDosis != null) {
            this.proximaDosis = proximaDosis;
        }
    }

    // Método auxiliar si se desea mostrar
    public String mostrarVacuna() {
        return "Tipo: " + tipo + " | Lote: " + lote +
               " | Fecha Aplicación: " + fechaAplicacion +
               " | Próxima dosis: " + proximaDosis;
    }   
}
