
package Vistas;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Image;
import javax.swing.Timer;

public class Principal extends javax.swing.JFrame {
    private ImageIcon imagen;
    private Icon icono;
    private Timer timerReloj;
    
    public Principal() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        iniciarReloj();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        Nuevo_cliente = new javax.swing.JToggleButton();
        Nueva_cita = new javax.swing.JToggleButton();
        Citas = new javax.swing.JToggleButton();
        Edit_cliente = new javax.swing.JToggleButton();
        InicioSesion = new javax.swing.JToggleButton();
        NuevoEmpleado = new javax.swing.JButton();
        Reloj = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Ncliente = new javax.swing.JLabel();
        Editclientes = new javax.swing.JLabel();
        Nuevacita = new javax.swing.JLabel();
        Nempleado = new javax.swing.JLabel();
        vercitas = new javax.swing.JLabel();
        Editcitas = new javax.swing.JButton();
        imgcitas = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        Nuevo_cliente.setBackground(new java.awt.Color(255, 255, 153));
        Nuevo_cliente.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Nuevo_cliente.setText("Nuevo cliente");
        Nuevo_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nuevo_clienteActionPerformed(evt);
            }
        });

        Nueva_cita.setBackground(new java.awt.Color(255, 255, 153));
        Nueva_cita.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Nueva_cita.setText("Nueva cita");
        Nueva_cita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Nueva_citaActionPerformed(evt);
            }
        });

        Citas.setBackground(new java.awt.Color(255, 255, 153));
        Citas.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Citas.setText("Citas");
        Citas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CitasActionPerformed(evt);
            }
        });

        Edit_cliente.setBackground(new java.awt.Color(255, 255, 153));
        Edit_cliente.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Edit_cliente.setText("Editar cliente");
        Edit_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Edit_clienteActionPerformed(evt);
            }
        });

        InicioSesion.setBackground(new java.awt.Color(255, 255, 153));
        InicioSesion.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        InicioSesion.setText("Regresar inicio sesion");
        InicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InicioSesionActionPerformed(evt);
            }
        });

        NuevoEmpleado.setBackground(new java.awt.Color(255, 255, 153));
        NuevoEmpleado.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        NuevoEmpleado.setText("Nuevo empleado");
        NuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoEmpleadoActionPerformed(evt);
            }
        });

        Reloj.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Reloj.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel1.setText("¿Qué desea hacer?");

        Ncliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Crear cliente.jpg"))); // NOI18N
        Ncliente.setOpaque(true);
        Ncliente.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                NclienteMouseMoved(evt);
            }
        });

        Editclientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Edi clien.jpg"))); // NOI18N
        Editclientes.setOpaque(true);
        Editclientes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                EditclientesMouseMoved(evt);
            }
        });

        Nuevacita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Crear citas.jpg"))); // NOI18N
        Nuevacita.setOpaque(true);
        Nuevacita.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                NuevacitaMouseMoved(evt);
            }
        });

        Nempleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Crear empleado.jpg"))); // NOI18N
        Nempleado.setOpaque(true);
        Nempleado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                NempleadoMouseMoved(evt);
            }
        });

        vercitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Ver citas.jpg"))); // NOI18N
        vercitas.setOpaque(true);
        vercitas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                vercitasMouseMoved(evt);
            }
        });

        Editcitas.setBackground(new java.awt.Color(255, 255, 153));
        Editcitas.setFont(new java.awt.Font("Arial", 0, 20)); // NOI18N
        Editcitas.setText("Editar citas");
        Editcitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditcitasActionPerformed(evt);
            }
        });

        imgcitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Editar citas.jpg"))); // NOI18N
        imgcitas.setOpaque(true);
        imgcitas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                imgcitasMouseMoved(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(InicioSesion)
                .addGap(172, 172, 172))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(Reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Nempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(vercitas, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Nuevo_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Ncliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGap(48, 48, 48)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(Edit_cliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Editclientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(NuevoEmpleado)
                                .addGap(54, 54, 54)
                                .addComponent(Citas)))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Editcitas)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Nueva_cita))
                            .addComponent(Nuevacita, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(imgcitas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Reloj)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Ncliente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Editclientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nuevacita, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Nuevo_cliente)
                            .addComponent(Edit_cliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nempleado, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(vercitas, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Nueva_cita)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(imgcitas, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(NuevoEmpleado, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Citas)
                        .addComponent(Editcitas)))
                .addGap(18, 18, 18)
                .addComponent(InicioSesion)
                .addGap(24, 24, 24))
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Nuevo_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nuevo_clienteActionPerformed
        Clientes cl = new Clientes();
        cl.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Nuevo_clienteActionPerformed

    private void Nueva_citaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Nueva_citaActionPerformed
        Nueva_cita nc = new Nueva_cita();
        nc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Nueva_citaActionPerformed

    private void InicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InicioSesionActionPerformed
        int a =  JOptionPane.YES_NO_OPTION;
      int resultado = JOptionPane.showConfirmDialog(this," ¿Regresar al inicio de sesión?",
              "Regresar inicio sesión",a);
      if(resultado==0){
          Loggin lg = new Loggin();
          lg.setVisible(true);
          this.setVisible(false);
      }else{}
    }//GEN-LAST:event_InicioSesionActionPerformed

    private void NuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoEmpleadoActionPerformed
       Empleado em = new Empleado();
       em.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_NuevoEmpleadoActionPerformed

    private void Edit_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Edit_clienteActionPerformed
        EditarCliente EC = new EditarCliente();
        EC.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Edit_clienteActionPerformed

    private void CitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CitasActionPerformed
        Citas ci = new Citas();
        ci.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CitasActionPerformed

    private void NclienteMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NclienteMouseMoved
        Ncliente.setToolTipText("Crear nuevo cliente");
    }//GEN-LAST:event_NclienteMouseMoved

    private void EditclientesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditclientesMouseMoved
        Editclientes.setToolTipText("Editar clientes");
    }//GEN-LAST:event_EditclientesMouseMoved

    private void NempleadoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NempleadoMouseMoved
       Nempleado.setToolTipText("Crear nuevos empleados");
    }//GEN-LAST:event_NempleadoMouseMoved

    private void NuevacitaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NuevacitaMouseMoved
       Nuevacita.setToolTipText("Crear nueva cita");
    }//GEN-LAST:event_NuevacitaMouseMoved

    private void vercitasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vercitasMouseMoved
      vercitas.setToolTipText("Ver citas");
    }//GEN-LAST:event_vercitasMouseMoved

    private void EditcitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditcitasActionPerformed
       EditarCitas ec = new EditarCitas();
       ec.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_EditcitasActionPerformed

    private void imgcitasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imgcitasMouseMoved
       imgcitas.setToolTipText("Editar citas");
    }//GEN-LAST:event_imgcitasMouseMoved

private void iniciarReloj(){
        timerReloj = new Timer(1000, (e) -> {
            DateFormat hora = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa");
            String hora2 = hora.format(new java.util.Date()).toString();
                    Reloj.setText(hora2);
        });
        timerReloj.start();
    }
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Citas;
    private javax.swing.JToggleButton Edit_cliente;
    private javax.swing.JButton Editcitas;
    private javax.swing.JLabel Editclientes;
    private javax.swing.JToggleButton InicioSesion;
    private javax.swing.JLabel Ncliente;
    private javax.swing.JLabel Nempleado;
    private javax.swing.JToggleButton Nueva_cita;
    private javax.swing.JLabel Nuevacita;
    private javax.swing.JButton NuevoEmpleado;
    private javax.swing.JToggleButton Nuevo_cliente;
    public javax.swing.JLabel Reloj;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel imgcitas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel vercitas;
    // End of variables declaration//GEN-END:variables
}