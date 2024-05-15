public class Persona {

    // Atributos
    String nombre;
    String apellido;
    int edad;
    Carrera carrera;

    // Metodos
    public String darNombreCompleto(){
        return apellido + ", " + nombre;
    }
    public String enviarSaludo(String saludado){
        return "Un saludo de parte de " + nombre + ", " + saludado;
    }

    // Constructores
    public Persona(String nombre, String apellido, int edad, String nombreCarrera, int duracion, boolean enCurso){
        carrera = new Carrera(nombreCarrera, duracion, enCurso);
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        carrera.nombre = nombreCarrera;
    }

}
