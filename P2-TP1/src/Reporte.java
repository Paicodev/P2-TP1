public class Reporte {

    //método sin retorno, este método imprime un texto en consola
    public void generarEncabezado(){
        System.out.println("Reporte generado!");
    }

    //método con retorno, este método retorna una cadena de caracteres, retorna un String
    public String obtenerCuerpo(){
        return "Cuerpo de reporte obtenido";
    }

    //Metodo con parametros variables (varargs)
    //Los 3 puntos indican que puede recibir n Strings)
    public void procesadorSecciones(String... secciones){
        System.out.println("Procesando "+ secciones.length + " secciones:");
        //Recorre el arreglo de secciones con un for-each 
        // y las imprime
        for (String seccion: secciones){
            System.out.println("- " + seccion);
        }
    }
}
