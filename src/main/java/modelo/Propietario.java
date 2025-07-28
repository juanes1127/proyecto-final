/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Juanes Cardona
 */
public class Propietario extends Persona implements Serializable{

    
    private String documento;
    private String telefono;
    private ArrayList<Mascota> mascotas;

    public Propietario() {
    }
    

    public Propietario(String nombre,String documento, String telefono) {
        super(nombre);
        setDocumento(documento);
        setTelefono(telefono);
    }

   
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String toLineaArchivo() {
    return nombre + "," + documento + "," + telefono;
}

public static Propietario desdeLineaArchivo(String linea) {
    String[] partes = linea.split(",");
    if (partes.length != 3) return null;

    try {
        String nombre = partes[0];
        String documento = partes[1];
        String telefono = partes[2];

        return new Propietario(nombre, documento, telefono);
    } catch (Exception e) {
        return null;
    }
}


}
 
