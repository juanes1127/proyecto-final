/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import modelo.Mascota;
import java.util.ArrayList;
import modelo.Persona;

/**
 *
 * @author Juanes Cardona
 */
public class PropietarioDTO extends Persona{
    private String documento;
    private String telefono;
    private ArrayList<Mascota> mascotas;

    public PropietarioDTO(String documento, String telefono, ArrayList<Mascota> mascotas, String nombre) {
        super(nombre);
        this.documento = documento;
        this.telefono = telefono;
        this.mascotas = mascotas;
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

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento){
        if(documento == null || this.documento.isBlank())
            throw new IllegalArgumentException("El documento no puede estar vacio");{
        this.documento = documento;
    }
    }
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono){
        if(telefono == null || telefono.isBlank())
            throw new IllegalArgumentException("El telefono no puede estar vacio");{
        this.telefono = telefono;
    }
    }
    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }
  
}
