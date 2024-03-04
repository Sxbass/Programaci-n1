package co.edu.uniquindio.poo;

import co.edu.uniquindio.poo.Mascota.Color;
import co.edu.uniquindio.poo.Mascota.Especie;
import co.edu.uniquindio.poo.Mascota.Genero;
import co.edu.uniquindio.poo.Mascota.Raza;

public class App {
    public static void main(String[] args) {
        
        Mascota mascota1 = new Mascota("Venus", Especie.PERRO, Raza.PASTOR_ALEMAN, (byte) 2, Genero.MACHO, Color.NEGRO_Y_CANELA, 20.5f);
        Mascota mascota2 = new Mascota("Bigotes", Especie.CONEJO, Raza.BELIER, (byte) 1, Genero.HEMBRA, Color.BLANCO, 1f);
        Mascota mascota3 = new Mascota("Ferxxo", Especie.LORO, Raza.GUACAMAYO, (byte) 1, Genero.MACHO, Color.AZUL_Y_ROJO, 1f);
        

        System.out.println(mascota1.toString());
        System.out.println(mascota2.toString());
        System.out.println(mascota3.toString());
    }
}



