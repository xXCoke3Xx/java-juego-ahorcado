import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main m = new Main();
        // m.ejercicio2();

        Persona persona1 = new Persona("Raul", "Perez", 40, "Arquitecto", 6, true);

        System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.edad + " años y esta estudiando " + persona1.carrera.nombre);

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
}
