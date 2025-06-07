
import java.util.Scanner;

public class Producto {
    private  String codigo, nombre;
    private int cantidad;

    
    public Producto(String codigo, String nombre, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public Producto() {
        
    }


    public void validarCampo(String campo, String texto, int cantidad){
        Scanner read = new Scanner(System.in);
        boolean bandera = true;

        while (bandera) { 
            if(campo == null || campo.isEmpty()){

                System.out.println("ERROR: Ingresa lo que se te pide");
                System.out.println("====================================");
                System.out.print(texto);
                campo = read.nextLine();

            }
            else if(cantidad >= 0){
                bandera = false;
            }
            else{
                System.out.println("ERROR: Ingresa números >= 0");
                System.out.println("====================================");
                System.out.print(texto);
                cantidad = read.nextInt();
            }
           
        }
    }



    public void setCodigo(String codigo) {
        validarCampo(codigo, "Ingresa nuevamente el código: ",0);
        this.codigo = codigo;
        
    }

    public void setNombre(String nombre) {
        validarCampo(nombre, "Ingresa nuevamente el nombre: ",0);
        this.nombre = nombre;
    }

    public void setCantidad(int cantidad) {
        validarCampo(".", "Ingresa nuevamente la cantidad: ", cantidad);
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    
}
