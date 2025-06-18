//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        EmpleadoPorHoras empleadoPorHoras = new EmpleadoPorHoras("123", "David", 1000,5);
        EmpleadoTiempoCompleto empleadoTiempoCompleto = new EmpleadoTiempoCompleto("123", "David", 1000, "Seguro");


        System.out.println(empleadoTiempoCompleto.calcularSalario());
        System.out.println("==================================");
        System.out.println(empleadoPorHoras.calcularSalario());


    }
}