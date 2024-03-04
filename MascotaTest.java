package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.Mascota.Color;
import co.edu.uniquindio.poo.Mascota.Especie;
import co.edu.uniquindio.poo.Mascota.Genero;
import co.edu.uniquindio.poo.Mascota.Raza;

public class MascotaTest {

    private static final Logger LOG = Logger.getLogger(MascotaTest.class.getName());
/**
 * Clase para probar el funcionamiento del código de una veterinaria
 * @author Yefry Fajardo - Sebastian Roman - Santiago Gordillo
 * @since 2024-01
 * https://github.com/Sxbass/Programaci-n1.git  
 */

/**
 * Prueba para verificar que los datos de una mascota estén completos
 */
@Test
public void datosCompletos() {
    LOG.info("Inicio datosCompletos");

    var mascota1 = new Mascota("venus", Especie.PERRO, Raza.PASTOR_ALEMAN, (byte)2, Genero.MACHO, Color.NEGRO_Y_CANELA, 20.5f);
    var mascota2 = new Mascota("bigotes", Especie.CONEJO, Raza.BELIER, (byte) 1, Genero.HEMBRA, Color.BLANCO, 1f);
    var mascota3 = new Mascota("ferxxo", Especie.LORO, Raza.GUACAMAYO, (byte) 2, Genero.MACHO, Color.AZUL_Y_ROJO, 2f);

    assertEquals("venus", mascota1.getNombre());
    assertEquals(Especie.PERRO, mascota1.getEspecie());
    assertEquals(Raza.PASTOR_ALEMAN, mascota1.getRaza());
    assertEquals((byte)2, mascota1.getEdad());
    assertEquals(Genero.MACHO, mascota1.getGenero());
    assertEquals(Color.NEGRO_Y_CANELA, mascota1.getColor());
    assertEquals(20.5f, mascota1.getPeso());

    assertEquals("bigotes", mascota2.getNombre());
    assertEquals(Especie.CONEJO, mascota2.getEspecie());
    assertEquals(Raza.BELIER, mascota2.getRaza());
    assertEquals((byte)1, mascota2.getEdad());
    assertEquals(Genero.HEMBRA, mascota2.getGenero());
    assertEquals(Color.BLANCO, mascota2.getColor());
    assertEquals(1f, mascota2.getPeso());

    assertEquals("ferxxo", mascota3.getNombre());
    assertEquals(Especie.LORO, mascota3.getEspecie());
    assertEquals(Raza.GUACAMAYO, mascota3.getRaza());
    assertEquals((byte)2, mascota3.getEdad());
    assertEquals(Genero.MACHO, mascota3.getGenero());
    assertEquals(Color.AZUL_Y_ROJO, mascota3.getColor());
    assertEquals(2f, mascota3.getPeso());

    LOG.info("Finalización datosCompletos");
}

/**
 * Prueba para verificar que los datos de una mascota no estén nulos
 */
@Test
public void datosNulos() {
    LOG.info("Inicio datosNulos");
    assertThrows(Throwable.class, () -> new Mascota(null, Especie.PERRO, Raza.PASTOR_ALEMAN, (byte)0, Genero.MACHO, Color.NEGRO_Y_CANELA, 0f));
    LOG.info("Finalización datosNulos");
}


/**
 * Prueba para verificar que el peso de una mascota no sea negativo
 */
@Test
public void pesoNegativo() {
    LOG.info("Inicio pesoNegativo");
    assertThrows(Throwable.class, () -> new Mascota("venus", Especie.PERRO, Raza.PASTOR_ALEMAN, (byte)2, Genero.MACHO, Color.NEGRO_Y_CANELA, -20.5f));
    LOG.info("Finalización pesoNegativo");
}

/**
 * Prueba para verificar que la especie de una mascota no esté vacía ni nula
 */
@Test
public void especieNoVacia() {
    LOG.info("Inicio especieNoVacia");
    assertThrows(Throwable.class, () -> new Mascota("venus", null, Raza.PASTOR_ALEMAN, (byte)2, Genero.MACHO, Color.NEGRO_Y_CANELA, 20.9f));
    LOG.info("Finalización especieNoVacia");
}

/**
 * Prueba para verificar que la raza de una mascota no esté vacía ni nula
 */
@Test
public void razaNoVacia() {
    LOG.info("Inicio razaNoVacia");
    assertThrows(Throwable.class, () -> new Mascota("venus", Especie.PERRO, null, (byte)2, Genero.MACHO, Color.NEGRO_Y_CANELA, 0f));
    LOG.info("Finalización razaNoVacia");
}

/**
 * Prueba para verificar que el género de una mascota no esté vacío ni nulo
 */
@Test
public void generoNoVacio() {
    LOG.info("Inicio generoNoVacio");
    assertThrows(Throwable.class, () -> new Mascota("venus", Especie.PERRO, Raza.PASTOR_ALEMAN, (byte)2, null, Color.NEGRO_Y_CANELA, 20.9f));
    LOG.info("Finalización generoNoVacio");
}

/**
 * Prueba para verificar que el color de una mascota no esté vacío ni nulo
 */
@Test
public void colorNoVacio() {
    LOG.info("Inicio colorNoVacio");
    assertThrows(Throwable.class, () -> new Mascota("venus", Especie.PERRO, Raza.PASTOR_ALEMAN, (byte)2, Genero.MACHO, null, 20.9f));
    LOG.info("Finalización colorNoVacio");
}
}

