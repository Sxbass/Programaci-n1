package co.edu.uniquindio.poo;

public class App    {

    public static void main(String[] args) {
        Veterinaria amigosPeludos = new Veterinaria("Amigos Peludos");

        amigosPeludos.agregarMascota(new Mascota(1, "Max", Mascota.Especie.PERRO, Mascota.Raza.PASTOR_ALEMAN, (byte) 5, Mascota.Genero.MACHO, Mascota.Color.NEGRO_Y_CANELA,29.5f));
        amigosPeludos.agregarMascota(new Mascota(2, "Luna", Mascota.Especie.CONEJO, Mascota.Raza.BELIER, (byte) 2, Mascota.Genero.HEMBRA, Mascota.Color.BLANCO, 2.5f));
        amigosPeludos.agregarMascota(new Mascota(3, "Charlie", Mascota.Especie.LORO, Mascota.Raza.GUACAMAYO, (byte) 15, Mascota.Genero.MACHO, Mascota.Color.AZUL_Y_ROJO, 1.0f));
        amigosPeludos.agregarMascota(new Mascota(4, "Tommy", Mascota.Especie.HAMSTER, Mascota.Raza.CAMPBELL, (byte) 3, Mascota.Genero.MACHO, Mascota.Color.GRIS, 0.85f));
        amigosPeludos.agregarMascota(new Mascota(5, "Puchi", Mascota.Especie.CUY, Mascota.Raza.COBAYA, (byte) 2, Mascota.Genero.HEMBRA, Mascota.Color.MARRON, 1.2f));
        amigosPeludos.agregarMascota(new Mascota(6, "Godzilla", Mascota.Especie.LAGARTO, Mascota.Raza.LAGARTO_ARGENTINO, (byte) 8, Mascota.Genero.MACHO, Mascota.Color.VERDE, 9.5f));

        // Imprimir todas las mascotas registradas en la veterinaria
        System.out.println("Todas las mascotas registradas en la veterinaria 'Amigos Peludos':");
        for (Mascota mascota : amigosPeludos.getMascotas()) {
            System.out.println(mascota);
        }

        System.out.println("\nMascotas mayores de 10 años:");
        for (Mascota mascota : amigosPeludos.getMascotasMayores10()) {
            System.out.println(mascota);
        }
    }
}








