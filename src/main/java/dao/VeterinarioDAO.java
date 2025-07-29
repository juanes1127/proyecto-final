/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.ArrayList;
import modelo.Veterinario;
import dto.veterinarioDTO;
import java.util.List;


/**
 * @author Juanes Cardona
 */
public class VeterinarioDAO {

   private  ArrayList<veterinarioDTO>  veterinarios;

    public VeterinarioDAO() {
      veterinarios = new ArrayList<>();
      veterinarios.add(new veterinarioDTO("Pedro", "cirujano"));
      veterinarios.add(new veterinarioDTO("Juan", "medico"));
    }

  
    public ArrayList<veterinarioDTO> getVeterinarios() {
        return veterinarios;
    }
}
