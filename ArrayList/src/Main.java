import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = 10, b = 15, c = 22;
        ArrayList<Integer> lista = new ArrayList<Integer>();

        lista.add(10); //Aquí solo se almacena el tipo de dato en la posición correpondiente en este caso 0
        lista.add(1, b); //El primer parámetro representa el índice y luego el valor

        lista.set(0,c); // .set permite modificar
        lista.get(0); //Obtener valor en la posición 0
        

        double edades[]; //Aquí solo se declara el array
        edades = new double[10]; //Aquí ya se reserva un espacio a la memoria para dicho array

        //También se puede hacer en una sola línea
        double[] numeros = new double[10];

    }
}