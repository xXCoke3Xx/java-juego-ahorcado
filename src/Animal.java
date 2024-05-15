public class Animal {
    String nombre;
    int edad;
    static int contadorDeAnimales = 0;

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        contadorDeAnimales++;
    }

    public String hacerSonido(){
        return "Hacer sonido generico";
    }

    public static int getContadorDeAnimales(){
        return contadorDeAnimales;
    }

}
