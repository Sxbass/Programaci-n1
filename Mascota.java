package co.edu.uniquindio.poo;

/**
* @author Yefry Fajardo - Sebastian Roman - Santiago Gordillo
* @since 2024-01
* https://github.com/Sxbass/Programaci-n1.git
*/




public record Mascota(int id, String nombre, Especie especie, Raza raza, byte edad, Genero genero, Color color, Float peso) {

    public Mascota {
        assert id != 0 : "El id debe ser diferente de cero";
        assert nombre != null && !nombre.isEmpty(): "Debe ingresar un nombre válido para la mascota, diferente de null";
        assert especie != null : "Debe ingresar una especie válida para la mascota";
        assert raza != null : "Ingrese una raza válida para la mascota";
        assert edad > 0 : "La edad debe ser mayor a cero";
        assert genero != null : "Debe ingresar un genero válido para la mascota";
        assert color != null : "El color debe ser diferente de null";
        assert peso > 0 : "El peso debe ser mayor a 0 kg";
    }
        
    public int getId() {
        return id;
    }

    public String nombre() {
        return nombre;
    }

    public Especie especie() {
        return especie;
    }

    public Raza raza() {
        return raza;
    }

    /**
     * Obtiene la edad de la mascota.
     *
     * @return la edad de la mascota
     */
    public byte getEdad() {
        return edad;
    }

    public Genero genero() {
        return genero;
    }

    public Color color() {
        return color;
    }

    public Float peso() {
        return peso;
    }
    
    

    @Override
    public String toString() {
        return "ID: " + id + "\n" +
               "Nombre: " + nombre + "\n" +
               "Especie: " + especie + "\n" +
               "Raza: " + raza + "\n" +
               "Edad: " + edad + "\n" +
               "Genero: " + genero + "\n" +
               "Color: " + color + "\n" +
               "Peso: " + peso  + "\n";
    }
    
   
    // Enumeraciones definidas dentro de la clase Mascota
    public enum Especie {
        PERRO,
        CONEJO,
        LORO,
        HAMSTER,
        CUY,
        LAGARTO;
    }

    public enum Raza {
        PASTOR_ALEMAN,
        BELIER,
        GUACAMAYO,
        LAGARTO_ARGENTINO,
        CAMPBELL,
        COBAYA;

        
    }

    public enum Genero {
        MACHO,
        HEMBRA;
        
    }

    public enum Color {
        NEGRO_Y_CANELA,
        BLANCO,
        AZUL_Y_ROJO,
        MARRON,
        VERDE,
        GRIS;
    }
}


    
        

