
package Controladores;

import Modelos.Clientes;
import Modelos.ListaModel;
import Vistas.frmListas;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.util.Queue;

public class ListaController implements ActionListener{

    frmListas VistaLista;
    ListaModel ModeloVista;

    public ListaController(frmListas VistaLista, ListaModel ModeloVista) {
        this.VistaLista = VistaLista;
        this.ModeloVista = ModeloVista;
        
        //Escucha los botones
        
        this.VistaLista.btnAtenderCliente.addActionListener(this);
        this.VistaLista.btnAtenderTodos.addActionListener(this);
        this.VistaLista.btnIngresarCliente.addActionListener(this);
        
        //Levantar la vista a la lista
        this.VistaLista.setLocationRelativeTo(null);
        this.VistaLista.setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource() == this.VistaLista.btnIngresarCliente)
        {
            this.ModeloVista.EncolarCliente(this.VistaLista.txtApellidos.getText(),
                    this.VistaLista.txtNombre.getText());
            
            
            Queue<Clientes> listaLocal = this.ModeloVista.ListarClientes();
            this.VistaLista.txtListaClientes.setText(listaLocal.peek().toString());
            
            String Cadena = "";
            for(Clientes MiListaClientes : listaLocal)
            {
                Cadena = Cadena + MiListaClientes.getApellidos() +" "+ MiListaClientes.getNombre()+"\n";
                this.VistaLista.txtListaClientes.setText(Cadena);
                
            }
            
        }


    }
    
    
    
    
    
}
