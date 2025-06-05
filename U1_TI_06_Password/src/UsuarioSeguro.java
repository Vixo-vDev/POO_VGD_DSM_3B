

public class UsuarioSeguro {

    private String nombreUsuario;
    private String password;

    public void setNombreUsuario(String nombreUsuario) {
        if(nombreUsuario.isEmpty() || nombreUsuario == null){
            System.out.println("No se aceptan cadenas vacías error nombre de usuario");
        }else{
            return;
        }
    }
       
    public void setPassword(String password) {
        int ascii;
        boolean mayusculas = false;
        boolean minusculas = false;
        boolean digito = false;

        boolean bandera = true;

            for(int i = 0; i < password.length(); i++){

                char letra = password.charAt(i);
                ascii = (int) letra;

                if (ascii >= 65 && ascii <=90) {
                    mayusculas = true;
                }

                if(ascii >= 97 && ascii <= 122){
                    minusculas = true;
                }

                if(ascii >= 48 && ascii <=57){
                    digito = true;
                }

            }
                this.password = password;
                bandera = false;

            if(mayusculas && minusculas && digito && password.length()>=8){
                System.out.println("=======================================");
                System.out.println("Contraseña correcta");
            }
            else{
                System.out.println("No cumple con los requisitos la contraseña");
            }        
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }


    public String getPassword() {
        return password;
    }

    public boolean autenticar(String intentPassword){
        return password.equals(intentPassword);
    }
    
}
