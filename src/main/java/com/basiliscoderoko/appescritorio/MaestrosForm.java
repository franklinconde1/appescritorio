package com.basiliscoderoko.appescritorio;

import com.mysql.cj.util.StringUtils;
import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class MaestrosForm extends javax.swing.JInternalFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    DefaultListModel modelPackHas = new DefaultListModel();
    Map<Integer, Integer> idsAndQuantities = new HashMap<>();
    Map<Integer, String> articleMapper = new HashMap<>();

    public MaestrosForm() {
        initComponents();
        this.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width - getSize().width) / 2, (Toolkit.getDefaultToolkit().getScreenSize().height - getSize().height) / 4);
        enableDisable(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        TxtNomUsuario = new javax.swing.JTextField();
        TxtClave = new javax.swing.JTextField();
        TxtRepClave = new javax.swing.JTextField();
        BtnUserCancelar = new javax.swing.JButton();
        BtnUserGuardar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        GrillaUsuarios = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        BtnUserEditar = new javax.swing.JButton();
        BtnUserDesactivar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        TxtNomRRSS = new javax.swing.JTextField();
        BtnRRSSGuardar = new javax.swing.JButton();
        BtnRRSSCancelar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        GrillaRRSS = new javax.swing.JTable();
        BtnRRSSEditar = new javax.swing.JButton();
        BtnRRSSDesactivar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNomComuna = new javax.swing.JTextField();
        btnGuardarComuna = new javax.swing.JButton();
        btnCancelarComuna = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        GrillaComunas = new javax.swing.JTable();
        BtnEditarComuna = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        BtnDesactivarComuna = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtBuscarComuna = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        TxtBcoNombre = new javax.swing.JTextField();
        BtnBcoGuardar = new javax.swing.JButton();
        BtnBcoCancelar = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        BtnBcoeditar = new javax.swing.JButton();
        BtnBcoDesactivar = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        btnCrearPack = new javax.swing.JButton();
        BtnCancelarPack = new javax.swing.JButton();
        jScrollPane8 = new javax.swing.JScrollPane();
        jListPckHas = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        jListPckArt = new javax.swing.JList<>();
        btnAgregarArtPack = new javax.swing.JButton();
        btnQuitarArtPack = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtCantArtPack = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        txtBuscarPack = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane10 = new javax.swing.JScrollPane();
        GrillaPacks = new javax.swing.JTable();
        btnEditarPack = new javax.swing.JButton();
        btnDesactPack = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txtNombrePack = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtPrecioPack = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setTitle("Maestros");

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 153, 0), 2));
        jTabbedPane2.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jTabbedPane2StateChanged(evt);
            }
        });

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuarios"));

        jLabel3.setText("Nombre Usuario :");

        jLabel4.setText("Ingrese Clave :");

        jLabel5.setText("Repita Clave :");

        BtnUserCancelar.setText("Cancelar");
        BtnUserCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BtnUserGuardar.setText("Guardar");
        BtnUserGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(TxtNomUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(33, 33, 33)
                        .addComponent(TxtRepClave, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(BtnUserGuardar)
                        .addGap(62, 62, 62)
                        .addComponent(BtnUserCancelar))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(TxtNomUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(TxtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(TxtRepClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnUserCancelar)
                        .addComponent(BtnUserGuardar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        GrillaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Nombre Usuario", "Clave", "Accion"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(GrillaUsuarios);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("USUARIOS REGISTRADOS");

        BtnUserEditar.setText("Editar");
        BtnUserEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnUserEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnUserEditarActionPerformed(evt);
            }
        });

        BtnUserDesactivar.setText("Desactivar");
        BtnUserDesactivar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(jLabel6)))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnUserEditar)
                .addGap(41, 41, 41)
                .addComponent(BtnUserDesactivar)
                .addGap(125, 125, 125))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnUserEditar)
                    .addComponent(BtnUserDesactivar))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Usuarios", jPanel3);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Redes Sociales"));

        jLabel8.setText("Nombre RRSS :");

        TxtNomRRSS.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TxtNomRRSSKeyTyped(evt);
            }
        });

        BtnRRSSGuardar.setText("Guardar");
        BtnRRSSGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnRRSSGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRRSSGuardarActionPerformed(evt);
            }
        });

        BtnRRSSCancelar.setText("Cancelar");
        BtnRRSSCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnRRSSCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRRSSCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(TxtNomRRSS, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(BtnRRSSGuardar)
                .addGap(40, 40, 40)
                .addComponent(BtnRRSSCancelar)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BtnRRSSGuardar)
                        .addComponent(BtnRRSSCancelar))
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(TxtNomRRSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("REDES SOCIALES");

        GrillaRRSS.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código RRSS", "Nombre RRSS", "Estatus"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        GrillaRRSS.getTableHeader().setReorderingAllowed(false);
        GrillaRRSS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GrillaRRSSMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(GrillaRRSS);
        if (GrillaRRSS.getColumnModel().getColumnCount() > 0) {
            GrillaRRSS.getColumnModel().getColumn(0).setResizable(false);
            GrillaRRSS.getColumnModel().getColumn(1).setResizable(false);
        }

        BtnRRSSEditar.setText("Editar");
        BtnRRSSEditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BtnRRSSDesactivar.setText("Desactivar");
        BtnRRSSDesactivar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jTextField1.setToolTipText("Buscar Comunas x Nombre");

        jLabel9.setText("Buscar:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(0, 20, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(BtnRRSSEditar)
                        .addGap(42, 42, 42)
                        .addComponent(BtnRRSSDesactivar))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 615, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(54, 54, 54)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnRRSSEditar)
                    .addComponent(BtnRRSSDesactivar))
                .addContainerGap(105, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("RRSS", jPanel6);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Comunas"));

        jLabel1.setText("Nombre Comunas :");

        txtNomComuna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomComunaKeyTyped(evt);
            }
        });

        btnGuardarComuna.setText("Guardar");
        btnGuardarComuna.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardarComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarComunaActionPerformed(evt);
            }
        });

        btnCancelarComuna.setText("Cancelar");
        btnCancelarComuna.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCancelarComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarComunaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNomComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardarComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btnCancelarComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnGuardarComuna)
                        .addComponent(btnCancelarComuna))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(txtNomComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        GrillaComunas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo Comuna", "Nombre Comuna", "Estado Comuna"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        GrillaComunas.getTableHeader().setReorderingAllowed(false);
        GrillaComunas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GrillaComunasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(GrillaComunas);
        GrillaComunas.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (GrillaComunas.getColumnModel().getColumnCount() > 0) {
            GrillaComunas.getColumnModel().getColumn(0).setResizable(false);
            GrillaComunas.getColumnModel().getColumn(1).setResizable(false);
        }

        BtnEditarComuna.setText("Editar");
        BtnEditarComuna.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnEditarComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditarComunaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("COMUNAS REGISTRADAS");

        BtnDesactivarComuna.setText("Desactivar");
        BtnDesactivarComuna.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnDesactivarComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDesactivarComunaActionPerformed(evt);
            }
        });

        jLabel12.setText("Buscar:");

        txtBuscarComuna.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarComunaActionPerformed(evt);
            }
        });
        txtBuscarComuna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarComunaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BtnEditarComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(BtnDesactivarComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(87, 87, 87)
                            .addComponent(jLabel12)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtBuscarComuna, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(txtBuscarComuna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnDesactivarComuna)
                    .addComponent(BtnEditarComuna))
                .addContainerGap(121, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Comunas", jPanel1);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Bancos"));

        jLabel11.setText("Nombre Bancos :");

        BtnBcoGuardar.setText("Guardar");
        BtnBcoGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BtnBcoCancelar.setText("Cancelar");
        BtnBcoCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(TxtBcoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(BtnBcoGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnBcoCancelar)
                .addGap(79, 79, 79))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(TxtBcoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBcoGuardar)
                    .addComponent(BtnBcoCancelar))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("BANCOS REGISTRADOS");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Código Banco", "Nombre Banco", "Acción"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable2);

        BtnBcoeditar.setText("Editar");
        BtnBcoeditar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        BtnBcoDesactivar.setText("Desactivar");
        BtnBcoDesactivar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnBcoeditar)
                        .addGap(18, 18, 18)
                        .addComponent(BtnBcoDesactivar))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(168, 168, 168)
                            .addComponent(jLabel13))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 616, Short.MAX_VALUE))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnBcoeditar)
                    .addComponent(BtnBcoDesactivar))
                .addContainerGap(134, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Bancos", jPanel2);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder("Pack's"));

        btnCrearPack.setText("Crear Pack");
        btnCrearPack.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCrearPack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearPackActionPerformed(evt);
            }
        });

        BtnCancelarPack.setText("Cancelar");
        BtnCancelarPack.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BtnCancelarPack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelarPackActionPerformed(evt);
            }
        });

        jListPckHas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListPckHasMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(jListPckHas);

        jListPckArt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListPckArtMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(jListPckArt);

        btnAgregarArtPack.setText("Agregar");
        btnAgregarArtPack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarArtPackActionPerformed(evt);
            }
        });

        btnQuitarArtPack.setText("Quitar");
        btnQuitarArtPack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarArtPackActionPerformed(evt);
            }
        });

        jLabel22.setText("Cantidad:");

        txtCantArtPack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantArtPackKeyTyped(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel23.setText("Tabla Pack´s");

        txtBuscarPack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBuscarPackKeyTyped(evt);
            }
        });

        jLabel24.setText("Buscar:");

        GrillaPacks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Precio", "Stock", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        GrillaPacks.getTableHeader().setReorderingAllowed(false);
        GrillaPacks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GrillaPacks(evt);
            }
        });
        jScrollPane10.setViewportView(GrillaPacks);
        GrillaPacks.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (GrillaPacks.getColumnModel().getColumnCount() > 0) {
            GrillaPacks.getColumnModel().getColumn(0).setResizable(false);
            GrillaPacks.getColumnModel().getColumn(1).setResizable(false);
            GrillaPacks.getColumnModel().getColumn(2).setResizable(false);
            GrillaPacks.getColumnModel().getColumn(3).setResizable(false);
            GrillaPacks.getColumnModel().getColumn(4).setResizable(false);
        }

        btnEditarPack.setText("Editar");
        btnEditarPack.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnEditarPack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPackActionPerformed(evt);
            }
        });

        btnDesactPack.setText("Desactivar");
        btnDesactPack.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDesactPack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesactPackActionPerformed(evt);
            }
        });

        jLabel15.setText("Nombre Pack :");

        txtNombrePack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrePackKeyTyped(evt);
            }
        });

        jLabel16.setText("Precio Pack :");

        txtPrecioPack.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioPackKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombrePack, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPrecioPack, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnQuitarArtPack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAgregarArtPack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(8, 8, 8))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCantArtPack, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)))
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCrearPack, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(btnEditarPack, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addComponent(btnDesactPack, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(88, 88, 88)
                                .addComponent(jLabel24)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBuscarPack, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BtnCancelarPack, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtNombrePack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(txtPrecioPack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(btnAgregarArtPack)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel22)
                                    .addComponent(txtCantArtPack))
                                .addGap(11, 11, 11)
                                .addComponent(btnQuitarArtPack))
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnCancelarPack)
                            .addComponent(btnCrearPack)))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(txtBuscarPack, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDesactPack)
                    .addComponent(btnEditarPack))
                .addGap(19, 19, 19))
        );

        jTabbedPane2.addTab("Pack", jPanel11);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 8, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane2, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTabbedPane2StateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jTabbedPane2StateChanged
        int selected = jTabbedPane2.getSelectedIndex();
        switch (selected) {
            case 2 -> {
                BtnEditarComuna.setEnabled(false);
                BtnDesactivarComuna.setVisible(false);
                refreshTableComuna();
            }
            case 4 -> {
                getArticulos();
                getPack();
                btnDesactPack.setVisible(false);
                break;
            }
        }
    }//GEN-LAST:event_jTabbedPane2StateChanged

    private void txtPrecioPackKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioPackKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
        final String namePack = txtNombrePack.getText();
        if (namePack.equals(EMPTY)) {
            enableDisable(true);
        }
    }//GEN-LAST:event_txtPrecioPackKeyTyped

    private void txtNombrePackKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrePackKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        final String namePack = txtNombrePack.getText();
        if (namePack.equals(EMPTY)) {
            enableDisable(true);
        }
    }//GEN-LAST:event_txtNombrePackKeyTyped

    private void btnDesactPackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactPackActionPerformed
        try {
            con = ConnectionMysql.getConnection();
            int id = GrillaPacks.getSelectedRow();
            int idpack = Integer.parseInt(GrillaPacks.getValueAt(id, 0).toString());
            boolean status = (boolean) GrillaPacks.getValueAt(id, 4);
            ps = con.prepareStatement("UPDATE dreamgifts.pack SET PCK_ESTADO = ? WHERE PCK_ID_PACK = ?");
            ps.setInt(1, calculateStatus(status));
            ps.setInt(2, idpack);
            int execute = ps.executeUpdate();
            if (execute == 1) {
                con.close();
                String message = calculateStatus(status) == 1 ? "activó" : "desactivó";
                JOptionPane.showMessageDialog(null, "El pack se " + message + " correctamente");
                btnDesactPack.setVisible(false);
                btnEditarPack.setEnabled(false);
                txtNombrePack.setText(EMPTY);
                refreshTablePack();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaestrosForm.class
                    .getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnDesactPackActionPerformed

    private void btnEditarPackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPackActionPerformed
        try {
            String namePack = getFieldValue(txtNombrePack);
            Double precPack = Double.parseDouble(txtPrecioPack.getText());
            con = ConnectionMysql.getConnection();
            int id = GrillaPacks.getSelectedRow();
            int idPack = Integer.parseInt(GrillaPacks.getValueAt(id, 0).toString());
            int stockId = Integer.parseInt(GrillaPacks.getValueAt(id, 3).toString());
            ps = con.prepareStatement("UPDATE dreamgifts.pack SET PCK_NOMBRE = ?, PCK_COSTO = ?, PCK_STOCK = ? WHERE PCK_ID_PACK = ?");
            ps.setString(1, namePack);
            ps.setDouble(2, precPack);
            ps.setInt(3, stockId);
            ps.setInt(4, idPack);
            int execute = ps.executeUpdate();
            if (execute == 1) {
                con.close();
                insertHasPack(idPack);
                JOptionPane.showMessageDialog(null, "El Pack se actualizó correctamente");
                txtNombrePack.setText(EMPTY);
                txtPrecioPack.setText(EMPTY);
                btnEditarPack.setEnabled(false);
                btnDesactPack.setVisible(false);
                refreshTablePack();
                cleanArticleForm();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaestrosForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarPackActionPerformed

    private void GrillaPacks(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GrillaPacks
        if (evt.getClickCount() == 1 && GrillaPacks.getSelectedRow() != -1) {
            int id = GrillaPacks.getSelectedRow();
            boolean status = (boolean) GrillaPacks.getValueAt(id, 4);
            btnDesactPack.setVisible(true);
            btnDesactPack.setText(getActivateDeactivateName(status));
            btnDesactPack.setEnabled(true);
            btnEditarPack.setEnabled(true);
            btnCrearPack.setEnabled(false);
        }

        if (evt.getClickCount() == 2 && GrillaPacks.getSelectedRow() != -1) {
            int dialogResult = JOptionPane.showConfirmDialog(null, """
                                                                   Los artículos asociados al pack serán eliminados
                                                                   ¿Desea editar el registro seleccionado?""",
                    "Warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                int id = GrillaPacks.getSelectedRow();
                int packId = Integer.parseInt(GrillaPacks.getValueAt(id, 0).toString());
                String namePack = GrillaPacks.getValueAt(id, 1).toString();
                String price = GrillaPacks.getValueAt(id, 2).toString();
                deletePackHas();
                getHasPack(packId);
                txtBuscarPack.setText(EMPTY);
                txtNombrePack.setText(namePack);
                txtPrecioPack.setText(price);
                btnDesactPack.setVisible(false);
                btnEditarPack.setEnabled(true);
                btnCrearPack.setEnabled(false);
            }
        }
    }//GEN-LAST:event_GrillaPacks

    private void txtBuscarPackKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarPackKeyTyped
        try {
            final String text = txtBuscarPack.getText();
            DefaultTableModel model = (DefaultTableModel) GrillaPacks.getModel();
            model.setRowCount(0);
            con = ConnectionMysql.getConnection();
            ps = con.prepareStatement("SELECT * FROM dreamgifts.pack WHERE PCK_NOMBRE LIKE '%" + text + "%'");
            rs = ps.executeQuery();
            while (rs.next()) {
                Object[] row = new Object[]{rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getBoolean(5)};
                model.addRow(row);
            }
            GrillaPacks.setModel(model);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(MaestrosForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarPackKeyTyped

    private void txtCantArtPackKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantArtPackKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c))) {
            evt.consume();
        }
        final String cantidad = txtCantArtPack.getText();
        if ((jListPckArt.isSelectionEmpty() || cantidad.length() >= 1) || cantidad.equals(0)) {
            btnAgregarArtPack.setEnabled(false);
        } else {
            btnAgregarArtPack.setEnabled(true);
        }
    }//GEN-LAST:event_txtCantArtPackKeyTyped

    private void btnAgregarArtPackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarArtPackActionPerformed
        String articulo = jListPckArt.getSelectedValue();
        if (txtCantArtPack.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe agregar la cantidad");
            return;
        }
        if (modelPackHas.contains(articulo)) {
            JOptionPane.showMessageDialog(null, "El artículo " + articulo + " ya ha sido agregado al pack");
            return;
        }
        articleMapper.entrySet().stream().filter(f -> articulo.equals(f.getValue())).forEach(article -> {
            idsAndQuantities.put(article.getKey(), Integer.parseInt(txtCantArtPack.getText()));
        });
        modelPackHas.addElement(articulo);
        jListPckHas.setModel(modelPackHas);
        btnAgregarArtPack.setEnabled(false);
        txtCantArtPack.setText(EMPTY);
    }//GEN-LAST:event_btnAgregarArtPackActionPerformed

    private void jListPckArtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListPckArtMouseClicked
        btnAgregarArtPack.setEnabled(true);
        btnQuitarArtPack.setEnabled(false);
    }//GEN-LAST:event_jListPckArtMouseClicked

    private void BtnCancelarPackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelarPackActionPerformed
        txtNombrePack.setText(EMPTY);
        txtPrecioPack.setText(EMPTY);
        txtBuscarPack.setText(EMPTY);
        txtCantArtPack.setText(EMPTY);
        btnDesactPack.setVisible(false);
        getPack();
    }//GEN-LAST:event_BtnCancelarPackActionPerformed

    private void btnCrearPackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearPackActionPerformed
        int packId = insertPack();
        insertHasPack(packId);
        JOptionPane.showMessageDialog(null, "Pack insertado correctamente");
        cleanArticleForm();
    }//GEN-LAST:event_btnCrearPackActionPerformed

    private void insertHasPack(int packId) {
        idsAndQuantities.entrySet().forEach(map -> {
            try {
                con = ConnectionMysql.getConnection();
                ps = con.prepareStatement("INSERT INTO dreamgifts.pack_has_articulo (PCK_ID_PACK, ART_ID_ARTICULO, CANTIDAD) VALUES (?, ?, ?)");
                ps.setInt(1, packId);
                ps.setInt(2, map.getKey());
                ps.setInt(3, map.getValue());
                int execute = ps.executeUpdate();
                if (execute == 1) {
                    con.close();
                }
            } catch (SQLException ex) {
                Logger.getLogger(MaestrosForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        });
    }

    /*private String getFieldRRSS() {
        return TxtNomRRSS.getText().toUpperCase().trim().replaceAll("( )+", " ");
    }*/
    private int insertPack() {
        try {
            int id = 0;
            con = ConnectionMysql.getConnection();
            ps = con.prepareStatement("INSERT INTO dreamgifts.pack (PCK_NOMBRE, PCK_COSTO, PCK_STOCK, PCK_ESTADO) VALUES(?, ?, ?, ?)", Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, txtNombrePack.getText().toUpperCase());
            ps.setString(2, txtPrecioPack.getText());
            ps.setInt(3, 0);
            ps.setInt(4, 1);
            ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            if (rs.next()) {
                id = rs.getInt(1);
            }
            rs.close();
            con.close();
            return id;
        } catch (SQLException ex) {
            Logger.getLogger(MaestrosForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0;
    }

    private void cleanArticleForm() {
        txtNombrePack.setText(EMPTY);
        txtPrecioPack.setText(EMPTY);
        txtCantArtPack.setText(EMPTY);
        idsAndQuantities.clear();
        modelPackHas.removeAllElements();
        jListPckHas.setModel(modelPackHas);
    }
    private static final String EMPTY = "";

    private void txtBuscarComunaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarComunaKeyTyped
        try {
            final String text = txtBuscarComuna.getText();
            DefaultTableModel model = (DefaultTableModel) GrillaComunas.getModel();
            model.setRowCount(0);
            con = ConnectionMysql.getConnection();
            ps = con.prepareStatement("SELECT * FROM dreamgifts.comuna WHERE COM_NOMBRE LIKE '%" + text + "%'");
            rs = ps.executeQuery();
            while (rs.next()) {
                Object[] row = new Object[]{rs.getString(1), rs.getString(2), rs.getBoolean(3)};
                model.addRow(row);
            }
            GrillaComunas.setModel(model);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(MaestrosForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtBuscarComunaKeyTyped

    private void txtBuscarComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarComunaActionPerformed

    }//GEN-LAST:event_txtBuscarComunaActionPerformed

    private void BtnDesactivarComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDesactivarComunaActionPerformed
        try {
            con = ConnectionMysql.getConnection();
            int id = GrillaComunas.getSelectedRow();
            int idComuna = Integer.parseInt(GrillaComunas.getValueAt(id, 0).toString());
            boolean status = (boolean) GrillaComunas.getValueAt(id, 2);
            ps = con.prepareStatement("UPDATE dreamgifts.comuna SET COM_ESTADO = ? WHERE COM_ID_COMUNA = ?");
            ps.setInt(1, calculateStatus(status));
            ps.setInt(2, idComuna);
            int execute = ps.executeUpdate();
            if (execute == 1) {
                con.close();
                String message = calculateStatus(status) == 1 ? "activó" : "desactivó";
                JOptionPane.showMessageDialog(null, "La comuna se " + message + " correctamente");
                BtnDesactivarComuna.setVisible(false);
                BtnEditarComuna.setEnabled(false);
                txtNomComuna.setText(EMPTY);
                refreshTableComuna();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaestrosForm.class
                    .getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnDesactivarComunaActionPerformed

    private void BtnEditarComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditarComunaActionPerformed
        try {
            String nameComuna = getFieldValue(txtNomComuna);
            con = ConnectionMysql.getConnection();
            int id = GrillaComunas.getSelectedRow();
            int idComuna = Integer.parseInt(GrillaComunas.getValueAt(id, 0).toString());
            ps = con.prepareStatement("UPDATE dreamgifts.comuna SET COM_NOMBRE = ? WHERE COM_ID_COMUNA = ?");
            ps.setString(1, nameComuna);
            ps.setInt(2, idComuna);
            int execute = ps.executeUpdate();
            if (execute == 1) {
                con.close();
                JOptionPane.showMessageDialog(null, "La comuna se actualizó correctamente");
                txtNomComuna.setText(EMPTY);
                BtnEditarComuna.setEnabled(false);
                BtnDesactivarComuna.setVisible(false);
                btnGuardarComuna.setEnabled(true);
                refreshTableComuna();
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaestrosForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex.getMessage(), null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_BtnEditarComunaActionPerformed

    private void GrillaComunasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GrillaComunasMouseClicked
        if (evt.getClickCount() == 2 && GrillaComunas.getSelectedRow() != -1) {
            int id = GrillaComunas.getSelectedRow();
            String valor = GrillaComunas.getValueAt(id, 1).toString();
            boolean status = (boolean) GrillaComunas.getValueAt(id, 2);
            txtBuscarComuna.setText(EMPTY);
            txtNomComuna.setText(valor);
            BtnDesactivarComuna.setVisible(true);
            BtnDesactivarComuna.setText(getActivateDeactivateName(status));
            BtnDesactivarComuna.setEnabled(true);
            BtnEditarComuna.setEnabled(true);
            btnGuardarComuna.setEnabled(false);
        }
    }//GEN-LAST:event_GrillaComunasMouseClicked

    private void btnCancelarComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarComunaActionPerformed
        txtNomComuna.setText(EMPTY);
        txtBuscarComuna.setText(EMPTY);
        btnGuardarComuna.setEnabled(true);
        BtnEditarComuna.setEnabled(false);
        BtnDesactivarComuna.setEnabled(false);
        refreshTableComuna();
    }//GEN-LAST:event_btnCancelarComunaActionPerformed

    private void btnGuardarComunaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarComunaActionPerformed
        try {
            String nameComuna = getFieldValue(txtNomComuna);
            if (isEmptyField(nameComuna)) {
                con = ConnectionMysql.getConnection();
                ps = con.prepareStatement("INSERT INTO dreamgifts.comuna (COM_NOMBRE, COM_ESTADO) VALUES (?, ?)");
                ps.setString(1, nameComuna);
                ps.setInt(2, 1);
                int execute = ps.executeUpdate();
                if (execute == 1) {
                    con.close();
                    JOptionPane.showMessageDialog(null, "La comuna se inserto correctamente");
                    txtNomComuna.setText(EMPTY);
                    refreshTableComuna();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaestrosForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "La comuna " + getFieldValue(txtNomComuna) + " ya existe", null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarComunaActionPerformed

    private void txtNomComunaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomComunaKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        final String nameComuna = getFieldValue(txtNomComuna);
        if (nameComuna.equals(EMPTY)) {
            BtnEditarComuna.setEnabled(false);
            btnGuardarComuna.setEnabled(true);
        }
    }//GEN-LAST:event_txtNomComunaKeyTyped

    private void GrillaRRSSMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GrillaRRSSMouseClicked
        /*if (evt.getClickCount() == 2 && GrillaRRSS.getSelectedRow() != -1) {
            int id = GrillaRRSS.getSelectedRow();
            String valor = GrillaRRSS.getValueAt(id, 1).toString();
            boolean status = (boolean) GrillaRRSS.getValueAt(id, 2);
            TxtNomRRSS.setText(valor);
            BtnRRSSDesactivar.setVisible(true);
            BtnRRSSDesactivar.setText(getActivateDeactivateName(status));
            BtnRRSSEditar.setEnabled(true);
            BtnRRSSGuardar.setEnabled(false);
        }*/
    }//GEN-LAST:event_GrillaRRSSMouseClicked

    private void BtnRRSSCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRRSSCancelarActionPerformed
        /*TxtNomRRSS.setText("");
        BtnRRSSGuardar.setEnabled(true);
        BtnRRSSEditar.setEnabled(false);*/
    }//GEN-LAST:event_BtnRRSSCancelarActionPerformed

    private void BtnRRSSGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRRSSGuardarActionPerformed
        /*try {
            String nameRRSS = getFieldRRSS();
            if (isEmptyField(nameRRSS)) {
                con = ConnectionMysql.getConnection();
                ps = con.prepareStatement("INSERT INTO dreamgifts.RRSS (RRSS_NOMBRE, RRSS_ESTADO) VALUES (?, ?)");
                ps.setString(1, nameRRSS);
                ps.setInt(2, 1);
                int execute = ps.executeUpdate();
                if (execute == 1) {
                    con.close();
                    JOptionPane.showMessageDialog(null, "La RRSS se inserto correctamente");
                    TxtNomRRSS.setText("");
                    refreshTable();
                }
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaestrosForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "La RRSS " + TxtNomRRSS.getText().toUpperCase().trim() + " ya existe", null, JOptionPane.ERROR_MESSAGE);
        }*/        // TODO add your handling code here:
    }//GEN-LAST:event_BtnRRSSGuardarActionPerformed

    private void TxtNomRRSSKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TxtNomRRSSKeyTyped
        /*char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE)) {
            evt.consume();
        }
        final String nameRRSS = TxtNomComuna.getText();
        if (nameRRSS.equals("")) {
            BtnEditar.setEnabled(false);
            BtnGuardar.setEnabled(true);
        }*/
    }//GEN-LAST:event_TxtNomRRSSKeyTyped

    private void BtnUserEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnUserEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BtnUserEditarActionPerformed

    private void jListPckHasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListPckHasMouseClicked
        btnQuitarArtPack.setEnabled(true);
        btnAgregarArtPack.setEnabled(false);
    }//GEN-LAST:event_jListPckHasMouseClicked

    private void btnQuitarArtPackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarArtPackActionPerformed

    }//GEN-LAST:event_btnQuitarArtPackActionPerformed

    private void deletePackHas() throws NumberFormatException, HeadlessException {
        try {
            con = ConnectionMysql.getConnection();
            int id = GrillaPacks.getSelectedRow();
            int idHasPack = Integer.parseInt(GrillaPacks.getValueAt(id, 0).toString());
            ps = con.prepareStatement("DELETE FROM dreamgifts.pack_has_articulo WHERE PCK_ID_PACK = ?");
            ps.setInt(1, idHasPack);
            int execute = ps.executeUpdate();
            if (execute == 1) {
                JOptionPane.showMessageDialog(null, "Los articulos fueron eliminados del pack seleccionado");
            }
            con.close();
        } catch (HeadlessException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "error" + ex.getMessage());
        }
    }

    private String getFieldValue(JTextField jTextField) {
        return jTextField.getText().toUpperCase().trim().replaceAll("( )+", " ");
    }

    public void enableDisable(boolean state) {
        btnCrearPack.setEnabled(state);
        btnEditarPack.setEnabled(state);
        btnDesactPack.setEnabled(state);
    }

    private boolean isEmptyField(String field) {
        if (StringUtils.isNullOrEmpty(field)) {
            JOptionPane.showMessageDialog(this, "Debe ingresar el nombre de una comuna", "Error!", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    private static int calculateStatus(boolean status) {
        return status ? 0 : 1;
    }

    private String getActivateDeactivateName(boolean status) {
        return status ? "Desactivar" : "Activar";
    }

    private void refreshTableComuna() {
        try {
            DefaultTableModel model = (DefaultTableModel) GrillaComunas.getModel();
            model.setRowCount(0);
            con = ConnectionMysql.getConnection();
            ps = con.prepareStatement("SELECT * FROM dreamgifts.comuna");
            rs = ps.executeQuery();
            while (rs.next()) {
                Object[] row = new Object[]{rs.getString(1), rs.getString(2), rs.getBoolean(3)};
                model.addRow(row);
            }
            GrillaComunas.setModel(model);
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(MaestrosForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void refreshTablePack() {
        try {
            DefaultTableModel model = (DefaultTableModel) GrillaPacks.getModel();
            model.setRowCount(0);
            con = ConnectionMysql.getConnection();
            ps = con.prepareStatement("SELECT * FROM dreamgifts.pack");
            rs = ps.executeQuery();
            while (rs.next()) {
                Object[] row = new Object[]{rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getBoolean(5)};
                model.addRow(row);
            }
            GrillaComunas.setModel(model);
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(MaestrosForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getArticulos() {
        try {
            DefaultListModel model = new DefaultListModel();
            jListPckArt.removeAll();
            con = ConnectionMysql.getConnection();
            ps = con.prepareStatement("SELECT * FROM dreamgifts.articulo");
            rs = ps.executeQuery();
            while (rs.next()) {
                articleMapper.put(rs.getInt(1), rs.getString(2));
            }
            articleMapper.entrySet().forEach(articulo -> {
                model.addElement(articulo.getValue());
            });
            jListPckArt.setModel(model);
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(MaestrosForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getPack() {
        try {
            DefaultTableModel model = (DefaultTableModel) GrillaPacks.getModel();
            model.setRowCount(0);
            con = ConnectionMysql.getConnection();
            ps = con.prepareStatement("SELECT * FROM dreamgifts.pack");
            rs = ps.executeQuery();
            while (rs.next()) {
                Object[] row = new Object[]{rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4), rs.getBoolean(5)};
                model.addRow(row);
            }
            GrillaPacks.setModel(model);
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(MaestrosForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void getHasPack(int idPack) {
        try {
            DefaultListModel model = new DefaultListModel();
            model.removeAllElements();
            con = ConnectionMysql.getConnection();
            ps = con.prepareStatement("""
                                      SELECT ha.PCK_ID_PACK, a.ART_DESCRIPCION, ha.CANTIDAD FROM dreamgifts.articulo a 
                                      INNER JOIN dreamgifts.pack_has_articulo ha 
                                      	ON ha.ART_ID_ARTICULO = a.ART_ID_ARTICULO
                                      WHERE ha.PCK_ID_PACK = ?""");
            ps.setInt(1, idPack);
            rs = ps.executeQuery();
            while (rs.next()) {
                model.addElement(rs.getString(2) + " - (" + rs.getInt(3) + ")");
            }
            jListPckHas.setModel(model);
            con.close();

        } catch (SQLException ex) {
            Logger.getLogger(MaestrosForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /*private void filterTable(String text) {
        try {
            DefaultTableModel model = (DefaultTableModel) GrillaComunas.getModel();
            model.setRowCount(0);
            con = ConnectionMysql.getConnection();
            ps = con.prepareStatement("SELECT * FROM dreamgifts.comuna WHERE LIKE %" + text + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Object[] row = new Object[]{rs.getString(1), rs.getString(2), rs.getBoolean(3)};
                model.addRow(row);
            }
            GrillaComunas.setModel(model);
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(MaestrosForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBcoCancelar;
    private javax.swing.JButton BtnBcoDesactivar;
    private javax.swing.JButton BtnBcoGuardar;
    private javax.swing.JButton BtnBcoeditar;
    private javax.swing.JButton BtnCancelarPack;
    private javax.swing.JButton BtnDesactivarComuna;
    private javax.swing.JButton BtnEditarComuna;
    private javax.swing.JButton BtnRRSSCancelar;
    private javax.swing.JButton BtnRRSSDesactivar;
    private javax.swing.JButton BtnRRSSEditar;
    private javax.swing.JButton BtnRRSSGuardar;
    private javax.swing.JButton BtnUserCancelar;
    private javax.swing.JButton BtnUserDesactivar;
    private javax.swing.JButton BtnUserEditar;
    private javax.swing.JButton BtnUserGuardar;
    private javax.swing.JTable GrillaComunas;
    private javax.swing.JTable GrillaPacks;
    private javax.swing.JTable GrillaRRSS;
    private javax.swing.JTable GrillaUsuarios;
    private javax.swing.JTextField TxtBcoNombre;
    private javax.swing.JTextField TxtClave;
    private javax.swing.JTextField TxtNomRRSS;
    private javax.swing.JTextField TxtNomUsuario;
    private javax.swing.JTextField TxtRepClave;
    private javax.swing.JButton btnAgregarArtPack;
    private javax.swing.JButton btnCancelarComuna;
    private javax.swing.JButton btnCrearPack;
    private javax.swing.JButton btnDesactPack;
    private javax.swing.JButton btnEditarPack;
    private javax.swing.JButton btnGuardarComuna;
    private javax.swing.JButton btnQuitarArtPack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jListPckArt;
    private javax.swing.JList<String> jListPckHas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txtBuscarComuna;
    private javax.swing.JTextField txtBuscarPack;
    private javax.swing.JTextField txtCantArtPack;
    private javax.swing.JTextField txtNomComuna;
    private javax.swing.JTextField txtNombrePack;
    private javax.swing.JTextField txtPrecioPack;
    // End of variables declaration//GEN-END:variables

}
