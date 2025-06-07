
import java.util.Scanner;

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

    public void validarCampo(String campo, String texto, int cantidad){
        Scanner read = new Scanner(System.in);
        boolean bandera = true;

        while (bandera) { 
            if(campo == null || campo.isEmpty()){

                System.out.println("Error: Ingresa lo que se te pide");
                System.out.print(texto);
                campo = read.nextLine();

            }
            else if(cantidad >= 0){
                bandera = false;
            }
            else{
                System.out.println("Error: Ingresa lo que se te pide");
                System.out.print(texto);
                cantidad = read.nextInt();
            }
           
        }
    }

    public void setCodigo(String codigo) {
        validarCampo(codigo, "Ingresa nuevamente el código: ",0);
    }

    public void setNombre(String nombre) {
        validarCampo(nombre, "Ingresa nuevamente el nombre: ",0);
    }

    public void setCantidad(int cantidad) {
        validarCampo("", "Ingresa nuevamente la cantidad", cantidad);
    }    
}
