/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author Juanes Cardona
 */
public class VacunaDTO extends DtoMedicina implements Serializable {
    
    private String tipo;
    private String lote;

    public VacunaDTO( String tipo, String codigo, String fecha, String idMas, String docProp, String nomMascota,String lote) {
        super(codigo, fecha, idMas, docProp, nomMascota);
        setTipo(tipo);
        setLote(lote);
    }

    public String getLote() {
        return lote;
    }

    public void setLote(String lote) {
        this.lote = lote;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
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

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}

