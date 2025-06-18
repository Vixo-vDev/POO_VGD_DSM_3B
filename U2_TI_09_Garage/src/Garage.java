public class Garage{

    private Vehiculo [] espacios;


    public Garage(int espacios){
        this.espacios = new Vehiculo[espacios];
    }


    public boolean estacionar(Vehiculo vehiculo){

        for(int i = 0; i <espacios.length; i++){
            if(espacios[i] == null){
                espacios[i] = vehiculo;
                System.out.println("========================================");
                return true;
            }
        }
        System.out.println("No se puede estacionar el vehiculo");
        return false;
    }

    public boolean retirar(String placa){
        for(int i = 0; i < espacios.length; i++){
            if(espacios[i].getPlaca().equals(placa)){
                espacios[i] = null;
                return true;
            }
        }
        return false;
    }

    public int contarVehiculos(){
        int contador = 0;
        for(int j = 0; j < 4; j++){
            if(espacios[j] != null){
                contador +=j;
            }
        }
        return contador;
    }
}
