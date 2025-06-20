

public class Inventario {
    
    Producto stock[] = new Producto[3]; //Array de tipo objeto Producto
  
    public Inventario(){ //Constructor vacío

    }

    public Inventario(int size){ //Constructor con parámetro
        stock = new Producto[size];
    }

    //Método para agregar productos
    public boolean agregarProducto(Producto p){
        for(int i = 0; i <3; i++){

            if(stock[i]== null){
               for(int j = 0; j< p.getCantidad(); j++){
                    stock[j] = p;
               }

               return true;
            }
        }
        return false;
    }

    public boolean eliminarProducto(String codigo){
        for(int i = 0; i < 3; i++){
            if(stock[i] != null && codigo.equals(stock[i].getCodigo())){
               
                stock[i] = null;
                return true;   
            }        
            else{
                 continue;
            }
            }
        
        return false;
    }

    public Producto buscar(String codigo){
        for(int i = 0; i<3; i++){
            if(stock[i] != null){
                if(codigo.equals(stock[i].getCodigo())){
                    return stock[i];
                }
            }
        }
        return null;
    }

    public int totalItems(){
        int sumaTotal = 0;
        for(int i = 0; i < 3; i++){
            if(stock[i] != null){
                sumaTotal += 1;
            }
        }
        return sumaTotal;
    }
}
