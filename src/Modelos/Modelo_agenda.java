
package Modelos;
import static Controladores.Conexion.Conectar;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class Modelo_agenda {
 
    public String NuevoCliente(String Nombre,String Numtelefono,String Calle,String Colonia,String Ncasa,String Ninterior,String ciudad){
        Connection conexion = Conectar();
        
        try{
            
            String Direccion = "INSERT INTO Direccion(Colonia,NombreCalle,NumCasa,NumeroInterior,Ciudad) VALUES(?,?,?,?,?)";
            PreparedStatement statement = conexion.prepareStatement(Direccion,PreparedStatement.RETURN_GENERATED_KEYS);
            
            try{
            statement.setString(1, Colonia);
            statement.setString(2, Calle);
            statement.setString(3, Ncasa);
            statement.setString(4, Ninterior);
            statement.setString(5, ciudad);
             
             int filasAfectadas = statement.executeUpdate();
             System.out.println("Se han insertado " + filasAfectadas + " fila(s) en la tabla");
                
             int idDireccion = 0;
             
             try(var generatedKeys = statement.getGeneratedKeys()){
                 
                 if(generatedKeys.next()){
                     idDireccion=generatedKeys.getInt(1);
                 }else{
                     
                     throw new SQLException("Error al obtener id de la direccion");
                    
                 }          
             }
        
                String Persona = "INSERT INTO Persona(Nombre,NumTelefono,Direccion) VALUES(?,?,?)";
            PreparedStatement statement1 = conexion.prepareStatement(Persona,PreparedStatement.RETURN_GENERATED_KEYS);
            
            statement1.setString(1, Nombre);
            statement1.setString(2, Numtelefono);
            statement1.setInt(3, idDireccion);

            int filasAfectadas2 = statement1.executeUpdate();
                System.out.println("Se han insertado " + filasAfectadas2 + " fila(s) en la tabla");
                
                
               int idPersona = 0;
               try(var generatedKeys = statement1.getGeneratedKeys()){
                 if(generatedKeys.next()){
                     idPersona=generatedKeys.getInt(1);
                 }else{
                     throw new SQLException("Error al obtener id de la direccion");
                     
                 }
             }
               
               String ncliente = "INSERT INTO Cliente(Persona) VALUES(?)";
                PreparedStatement statement3 = conexion.prepareStatement(ncliente);
                statement3.setInt(1, idPersona);
                
                int filasAfectadas3 = statement3.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cliente creado con exito \nSe insertaron "+filasAfectadas3+" filas correctamente",
                        "Cliente creado",JOptionPane.INFORMATION_MESSAGE);
                
                conexion.close();
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Excediste el limite de caracteres que puedes ingresar",
                        "ERROR",JOptionPane.ERROR_MESSAGE);
            }
               
        } catch (SQLException e) {
       
            System.out.println("Error al insertar datos");
            e.printStackTrace();       
    }
     
        return Nombre + Numtelefono + Calle + Colonia + Ncasa + Ninterior + ciudad;
    }
    
    public String NuevoUsuarioyContraseña(String Nusuario, String Ncontraseña,String rol,
            String NombreE,String Numtelefono,String Calle,String Colonia,String Ncasa,String Ninterior){
        
        Connection conexion = Conectar(); 
            
            try {
                
                String Direccion = "INSERT INTO Direccion(Colonia,NombreCalle,NumCasa,NumeroInterior) VALUES(?,?,?,?)";
                PreparedStatement direccion = conexion.prepareStatement(Direccion,PreparedStatement.RETURN_GENERATED_KEYS);
                
                try{
                direccion.setString(1, Colonia);
                direccion.setString(2, Calle);
                direccion.setString(3, Ncasa);
                direccion.setString(4, Ninterior);
               
               int filasDireccion = direccion.executeUpdate();
               System.out.println("Se han insertado " + filasDireccion + " fila(s) en la tabla"); 
               
              int idDireccion = 0;
               try(var generatedKeys = direccion.getGeneratedKeys()){
                 
                 if(generatedKeys.next()){
                     idDireccion=generatedKeys.getInt(1);
                 }else{
                     
                     throw new SQLException("Error al obtener id de la direccion");                    
                 }   
             }
                
                String Persona = "INSERT INTO Persona(Nombre,NumTelefono,Direccion) VALUES(?,?,?)";
                PreparedStatement person = conexion.prepareStatement(Persona,PreparedStatement.RETURN_GENERATED_KEYS);
                
                person.setString(1, NombreE);
                person.setString(2, Numtelefono);
                person.setInt(3, idDireccion);
                
                int filasPersona = person.executeUpdate();
                System.out.println("Se han insertado " + filasPersona + " fila(s) en la tabla");
                
                int idPersona = 0;
                try(var generatedKeys = person.getGeneratedKeys()){
                 
                 if(generatedKeys.next()){
                     idPersona=generatedKeys.getInt(1);
                 }else{
                     
                     throw new SQLException("Error al obtener id de la direccion");                    
                 }   
             }
                
                String empleado = "INSERT INTO Empleado(Persona) VALUES(?)";
                PreparedStatement Empleado = conexion.prepareStatement(empleado,PreparedStatement.RETURN_GENERATED_KEYS);
                
                Empleado.setInt(1, idPersona);
                
                int filasEmpleado = Empleado.executeUpdate();
                System.out.println("Se han insertado " + filasEmpleado + " fila(s) en la tabla");
                
                int idEmpleado = 0;
                
                try(var generatedKeys = Empleado.getGeneratedKeys()){
                 
                 if(generatedKeys.next()){
                     idEmpleado=generatedKeys.getInt(1);
                 }else{
                     
                     throw new SQLException("Error al obtener id de la direccion");                    
                 }   
             }
                
                String Rol = "INSERT INTO Rol (Nombre) VALUES (?)";
                PreparedStatement ROL = conexion.prepareStatement(Rol,PreparedStatement.RETURN_GENERATED_KEYS);
                
                ROL.setString(1, rol);
                
                int filaROl = ROL.executeUpdate();
                System.out.println("Se han insertado " + filaROl + " fila(s) en la tabla");
                
                int idRol = 0;
                try(var generatedKeys = ROL.getGeneratedKeys()){
                 
                 if(generatedKeys.next()){
                     idRol=generatedKeys.getInt(1);
                 }else{
                     
                     throw new SQLException("Error al obtener id de la direccion");                    
                 }   
             }
                
                String consulta = "INSERT INTO Usuario (NombreUsuario, contraseña,Rol,Empleado) VALUES (?, ?,?,?)";
                PreparedStatement statement = conexion.prepareStatement(consulta,PreparedStatement.RETURN_GENERATED_KEYS);
                
                statement.setString(1, Nusuario); 
                statement.setString(2, Ncontraseña);
                statement.setInt(3, idRol);
                statement.setInt(4, idEmpleado);
                
                int filasAfectadas = statement.executeUpdate();
                System.out.println("Se han insertado " + filasAfectadas + " fila(s) en la tabla");
                
                int idUsuario = 0;
                try(var generetedKeys = statement.getGeneratedKeys()){
                    
                    if(generetedKeys.next()){
                        idUsuario=generetedKeys.getInt(1);
                    }else{
                        throw new SQLException("Error al obtener id de la direccion");   
                    }
                }
                
                String fontanero="INSERT INTO Fontanero(Usuario)VALUES(?)";
                PreparedStatement fonta = conexion.prepareStatement(fontanero);
                
                fonta.setInt(1, idUsuario);
                
                int filasFontanero = fonta.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuario/empleado creado correctamente"
                        + "\nSe insertaron "+filasFontanero+" filas en la tabla",
                            "Usuario/empleado",JOptionPane.INFORMATION_MESSAGE);
                
                conexion.close();
                
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, "Excediste la cantidad de datos permitidos",
                            "ERROR",JOptionPane.ERROR_MESSAGE);
                }
            
            }catch (SQLException e) {
                
                System.out.println("Error al insertar datos en la base de datos:");
                e.printStackTrace();
            }
    
        return Nusuario + Ncontraseña+rol +
            NombreE + Numtelefono + Calle + Colonia + Ncasa + Ninterior;
    }

   public static boolean validarUsuarioContraseña(String usuario, String contraseña) {
        if (usuario == null || usuario.isEmpty() || contraseña == null || contraseña.isEmpty()) {
            return false; 
        }
        
        Connection conexion = Conectar();
        
        try {
            String validar = "SELECT * FROM Usuario WHERE NombreUsuario = (?) AND contraseña = (?)";
            PreparedStatement statement = conexion.prepareStatement(validar);
            
            statement.setString(1, usuario); 
            statement.setString(2, contraseña); 
            ResultSet validado = statement.executeQuery();
            
            return validado.next();
            
        } catch (SQLException e) {
            System.out.println("Error al validar usuario y contraseña");
            e.printStackTrace();
        }
        
        return false; 
    }
   
   public String NuevoEmpleado(String NombreEmpleado,String NumtelefonoEmpleado,String CalleEmpleado,
           String ColoniaEmpleado,String NcasaEmpleado,String NinteriorEmpleado,String rol, String  Nusuario, String Ncontraseña ){
       
       Connection conexion = Conectar(); 
            
            try {
                
                String Direccion = "INSERT INTO Direccion(Colonia,NombreCalle,NumCasa,NumeroInterior) VALUES(?,?,?,?)";
                PreparedStatement direccion = conexion.prepareStatement(Direccion,PreparedStatement.RETURN_GENERATED_KEYS);
                
                try{
                direccion.setString(1, ColoniaEmpleado);
                direccion.setString(2, CalleEmpleado);
                direccion.setString(3, NcasaEmpleado);
                direccion.setString(4, NinteriorEmpleado);
               
               int filasDireccion = direccion.executeUpdate();
               System.out.println("Se han insertado " + filasDireccion + " fila(s) en la tabla"); 
               
              int idDireccion = 0;
               try(var generatedKeys = direccion.getGeneratedKeys()){
                 
                 if(generatedKeys.next()){
                     idDireccion=generatedKeys.getInt(1);
                 }else{
                     
                     throw new SQLException("Error al obtener id de la direccion");                    
                 }   
             }
                
                String Persona = "INSERT INTO Persona(Nombre,NumTelefono,Direccion) VALUES(?,?,?)";
                PreparedStatement person = conexion.prepareStatement(Persona,PreparedStatement.RETURN_GENERATED_KEYS);
                
                person.setString(1, NombreEmpleado);
                person.setString(2, NumtelefonoEmpleado);
                person.setInt(3, idDireccion);
                
                int filasPersona = person.executeUpdate();
                System.out.println("Se han insertado " + filasPersona + " fila(s) en la tabla");
                
                int idPersona = 0;
                try(var generatedKeys = person.getGeneratedKeys()){
                 
                 if(generatedKeys.next()){
                     idPersona=generatedKeys.getInt(1);
                 }else{
                     
                     throw new SQLException("Error al obtener id de la direccion");                    
                 }   
             }
                
                String empleado = "INSERT INTO Empleado(Persona) VALUES(?)";
                PreparedStatement Empleado = conexion.prepareStatement(empleado,PreparedStatement.RETURN_GENERATED_KEYS);
                Empleado.setInt(1, idPersona);
                
                int filasEmpleado = Empleado.executeUpdate();
                System.out.println("Se han insertado " + filasEmpleado + " fila(s) en la tabla");
                
                int idEmpleado = 0;
                
                try(var generatedKeys = Empleado.getGeneratedKeys()){
                 
                 if(generatedKeys.next()){
                     idEmpleado=generatedKeys.getInt(1);
                 }else{
                     
                     throw new SQLException("Error al obtener id de la direccion");                    
                 }   
             }
                
                String Rol = "INSERT INTO Rol (Nombre) VALUES (?)";
                PreparedStatement ROL = conexion.prepareStatement(Rol,PreparedStatement.RETURN_GENERATED_KEYS);
                
                ROL.setString(1, rol);
                
                int filaROl = ROL.executeUpdate();
                System.out.println("Se han insertado " + filaROl + " fila(s) en la tabla");
                
                int idRol = 0;
                try(var generatedKeys = ROL.getGeneratedKeys()){
                 
                 if(generatedKeys.next()){
                     idRol=generatedKeys.getInt(1);
                 }else{
                     
                     throw new SQLException("Error al obtener id de la direccion");                    
                 }   
             }
                
                String consulta = "INSERT INTO Usuario (NombreUsuario, contraseña,Rol,Empleado) VALUES (?, ?,?,?)";
                PreparedStatement statement = conexion.prepareStatement(consulta,PreparedStatement.RETURN_GENERATED_KEYS);
                
                statement.setString(1, Nusuario); 
                statement.setString(2, Ncontraseña);
                statement.setInt(3, idRol);
                statement.setInt(4, idEmpleado);
                
                int filasAfectadas = statement.executeUpdate();
                System.out.println("Se han insertado " + filasAfectadas + " fila(s) en la tabla");
                
                int idUsuario = 0;
                try(var generetedKeys = statement.getGeneratedKeys()){
                    
                    if(generetedKeys.next()){
                        idUsuario=generetedKeys.getInt(1);
                    }else{
                        throw new SQLException("Error al obtener id de la direccion");   
                    }
                }
                
                String fontanero="INSERT INTO Fontanero(Usuario)VALUES(?)";
                PreparedStatement fonta = conexion.prepareStatement(fontanero,PreparedStatement.RETURN_GENERATED_KEYS);
                
                fonta.setInt(1, idUsuario);
                
                int filasFontanero = fonta.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuario/empleado creado correctamente"
                        + "\nSe insertaron "+filasFontanero+" filas en la tabla",
                            "Usuario/empleado",JOptionPane.INFORMATION_MESSAGE);
               
                conexion.close();
                
                }catch(SQLException e){
                    JOptionPane.showMessageDialog(null,"Excediste el limite de caracteres para ingresar datos",
                            "ERROR",JOptionPane.ERROR_MESSAGE);
                }
            
            }catch (SQLException e) {
                
                System.out.println("Error al insertar datos en la base de datos:");
                e.printStackTrace();
            }
    
        return NombreEmpleado + NumtelefonoEmpleado + CalleEmpleado+
                ColoniaEmpleado + NcasaEmpleado + NinteriorEmpleado;
   }  
 
   public class ItemCyF {
    private int id;
    private String name;

    public ItemCyF(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }
}
   
   public String Clienteyfontanero(JComboBox clientes,JComboBox fonta,String nombref,String nombrec){
   
       Connection conexion = Conectar();
       
       String cliente ="SELECT persona.nombre, cliente.id FROM cliente JOIN persona ON cliente.persona = persona.id";
       Statement cl;
       
       try{
           cl = conexion.createStatement();
           ResultSet rs = cl.executeQuery(cliente);
           
           while(rs.next()){
            int idc = rs.getInt("id");
            String nombre = rs.getString("nombre");
            clientes.addItem(new ItemCyF(idc, nombre));
           }
           
       }catch(SQLException e){
           
           System.out.println("Error al buscar datos");
           e.printStackTrace();
       }
       
       String fontan ="SELECT persona.nombre, fontanero.id FROM Fontanero JOIN usuario ON fontanero.usuario = usuario.id join empleado "
               + "on usuario.empleado = empleado.id join persona on empleado.persona = persona.id";
       Statement font;
       
       try{
           font = conexion.createStatement();
           ResultSet rs = font.executeQuery(fontan);
           
           while(rs.next()){
                int idf = rs.getInt("id");
            String nombre = rs.getString("nombre");
            fonta.addItem(new ItemCyF(idf, nombre));
           }
       
           conexion.close();
       }catch(SQLException e){
           
           System.out.println("Error al buscar datos");
           e.printStackTrace();
       }
       return cliente + fontan + nombrec + nombref;
   }
   
   public String Citas(String herramienta,String tipotrabajo,String fecha,String horaini,String horafin, int IdCliente,int IdFontanero){
       
       Connection conexion = Conectar();
       
       try{
      
       String Herramienta = "INSERT INTO Herramienta(Herramienta)VALUES(?)";
           PreparedStatement herra = conexion.prepareStatement(Herramienta,PreparedStatement.RETURN_GENERATED_KEYS);
           
           try{
           herra.setString(1, herramienta);
           
           int filasHerramienta = herra.executeUpdate();
           System.out.println("Se insertaron " + filasHerramienta + " filas(s) en la tabla");
           
           int idHerramientas = 0;
           try(var generatedKeys = herra.getGeneratedKeys()){
                 if(generatedKeys.next()){
                     idHerramientas=generatedKeys.getInt(1);
                 }else{
                     throw new SQLException("Error al obtener id de la direccion");
                     
                 }
             }
       
           String TipoTrabajo= "INSERT INTO TipoTrabajo(Descripcion,Herramienta)VALUES(?,?)";
           PreparedStatement traba = conexion.prepareStatement(TipoTrabajo,PreparedStatement.RETURN_GENERATED_KEYS);
           
           traba.setString(1, tipotrabajo);
           traba.setInt(2, idHerramientas);
           
           int filasTrabajo = traba.executeUpdate();
           System.out.println("Se insertaron " + filasTrabajo + " filas(s) en la tabla");
           
           int idTrabajo = 0;
            try(var generatedKeys = traba.getGeneratedKeys()){
                 if(generatedKeys.next()){
                     idTrabajo=generatedKeys.getInt(1);
                 }else{
                     throw new SQLException("Error al obtener id de la direccion");
                     
                 }
             }
            
            String NuevaCita = "INSERT INTO Cita(Fecha,HoraInicio,HoraFin,Cliente,Fontanero,TipoTrabajo)VALUES(?,?,?,?,?,?)";
            PreparedStatement ci = conexion.prepareStatement(NuevaCita,PreparedStatement.RETURN_GENERATED_KEYS);
            
            ci.setString(1, fecha);
            ci.setString(2, horaini);
            ci.setString(3, horafin);
            ci.setInt(4, IdCliente);
            ci.setInt(5, IdFontanero);
            ci.setInt(6, idTrabajo);
            
            int filasCita = ci.executeUpdate();
         
                JOptionPane.showMessageDialog(null, "Cita creada correctamente creada correctamente"
                        + "\nSe insertaron "+filasCita+" filas en la tabla",
                            "Cita creada",JOptionPane.INFORMATION_MESSAGE);
            
            conexion.close();
            
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, "Intenta: \nEscribir la fecha en este orden: \n Año/Mes/Dia\n2024/09/09",
                    "ERROR",JOptionPane.ERROR_MESSAGE);
            }
           
       }catch(SQLException e){
            
        System.out.println("Error al insertar datos en la base de datos:");
        e.printStackTrace();
       }
       return  herramienta + tipotrabajo + fecha + horaini + horafin;
   }
   
   public class ItemC {
    
       private int id;
    private String name;

    public ItemC(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return name;
    }
}

   public String SeleccionEdiClientes(JComboBox<ItemC> clienteseleccion) {
    String cliente = "SELECT persona.nombre, cliente.id FROM cliente JOIN persona ON cliente.persona = persona.id";
    Statement cl;
    Connection conexion = Conectar();

    try {
        cl = conexion.createStatement();
        ResultSet rs = cl.executeQuery(cliente);

        while (rs.next()) {
            int idc = rs.getInt("id");
            String nombre = rs.getString("nombre");
            clienteseleccion.addItem(new ItemC(idc, nombre));
        }

        conexion.close();

    } catch (SQLException e) {
        System.out.println("Error al buscar datos");
        e.printStackTrace();
    }

    return clienteseleccion.toString();
}
   
   public class seci{
       private int id;
       private String ncita;
       
       public seci(int id,String ncita){
           this.id = id;
           this.ncita = ncita;
       }
       public int getId(){
           return id;
       }
       
       public String toString(){
           return ncita;
       }
   }
   
   public String SeleccionCita(JComboBox<seci> citaseleccion){
       String cita = "SELECT Ncita FROM Cita ORDER BY NCita";
       Statement ci;
       Connection conexion = Conectar();
       
       try{
           ci = conexion.createStatement();
           ResultSet rs = ci.executeQuery(cita);
           
           while(rs.next()){
               int idci = rs.getInt("Ncita");
               String ncit = rs.getString("Ncita");
               citaseleccion.addItem(new seci (idci,ncit));
           }
           
           conexion.close();
           
       }catch(SQLException e){
           System.out.println("Error al buscar datos");
           e.printStackTrace();
       }
       return citaseleccion.toString();
   }
   
   public String ActualizarCitas(int Ncitas,String Nfecha, String Nhoraini, String Nhorafin,String Ndescrip,String Herramientas){
       Connection conexion = Conectar();
       
       try{
           String actualizarCita = "UPDATE cita "
                + "JOIN tipotrabajo ON cita.tipotrabajo = tipotrabajo.id "
                + "JOIN herramienta ON tipotrabajo.herramienta = herramienta.id "
                + "SET cita.fecha = ?, cita.horainicio = ?, cita.horafin = ?, "
                + "tipotrabajo.descripcion = ?, herramienta.herramienta = ? "
                + "WHERE cita.ncita = ?";
           PreparedStatement actualizar = conexion.prepareStatement(actualizarCita);
           
           try{
           actualizar.setString(1, Nfecha);
           actualizar.setString(2, Nhoraini);
           actualizar.setString(3, Nhorafin);
           actualizar.setString(4, Ndescrip);
           actualizar.setString(5, Herramientas);
           actualizar.setInt(6, Ncitas);
           
           int filasActualizadas = actualizar.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cita actualizada correctamente"
                        + "\nSe actualizaron "+filasActualizadas+" filas en la tabla",
                            "Cita actualizada",JOptionPane.INFORMATION_MESSAGE);
           
           }catch(SQLException e){
               JOptionPane.showMessageDialog(null, "Intenta: \nEscribir la fecha en este orden: \n Año/Mes/Dia\n2024/09/09",
                    "ERROR",JOptionPane.ERROR_MESSAGE);
           }
       }catch(SQLException e){
           System.out.println("Error al actualizar datos");
           e.printStackTrace();
       }
       
       return Herramientas + Ndescrip + Nfecha + Nhoraini + Nhorafin + Ncitas;
   }
   
   public int Eliminarcitas(int idCita){
       Connection conexion = Conectar();
       
       try{
           String citas = "DELETE FROM Cita WHERE Ncita = ?";
           PreparedStatement borrar = conexion.prepareStatement(citas);
           
           borrar.setInt(1, idCita);
           
           int filarEliminadas = borrar.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cita elimindada correctamente"
                        + "\nSe eliminaron "+filarEliminadas+" en la tabla",
                            "Cita eliminada",JOptionPane.INFORMATION_MESSAGE);
           
       }catch(SQLException e){
           System.out.println("Error borrar datos");
           e.printStackTrace();
       }
       return idCita;
   }

   public String ActualizarClientes(String Nuevotelefono, String Nuevacalle, String Nuevacolonia, String NuevoNcasa, String NuevoNinterior, 
           int idCliente,String nciudad) {
    Connection conexion = Conectar();

    try{
        String cliente = "UPDATE Cliente JOIN Persona ON Cliente.persona = Persona.id JOIN Direccion ON Persona.direccion = "
                + "Direccion.id SET Persona.numtelefono = ?, Direccion.nombrecalle = ?, Direccion.colonia = ?, Direccion.numcasa = ?, "
                + "Direccion.numerointerior = ?,Direccion.ciudad = ? WHERE Cliente.id = ?";

        PreparedStatement Ndatosc = conexion.prepareStatement(cliente);
            
        Ndatosc.setString(1, Nuevotelefono);
        Ndatosc.setString(2, Nuevacalle);
        Ndatosc.setString(3, Nuevacolonia);
        Ndatosc.setString(4, NuevoNcasa);
        Ndatosc.setString(5, NuevoNinterior);
        Ndatosc.setString(6, nciudad);
        Ndatosc.setInt(7, idCliente);

        int filasActualizadas = Ndatosc.executeUpdate();
                JOptionPane.showMessageDialog(null, "Cliente actualizado correctamente"
                        + "\nSe actualizaron "+filasActualizadas+" filas en la tabla",
                            "Cliente actualizado",JOptionPane.INFORMATION_MESSAGE);

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Sobrepasaste el límite de caracteres permitidos,", "ERROR", JOptionPane.ERROR_MESSAGE);
    }

    return Nuevotelefono + Nuevacalle + Nuevacolonia + NuevoNcasa + NuevoNinterior + idCliente + nciudad;
}
   
   public String ConsultarCitas(String Citas){
       
    Statement st;
    ResultSet rs;
    Connection conexion = Conectar();   
    
             Citas = "SELECT cita.NCita, cita.fecha, cita.horainicio, cita.horafin, persona_cliente.nombre AS cliente, "
                  + "direccion_cliente.colonia, direccion_cliente.nombrecalle, direccion_cliente.numcasa, direccion_cliente.numerointerior, direccion_cliente.ciudad, "
                  + "persona_fontanero.nombre AS fontanero, tipotrabajo.descripcion AS tipotrabajo, herramienta.herramienta AS herramienta "
                  + "FROM cita ORDER BY NCita "
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
           }
           
       }catch(SQLException e){
           System.out.println("Error al buscar los datos");
           e.printStackTrace();
       }
      
       return Citas;
   }
   
}