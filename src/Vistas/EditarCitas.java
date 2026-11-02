
package Vistas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import Controladores.Controlador_agenda;
import Modelos.Modelo_agenda;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class EditarCitas extends javax.swing.JFrame {
    Controlador_agenda seleccitas;
    Controlador_agenda eliminar;
    Controlador_agenda actualizar;
     private Timer timerReloj;
 
    public EditarCitas() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        Modelo_agenda model = new Modelo_agenda();
        seleccitas = new Controlador_agenda(model, this);
        seleccitas.seleccionEditarcitas();
        
        Modelo_agenda eliminarc = new Modelo_agenda();
        eliminar = new Controlador_agenda(eliminarc, this);
        
        Modelo_agenda actualiza = new Modelo_agenda();
        actualizar = new Controlador_agenda(actualiza, this);
        
        iniciarReloj();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        SeleccionCita = new javax.swing.JComboBox<>();
        Reloj = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NueFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Nuehoraini = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        Nuehorafin = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Nuevadescrip = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Herramientas = new javax.swing.JTextArea();
        Actualizarcita = new javax.swing.JButton();
        Borrarcita = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MenuPrincipal = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Vercitas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        SeleccionCita.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        SeleccionCita.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione la cita a cambiar" }));

        Reloj.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Reloj.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Arial", 0, 22)); // NOI18N
        jLabel1.setText("Editar citas");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Nueva fecha:");

        NueFecha.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setText("Nueva hora inicio:");

        Nuehoraini.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setText("Nueva hora fin:");

        Nuehorafin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setText("Nueva descripcion:");

        jScrollPane1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        Nuevadescrip.setColumns(20);
        Nuevadescrip.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Nuevadescrip.setRows(5);
        jScrollPane1.setViewportView(Nuevadescrip);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setText("Herramientas:");

        Herramientas.setColumns(20);
        Herramientas.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Herramientas.setRows(5);
        jScrollPane2.setViewportView(Herramientas);

        Actualizarcita.setBackground(new java.awt.Color(255, 255, 153));
        Actualizarcita.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Actualizarcita.setText("Actualizar cita");
        Actualizarcita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarcitaActionPerformed(evt);
            }
        });

        Borrarcita.setBackground(new java.awt.Color(255, 255, 153));
        Borrarcita.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Borrarcita.setForeground(new java.awt.Color(255, 0, 0));
        Borrarcita.setText("Borrar cita");
        Borrarcita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarcitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(SeleccionCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(NueFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Nuehoraini)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addComponent(jLabel5)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(Nuehorafin, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(126, 126, 126))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(41, 41, 41)
                .addComponent(Reloj, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(157, 157, 157)
                .addComponent(Actualizarcita)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Borrarcita)
                .addGap(123, 123, 123))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Reloj))
                .addGap(18, 18, 18)
                .addComponent(SeleccionCita, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NueFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nuehoraini, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nuehorafin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Actualizarcita)
                    .addComponent(Borrarcita))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jMenu1.setText("Menu");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        MenuPrincipal.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        MenuPrincipal.setText("Menu principal");
        MenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuPrincipalActionPerformed(evt);
            }
        });
        jMenu1.add(MenuPrincipal);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Citas");
        jMenu2.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N

        Vercitas.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        Vercitas.setText("Ver citas");
        Vercitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VercitasActionPerformed(evt);
            }
        });
        jMenu2.add(Vercitas);

        jMenuBar1.add(jMenu2);

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

    private void MenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuPrincipalActionPerformed
       Principal pr = new Principal();
       pr.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_MenuPrincipalActionPerformed

    private void BorrarcitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarcitaActionPerformed
    try{
        
        int a = JOptionPane.YES_NO_OPTION;
        int resultado = JOptionPane.showConfirmDialog(this,"¿Desea eliminar esta cita?","Salir",a);
        
        if(resultado ==0){
        eliminar.Eliminarcitas();
        }else{}
        
    }catch(ClassCastException e){
        JOptionPane.showMessageDialog(null, "Selecciona un cita para eliminar",
                "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
    }
    }//GEN-LAST:event_BorrarcitaActionPerformed

    private void ActualizarcitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarcitaActionPerformed
        try{ 
            
            int a = JOptionPane.YES_NO_CANCEL_OPTION;
            int resultado = JOptionPane.showConfirmDialog(this, "¿Desea modificar la cita seleccionada?","Modificar cita",a);
            
            if(resultado == 0){
                actualizar.EditarCitas();
            }else{}
        }catch(ClassCastException e){
            JOptionPane.showMessageDialog(null, "Selecciona un cita para actualizar",
                "ADVERTENCIA",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_ActualizarcitaActionPerformed

    private void VercitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VercitasActionPerformed
       Citas c = new Citas();
       c.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_VercitasActionPerformed

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
            java.util.logging.Logger.getLogger(EditarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarCitas().setVisible(true);
            }
        });
    }
    
    public String getNuevaFecha(){
        return NueFecha.getText();
    }
    
    public String getNuevaHoraini(){
        return Nuehoraini.getText();
    }
    
    public String getNuevaHorafin(){
        return Nuehorafin.getText();
    }
    
    public String getNuevaDescripcion(){
        return Nuevadescrip.getText();
    }
    
    public String getHerramientas(){
        return Herramientas.getText();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizarcita;
    private javax.swing.JButton Borrarcita;
    private javax.swing.JTextArea Herramientas;
    private javax.swing.JMenuItem MenuPrincipal;
    private javax.swing.JTextField NueFecha;
    private javax.swing.JTextField Nuehorafin;
    private javax.swing.JTextField Nuehoraini;
    private javax.swing.JTextArea Nuevadescrip;
    private javax.swing.JLabel Reloj;
    public javax.swing.JComboBox<String> SeleccionCita;
    private javax.swing.JMenuItem Vercitas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}