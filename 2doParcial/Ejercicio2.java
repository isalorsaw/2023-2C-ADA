import javax.swing.JOptionPane;
public class Ejercicio2
{
    public static void main(String args[])
    {
        //Declaraciones
        int numero=0;
        
        //Salida y Entrada
        String entrada=JOptionPane.showInputDialog("Ingrese un Numero");
        numero=Integer.parseInt(entrada);
        
        //Proceso
        if(numero>100)
        {
            JOptionPane.showMessageDialog(null,"El Numero es Mayor a 100");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"El Numero NO es Mayor a 100");
        }
    }
}