/*
   Nombre: Ing Isaias Salinas
   Numero Cuenta: 232051048
   Clase Analisis y Diseno de Algoritmo
   */
//Librerias
import javax.swing.JOptionPane;
public class Ejercicio1
{//Inicio de Class
    public static void main(String args[])
    {//Inicio Main
        
        //Declaraciones
        int n1=0;
        int n2=0;
        int suma=0;
        //Asignaciones o Inicializaciones
        
        //Entradas
        String entrada=JOptionPane.showInputDialog("Ingrese el Primer Numero");
        n1=Integer.parseInt(entrada);
        
        entrada=JOptionPane.showInputDialog("Ingrese el Segundo Numero");
        n2=Integer.parseInt(entrada);
        
        //Proceso
        suma=n1+n2;
        
        //Salida
        JOptionPane.showMessageDialog(null,"La Suma es: "+suma);
        
        
        
    }//Fin del Main
}//Fin de Class