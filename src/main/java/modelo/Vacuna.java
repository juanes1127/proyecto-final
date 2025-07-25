/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Juanes Cardona
 */
public class Vacuna {
    private String tipo;
    private String lote;
    private LocalDate fechaAplicacion;
    private LocalDate proximaDosis;

    public Vacuna(String tipo, String lote, LocalDate fechaAplicacion, LocalDate proximaDosis) {
        this.tipo = tipo;
        this.lote = lote;
        this.fechaAplicacion = fechaAplicacion;
        this.proximaDosis = proximaDosis;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public LocalDate getFechaAplicacion() {
        return fechaAplicacion;
    }

    public void setFechaAplicacion(LocalDate fechaAplicacion) {
        this.fechaAplicacion = fechaAplicacion;
    }

    public LocalDate getProximaDosis() {
        return proximaDosis;
    }

    public void setProximaDosis(LocalDate proximaDosis) {
        this.proximaDosis = proximaDosis;
    }
   
    public String toLineaArchivo() {
        return tipo + "," + lote + "," + fechaAplicacion.toString() + "," + proximaDosis.toString();
    }

   
    public static Vacuna desdeLineaArchivo(String linea) {
        String[] partes = linea.split(",");
        if (partes.length != 4) return null;

        try {
            String tipo = partes[0];
            String lote = partes[1];
            LocalDate fechaAplicacion = LocalDate.parse(partes[2]);
            LocalDate proximaDosis = LocalDate.parse(partes[3]);

            return new Vacuna(tipo, lote, fechaAplicacion, proximaDosis);
        } catch (DateTimeParseException e) {
            return null;
        }
    }
   
    
}
