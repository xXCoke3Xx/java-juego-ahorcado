// Con esto especificamos que gato hereda de animal
public class Gato extends Animal{

    public Gato(String nommbre, int edad){
        // Con la palabra super estamos asignando la informacion heredada
        super(nommbre, edad);
    }

    @Override
    public String hacerSonido(){
        return "Hacer sonido miau";
    }

}
