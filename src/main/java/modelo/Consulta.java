package modelo;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;

/**
 *
 * @author Juanes Cardona
 */
public class Consulta {
    private String codigo;
    private LocalDate fecha;
    private String Diagnostico;
    private String Tratamiento;

    public Consulta(String codigo, String fecha, String Diagnostico, String Tratamiento) {
        setCodigo(codigo);
        setFecha(fecha);
        setDiagnostico(Diagnostico);
        setTratamiento(Tratamiento);
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

    public void setFecha(String fechaTexto) {
        try {
            this.fecha = LocalDate.parse(fechaTexto); 
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Formato de fecha inválido.");
        }
    }

    // Convertir desde una línea del archivo a un objeto Consulta
    public static Consulta desdeLineaArchivo(String linea) {
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
}
