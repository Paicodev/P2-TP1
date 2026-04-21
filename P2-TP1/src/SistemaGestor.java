/**
 * Clase "Sistema Gestor" que se encarga de gestionar cosas
 */
public class SistemaGestor {
    // Atributos del sistema gestor
    /*  El campo nombre pertenece a la clase en sí, ya que,
      está declarada como "static", su valor no puede cambiar porque está
     declarado como "final"*/
    public static final String NOMBRE_SISTEMA = "Gestor universitario";
    /*
    Bloque de configuración
    Aqui iran las variables y métodos próximamente
    */

   public String imprimirNombre(){
    return "El nombre del Sistema Gestor es: " + NOMBRE_SISTEMA;
   }
}
