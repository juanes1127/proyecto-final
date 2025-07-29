package modelo;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Juanes Cardona
 */
public class Consulta extends Medicina implements Serializable{
    private String Diagnostico;
    private String Tratamiento;
    
    public Consulta(String codigo, String fecha, String Diagnostico, String Tratamiento,String idMas, String docProp, String nomMascota) {
        super(fecha,codigo,idMas, docProp, nomMascota);
        setDiagnostico(Diagnostico);
        setTratamiento(Tratamiento);
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

    public String getDiagnostico() {
        return Diagnostico;
    }

    public void setDiagnostico(String Diagnostico) {
        this.Diagnostico = Diagnostico;
    }

    public String getTratamiento() {
        return Tratamiento;
    }

    public void setTratamiento(String Tratamiento) {
        this.Tratamiento = Tratamiento;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    

}
  


    // Convertir desde una línea del archivo a un objeto Consulta
   /* public static Consulta desdeLineaArchivo(String linea) {
        String[] partes = linea.split(",");
        if (partes.length != 4) return null;

        try {
            String codigo = partes[0];
            LocalDate fecha = LocalDate.parse(partes[1]);
            String diagnostico = partes[2];
            String tratamiento = partes[3];

            return new Consulta(codigo, fecha.toString(), diagnostico, tratamiento);
        } catch (DateTimeParseException e) {
            return null;
        }
    }

    // Convertir un objeto Consulta a una línea de texto para guardar en archivo
    public String toLineaArchivo() {
        return codigo + "," + fecha + "," + Diagnostico + "," + Tratamiento;
    }
}*/
