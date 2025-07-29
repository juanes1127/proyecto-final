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
    String idMas;
    String docProp;
    String nomMascota;

    public DtoMedicina (String codigo, String fecha,String idMas, String docProp,String nomMascota) {
        setCodigo(codigo);
        setFecha(fecha);
        setIdMas(idMas);
        setDocProp(docProp);
        setNomMascota(nomMascota);
    }
 public String getCodigo() {
        return codigo;
    }

    public String getIdMas() {
        return idMas;
    }

    public void setIdMas(String idMas) {
        this.idMas = idMas;
    }

    public String getDocProp() {
        return docProp;
    }

    public void setDocProp(String docProp) {
        this.docProp = docProp;
    }

    public String getNomMascota() {
        return nomMascota;
    }

    public void setNomMascota(String nomMascota) {
        this.nomMascota = nomMascota;
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


