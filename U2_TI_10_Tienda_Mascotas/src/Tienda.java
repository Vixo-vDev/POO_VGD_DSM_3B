import java.util.ArrayList;
import java.util.List;

public class Tienda {
    List<Animal> inventario;


    public Tienda(int capacidad){
        inventario = new ArrayList<>(capacidad);
        for(int i = 0; i < capacidad; i++){
            inventario.add(i,null);
        }
    }

    
    public boolean venderAnimal(Cliente c, Animal a){
        for(int i = 0; i < inventario.size(); i++){
            if(inventario.get(i) == a && c.getMascotas() == null){
                System.out.println("Adquirido por el cliente: "+ c.getNombre());
                c.setMascotas(inventario); //Se agrega al animal como mascota al cliente
                inventario.set(i, null); //Se elimina el animal de la tienda
                return true;
            }
            else if(c.getMascotas() != null){
                System.out.println("El cliente: "+ c.getNombre()+ " ya ha adquirido su mascota");
                break;
            }
        }
        return false; 
    }
    

    public boolean reabastecer(Animal a){

        for(int i = 0; i < inventario.size() ; i++){
            if(inventario.get(i) == null){
                inventario.set(i, a);
                System.out.println("Animal ("+ a.getNombe()+") agregad@ exitosamente a la tienda");
                return true;
            }
        }
            return false;
    }
    
}
