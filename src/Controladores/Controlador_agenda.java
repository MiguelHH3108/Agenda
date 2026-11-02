
package Controladores;

import static Controladores.Conexion.Conectar;
import Modelos.Modelo_agenda;
import Modelos.Modelo_agenda.ItemC;
import Modelos.Modelo_agenda.ItemCyF;
import Modelos.Modelo_agenda.seci;
import Vistas.Loggin;
import Vistas.Principal;
import javax.swing.JOptionPane;
import Vistas.NuevoUsuario;
import Vistas.Clientes;
import Vistas.Empleado;
import Vistas.Nueva_cita;
import Vistas.EditarCitas;
import javax.swing.JComboBox;
import Vistas.EditarCliente;
import Vistas.Citas;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;

public class Controlador_agenda {
    
    private Modelo_agenda ModeloContraseña;
    private Loggin Vistacontraseña;
    private  NuevoUsuario nuevouser;
    private Clientes Ncliente;
    private Empleado NuevoEmpleado;
    private Nueva_cita Nuevacita;
    private EditarCliente EditCliente;
    private Citas consulcitas;
    private EditarCitas Editcitas;
    
    //Este es para consultar las citas
    public Controlador_agenda(Modelo_agenda ModeloContraseña, Citas consulcitas) {
        this.ModeloContraseña = ModeloContraseña;
        this.consulcitas = consulcitas;
    }

    //Este es para seleccionar las citas a editar;
    public Controlador_agenda(Modelo_agenda ModeloContraseña, EditarCitas editcitas) {
        this.ModeloContraseña = ModeloContraseña;
        this.Editcitas = editcitas;
    }
    
    //Este es para seleccionar clientes para editar datos
    public Controlador_agenda(Modelo_agenda ModeloContraseña, EditarCliente EditCliente) {
        this.ModeloContraseña = ModeloContraseña;
        this.EditCliente = EditCliente;
    }
    
    //Este es para seleccionar cliente para las citas
    public Controlador_agenda(Modelo_agenda ModeloContraseña, Nueva_cita Nuevacita) {
        this.ModeloContraseña = ModeloContraseña;
        this.Nuevacita = Nuevacita;
    }
    
    //Este es para crear nuevo usuario
    public Controlador_agenda(Modelo_agenda ModeloContraseña, NuevoUsuario nuevouser) {
        this.ModeloContraseña = ModeloContraseña;
        this.nuevouser = nuevouser;
    }
    
    //Este es para verificar el usuario =)
    public Controlador_agenda(Modelo_agenda ModeloContraseña, Loggin Vistacontraseña) {
        this.ModeloContraseña = ModeloContraseña;
        this.Vistacontraseña = Vistacontraseña;
    }

    //Este es para crear nuevos clientes 
    public Controlador_agenda(Modelo_agenda ModeloContraseña, Clientes Ncliente) {
        this.ModeloContraseña = ModeloContraseña;
        this.Ncliente = Ncliente;
    }

    //Este es para crear nuevos empleados
    public Controlador_agenda(Modelo_agenda ModeloContraseña, Empleado NuevoEmpleado) {
        this.ModeloContraseña = ModeloContraseña;
        this.NuevoEmpleado = NuevoEmpleado;
    }
    
    public void Clientefonta(){
        JComboBox fon = Nuevacita.Fontanero;
        JComboBox cl = Nuevacita.Cliente;
        
        ModeloContraseña.Clienteyfontanero(cl, fon, "nombre", "nombre");
    }
    
    public void cita(){
        String fecha = Nuevacita.getFecha();
        String horain = Nuevacita.getHorainicio();
        String horaf = Nuevacita.getHoraFin();
        String descrip = Nuevacita.getDescripcion();
        String herra = Nuevacita.getHerramientas();
        JComboBox idfonta = Nuevacita.Fontanero;
        JComboBox idclien = Nuevacita.Cliente;
        
        int idfon = getIdClienteFontanero(idfonta);
        int idcli = getIdClienteFontanero(idclien);
        
        ModeloContraseña.Citas(herra, descrip, fecha, horain, horaf,idcli,idfon);
    }
    
