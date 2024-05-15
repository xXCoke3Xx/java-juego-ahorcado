public class Persona {

    // Atributos
    private String nombre;
    private String apellido;
    private int edad;

    // Metodos
    public String darNombreCompleto(){
        return apellido + ", " + nombre;
    }
    public String enviarSaludo(String saludado){
        return "Un saludo de parte de " + nombre + ", " + saludado;
    }

    // Constructores
    public Persona(String nombre, String apellido, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    // GETTERS Y SETTERS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
}
