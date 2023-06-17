/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package cinepolis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.event.*;

public class ModificarPelicula extends javax.swing.JFrame {
    public com.mysql.jdbc.Connection con=null;
    
    public final String url = "jdbc:mysql://localhost/cinepolis";
    public final String usuario = "root";
    public final String password = "";
    
    PreparedStatement ps;
    ResultSet rs;
    
    public ModificarPelicula() {
        initComponents();
        
        setIconImage(new ImageIcon(getClass().getResource("/cinepolis/cinepolisLogo.png")).getImage());
    }

    public Connection getConnection() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                con = (com.mysql.jdbc.Connection) DriverManager.getConnection(url, usuario, password);
            } catch (SQLException ex) {
                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);

        }
        return con;
    }
    
    public void limpiar(){
        peliculaTxt.setText(null);
        lugarCB.setSelectedIndex(0);
        horaCB.setSelectedIndex(0);
        salaCB.setSelectedIndex(0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        titulo = new javax.swing.JLabel();
        peliculaL = new javax.swing.JLabel();
        peliculaTxt = new javax.swing.JTextField();
        lugarCB = new javax.swing.JComboBox<>();
        lugarL = new javax.swing.JLabel();
        horaL = new javax.swing.JLabel();
        horaCB = new javax.swing.JComboBox<>();
        buscarBtn = new javax.swing.JButton();
        salaL = new javax.swing.JLabel();
        salaCB = new javax.swing.JComboBox<>();
        modificarBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MODIFICAR PELICULA");

        contenedor.setBackground(new java.awt.Color(255, 255, 255));

        titulo.setFont(new java.awt.Font("SWRomnd", 1, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("MODIFICAR PELICULA");

        peliculaL.setFont(new java.awt.Font("SWRomnd", 1, 14)); // NOI18N
        peliculaL.setText("Pelicula:");

        peliculaTxt.setFont(new java.awt.Font("SWRomnd", 0, 14)); // NOI18N

        lugarCB.setFont(new java.awt.Font("SWRomnd", 0, 14)); // NOI18N
        lugarCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cinepolis VIP Midtown Jalisco", "Cinepolis Centro Magno", "Cinepolis La Gran Plaza", "Cinepolis Pabellon", "Cinepolis Galeria" }));

        lugarL.setFont(new java.awt.Font("SWRomnd", 1, 14)); // NOI18N
        lugarL.setText("Lugar:");

        horaL.setFont(new java.awt.Font("SWRomnd", 1, 14)); // NOI18N
        horaL.setText("Hora:");

        horaCB.setFont(new java.awt.Font("SWRomnd", 0, 14)); // NOI18N
        horaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00" }));

        buscarBtn.setFont(new java.awt.Font("SWRomnd", 1, 14)); // NOI18N
        buscarBtn.setText("BUSCAR");
        buscarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarBtnActionPerformed(evt);
            }
        });

        salaL.setFont(new java.awt.Font("SWRomnd", 1, 14)); // NOI18N
        salaL.setText("Sala:");

        salaCB.setFont(new java.awt.Font("SWRomnd", 0, 14)); // NOI18N
        salaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SALA 1", "SALA 2", "SALA 3", "SALA 4", "SALA 5" }));

        modificarBtn.setFont(new java.awt.Font("SWRomnd", 1, 14)); // NOI18N
        modificarBtn.setText("MODIFICAR");
        modificarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buscarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(salaL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lugarL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(peliculaL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(horaL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(horaCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(peliculaTxt)
                            .addComponent(lugarCB, 0, 308, Short.MAX_VALUE)
                            .addComponent(salaCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(modificarBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(peliculaL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(peliculaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lugarCB)
                    .addComponent(lugarL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(horaCB)
                    .addComponent(horaL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(salaCB)
                    .addComponent(salaL, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(buscarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modificarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 9, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buscarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarBtnActionPerformed
        // TODO add your handling code here:
        Connection con = null;

        try {
            con = getConnection();
            ps = con.prepareStatement("SELECT * FROM pelicula WHERE pelicula = ?");
            ps.setString(1, peliculaTxt.getText());

            rs = ps.executeQuery();

            if (rs.next()) {
                lugarCB.setSelectedItem(rs.getString("lugar"));
                horaCB.setSelectedItem(rs.getString("hora"));
                salaCB.setSelectedItem(rs.getString("sala"));
            } else {
                JOptionPane.showMessageDialog(this, "NINGUN REGISTRO COINCIDE CON LOS DATOS");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_buscarBtnActionPerformed

    private void modificarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarBtnActionPerformed
        // TODO add your handling code here:
        if (peliculaTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "BUSQUE UNA PELICULA");
        } else {
            Connection con = null;

            try {
                con = getConnection();
                ps = con.prepareStatement("UPDATE pelicula SET pelicula=?, lugar=?, hora=?, sala=? WHERE pelicula=?");
                ps.setString(1, peliculaTxt.getText());
                ps.setString(2, lugarCB.getSelectedItem().toString());
                ps.setString(3, horaCB.getSelectedItem().toString());
                ps.setString(4, salaCB.getSelectedItem().toString());
                ps.setString(5, peliculaTxt.getText());

                int res = ps.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(this, "PELICULA MODIFICADA");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(this, "ERROR AL MODIFICAR PELICULA");
                }

                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "ERROR AL MODIFICAR PELICULA");
                System.out.println(e);
            }

        }
    }//GEN-LAST:event_modificarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarPelicula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarPelicula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscarBtn;
    private javax.swing.JPanel contenedor;
    private javax.swing.JComboBox<String> horaCB;
    private javax.swing.JLabel horaL;
    private javax.swing.JComboBox<String> lugarCB;
    private javax.swing.JLabel lugarL;
    private javax.swing.JButton modificarBtn;
    private javax.swing.JLabel peliculaL;
    private javax.swing.JTextField peliculaTxt;
    private javax.swing.JComboBox<String> salaCB;
    private javax.swing.JLabel salaL;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
