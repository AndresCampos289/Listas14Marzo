
import Controladores.ListaController;
import Modelos.ListaModel;
import Vistas.frmListas;


public class main {

    public static void main(String[] args) {
        
        frmListas VistaListas = new frmListas(null, true);
        ListaModel ModeloLista = new ListaModel();
        
        ListaController ControladorLista = new ListaController(VistaListas, ModeloLista);
        
    }
    
}
