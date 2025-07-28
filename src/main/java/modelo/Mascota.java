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
public class Mascota implements Serializable{
    private String id;
    private String nombre;
    private String especie;
    private String edad;
    private String documentoProp; 

    public Mascota() {
    }

    public Mascota(String id, String nombre, String especie, String edad, String documentoProp) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.documentoProp = documentoProp;
    }


    

    public String getNombre() { return nombre; }
    public String getEspecie() { return especie; }
    public String getEdad() { return edad; }
    public String getId() {return id;}
    public String getDocumentoProp() { return documentoProp; }
    
    public void setId(String id) { this.id = id; }
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setDocumentoProp(String documentoProp) {this.documentoProp = documentoProp;}
    public void setEspecie(String especie) { this.especie = especie; }
    public void setEdad(String edad) { this.edad = edad; }

    public String toLineaArchivo() {
        return nombre + "," + especie + "," + edad + "," + id + "," + documentoProp;
    }

    public static Mascota desdeLineaArchivo(String linea) {
    String[] partes = linea.split(",");
    if (partes.length != 5) return null;

    try {
        String nombre = partes[0];
        String especie = partes[1];
        String edad = (partes[2]);
        String id = partes[3];
        String documentoProp = partes[4];

        return new Mascota(id, nombre, especie, edad, documentoProp);
    } catch (NumberFormatException e) {
        return null;
    }
 }
 
}