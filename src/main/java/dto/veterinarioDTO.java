/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;
import modelo.Persona;
import modelo.Veterinario;
/**
 *
 * @author Juanes Cardona
 */
public class veterinarioDTO extends Persona {
    private String especialidad;

    
    public veterinarioDTO(String nombre, String especialidad) {
        super(nombre);
       this.especialidad = especialidad;
       
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        
      if(especialidad == null || especialidad.isBlank())
            throw new IllegalArgumentException("La especialidad no puede estar vacio");{
        this.especialidad = especialidad;
    }
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
          if(nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("El Nombre no puede estar vacio");{
        this.nombre = nombre;
    }
    }
}
