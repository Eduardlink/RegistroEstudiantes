/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.awt.Color;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controladores.inforDocController;

/**
 *
 * @author Tefy
 */
public class InformeDocentes extends javax.swing.JPanel {

    private ImageIcon imagen;
    private Icon icono;
    private DefaultTableModel modeloTabla;
    boolean validacionCedula = false;
    /**
     * Creates new form Bienvenida
     */
    public InformeDocentes() {
        initComponents();
        //this.pintarImagen(this.imgUsuario, "src/imagenesFrames/usuario.png");
        cargarTitulosTabla();
        
        //
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jtxtBuscar = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtblDocentes = new javax.swing.JTable();
        jbtnBuscar = new javax.swing.JButton();
        jlbCedula = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jlbInasistencias = new javax.swing.JLabel();
        jlbAsistencias = new javax.swing.JLabel();
        jlbNombre = new javax.swing.JLabel();
        imgUsuario = new javax.swing.JLabel();
        jlbUsuario = new javax.swing.JLabel();
        jbtnReportes = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1250, 590));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1250, 590));

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel17.setText("_____________________________");

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setText("Busqueda por Docente");

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel16.setText("_____________________________");

        jtxtBuscar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jtxtBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jtxtBuscarFocusLost(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel15.setText("_____________________________");

        jtblDocentes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jtblDocentes.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jtblDocentes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jtblDocentes.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jtblDocentes);

        jbtnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrames/lupa.png"))); // NOI18N
        jbtnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnBuscarActionPerformed(evt);
            }
        });

        jlbCedula.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jLabel18.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel18.setText("_____________________________");

        jPanel2.setBackground(new java.awt.Color(236, 71, 71));

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel13.setText("      Nombre");

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel11.setText("    Asistencias");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel14.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel14.setText("           C.I.");

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel10.setText("  Inasistencias");
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jlbInasistencias.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jlbAsistencias.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        jlbNombre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N

        imgUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrames/usuario .png"))); // NOI18N

        jlbUsuario.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N

        jbtnReportes.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jbtnReportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenesFrames/generarReporte.png"))); // NOI18N
        jbtnReportes.setText("Generar Reporte");
        jbtnReportes.setBorder(null);
        jbtnReportes.setBorderPainted(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jtxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jbtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(imgUsuario)
                        .addGap(18, 18, 18)
                        .addComponent(jlbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jlbAsistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jlbInasistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jlbCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jlbNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jtxtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbtnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jlbUsuario)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jlbAsistencias))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel16))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jLabel17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(jlbInasistencias))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jlbCedula))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jlbNombre))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jbtnReportes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jtxtBuscarFocusLost

        if (jtxtBuscar.getText().isEmpty()) {
            jtxtBuscar.setBorder(BorderFactory.createLineBorder(Color.red));
            JOptionPane.showMessageDialog(null, "Campo vacio");
            validacionCedula = false;
        } else {
            jtxtBuscar.setBorder(BorderFactory.createLineBorder(Color.black));
            if (validarCedula(jtxtBuscar.getText()) == true) {
                validacionCedula = true;

            } else {
                validacionCedula = false;
            }

        }
    }//GEN-LAST:event_jtxtBuscarFocusLost

    private void jbtnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnBuscarActionPerformed
        jtblDocentes.setModel(new inforDocController().cargarTabla(jtxtBuscar.getText()));
        /*if (validacionCedula == true) {
            buscarDocentes2(jtxtBuscar.getText());
            
        }*/
    }//GEN-LAST:event_jbtnBuscarActionPerformed

    private boolean validarCedula(String cedula) {
        boolean cedulaCorrecta = false;
        boolean esNumero = false;

        if (cedula.length() != 4) {
            JOptionPane.showMessageDialog(null, "La logitud de caracteres debe ser igual a 10");
            return false;
        } else {
            for (int i = 0; i < cedula.length(); i++) {
                if (!Character.isDigit(cedula.charAt(i))) {
                    esNumero = false;
                    JOptionPane.showMessageDialog(null, "Solo se admiten números");
                    return false;
                } else {
                    esNumero = true;
                    cedulaCorrecta = true;
                }

            }

        }
        return cedulaCorrecta;
    }

    private void pintarImagen(JLabel lbl, String ruta) {
        this.imagen = new ImageIcon(ruta);
        this.icono = new ImageIcon(this.imagen.getImage().getScaledInstance(
                lbl.getWidth(),
                lbl.getHeight(),
                Image.SCALE_DEFAULT));
        lbl.setIcon(this.icono);
        this.repaint();
    }

    private void cargarTitulosTabla() {
        String[] titulos = {"Fecha", "Entrada Matutina", "Salida Matutina", "Entrada Vespertina", "Salida Vespertina", "Horas"};
        this.modeloTabla = new DefaultTableModel(null, titulos);
        jtblDocentes.setModel(modeloTabla);
        for (int i = 0; i < titulos.length; i++) {
            jtblDocentes.getColumnModel().getColumn(i).setResizable(false);
        }
    }
    
    
        private void buscarDocentes2(String cedula) {
        inforDocController informe = new inforDocController();
        String[] datos = informe.mostrarDatos(cedula);
        if(datos[0].isEmpty()){
            JOptionPane.showMessageDialog(null, "Usuario no encontrado");
            
        }else{
        jlbUsuario.setText(datos[0]);
        jlbCedula.setText(datos[3]);
        jlbNombre.setText(datos[1] + " " + datos[2]);
        }

    }

    /*private void buscarDocentes(String cedula) {
        if (cedula.equals("1802144090")) {
            jlbUsuario.setText("LuisT90");
            jlbCedula.setText("1802144090");
            jlbNombre.setText("Luis Torres");
            jlbAsistencias.setText(String.valueOf(20));
            jlbInasistencias.setText(String.valueOf(1));
            cargarTabla("01/02/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
            cargarTabla("02/02/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
            cargarTabla("03/02/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
            cargarTabla("04/02/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
            cargarTabla("05/02/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
            cargarTabla("06/02/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
            cargarTabla("07/02/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
            cargarTabla("01/02/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
            cargarTabla("02/02/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
            cargarTabla("03/02/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
            cargarTabla("04/02/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
            cargarTabla("05/02/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
            cargarTabla("06/02/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
            cargarTabla("07/02/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
            cargarTabla("01/02/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
            cargarTabla("02/02/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
            cargarTabla("03/02/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
            cargarTabla("04/02/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
            cargarTabla("05/02/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
            cargarTabla("06/02/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
            cargarTabla("07/02/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");

        } else {
            if (cedula.equals("1802144091")) {
                jlbUsuario.setText("AnaM91");
                jlbCedula.setText("1802144091");
                jlbNombre.setText("Ana Martinez");
                jlbAsistencias.setText(String.valueOf(21));
                jlbInasistencias.setText(String.valueOf(0));
                cargarTabla("01/06/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
                cargarTabla("02/06/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
                cargarTabla("03/06/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
                cargarTabla("04/06/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
                cargarTabla("05/06/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
                cargarTabla("06/06/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
                cargarTabla("07/06/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
                cargarTabla("01/06/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
                cargarTabla("02/06/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
                cargarTabla("03/06/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
                cargarTabla("04/06/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
                cargarTabla("05/06/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
                cargarTabla("06/06/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
                cargarTabla("07/06/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
                cargarTabla("01/06/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
                cargarTabla("02/06/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
                cargarTabla("03/06/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
                cargarTabla("04/06/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
                cargarTabla("05/06/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
                cargarTabla("06/06/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
                cargarTabla("07/06/2022", "07:01:00", "13:00:01", "14:00:00", "16:00:00", "8");
            } else {
                JOptionPane.showMessageDialog(null, "Numero de cedula no encontrado");
            }
        }
    }*/

    private void cargarTabla(String fecha, String horaEntradaM, String horaSalidaM, String horaEntradaV, String horaSalidaV, String horas) {
        String[] registro = new String[modeloTabla.getColumnCount()];
        registro[0] = fecha;
        registro[1] = horaEntradaM;
        registro[2] = horaSalidaM;
        registro[3] = horaEntradaV;
        registro[4] = horaSalidaV;
        registro[5] = horas;
        modeloTabla.addRow(registro);
        jtblDocentes.setModel(modeloTabla);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel imgUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbtnBuscar;
    private javax.swing.JButton jbtnReportes;
    private javax.swing.JLabel jlbAsistencias;
    private javax.swing.JLabel jlbCedula;
    private javax.swing.JLabel jlbInasistencias;
    private javax.swing.JLabel jlbNombre;
    private javax.swing.JLabel jlbUsuario;
    private javax.swing.JTable jtblDocentes;
    private javax.swing.JTextField jtxtBuscar;
    // End of variables declaration//GEN-END:variables
}
