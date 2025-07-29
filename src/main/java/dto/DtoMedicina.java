/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Juanes Cardona
 */
public abstract class DtoMedicina implements Serializable{
    
    String codigo;
    LocalDate fecha;

    public DtoMedicina(String codigo, String fecha) {
        setCodigo(codigo);
        setFecha(fecha);
    }

    public String getCodigo() {
        return codigo;
    }

   public void setCodigo(String codigo) {
    if (codigo == null || codigo.isBlank()) {
        throw new IllegalArgumentException("El código no puede estar vacío.");
    }
    this.codigo = codigo;
}

    public LocalDate getFecha() {
        return fecha;
    }
     public void setFecha(String fechaTexto) {
        try {
            this.fecha = LocalDate.parse(fechaTexto); 
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Formato de fecha inválido.");
        }
    }

 
    
}


