
import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);
        double imc;
        DecimalFormat formatter = new DecimalFormat("#.##");
      

        Persona persona1 = new Persona();

        System.out.println("Ingresa tu nomnbre:");
        persona1.setNombre(read.nextLine());


        System.out.println("Ingresa tu altura:");
        persona1.setAltura(read.nextDouble());

        System.out.println("Ingresa tu peso:");
        persona1.setPeso(read.nextDouble());

        imc = persona1.calcularIMC();

        persona1.clasificarIMC(imc);

        System.out.println("Nombre: "+ persona1.getNombre());
        System.out.println("Alutra en metros: "+ persona1.getAltura());
        System.out.println("Peso: "+ persona1.getPeso()+"kg");
        System.out.println("IMC: "+ formatter.format(persona1.calcularIMC()));
        System.out.println("Tienes: "+persona1.clasificarIMC(imc));


    }
}
