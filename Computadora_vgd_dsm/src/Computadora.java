public class Computadora {

    private String marca, modelo;
    private boolean encendida;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isEncendida() {
        return encendida;
    }

    public void setEncendida(boolean encendida) {
        this.encendida = encendida;
    }

    public void encender(){
        if (encendida == false){
            encendida = true;
        }
    }

    public void apagar(){
        if (encendida == true){
            encendida = false;
        }
    }
}
