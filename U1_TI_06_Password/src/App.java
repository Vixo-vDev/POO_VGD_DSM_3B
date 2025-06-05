import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
    UsuarioSeguro user1 = new UsuarioSeguro();

    Scanner read = new Scanner(System.in);
    String password, user;
    boolean exito;

    System.out.println("Ingresa el nombre:");
    user = read.nextLine();
    System.out.println("Ingresa la contraseña:");
    password = read.nextLine();

    user1.setNombreUsuario(user);
    user1.setPassword(password);
    

    System.out.println("Ingresa una contraseña para iniciar sesión");
    password = read.nextLine();

    exito = user1.autenticar(password);
      
    if(exito){
      System.out.println("Acceso concedido");
    }
    else{
      System.out.println("Acceso denegado");
    }


    exito = user1.autenticar("12345678"); //Intento incorrecto
    if(exito){
      System.out.println("Acceso concedido");
    }
    else{
      System.out.println("Acceso denegado");
    }
    }
    
}
