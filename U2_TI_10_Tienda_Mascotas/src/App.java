public class App {
    public static void main(String[] args) throws Exception {

       //David Valenzuela Guijosa 3B-DSM
       Cliente cliente1 = new Cliente("David", null);
       Cliente cliente2 = new Cliente("Diego", null);
    
       Perro perro = new Perro("PitBull", 5);
       Gato gato = new Gato("Chanchito", 4);
       Gato gato1 = new Gato("Juas", 4);
       Tienda tienda = new Tienda(3);

       System.out.println("===============================================");
       System.out.println("               REABASTECER ANIMALES            ");
       System.out.println("===============================================");
       
       if(!tienda.reabastecer(perro)){
            System.out.println("Tienda llena :(");
       }else{
            perro.ladrar();
       }

       if(!tienda.reabastecer(gato)){
            System.out.println("Tienda llena :(");
       }else{
            gato.maullar();
       }

       if(!tienda.reabastecer(gato1)){
            System.out.println("Tienda llena :(");
       }else{
            gato.maullar();
       }


       System.out.println("===============================================");
       System.out.println("                  VENDER ANIMALES               ");
       System.out.println("===============================================");

       if(tienda.venderAnimal(cliente1, gato)){
            System.out.println(gato.getNombe()+" vendido correctamente");
            System.out.println("===============================================");
       }
       else{
        System.out.println("No existe este animal en la tienda");
       }


       if(tienda.venderAnimal(cliente2, perro)){
            System.out.println(perro.getNombe() +" vendido correctamente");
            System.out.println("===============================================");
       }
       else{
        System.out.println("No existe este animal en la tienda");
       }

       
       if(tienda.venderAnimal(cliente1, gato1)){
            System.out.println(perro.getNombe() +" vendido correctamente");
            System.out.println("===============================================");
       }
       else{
        System.out.println("No existe este animal en la tienda");
       }
    
    
    }
}
