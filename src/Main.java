import Exceptions.CalculadoraException;
import Exceptions.DividirPorCeroException;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        m.colecciones2HashMap();

    }

    //Aqui hay cosas varias de pruebas y recordar sin mucho sentido
    public void pruebas() {
        //Un poco de todo
        {
            /*
             * VARIABLE:
             *   Es un espacio de memoria que tiene un nombre asociado y puede contener un valor cambiante
             * DECLARACION:
             *   Asignar el tipo de dato y el nombre de la variable sin darle un valor inicial
             * DEFINICION:
             *   Asignar el tipo de dato y el nombre de la variable dandole o no un valor inicial
             * ASIGNACION
             *   Darle un valor a la variable ya declarada
             *



             * TIPOS DE VARIABLES
             * Variables primitivas: Almacenan valores basicos
             * Variables de referencia: Almacena direcciones de memoria que apuntan a objetos
             *

            //TIPOS DE DATOS ENTEROS: byte (-128 a 127), short (-32768 a 32767), int, long
            int num = 5;

            //TIPOS DE DATOS REALES: float (6 decimales) y double
            double decimal = 5.43;
            double decimalInt = 5d; //Aqui estariamos refiriendo a un 5.0 o 5d

            //TIPO DE DATOS DE CARACTER
            char letra = 's';

            //TIPO DE DATO BOOLEANO
            boolean v = true;
            boolean f = false;

            String cadena = "Esto es un string";

            System.out.println(num + "  ,  " + decimal + "  ,  " + decimalInt + "  ,  " + letra + "  ,  " + v + "  ,  " + f + "  ,  " + cadena);

             */
        }

        // Propiedades mas usadas de un string
        {
            /*String texto = "           Este es un texto asignado a una variable string         ";
            System.out.println(texto);

            int longitud = texto.length();
            System.out.println(longitud);

            char caracter = texto.charAt(0);
            System.out.println(caracter);

            String subCadena = texto.substring(5, 16);
            System.out.println(subCadena);

            String minuscula = texto.toLowerCase();
            System.out.println(minuscula);

            String mayuscula = texto.toUpperCase();
            System.out.println(mayuscula);

            int indice = texto.toLowerCase().indexOf("variable");
            System.out.println(indice);

            String reemplazado = texto.replace("texto", "parrafo");
            System.out.println(reemplazado);

            boolean contiene = texto.contains("asignado");
            System.out.println("Tiene la palabra asignado: " + contiene);

            String sinEspacios = texto.trim();
            System.out.println(sinEspacios);*/
        }

        // IF , ELSE IF y SWITCH
        {
            /*
            int edad = 70;


            if (edad > 60) {
                System.out.println("No entras por viejo");
            } else if (edad == 18) {
                System.out.println("Tienes la edad justa para entrar");
            } else if (edad > 18) {
                System.out.println("Puedes entrar");
            } else {
                System.out.println("No tienes edad");
            }

            String bebida = "cafe";

            switch (bebida) {
                case "cafe":
                    System.out.println("Estas bebiendo cafe");
                    break;
                case "agua":
                    System.out.println("Estas bebiendo agua");
                    break;
                case "cola":
                    System.out.println("Estas bebiendo agua");
                    break;
                case "cerveza":
                    System.out.println("Estas bebiendo agua");
                    break;
                default:
                    System.out.println("Sigue bebiendo lo que sea");
                    break;

            }

             */
        }

        // While y do while
        int contador = 1;

        while (contador <= 5){
            System.out.println(contador);
            if (contador == 5){
                break;
            }else {
                contador++;
            }
        }
        System.out.println(contador);

        contador = 1;

        do{
            System.out.println("Esto sucede entes de la condicion");
            System.out.println(contador);
            contador++;
        }while(contador <= 5);

    }

    //Ejercicio 1 y pruebas con el scanner y un switch
    public void ejercicio1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido a la maquina expendedora");
        System.out.println("Elige una de las siguientes bebidas: ");
        System.out.println("1- Cafe");
        System.out.println("2- Cola");
        System.out.println("3- Cerveza");
        System.out.println("4- Vino");
        System.out.println("5- Agua");

        Integer opcion = scanner.nextInt();

        switch (opcion){
            case 1:
                System.out.println("Expendiendo cafe");
                break;
            case 2:
                System.out.println("Expendiendo cola");
                break;
            case 3:
                System.out.println("Expendiendo cerveza");
                break;
            case 4:
                System.out.println("Expendiendo vino");
                break;
            case 5:
                System.out.println("Expendiendo agua");
                break;
            default:
                System.out.println("No existe el producto o no hay stock");
                break;
        }
        scanner.close();

        if (opcion > 0 && opcion <= 5) System.out.println("Disfrute la bebida");


    }

    //Ejecricio 2 (Ahorcado)
    public void ejercicio2(){

        // Clase scanner para recibir por consola
        Scanner sc = new Scanner(System.in);

        // Declaraciones y asignaciones
        String secretWord = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean adivinada = false;

        // Matrices
        char[] letrasAdivinadas = new char[secretWord.length()];
        String letra;

        // Bucle fori
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
        }

        // Bucle while
        while (!adivinada && intentos < intentosMaximos){
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas));
            System.out.print("Introduce su letra para adivinar: ");
            letra = sc.next().toLowerCase();
            intentos++;
            for (int i = 0; i < letrasAdivinadas.length; i++) {
                if (letra.charAt(0) == secretWord.charAt(i)){
                    letrasAdivinadas[i] = letra.charAt(0);
                }
            }
            if (letra.equals(secretWord)){
                System.out.println("Has ganado!");
                System.out.println("La palabra era: " + secretWord);
                adivinada = true;
            }
        }
        sc.close();

    }

    //Getters y Setters y objetos
    public void getYSet(){
        Persona persona1 = new Persona("Raul", "Perez", 40);
        persona1.setNombre("Ricardo");
        persona1.setApellido("Milos");

        System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.getEdad() + " años.");
    }

    //Herencias y polimorfismos y Statics
    public void herencias(){
        Animal animal = new Animal("Bestia", 15);
        Gato gato = new Gato("Niguiri", 1);
        Perro perro = new Perro("Mulan", 2);

        System.out.println("El animal llamado: " + animal.nombre);
        System.out.println(animal.hacerSonido());
        System.out.println("El gato llamado: " + gato.nombre);
        System.out.println(gato.hacerSonido());
        System.out.println("El perro llamado: " + perro.nombre);
        System.out.println(perro.hacerSonido());

        System.out.println("El total de animales creados es: " + Animal.getContadorDeAnimales());
        System.out.println("Mis animales van a: " + Veterinaria.nombre);

    }

    //Clases abstractas
    public void abstractas(){

        Circulo circulo = new Circulo(10);
        Rectangulo rectangulo = new Rectangulo(8, 6);

        circulo.imprimirInformacion();
        System.out.println("Area del circulo es: " + circulo.calcularArea());
        rectangulo.imprimirInformacion();
        System.out.println("Area del rectangulo es: " + rectangulo.calcularArea());

    }

    //Interfaces
    public void interfaces(){

        Delfin delfin = new Delfin("Adolfina");
        Pulpo pulpo = new Pulpo("Pol", 11);

        delfin.nadar();
        delfin.comunicarse();
        delfin.alimentar();

        pulpo.nadar();
        pulpo.comunicarse();
        pulpo.alimentar();

    }

    //Manejo de errores / excepciones > Try Catch
    public void errores(){
        // Excepciones: eventos que interrumpen el flujo normal de la aplicacion
        // Unchecked y checked

        int numero1 = 10;
        int numero2 = 0;
        int resultado;

        Calculadora calc = new Calculadora();

        try{
            resultado = calc.dividir(numero1, numero2);
            System.out.println(resultado);
        }catch(CalculadoraException e){
            e.printStackTrace();
        }finally {
            System.out.println("Hemos finalizado el calculo sea exitoso o no");
        }
    }

    //Manejo de colecciones
    public void colecciones1HashSet(){
        System.out.println("Bienvenido a la fiesta de los superheroes!");

        Set<String> superheroes = new HashSet<>();
        superheroes.add("Spiderman");
        superheroes.add("Batman");
        superheroes.add("CatWoman");
        superheroes.add("Hulk");
        superheroes.add("WonderWoman");
        superheroes.add("IronMan");
        superheroes.add("Superman");

        if (superheroes.contains("Spiderman")){
            System.out.println("Spiderman esta en la fiesta");
        }

        superheroes.remove("Hulk");

        if (!superheroes.contains("Hulk")){
            System.out.println("Hulk se bajo del carro");
        }

        superheroes.add("Superman");

        if (superheroes.isEmpty()){
            System.out.println("La fiesta ha acabado");
        }else{
            System.out.println("Aun hay " + superheroes.size() + " superheroes en la fiesta");
        }

        for (String superheroe : superheroes){
            System.out.println(superheroe);
        }

    }

    public void colecciones1TreeSet(){
        System.out.println("Bienvenido a la fiesta de los superheroes!");

        Set<String> superheroes = new TreeSet<>();
        superheroes.add("Spiderman");
        superheroes.add("Batman");
        superheroes.add("CatWoman");
        superheroes.add("Hulk");
        superheroes.add("WonderWoman");
        superheroes.add("IronMan");
        superheroes.add("Superman");

        if (superheroes.contains("Spiderman")){
            System.out.println("Spiderman esta en la fiesta");
        }

        superheroes.remove("Hulk");

        if (!superheroes.contains("Hulk")){
            System.out.println("Hulk se bajo del carro");
        }

        superheroes.add("Superman");

        if (superheroes.isEmpty()){
            System.out.println("La fiesta ha acabado");
        }else{
            System.out.println("Aun hay " + superheroes.size() + " superheroes en la fiesta");
        }

        for (String superheroe : superheroes) {
            System.out.println(superheroe);
        }
    }

    public void colecciones1LinkedHashSet(){
        System.out.println("Bienvenido a la fiesta de los superheroes!");

        Set<String> superheroes = new LinkedHashSet<>();
        superheroes.add("Spiderman");
        superheroes.add("Batman");
        superheroes.add("CatWoman");
        superheroes.add("Hulk");
        superheroes.add("WonderWoman");
        superheroes.add("IronMan");
        superheroes.add("Superman");

        if (superheroes.contains("Spiderman")){
            System.out.println("Spiderman esta en la fiesta");
        }

        superheroes.remove("Hulk");

        if (!superheroes.contains("Hulk")){
            System.out.println("Hulk se bajo del carro");
        }

        superheroes.add("Superman");

        if (superheroes.isEmpty()){
            System.out.println("La fiesta ha acabado");
        }else{
            System.out.println("Aun hay " + superheroes.size() + " superheroes en la fiesta");
        }

        for (String superheroe : superheroes) {
            System.out.println(superheroe);
        }
    }

    public void colecciones2HashMap(){
        System.out.println("Bienvenido a nuestra fruteria");

        Map<String, Double> inventario = new HashMap<>();

        inventario.put("Banana", 1.89);
        inventario.put("Tomate", 1.32);
        inventario.put("Palta", 1.74);
        inventario.put("Fresa", 2.19);
        inventario.put("Pimiento", 4.89);

        System.out.println("Inventario de frutas y verduras: ");

        // KeySet me da un array con las keys
        for(String fruta : inventario.keySet()){
            System.out.println(fruta + ": €" + inventario.get(fruta)); // Con el get puedo acceder al valor del key
        }

        String frutaBuscada = "Fresa";
        System.out.println("Se acerca un cliente y nos pide la siguiente fruta: ");

        if(inventario.containsKey(frutaBuscada)){
            System.out.println(frutaBuscada + " esta en el inventario");
        }else{
            System.out.println("Lamentablemente nos quedamos sin " + frutaBuscada);
        }

        String sinStock = "Fresa";
        inventario.remove(sinStock);

        System.out.println("Nos hemos quedado sin " + sinStock);

        for(String fruta : inventario.keySet()){
            System.out.println(fruta + ": €" + inventario.get(fruta)); // Con el get puedo acceder al valor del key
        }
    }
}
