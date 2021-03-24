import javax.swing.*;
public class EjemploTry {
    public static void main(String[] args) {
        try{
            String mensaje = JOptionPane.showInputDialog("Cuál división desea realizar?. Presione una tecla.");
            int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número 1"));
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el número 2"));
            int resultado = numero1 / numero2;
            System.out.println("El resultado es: " + resultado);
        }catch(RuntimeException e){
            System.out.println("Esta operación no se puede realizar");
        }
    }
}
