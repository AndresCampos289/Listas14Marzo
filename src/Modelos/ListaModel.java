
package Modelos;

import java.util.LinkedList;
import java.util.Queue;
import javax.swing.JOptionPane;


public class ListaModel 
{
    Queue<Clientes> ListaCLientes = new LinkedList();
    
    public void EncolarCliente (String ape, String nom)
    {
        
        Clientes nuevoCliente = new Clientes(ape, nom);
        this.ListaCLientes.add(nuevoCliente);  
        JOptionPane.showMessageDialog(null, "CLIENTE AGREGADO A LA LISTA!!!");
    }   
    
    public Queue ListarClientes()
    {
        return this.ListaCLientes;
        
    }
    
    public void DesEncolar() 
    {
        this.ListaCLientes.poll();
    }
    
    
}
