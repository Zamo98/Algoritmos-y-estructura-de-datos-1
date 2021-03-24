import java.io.FileReader;
import java.io.IOException;

public class EjemploFinally{
    public static void main(String[] args) {
        try{
            FileReader archivo = new FileReader("C:\\Users\\Admin\\IdeaProjects\\TareaExcepciones\\src\\Prueva");
            System.out.println("Archivo encontrado.");
        }catch (IOException e){
            System.out.println("No se encontró el archivo.");
        }
        finally{
            System.out.println("Proceso finalizado.");
        }
    }
        }



