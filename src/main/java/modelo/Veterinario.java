/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Juanes Cardona
 */
public class Veterinario extends Persona {
   
    private String especialidad;

    

    public Veterinario(String nombre, String especialidad) {
        super(nombre);
       this.especialidad = especialidad;
       
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String toLineaArchivo() {
        return nombre + ";" + especialidad;
    }

    public static Veterinario desdeLineaArchivo(String linea) {
        try {
            String[] partes = linea.split(";");
            if (partes.length < 2) return null;
            return new Veterinario(partes[0], partes[1]);
        } catch (Exception e) {
            return null;
        }
    }
}
