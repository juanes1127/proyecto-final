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

    public VacunaDTO (String proximaDosis, String codigo, String fecha, String tipo) {
        super(codigo, fecha);
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
   
    public static VacunaDTO desdeLineaArchivo(String linea) {
    String[] partes = linea.split(",");
    if (partes.length != 4) return null;

    return new VacunaDTO(partes[0], partes[1], partes[2], partes[3]);
}
    public String toLineaArchivo() {
    return proximaDosis + "," + codigo + "," + fecha + "," + tipo;
}
    /*// Método auxiliar si se desea mostrar
    public String mostrarVacuna() {
        return "Tipo: " + tipo + " | Lote: " + lote +
               " | Fecha Aplicación: " + fechaAplicacion +
               " | Próxima dosis: " + proximaDosis;
    } */  
}

