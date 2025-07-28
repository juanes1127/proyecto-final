/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controladores;

import dao.VeterinarioDAO;
import java.util.ArrayList;
import modelo.Veterinario;

/**
 * Juanes Cardona
 */
public class VeterinarioControlador {

    private VeterinarioDAO dao;

    public VeterinarioControlador(VeterinarioDAO dao) {
        this.dao = dao;
        dao.getVeterinarios();
    }

public ArrayList<Veterinario>getveterinarios(){
    return dao.getVeterinarios();
}
    
}
