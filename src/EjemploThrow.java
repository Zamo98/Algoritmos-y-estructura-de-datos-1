import javax.swing.*;

public class EjemploThrow {
    public static void main(String[] args) throws Exception {
        Prueba();
        try {
            int[] mat = {5, 9, 78, 45};
            int opcion = Integer.parseInt(JOptionPane.showInputDialog("Cuál posición del array desea obtener?"));
            System.out.println("El valor de la posición seleccionada es: " + mat[opcion]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("La posición seleccionada no existe.");
        }
        System.out.println("Hemos terminado.");
    }

    public static void Prueba() throws Exception {
        try {
            String usuario = JOptionPane.showInputDialog("Introduce un usuario para continuar.");
            if (usuario.length() < 4) {
                throw new Exception();
            } else {
                System.out.println("Usuario permitido: " + usuario);
            }
        } catch (Exception e) {
            System.out.println("El usuario no puede ser tan corto.");
            System.exit(0);
        }
    }
}


