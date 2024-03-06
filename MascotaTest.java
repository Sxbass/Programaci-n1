package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.Mascota.Color;
import co.edu.uniquindio.poo.Mascota.Especie;
import co.edu.uniquindio.poo.Mascota.Genero;
import co.edu.uniquindio.poo.Mascota.Raza;

public class MascotaTest {

    private static final Logger LOG = Logger.getLogger(MascotaTest.class.getName());

    /**
     * Prueba para verificar que los datos de una mascota estén completos
     */
    @Test
    public void datosCompletos() {
        LOG.info("Inicio datosCompletos");

        var mascota1 = new Mascota(1, "venus", Especie.PERRO, Raza.PASTOR_ALEMAN, (byte) 2, Genero.MACHO,
                Color.NEGRO_Y_CANELA, 20.5f);
        var mascota2 = new Mascota(2, "bigotes", Especie.CONEJO, Raza.BELIER, (byte) 1, Genero.HEMBRA, Color.BLANCO,
                1f);
        var mascota3 = new Mascota(3, "ferxxo", Especie.LORO, Raza.GUACAMAYO, (byte) 2, Genero.MACHO,
                Color.AZUL_Y_ROJO, 2f);
        var mascota4 = new Mascota(4, "Bobby", Especie.PERRO, Raza.PASTOR_ALEMAN, (byte) 3, Genero.MACHO,
                Color.NEGRO_Y_CANELA, 7.2f);
        var mascota5 = new Mascota(5, "Molly", Especie.CONEJO, Raza.BELIER, (byte) 1, Genero.HEMBRA, Color.BLANCO,
                1.5f);
        var mascota6 = new Mascota(6, "Paco", Especie.LORO, Raza.GUACAMAYO, (byte) 10, Genero.MACHO,
                Color.AZUL_Y_ROJO, 1.2f);

        assertEquals(1, mascota1.getId());
        assertEquals("venus", mascota1.nombre());
        assertEquals(Especie.PERRO, mascota1.especie());
        assertEquals(Raza.PASTOR_ALEMAN, mascota1.raza());
        assertEquals((byte) 2, mascota1.edad());
        assertEquals(Genero.MACHO, mascota1.genero());
        assertEquals(Color.NEGRO_Y_CANELA, mascota1.color());
        assertEquals(20.5f, mascota1.peso());

        assertEquals(2, mascota2.getId());
        assertEquals("bigotes", mascota2.nombre());
        assertEquals(Especie.CONEJO, mascota2.especie());
        assertEquals(Raza.BELIER, mascota2.raza());
        assertEquals((byte) 1, mascota2.edad());
        assertEquals(Genero.HEMBRA, mascota2.genero());
        assertEquals(Color.BLANCO, mascota2.color());
        assertEquals(1f, mascota2.peso());

        assertEquals(3, mascota3.getId());
        assertEquals("ferxxo", mascota3.nombre());
        assertEquals(Especie.LORO, mascota3.especie());
        assertEquals(Raza.GUACAMAYO, mascota3.raza());
        assertEquals((byte) 2, mascota3.edad());
        assertEquals(Genero.MACHO, mascota3.genero());
        assertEquals(Color.AZUL_Y_ROJO, mascota3.color());
        assertEquals(2f, mascota3.peso());

        assertEquals(4, mascota4.getId());
        assertEquals("Bobby", mascota4.nombre());
        assertEquals(Especie.PERRO, mascota4.especie());
        assertEquals(Raza.PASTOR_ALEMAN, mascota4.raza());
        assertEquals((byte) 3, mascota4.edad());
        assertEquals(Genero.MACHO, mascota4.genero());
        assertEquals(Color.NEGRO_Y_CANELA, mascota4.color());
        assertEquals(7.2f, mascota4.peso());

        assertEquals(5, mascota5.getId());
        assertEquals("Molly", mascota5.nombre());
        assertEquals(Especie.CONEJO, mascota5.especie());
        assertEquals(Raza.BELIER, mascota5.raza());
        assertEquals((byte) 1, mascota5.edad());
        assertEquals(Genero.HEMBRA, mascota5.genero());
        assertEquals(Color.BLANCO, mascota5.color());
        assertEquals(1.5f, mascota5.peso());

        assertEquals(6, mascota6.getId());
        assertEquals("Paco", mascota6.nombre());
        assertEquals(Especie.LORO, mascota6.especie());
        assertEquals(Raza.GUACAMAYO, mascota6.raza());
        assertEquals((byte) 10, mascota6.edad());
        assertEquals(Genero.MACHO, mascota6.genero());
        assertEquals(Color.AZUL_Y_ROJO, mascota6.color());
        assertEquals(1.2f, mascota6.peso());

        LOG.info("Finalización datosCompletos");
    }

    /**
     * Prueba para verificar que los datos de una mascota no estén nulos
     */
    @Test
    public void datosNulos() {
        LOG.info("Inicio datosNulos");
        assertThrows(IllegalArgumentException.class,
                () -> new Mascota(1, null, Especie.PERRO, Raza.PASTOR_ALEMAN, (byte) 2, Genero.MACHO,
                        Color.NEGRO_Y_CANELA, 20.5f));
        LOG.info("Finalización datosNulos");
    }

    /**
     * Prueba para verificar que el peso de una mascota no sea negativo
     */
    @Test
    public void pesoNegativo() {
        LOG.info("Inicio pesoNegativo");
        assertThrows(IllegalArgumentException.class,
                () -> new Mascota(1, "venus", Especie.PERRO, Raza.PASTOR_ALEMAN, (byte) 2, Genero.MACHO,
                        Color.NEGRO_Y_CANELA, -20.5f));
        LOG.info("Finalización pesoNegativo");
    }

    /**
    * Prueba para verificar que la especie de una mascota no esté vacía ni nula
    */
    @Test
    public void especieNoVacia() {
        LOG.info("Inicio especieNoVacia");
        assertThrows(IllegalArgumentException.class,
                () -> new Mascota(1, "venus", null, Raza.PASTOR_ALEMAN, (byte) 2, Genero.MACHO,
                        Color.NEGRO_Y_CANELA, 20.5f));
        LOG.info("Final");

    }
    /**
     * Prueba para verificar que una mascota no esté repetida en una lista
     */
    @Test
    public void mascotaNoRepetida() {
        // Creamos una lista de mascotas
        List<Mascota> listaMascotas = new ArrayList<>();
        
        // Creamos dos mascotas con los mismos atributos
        Mascota mascota1 = new Mascota(1, "Max", Especie.PERRO, Raza.PASTOR_ALEMAN, (byte) 5, Genero.MACHO, Color.NEGRO_Y_CANELA, 29.5f);
        Mascota mascota2 = new Mascota(2, "Max", Especie.PERRO, Raza.PASTOR_ALEMAN, (byte) 5, Genero.MACHO, Color.NEGRO_Y_CANELA, 29.5f);
        
        // Agregamos la primera mascota a la lista
        listaMascotas.add(mascota1);
        
        // Intentamos agregar la segunda mascota
        // Debería lanzar una excepción porque la mascota ya está en la lista
        assertThrows(IllegalArgumentException.class, () -> listaMascotas.add(mascota2));
    }
}




