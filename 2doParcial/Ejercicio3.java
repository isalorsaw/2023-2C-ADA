import javax.swing.JOptionPane;
public class Ejercicio3
{
    public static void main(String args[])
    {
        //Declaraciones
        int numero=0;//Inicializar con 1 igual
        
        //Entrada
        String entrada=JOptionPane.showInputDialog("Ingrese un Numero");
        numero=Integer.parseInt(entrada);
        
        //Proceso
        if(numero==0)//Comparar con dos iguales
        {
            JOptionPane.showMessageDialog(null,"El Numero Ingresado es Igual a Cero");
        }
        else if(numero>0)
        {
            JOptionPane.showMessageDialog(null,"El Numero Ingresado es Positivo");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"El Numero Ingresado es Negativo");
        }
    }
}