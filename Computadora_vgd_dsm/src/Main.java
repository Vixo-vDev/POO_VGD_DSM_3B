import java.sql.SQLOutput;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //David Valenzuela Guijosa 3B-DSM

        Computadora computadora = new Computadora();

        computadora.setModelo("17");


        System.out.println("Primera vez, arrancando pc");
        computadora.encender();
        System.out.println("=========================================");
        System.out.println("Encender segunda vez");
        computadora.encender();
        System.out.println("=========================================");
        System.out.println("Apagar computadora");
        computadora.apagar();
        System.out.println("=========================================");

        System.out.println("Marca:" +computadora.getMarca());
        System.out.println("Modelo: "+computadora.getModelo());
        System.out.println("Estado: "+ computadora.getEncendida());

        }
    }
