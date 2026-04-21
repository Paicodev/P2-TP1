public class Reporte {
    
    //método sin retorno, este método imprime un texto en consola
    public void generarEncabezado(){
        System.out.println("Reporte generado!");
    }

    //método con retorno, este método retorna una cadena de caracteres, retorna un String
    public String obtenerCuerpo(){
        return "Cuerpo de reporte obtenido";
    }
}
