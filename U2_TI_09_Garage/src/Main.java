import com.sun.security.jgss.GSSUtil;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int vehiculos;
        Garage garage = new Garage(4);
        Coche coche = new Coche("3434", "Toyota", 4);
        Motocicleta moto = new Motocicleta("ERER3", "ER", true);
        Coche coche1 = new Coche("34", "Toyota", 2);
        Coche coche2 = new Coche("34", "Nissan", 4);
        Coche coche3 = new Coche("34", "Nissan", 4);


        if (garage.estacionar(coche)) {
            System.out.println("Coche estacionado exitosamente");
            System.out.println("Total de autos: "+ garage.contarVehiculos());
        }

        if(garage.estacionar(moto)) {
            System.out.println("Motocicleta estacionado exitosamente");
            System.out.println("Total de autos: "+ garage.contarVehiculos());

        }

        if(garage.estacionar(coche1)) {
            System.out.println("Coche estacionado exitosamente");
            System.out.println("Total de autos: "+ garage.contarVehiculos());

        }

        if(garage.estacionar(coche2)) {
            System.out.println("Coche estacionado exitosamente");
            System.out.println("Total de autos: "+ garage.contarVehiculos());

        }

        if(garage.estacionar(coche3)) {
            System.out.println("Coche estacionado exitosamente");
            System.out.println("Total de autos: "+ garage.contarVehiculos());

        }

        if(garage.retirar("3434")){
            System.out.println("Coche retirado exitosamente");
            System.out.println("Total de autos: "+ garage.contarVehiculos());
        }









    }
}