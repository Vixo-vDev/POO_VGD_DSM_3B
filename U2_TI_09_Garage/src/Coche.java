public class Coche extends Vehiculo {

    private  int numPuertas;

    public Coche(String placa, String modelo, int nunmPuertas ) {
        super(placa, modelo);
        this.numPuertas = nunmPuertas;
    }
}