    private int getIdClienteFontanero(JComboBox<ItemC> comboBox) {
    ItemCyF selectedItem = (ItemCyF) comboBox.getSelectedItem();
    
    if (selectedItem != null) {
        return selectedItem.getId();
    } else {
        return -1;
    }
}
    
    public void Vercitas(){
        DefaultTableModel modelo;
        Statement st;
        ResultSet rs;
        Connection conexion = Conectar();   
         String Citas =  "SELECT cita.NCita, cita.fecha, cita.horainicio, cita.horafin, persona_cliente.nombre AS cliente, "
                  + "direccion_cliente.colonia, direccion_cliente.nombrecalle, direccion_cliente.numcasa, direccion_cliente.numerointerior, direccion_cliente.ciudad, "
                  + "persona_fontanero.nombre AS fontanero, tipotrabajo.descripcion AS tipotrabajo, herramienta.herramienta AS herramienta "
                  + "FROM cita "
                  + "JOIN cliente ON cita.cliente = cliente.id "
                  + "JOIN persona AS persona_cliente ON cliente.persona = persona_cliente.id "
                  + "JOIN direccion AS direccion_cliente ON persona_cliente.direccion = direccion_cliente.id "
                  + "JOIN fontanero ON cita.fontanero = fontanero.id "
                  + "JOIN usuario ON fontanero.usuario = usuario.id "
                  + "JOIN empleado ON usuario.empleado = empleado.id "
                  + "JOIN persona AS persona_fontanero ON empleado.persona = persona_fontanero.id "
                  + "JOIN tipotrabajo ON cita.tipotrabajo = tipotrabajo.id "
                  + "JOIN herramienta ON tipotrabajo.herramienta = herramienta.id ORDER BY NCita";
    
         try{
                
              st = conexion.createStatement();
              rs = st.executeQuery(Citas);
              Object[] cit = new Object[13];
              modelo = (DefaultTableModel) consulcitas.Tablacitas.getModel();
              while(rs.next()){
                  cit [0] = rs.getInt("NCita");
                  cit [1] = rs.getDate("Fecha");
                  cit [2] = rs.getTime("Horainicio");
                  cit [3] = rs.getTime("Horafin");
                  cit [4] = rs.getString("Cliente");
                  cit [5] = rs.getString("Colonia");
                  cit [6] = rs.getString("NombreCalle");
                  cit [7] = rs.getString("Numcasa");
                  cit [8] = rs.getString("Numerointerior");
                  cit [9] = rs.getString("Ciudad");
                  cit [10] = rs.getString("Fontanero");
                  cit [11] = rs.getString("Tipotrabajo");
                  cit [12] = rs.getString("Herramienta");
                  
                  modelo.addRow(cit);
                  
              }
              
              consulcitas.Tablacitas.setModel(modelo);
         }catch(SQLException e){
             System.out.println("Error");
             e.printStackTrace();
         }
    }
    
    public void NuevoCliente(){
        String Nombre = Ncliente.getNombre();
        String Telefono = Ncliente.getNumtelefono();
        String calle = Ncliente.getCalle();
        String colonia = Ncliente.getColonia();
        String    ncasa = Ncliente.getNcasa();
        String ninterior = Ncliente.getNinterior();
        String Ciudad = Ncliente.getCiudad();
        
        ModeloContraseña.NuevoCliente(Nombre, Telefono, calle, colonia, ncasa,ninterior,Ciudad);
    }
   
    public void NusuarioContraseña(){
        
        String NuevoUsuario = nuevouser.getNombreUsuario();
        String NuevaContra = nuevouser.getNContraseña();
        String NuevoNombre = nuevouser.getNombreEmpleado();
        String NuevoTelefono = nuevouser.getNumeroTelefono();
        String NuevaCalle = nuevouser.getCalleEmpleado();
        String NuevaColonia = nuevouser.getColoniaEmpleado();
        String NuevoNcasa = nuevouser.getCalleEmpleado();
        String NuevoNinterior = nuevouser.getNumInteriorEmpleado();
        String Rol = nuevouser.getRol();
        
        ModeloContraseña.NuevoUsuarioyContraseña(NuevoUsuario, NuevaContra, Rol, NuevoNombre, 
                NuevoTelefono, NuevaCalle, NuevaColonia, NuevoNcasa, NuevoNinterior);
    }
    
