public class Persona {
    private String nombre;
    private double altura, peso;

    //Getters and setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double calcularIMC(){
        return  peso /(altura*altura);
    }

    public String clasificarIMC(double imc){
        String clasificacion ="";

        if(imc < 18.5){
            clasificacion = "Bajo de peso";
        }

        else if(imc >= 18.5 && imc <=24.9){
            clasificacion="Peso normal";

        }else if (imc >= 25.0 && imc <= 29.9) {
            clasificacion="Sobrepeso";
        }
        else{
            clasificacion = "Obesidad";
        }
        

        return clasificacion;
    }

    
    
}
