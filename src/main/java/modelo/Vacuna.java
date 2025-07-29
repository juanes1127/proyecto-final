/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Juanes Cardona
 */
public class Vacuna extends Medicina implements Serializable{
    private String tipo;
    private String lote;

    public Vacuna(String tipo, String lote, String fecha, String codigo, String idMas, String docProp, String nomMascota) {
        super(codigo, fecha, idMas, docProp, nomMascota);
        setTipo(tipo);
        setLote(lote);
    }

    public String getIdMas() {
        return idMas;
    }

    public void setIdMas(String idMas) {
        this.idMas = idMas;
    }

    public String getNomMascota() {
        return nomMascota;
    }

    public void setNomMascota(String nomMascota) {
        this.nomMascota = nomMascota;
    }


    public String getDocProp() {
        return docProp;
    }

    public void setDocProp(String docProp) {
        this.docProp = docProp;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public LocalDate getFecha() {
        return fecha;
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

  
}
  /*  public String toLineaArchivo() {
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
    }*/
    

