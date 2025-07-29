/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.io.Serializable;

/**
 *
 * @author Juanes Cardona
 */
public class VacunaDTO extends DtoMedicina implements Serializable {
    
    private String proximaDosis;
    private String tipo;

    public VacunaDTO(String proximaDosis, String tipo, String codigo, String fecha, String idMas, String docProp, String nomMascota) {
        super(codigo, fecha, idMas, docProp, nomMascota);
        this.proximaDosis = proximaDosis;
        this.tipo = tipo;
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

    public String getProximaDosis() {
        return proximaDosis;
    }

    public void setProximaDosis(String proximaDosis) {
        this.proximaDosis = proximaDosis;
    }
 
}

