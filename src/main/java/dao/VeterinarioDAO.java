/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import modelo.Veterinario;
import persistencia.ArchivoManager;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Juanes Cardona
 */
public class VeterinarioDAO {

    private ArchivoManager archivo;
    private ArrayList<Veterinario> veterinarios;

    public VeterinarioDAO() {
        archivo = new ArchivoManager("data/veterinarios.txt");
        veterinarios = obtenerTodos(); // Cargar desde archivo
    }

    public boolean guardarVeterinario(Veterinario vet) {
        for (Veterinario v : veterinarios) {
            if (v.getNombre().equalsIgnoreCase(vet.getNombre())) {
                return false; // Ya existe por nombre
            }
        }
        veterinarios.add(vet);
        guardarEnArchivo(vet);
        return true;
    }

    private void guardarEnArchivo(Veterinario vet) {
        archivo.escribirLinea(vet.toLineaArchivo());
    }

    public Veterinario buscarVeterinario(String nombre) {
        for (Veterinario v : veterinarios) {
            if (v.getNombre().equalsIgnoreCase(nombre)) {
                return v;
            }
        }
        return null;
    }

    public boolean eliminarVeterinario(String nombre) {
        for (Veterinario v : veterinarios) {
            if (v.getNombre().equalsIgnoreCase(nombre)) {
                veterinarios.remove(v);
                sobreescribirLista(veterinarios);
                return true;
            }
        }
        return false;
    }

    public boolean editarVeterinario(String nombreClave, Veterinario nuevo) {
        for (Veterinario v : veterinarios) {
            if (v.getNombre().equalsIgnoreCase(nombreClave)) {
                v.setNombre(nuevo.getNombre());
                v.setEspecialidad(nuevo.getEspecialidad());
                sobreescribirLista(veterinarios);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Veterinario> obtenerTodos() {
        ArrayList<Veterinario> lista = new ArrayList<>();
        List<String> lineas = archivo.leerLineas();

        for (String linea : lineas) {
            Veterinario v = Veterinario.desdeLineaArchivo(linea);
            if (v != null) lista.add(v);
        }

        return lista;
    }

    private void sobreescribirLista(List<Veterinario> veterinarios) {
        List<String> lineas = new ArrayList<>();
        for (Veterinario v : veterinarios) {
            lineas.add(v.toLineaArchivo());
        }
        archivo.sobrescribirArchivo(lineas);
    }
}
