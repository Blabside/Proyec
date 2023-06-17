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
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

public class RegistrarReservacion extends javax.swing.JFrame {
    
    public com.mysql.jdbc.Connection con=null;
    
    public final String url = "jdbc:mysql://localhost/cinepolis";
    public final String usuario = "root";
    public final String password = "";
    
    PreparedStatement ps;
    ResultSet rs;
    
    public RegistrarReservacion() {
        initComponents();

        peliculas();
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
    
    public void limpiar() {
        peliculaTxt.setText(null);
        asientosSpinner.setValue(1);
        diaCB.setSelectedIndex(0);
        mesCB.setSelectedIndex(0);
        anioTxt.setText(null);
        lugarCB.setSelectedIndex(0);
        horaCB.setSelectedIndex(0);
        salaCB.setSelectedIndex(0);
    }
    
    
    public void peliculas() {
        int columnas;

        try {

            DefaultTableModel modelo = new DefaultTableModel();
            jTable1.setModel(modelo);

            PreparedStatement ps = null;
            ResultSet rs = null;
            Conexion conn = new Conexion();
            Connection con = conn.getConnection();

            String sql = "SELECT pelicula, lugar, hora, sala FROM pelicula";
            ps = (PreparedStatement) con.prepareStatement(sql);
            rs = ps.executeQuery();

            ResultSetMetaData rsmd = rs.getMetaData();
            int cantidadCol = rsmd.getColumnCount();
            modelo.addColumn("Pelicula");
            modelo.addColumn("Lugar");
            modelo.addColumn("Hora");
            modelo.addColumn("Sala");

            while (rs.next()) {

                Object[] filas = new Object[cantidadCol];

                for (int i = 0; i < cantidadCol; i++) {
                    filas[i] = rs.getObject(i + 1);
                }
                modelo.addRow(filas);

            }

        } catch (SQLException ex) {
            System.err.println(ex.toString());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        titulo = new javax.swing.JLabel();
        peliculaL = new javax.swing.JLabel();
        asientosL = new javax.swing.JLabel();
        peliculaTxt = new javax.swing.JTextField();
        asientosSpinner = new javax.swing.JSpinner();
        fechaL = new javax.swing.JLabel();
        diaCB = new javax.swing.JComboBox<>();
        mesCB = new javax.swing.JComboBox<>();
        anioTxt = new javax.swing.JTextField();
        lugarL = new javax.swing.JLabel();
        lugarCB = new javax.swing.JComboBox<>();
        horaL = new javax.swing.JLabel();
        horaCB = new javax.swing.JComboBox<>();
        reservarBtn = new javax.swing.JButton();
        titulo1 = new javax.swing.JLabel();
        salaL = new javax.swing.JLabel();
        salaCB = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGISTRAR RESERVACION");
        setLocation(new java.awt.Point(300, 50));

        contenedor.setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pelicula", "Lugar", "Hora", "Sala"
            }
        ));
        jTable1.setEnabled(false);
        jScrollPane1.setViewportView(jTable1);

        titulo.setFont(new java.awt.Font("SWRomnd", 1, 24)); // NOI18N
        titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo.setText("RESERVAR");

        peliculaL.setFont(new java.awt.Font("SWRomnd", 1, 14)); // NOI18N
        peliculaL.setText("Pelicula:");

        asientosL.setFont(new java.awt.Font("SWRomnd", 1, 14)); // NOI18N
        asientosL.setText("No. Asientos:");

        peliculaTxt.setFont(new java.awt.Font("SWRomnd", 0, 14)); // NOI18N

        asientosSpinner.setFont(new java.awt.Font("SWRomnd", 0, 14)); // NOI18N
        asientosSpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        fechaL.setFont(new java.awt.Font("SWRomnd", 1, 14)); // NOI18N
        fechaL.setText("Fecha:");

        diaCB.setFont(new java.awt.Font("SWRomnd", 0, 14)); // NOI18N
        diaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        mesCB.setFont(new java.awt.Font("SWRomnd", 0, 14)); // NOI18N
        mesCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        anioTxt.setFont(new java.awt.Font("SWRomnd", 0, 14)); // NOI18N

        lugarL.setFont(new java.awt.Font("SWRomnd", 1, 14)); // NOI18N
        lugarL.setText("Lugar:");

