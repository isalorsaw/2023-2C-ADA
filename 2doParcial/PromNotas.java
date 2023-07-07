/*Tema: Operaciones Condicionales.
 * Ingresar 3 notas y mostrar un mensaje si esta reprobado donde el promedio 
 * es entre 0 y 69. Bueno si esta entre 70 y 79, Muy Bueno si esta entre 80 y 89
 * Sobresaliente si es entre 90 y 100
   */
import javax.swing.JOptionPane;
public class PromNotas
{
    public static void main(String args[])
    {
        //Declaracion e Inicializacion
        int n1=0;
        int n2=0;
        int n3=0;
        int prom=0;
        String resultado="";
        
        //Entrada
        String entrada=JOptionPane.showInputDialog(null,"Ingrese la Primera Nota");
        n1=Integer.parseInt(entrada);
        
        entrada=JOptionPane.showInputDialog(null,"Ingrese la Segunda Nota");
        n2=Integer.parseInt(entrada);
        
        entrada=JOptionPane.showInputDialog(null,"Ingrese la Tercera Nota");
        n3=Integer.parseInt(entrada);
        
        prom=(n1+n2+n3)/3;
        //JOptionPane.showMessageDialog(null,prom);
        
        //Desiciones
        if(prom>=0&&prom<=69){
            resultado="Reprobado";
        }
        else if(prom>=70&&prom<=79){
            resultado="Bueno";
        }
        else if(prom>=80&&prom<=89){
            resultado="Muy Bueno";
        }
        else if(prom>=90&&prom<=100){
            resultado="Sobresaliente";
        }
        else{
            resultado="Error";
        }
        JOptionPane.showMessageDialog(null,resultado);
    }
}
