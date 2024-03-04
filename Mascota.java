package co.edu.uniquindio.poo;




public record Mascota(String nombre, Especie especie, Raza raza, byte edad, Genero genero, Color color, Float peso) {

    public Mascota {
        assert nombre != null && !nombre.isEmpty(): "Debe ingresar un nombre válido para la mascota, diferente de null";
        assert especie != null : "Debe ingresar una especie válida para la mascota";
        assert raza != null : "Ingrese una raza válida para la mascota";
        assert edad > 0 : "La edad debe ser mayor a cero";
        assert genero != null : "Debe ingresar un genero válido para la mascota";
        assert color != null : "El color debe ser diferente de null";
        assert peso > 0 : "El peso debe ser mayor a 0 kg";
    }
        
        public String getNombre() {
            return nombre;
        }
        
        public Especie getEspecie() {
            return especie;
        }
    
        public Raza getRaza() {
            return raza;
        }
    
        public byte getEdad() {
            return edad;
        }
    
        public Genero getGenero() {
            return genero;
        }
    
        public Color getColor() {
            return color;
        }
    
        public Float getPeso() {
            return peso;
        }
    
    

@Override
    public String toString() {
        return "Nombre:" + nombre + "\n" +
               "Especie:" + especie + "\n" +
               "Raza:" + raza + "\n" +
               "Edad:" + edad + "\n" +
               "Genero:" + genero + "\n" +
               "Color:" + color + "\n" +
               "Peso:" + peso  + "\n";
    }

    
    public enum Especie {
        PERRO,
        CONEJO,
        LORO;
    }

    public enum Raza {
        PASTOR_ALEMAN,
        BELIER,
        GUACAMAYO;
        
    }

    public enum Genero {
        MACHO,
        HEMBRA;
        
    }

    public enum Color {
        NEGRO_Y_CANELA,
        BLANCO,
        AZUL_Y_ROJO;
    }
}
    
        

