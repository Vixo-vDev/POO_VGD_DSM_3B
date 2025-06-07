import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);
        Inventario inventory = new Inventario();
        Producto p = new Producto();

        System.out.println("==============================================");
        System.out.println("             GESTIÓN DE INVENTARIO            ");
        System.out.println("==============================================");
        System.out.println("1. Agregar Producto");
        System.out.println("2. Eliminar Producto");
        System.out.println("3. Buscar Producto");
        System.out.println("4. Total Items Producto");
        System.out.print("Ingresa una opción: ");
        int opc = read.nextInt();

        switch (opc) {
            case 1:
                inventory.agregarProducto(p);
            
            break;
            default:
                throw new AssertionError();
        }
        
        
    }
}