        lugarCB.setFont(new java.awt.Font("SWRomnd", 0, 14)); // NOI18N
        lugarCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cinepolis VIP Midtown Jalisco", "Cinepolis Centro Magno", "Cinepolis La Gran Plaza", "Cinepolis Pabellon", "Cinepolis Galeria" }));

        horaL.setFont(new java.awt.Font("SWRomnd", 1, 14)); // NOI18N
        horaL.setText("Hora:");

        horaCB.setFont(new java.awt.Font("SWRomnd", 0, 14)); // NOI18N
        horaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00", "23:00" }));

        reservarBtn.setFont(new java.awt.Font("SWRomnd", 1, 14)); // NOI18N
        reservarBtn.setText("RESERVAR");
        reservarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reservarBtnActionPerformed(evt);
            }
        });

        titulo1.setFont(new java.awt.Font("SWRomnd", 1, 24)); // NOI18N
        titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulo1.setText("PELICULAS DISPONIBLES");

        salaL.setFont(new java.awt.Font("SWRomnd", 1, 14)); // NOI18N
        salaL.setText("Sala:");

        salaCB.setFont(new java.awt.Font("SWRomnd", 0, 14)); // NOI18N
        salaCB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SALA 1", "SALA 2", "SALA 3", "SALA 4", "SALA 5" }));

        javax.swing.GroupLayout contenedorLayout = new javax.swing.GroupLayout(contenedor);
        contenedor.setLayout(contenedorLayout);
        contenedorLayout.setHorizontalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(horaL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lugarL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fechaL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(peliculaL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(asientosL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(salaL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contenedorLayout.createSequentialGroup()
                                .addComponent(reservarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(salaCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(asientosSpinner)
                            .addComponent(peliculaTxt)
                            .addComponent(lugarCB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(horaCB, 0, 288, Short.MAX_VALUE)
                            .addGroup(contenedorLayout.createSequentialGroup()
                                .addComponent(diaCB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mesCB, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(anioTxt)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        contenedorLayout.setVerticalGroup(
            contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contenedorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contenedorLayout.createSequentialGroup()
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(peliculaL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(peliculaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(asientosL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(asientosSpinner, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(mesCB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(diaCB, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fechaL, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(anioTxt))
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
                        .addComponent(reservarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reservarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reservarBtnActionPerformed
        // TODO add your handling code here:
        if (peliculaTxt.getText().isEmpty() || anioTxt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Llena todos los campos");
        } else {
            Connection con = null;
            
            String dia=null, mes=null, anio=null, fecha=null;

            try {
                con = getConnection();
                ps = con.prepareStatement("INSERT INTO reservacion (pelicula, asientos, fecha, lugar, hora, sala) VALUES(?,?,?,?,?,?) ");
                ps.setString(1, peliculaTxt.getText());
                ps.setString(2, String.valueOf(asientosSpinner.getValue()));
                
                dia = diaCB.getSelectedItem().toString();
                mes = mesCB.getSelectedItem().toString();
                anio = anioTxt.getText();
                fecha=dia+"/"+mes+"/"+anio;
                ps.setString(3, fecha);
                ps.setString(4, lugarCB.getSelectedItem().toString());
                ps.setString(5, horaCB.getSelectedItem().toString());
                ps.setString(6, salaCB.getSelectedItem().toString());
                

                int res = ps.executeUpdate();
                if (res > 0) {
                    JOptionPane.showMessageDialog(this, "Reservacion guardada");
                    limpiar();
                } else {
                    JOptionPane.showMessageDialog(this, "Error al reservar");
                }

                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Error al reservar");
                System.out.println(e);
            }

        }
    }//GEN-LAST:event_reservarBtnActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarReservacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField anioTxt;
    private javax.swing.JLabel asientosL;
    private javax.swing.JSpinner asientosSpinner;
    private javax.swing.JPanel contenedor;
    private javax.swing.JComboBox<String> diaCB;
    private javax.swing.JLabel fechaL;
    private javax.swing.JComboBox<String> horaCB;
    private javax.swing.JLabel horaL;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> lugarCB;
    private javax.swing.JLabel lugarL;
    private javax.swing.JComboBox<String> mesCB;
    private javax.swing.JLabel peliculaL;
    private javax.swing.JTextField peliculaTxt;
    private javax.swing.JButton reservarBtn;
    private javax.swing.JComboBox<String> salaCB;
    private javax.swing.JLabel salaL;
    private javax.swing.JLabel titulo;
    private javax.swing.JLabel titulo1;
    // End of variables declaration//GEN-END:variables
}