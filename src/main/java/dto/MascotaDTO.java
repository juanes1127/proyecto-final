/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Juanes Cardona
 */

public class MascotaDTO {
    private String id;
    private String nombre;
    private String especie;
    private String edad;
    private String documentoProp; 

    public MascotaDTO(String id, String nombre, String especie, String edad, String documentoProp) {
        setId(id);
        setEspecie(especie);
        setEdad(edad);
        setDocumentoProp(documentoProp);
        setNombre(nombre);
        
    }

    public String getId() {
        return id;
    }

    public void setId(String id){
    if( id == null || id.isBlank())
        throw new IllegalArgumentException("El Id no puede estar vacio"); {
        this.id = id;
      }
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre){
        if(nombre == null || nombre.isBlank())
            throw new IllegalArgumentException("El Nombre no puede estar vacio"); {
        this.nombre = nombre;
       }
    }
    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie){
        if(especie == null || especie.isBlank())
            throw new IllegalArgumentException("La Especie no puede estar vacio"); {
        this.especie = especie;
    }
    }
    public String  getEdad() {
        return edad;
    }

    public void setEdad(String edad){
        if(edad == null || edad.isBlank())
            throw new IllegalArgumentException("La Edad no puede estar vacio"); {
        this.edad = edad;
    }
    }
    public String getDocumentoProp() {
        return documentoProp;
    }

    public void setDocumentoProp(String documentoProp){
        if(documentoProp == null || documentoProp.isBlank())
            throw new IllegalArgumentException("El Documento no puede estar vacio"); {
        this.documentoProp = documentoProp;
    }
}
}    