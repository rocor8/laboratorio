/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

import javax.swing.JOptionPane;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Ruth
 */
public class BajaPaciente extends javax.swing.JFrame {

    /**
     * Creates new form BajaPaciente
     */
    private Clinica clinica;
    public BajaPaciente() {
        initComponents();
    }
    public BajaPaciente(Clinica c) {
        clinica = c;
        initComponents();
        
        
    }
      @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
             getImage(ClassLoader.getSystemResource("Imagenes/icono.png"));
        return retValue;
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField_DniBaja = new javax.swing.JTextField();
        jButton_DarBaja = new javax.swing.JButton();
        jButton_Volver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Baja de Paciente");
        setIconImage(getIconImage());
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Ingrese el DNI del Paciente:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 56, -1, -1));

        jTextField_DniBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_DniBajaActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField_DniBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(202, 53, 124, -1));

        jButton_DarBaja.setText("Dar de baja");
        jButton_DarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DarBajaActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_DarBaja, new org.netbeans.lib.awtextra.AbsoluteConstraints(212, 84, -1, -1));

        jButton_Volver.setText("Volver");
        jButton_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VolverActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Volver, new org.netbeans.lib.awtextra.AbsoluteConstraints(404, 121, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondo2.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_DniBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_DniBajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_DniBajaActionPerformed

    private void jButton_DarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DarBajaActionPerformed
        
        try{
            String dni = jTextField_DniBaja.getText();
            clinica.verificarDni(dni);
            clinica.buscarPaciente(dni);
            for(Paciente pac: clinica.getPacientes()){  
                if(pac.getDni().equals(dni)){
                    if(pac.getHabitacion().getCama(dni)== null){
                        JOptionPane.showMessageDialog(null, "Paciente ya esta dado de baja", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    }
                    else{
                        pac.getHabitacion().bajaPacienteCama(dni); 
                        JOptionPane.showMessageDialog(null, "Paciente desocupo la cama", "Operacion Exitosa", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;
                }
            }
            
            MenuPrincipal menu = new MenuPrincipal(clinica);
            menu.setLocationRelativeTo(null);
            menu.setVisible(true);
            dispose();
        }catch(VerificarDniException vdni){
           JOptionPane.showMessageDialog(null, "Dni Invalido", "Error!", JOptionPane.OK_OPTION);
        }catch(PacienteNoEncontradoException pnee){
            JOptionPane.showMessageDialog(null, "Paciente no registrado", "Aviso!", JOptionPane.WARNING_MESSAGE);
        //}catch(BajaPacienteException bpe){
            //JOptionPane.showMessageDialog(null, "Paciente ya esta dado de baja", "Aviso!", JOptionPane.WARNING_MESSAGE);            
        }finally{
            jTextField_DniBaja.setText(null);
        }
        
        
        
    }//GEN-LAST:event_jButton_DarBajaActionPerformed

    private void jButton_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VolverActionPerformed
        // TODO add your handling code here:
        MenuPrincipal menu = new MenuPrincipal(clinica);
           menu.setLocationRelativeTo(null);
           menu.setVisible(true);
           dispose();
    }//GEN-LAST:event_jButton_VolverActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BajaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BajaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BajaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BajaPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BajaPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_DarBaja;
    private javax.swing.JButton jButton_Volver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField_DniBaja;
    // End of variables declaration//GEN-END:variables
}