import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Ejemplo3
{
    public static void main(String args[])
    {
        
        for(int i=0;i<5;i++)
        {
        String op1="Canada";
        String op2="Costa Rica";
        String op3="Belice";
        
        ImageIcon icono=new ImageIcon(Ejemplo3.class.getResource("Imagenes/1.png"));
        int seleccion = JOptionPane.showOptionDialog(null,
                       "Informacion", 
                       "Titulo",
                       JOptionPane.YES_NO_CANCEL_OPTION,
                       JOptionPane.QUESTION_MESSAGE,
                       icono,
                       new Object[] { op1, op2, 
                       op3 },   // null para YES, NO y CANCEL
                        op1);
 JOptionPane.showMessageDialog(null,""+seleccion);
}
    }
}