/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utiles;

/**
 *
 * @author Juanes Cardona
 */
public class Generator {
    private static int contadorConsulta = 0;
    private static int contadorMascota = 0;

    public static String generarCodigoConsulta() {
        return "C" + (++contadorConsulta);
    }

    public static String generarCodigoMascota() {
        return "M" + (++contadorMascota);
    }
      public static void inicializarContadorMascota(int cantidadActual) {
        contadorMascota = cantidadActual;
    }
}

