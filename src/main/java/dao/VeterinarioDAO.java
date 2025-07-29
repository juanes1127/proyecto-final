/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Veterinario;


/**
 * @author Juanes Cardona
 */
public class VeterinarioDAO {

   private  ArrayList<Veterinario>  veterinarios;

    public VeterinarioDAO() {
      veterinarios = new ArrayList<>();
    }

    public void veterinarios(){
        veterinarios = new ArrayList<>();
        veterinarios.add(new Veterinario("Pedro", "cirujano"));
        veterinarios.add(new Veterinario("Juan", "medico"));
     }

    public ArrayList<Veterinario> getVeterinarios() {
        return veterinarios;
    }
    
    
}
