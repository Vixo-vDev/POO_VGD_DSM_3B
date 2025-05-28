public class Computadora {

    private String marca="Victus", modelo;
    private boolean encendida;

    public String getMarca() {
        return marca;
    }


    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean getEncendida() {
        return encendida;
    }


    public void encender(){
        if (!encendida){
            encendida = true;
            System.out.println("La computadora se encendió sin un pantallazo azúl");
        }
        else{
            System.out.printf("La computadora ya esta encendida.\n");
        }
    }

    public void apagar(){
        if (encendida){
            encendida = false;
            System.out.println("Se apago correctamente");
        }
    }
}
