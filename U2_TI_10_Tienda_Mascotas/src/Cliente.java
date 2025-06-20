
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    List<Animal> mascotas = new ArrayList<>(1);
    
    public Cliente(String nombre, List<Animal> mascotas){
        this.nombre = nombre;
        this.mascotas = mascotas;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public List<Animal> getMascotas(){
        return mascotas;
    }

    public void setMascotas(List<Animal> mascotas){
        this.mascotas = mascotas;
    }
}
