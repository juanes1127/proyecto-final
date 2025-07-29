package controladores;

import dao.VeterinarioDAO;
import java.util.ArrayList;
import modelo.Veterinario;

/**
 * Juanes Cardona
 */
public class VeterinarioControlador {

    private VeterinarioDAO dao;

    public VeterinarioControlador() {
        this.dao = new VeterinarioDAO();
    }

    public ArrayList<Veterinario> getVeterinarios() {
        return dao.getVeterinarios();
    }
}
