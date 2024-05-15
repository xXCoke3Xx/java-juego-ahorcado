public class Perro extends Animal{
    public Perro(String nommbre, int edad){
        // Con la palabra super estamos asignando la informacion heredada
        super(nommbre, edad);
    }
    @Override
    public String hacerSonido(){
        return "Hacer sonido guau";
    }
}
