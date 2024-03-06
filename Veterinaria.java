package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class Veterinaria {
    private final String nombre;
    private final List<Mascota> mascotas;

    public Veterinaria(String nombre) {
        assert nombre != null : "El nombre no puede ser nulo";
        this.nombre = nombre;
        mascotas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarMascota(Mascota mascota) {
        assert validarIdUnico(mascota.getId()) == false : "El ID de la mascota ya existe.";
        mascotas.add(mascota);
    }

    public Optional<Mascota> getMascota(int id) {
        Predicate<Mascota> condicion = mascota -> mascota.getId() == id;

        return mascotas.stream().filter(condicion).findAny();
    }

    public Collection<Mascota> getMascotas() {
        return Collections.unmodifiableCollection(mascotas);
    }

    public List<Mascota> getMascotasMayores10() {
        return mascotas.stream()
                .filter(mascota -> mascota.getEdad() > 10)
                .collect(Collectors.toList());
    }

    private boolean validarIdUnico(int id) {
        Predicate<Mascota> condicion = mascota -> mascota.getId() == id;
        return mascotas.stream().filter(condicion).findAny().isPresent();
    }
}





