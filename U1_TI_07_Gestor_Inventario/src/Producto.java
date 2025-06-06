public class Producto {
    private  String codigo, nombre;
    private int cantidad;

    public void Producto(){

    }

    public void Producto(String codigo, String nombre, int setCantidad){
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;

    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }


    
}
