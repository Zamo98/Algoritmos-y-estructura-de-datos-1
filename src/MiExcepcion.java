import javax.swing.*;

public class MiExcepcion extends Exception{
    public static void main(String[] args) {
        try{
            VerificaCedula();
        }catch (MiExcepcion e){
            System.out.println(e.getMessage());
        }
    }
    public MiExcepcion(String MensajeError){
        super(MensajeError);
    }
    public static void VerificaCedula() throws MiExcepcion{
        String cedula = JOptionPane.showInputDialog("Introduce un número de cédula.");
        if(cedula.length() < 9){
            throw new MiExcepcion("La cédula tiene que tener 9 dígitos.");
        }else{
            System.out.println("La cédula introducida es correcta.");
        }
        System.out.println(cedula);
    }
}
