package MVC.controlador;

import MVC.modelo.Usuario;
import MVC.modelo.UsuarioDAO;
import MVC.vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author Jaime Barrera
 */
public class Controlador implements ActionListener{

    UsuarioDAO dao = new UsuarioDAO();
    Usuario u = new Usuario();
    Vista vista = new Vista();
    DefaultTableModel modelo = new DefaultTableModel();

    public Controlador(Vista v) {
        this.vista=v;
        this.vista.btnListar.addActionListener(this);
    }
            
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==vista.btnListar){
            listar(vista.tabla);
        }
    }
    
    public void listar(JTable table){
        modelo = (DefaultTableModel) table.getModel();
        List<Usuario>lista=dao.listar();
        Object[]object=new Object[3];
        for (int i = 0; i < lista.size() ; i++) {
            object[0]=lista.get(i).getId();
            object[1]=lista.get(i).getNombre();
            object[2]=lista.get(i).getEmail();
            modelo.addRow(object);
        }
        vista.tabla.setModel(modelo);
    }
    
}