    public void login() {
        String User = Vistacontraseña.getUsuario();
        String pasword = Vistacontraseña.getContraseña();
        
        Principal pr = new Principal();
        Loggin lg = new Loggin();
        
        if (User != null && !User.isEmpty() && pasword != null && !pasword.isEmpty() &&
            Modelo_agenda.validarUsuarioContraseña(User, pasword)) {
            
            JOptionPane.showMessageDialog(null, "        Acceso concedido",
                    "Bienvenido", JOptionPane.INFORMATION_MESSAGE);
            
            pr.setVisible(true);
            lg.setVisible(false);
            
        } else {
            JOptionPane.showMessageDialog(null, "         Acceso denegado",
                    "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public void NuevoEmpleado(){
         String NombreEmpleado = NuevoEmpleado.getNombreEmpleado();
        String TelefonoEmpleado = NuevoEmpleado.getNumeroTelefono();
        String calleEmpleado = NuevoEmpleado.getCalleEmpleado();
        String coloniaEmpleado = NuevoEmpleado.getColoniaEmpleado();
        String ncasaEmpleado = NuevoEmpleado.getNcasaEmpleado();
        String ninteriorEmpleado = NuevoEmpleado.getNumInteriorEmpleado();
        String usuario = NuevoEmpleado.getNombreUsuario();
        String contraseña = NuevoEmpleado.getNContraseña();
        String rol = NuevoEmpleado.getRol();
        
        ModeloContraseña.NuevoEmpleado(NombreEmpleado, TelefonoEmpleado, calleEmpleado, coloniaEmpleado, 
                ncasaEmpleado, ninteriorEmpleado, rol, usuario, contraseña);
    }

    public void seleccionEditarClientes(){
        JComboBox cliente = EditCliente.clienteseleccion;
        ModeloContraseña.SeleccionEdiClientes(cliente);
    }
    
    public void seleccionEditarcitas(){
        JComboBox edicitas = Editcitas.SeleccionCita;
        ModeloContraseña.SeleccionCita(edicitas);
    }
     
    public void EditarClientes() {
    String nuevonumtele = EditCliente.getNuevoNtelefono();
    String nuevacalle = EditCliente.getNuevaCalle();
    String nuevacolonia = EditCliente.getNuevaColonia();
    String nuevoNinterior = EditCliente.getNuevoNinterior();
    String nuevoNcasa = EditCliente.getNuevoNcasa();
    JComboBox idc = EditCliente.clienteseleccion;
    String Nuevaciudad = EditCliente.getNueciudad();

    int idcliente = getIdCliente(idc);

    ModeloContraseña.ActualizarClientes(nuevonumtele, nuevacalle, nuevacolonia, nuevoNcasa,
            nuevoNinterior, idcliente,Nuevaciudad);
}
    
    public void Eliminarcitas(){
        JComboBox ncitas = Editcitas.SeleccionCita;
        
        int idcitas = getNcita(ncitas);
        ModeloContraseña.Eliminarcitas(idcitas);
    }
    
    public void EditarCitas(){
        String Nuefecha = Editcitas.getNuevaFecha();
        String Nuehoraini = Editcitas.getNuevaHoraini();
        String Nuehorafin = Editcitas.getNuevaHorafin();
        String Nuevadescrip = Editcitas.getNuevaDescripcion();
        String herramientas = Editcitas.getHerramientas();
        JComboBox ncitas = Editcitas.SeleccionCita;
        
        int Ncita = getNcita(ncitas);
        
        ModeloContraseña.ActualizarCitas(Ncita, Nuefecha, Nuehoraini, Nuehorafin, 
                Nuevadescrip, herramientas);
    }
    
    private int getNcita(JComboBox<seci> ncitas){
        seci seleccita = (seci) ncitas.getSelectedItem();
        
        if(seleccita != null){
            return seleccita.getId();
        }else{
            return -1;
        }
    }

private int getIdCliente(JComboBox<ItemC> comboBox) {
    ItemC selectedItem = (ItemC) comboBox.getSelectedItem();
    
    if (selectedItem != null) {
        return selectedItem.getId();
    } else {
        return -1;
    }
}

}