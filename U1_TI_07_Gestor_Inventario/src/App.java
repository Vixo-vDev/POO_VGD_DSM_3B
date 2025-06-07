import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Inventario inventory = new Inventario(3); //Instancia de la clase inventario
        Producto p = new Producto(); //Instancia de la clase Producto
        Scanner read = new Scanner(System.in);

        String code;
        boolean agregar, eliminar, bandera = true;

        
        do { 
                
            System.out.println("==============================================");
            System.out.println("             GESTIÓN DE INVENTARIO            ");
            System.out.println("==============================================");
            System.out.println("1. Agregar Producto");
            System.out.println("2. Eliminar Producto");
            System.out.println("3. Buscar Producto");
            System.out.println("4. Total Items Producto");
            System.out.print("Ingresa una opción: ");
            int opc = read.nextInt();
            read.nextLine();

            switch (opc) {
                case 1: //Opción 1 para agregar un producto
                    System.out.println("===================================================");
                    System.out.println("                 AGREGANDO PRODUCTO"                );
                    System.out.println("===================================================");
                        
                    System.out.print("Ingresa el nombre del producto: ");
                    p.setNombre(read.nextLine());
                    System.out.print("Ingresa el código del producto: ");
                    p.setCodigo(read.nextLine());
                    System.out.print("Ingresa la cantidad del producto: ");
                    p.setCantidad(read.nextInt());
                    System.out.println(p.getNombre());
                    System.out.println(p.getCodigo());
                    System.out.println(p.getCantidad());

                    Producto productonew = new Producto(p.getCodigo(), p.getNombre(), p.getCantidad());
                        
                    agregar = inventory.agregarProducto(productonew);
                    if(agregar){
                        System.out.println("===================================================");
                        System.out.println("Producto agregado con éxito");

                    }else{
                        System.out.println("El inventario está lleno :(");
                    }

                    System.out.println("Total de items disponibles: "+ inventory.totalItems());
                
                break;

                case 2: //Opción 2 para eliminar un producto
                    System.out.println("===================================================");
                    System.out.println("                 ELIMINAR PRODUCTO"                 );
                    System.out.println("===================================================");
                    System.out.print("Ingresa código para buscar producto: ");
                    code = read.nextLine();
                    
                    eliminar = inventory.eliminarProducto(code);
                    if(eliminar){
                        System.out.println("Objeto eliminado con éxito");
                    }else{
                        System.out.println("Operación fallida item no encontrado");
                    }

                    System.out.println("Total de items disponibles: "+ inventory.totalItems());
                    
                break;

                case 3: //Opción 3 para buscar un producto
                    System.out.println("===================================================");
                    System.out.println("                 BUSCAR PRODUCTO"                   );
                    System.out.println("===================================================");
                    System.out.print("Ingresa código para buscar producto: ");
                    code = read.nextLine();
                    productonew = inventory.buscar(code); //OBJETO ENCONTRADO
                    System.out.println("===================================================");
                    System.out.println("Nombre del producto: "+ productonew.getNombre());
                    System.out.println("Código del producto: "+ productonew.getCodigo());
                    System.out.println("Cantidad de "+ productonew.getNombre()+": "+productonew.getCantidad()+" unidad(es)");
                    System.out.println("===================================================");
                    System.out.println("Total de items disponibles: "+ inventory.totalItems());

                
                break;
                default:
                    throw new AssertionError();
            }

            System.out.println("===================================================");
            System.out.print("¿Desea salir del programa? 1 para salir o != 1 para seguir: ");
            int salir = read.nextInt();
            if(salir == 1){
                bandera = false;
            }

        } while (bandera);

        
    }
}
