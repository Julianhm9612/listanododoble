package ejercicio1.ll;
import javax.swing.JOptionPane;

public class Ejercicio1LL 
{
    public static void main(String[] args) 
    {
        int aNum;
        ListaLigada listaNros = new ListaLigada();
        
        //crea la lista
        do
        {
            aNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Número entero diferente de cero [999 para salir]", "Crear Lista", JOptionPane.INFORMATION_MESSAGE));
        }
        while(aNum < 0);
        
        while(aNum != 999)
        {
            listaNros.Ingresar(aNum);
            do
            {
                aNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Número entero diferente de cero [999 para salir]", "Crear Lista", JOptionPane.INFORMATION_MESSAGE));
            }
            while(aNum < 0);
        }      
        //muesta la lista original  
        System.out.println("La lista ingresada es");
        aNum = listaNros.MostrarLista();
        do
        {
            System.out.print(aNum + " ");
            aNum = listaNros.MostrarLista();
        }
        while (aNum != 0);
       
        aNum = Integer.parseInt(JOptionPane.showInputDialog(null, "Parametro a eliminar de la lista: ", JOptionPane.INFORMATION_MESSAGE));
        listaNros.BorraParam(aNum);
        System.out.println("");
        System.out.println("\nLa lista con todos los parametros ("+aNum+") eliminados");
        aNum = listaNros.MostrarLista();
        do
        {
            System.out.print(aNum + " ");
            aNum = listaNros.MostrarLista();
        }
        while (aNum != 0);
        
        System.out.println("");
        System.out.println("\nIntercambio del segundo y el cuarto info");        
        listaNros.IntercambiarInfo();
        aNum = listaNros.MostrarLista();
        do
        {
            System.out.print(aNum + " ");
            aNum = listaNros.MostrarLista();
        }
        while (aNum != 0);
        
        listaNros.PenUlt();
        System.out.println("");
        System.out.println("\nSi el penúltimo numero de la anterior lista es impar se elimina, de lo contrario se cambia por 100");
        aNum = listaNros.MostrarLista();
        do
        {
            System.out.print(aNum + " ");
            aNum = listaNros.MostrarLista();
        }
        while (aNum != 0);
        System.out.println("");
    }
}