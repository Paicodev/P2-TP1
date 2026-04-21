/**
 * Clase Usuario que permite crear a un usuario,
 * en esta se puede darle un nombre y edad al mismo.
 * En esta clase tenemos el método actualizarPerfil,
 * para poder otorgarle un correo y teléfono al usuario.
 */
public class Usuario {
    //Atributos encapsulados de la clase usuario
    private String nombre;
    private int edad;
    private String correo;
    private int telefono;

    /*
    Sobrecarga de constructores con y sin parámetros
    */
    public Usuario(){

    }

    public Usuario(String nombre){
        this.nombre = nombre;
    }

    public Usuario(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    /*
    Sobrecarga de métodos con diferentes parámetros
    */

    public void actualizarPerfil(String correo){
        this.correo = correo;
    }

    public void actualizarPerfil(String correo, int telefono){
        this.correo = correo;
        this.telefono = telefono;
    }

    /*
    Métodos getters para acceder a los valores de los campos de la clase
    */
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getCorreo() {
        return correo;
    }

    public int getTelefono() {
        return telefono;
    }

}
