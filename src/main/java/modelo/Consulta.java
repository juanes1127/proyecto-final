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
public class Consulta {
    private String codigo;
    private LocalDate fecha;
    private Veterinario veterinario;

    public Consulta(String codigo, LocalDate fecha, Veterinario veterinario) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.veterinario = veterinario;
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

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
    public String toLineaArchivo() {
        return codigo + "," + fecha.toString() + "," + veterinario.getNombre() + "," + veterinario.getEspecialidad();
    }

 
    public static Consulta desdeLineaArchivo(String linea) {
        String[] partes = linea.split(",");
        if (partes.length != 4) return null;

        try {
            String codigo = partes[0];
            LocalDate fecha = LocalDate.parse(partes[1]);
            String nombreVeterinario = partes[2];
            String especialidad = partes[3];

            Veterinario vet = new Veterinario(nombreVeterinario, especialidad);

            return new Consulta(codigo, fecha, vet);
        } catch (DateTimeParseException e) {
            return null;
        }
    }

    
}
