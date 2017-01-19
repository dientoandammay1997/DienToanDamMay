/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duongnxpk00662;

import java.awt.Dimension;
import java.awt.Graphics;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DuongAli
 */
public class frmQuanLySanPham extends javax.swing.JFrame {

    String string = "src\\images\\215a.png";

    /**
     * Creates new form frmQuanLySanPham
     */
    public frmQuanLySanPham() {
        initComponents();
        getRootPane().setDefaultButton(btnSearch);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnQuanLySanPham1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQuanLySanPham = new javax.swing.JTable();
        jpnQuanLySanPham2 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon(string);
            public void paintComponent(Graphics g) {
                Dimension d = this.getSize();
                g.drawImage(icon.getImage(),0,0,d.width,d.height,null);
                setOpaque(false);
                super.paintComponent(g); }
        };
        lblTenLoai = new javax.swing.JLabel();
        lblMaSanPham = new javax.swing.JLabel();
        lblMoTa = new javax.swing.JLabel();
        lblTenSanPham = new javax.swing.JLabel();
        txtMaSanPham = new javax.swing.JTextField();
        txtTenSanPham = new javax.swing.JTextField();
        txtMoTa = new javax.swing.JTextField();
        cbbTenLoai = new javax.swing.JComboBox<>();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        lblTool = new javax.swing.JLabel();
        lblQuanLySanPham = new javax.swing.JLabel();
        txtGiaSanPham = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        lblGiaSanPham = new javax.swing.JLabel();
        lblSoLuong = new javax.swing.JLabel();
        lblSearch = new javax.swing.JLabel();
        jMenuQuanLySanPham = new javax.swing.JMenuBar();
        jMenuHome = new javax.swing.JMenu();
        jMenuSystem = new javax.swing.JMenu();
        jMenuSetting = new javax.swing.JMenu();
        jMenuHelf = new javax.swing.JMenu();
        jMenuInfo = new javax.swing.JMenu();
        jMenuLogOut = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jpnQuanLySanPham1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tblQuanLySanPham.setBackground(new java.awt.Color(0, 0, 0));
        tblQuanLySanPham.setForeground(new java.awt.Color(0, 255, 255));
        tblQuanLySanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sản Phẩm", "Tên Sản Phẩm", "Mô Tả", "Giá Sản Phẩm", "Số Lượng", "Tên Loại"
            }
        ));
        tblQuanLySanPham.setSelectionBackground(new java.awt.Color(222, 222, 222));
        tblQuanLySanPham.setSelectionForeground(new java.awt.Color(22, 22, 22));
        tblQuanLySanPham.setShowVerticalLines(false);
        tblQuanLySanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuanLySanPhamMouseClicked(evt);
            }
        });
        tblQuanLySanPham.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblQuanLySanPhamKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblQuanLySanPham);

        jpnQuanLySanPham2.setBackground(new java.awt.Color(0, 0, 0));

        lblTenLoai.setForeground(new java.awt.Color(255, 255, 255));
        lblTenLoai.setText("Tên Loại");

        lblMaSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblMaSanPham.setText("Mã Sản Phẩm");

        lblMoTa.setForeground(new java.awt.Color(255, 255, 255));
        lblMoTa.setText("Mô Tả");

        lblTenSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblTenSanPham.setText("Tên Sản Phẩm");

        txtMaSanPham.setEditable(false);
        txtMaSanPham.setBackground(new java.awt.Color(51, 51, 51));
        txtMaSanPham.setForeground(new java.awt.Color(0, 255, 255));

        txtTenSanPham.setBackground(new java.awt.Color(0, 0, 0));
        txtTenSanPham.setForeground(new java.awt.Color(0, 255, 255));

        txtMoTa.setBackground(new java.awt.Color(0, 0, 0));
        txtMoTa.setForeground(new java.awt.Color(0, 255, 255));

        cbbTenLoai.setBackground(new java.awt.Color(0, 0, 0));
        cbbTenLoai.setForeground(new java.awt.Color(0, 255, 255));
        cbbTenLoai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnInsert.setBackground(new java.awt.Color(0, 0, 0));
        btnInsert.setForeground(new java.awt.Color(0, 255, 255));
        btnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/them.png"))); // NOI18N
        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setForeground(new java.awt.Color(0, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/xoa.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setForeground(new java.awt.Color(0, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sua.png"))); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(0, 0, 0));
        btnReset.setForeground(new java.awt.Color(0, 255, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/taomoi.png"))); // NOI18N
        btnReset.setText("Tạo Mới");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        txtSearch.setBackground(new java.awt.Color(0, 0, 0));
        txtSearch.setForeground(new java.awt.Color(0, 255, 255));

        btnSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnSearch.setForeground(new java.awt.Color(0, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tim.png"))); // NOI18N
        btnSearch.setText("Tìm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        lblTool.setForeground(new java.awt.Color(255, 255, 255));
        lblTool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/TOOL.png"))); // NOI18N
        lblTool.setText("TOOL");

        lblQuanLySanPham.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQuanLySanPham.setForeground(new java.awt.Color(0, 255, 255));
        lblQuanLySanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/NOTEPAD.png"))); // NOI18N
        lblQuanLySanPham.setText("Quản Lý Sản Phẩm");

        txtGiaSanPham.setBackground(new java.awt.Color(0, 0, 0));
        txtGiaSanPham.setForeground(new java.awt.Color(0, 255, 255));

        txtSoLuong.setBackground(new java.awt.Color(0, 0, 0));
        txtSoLuong.setForeground(new java.awt.Color(0, 255, 255));

        lblGiaSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblGiaSanPham.setText("Giá Sản Phẩm");

        lblSoLuong.setForeground(new java.awt.Color(255, 255, 255));
        lblSoLuong.setText("Số Lượng");

        lblSearch.setForeground(new java.awt.Color(255, 255, 255));
        lblSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tim.png"))); // NOI18N
        lblSearch.setText("Tìm Kiếm");

        javax.swing.GroupLayout jpnQuanLySanPham2Layout = new javax.swing.GroupLayout(jpnQuanLySanPham2);
        jpnQuanLySanPham2.setLayout(jpnQuanLySanPham2Layout);
        jpnQuanLySanPham2Layout.setHorizontalGroup(
            jpnQuanLySanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLySanPham2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jpnQuanLySanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblTenLoai)
                    .addComponent(lblMaSanPham)
                    .addComponent(lblTenSanPham)
                    .addComponent(lblMoTa)
                    .addComponent(lblGiaSanPham)
                    .addComponent(lblSoLuong))
                .addGap(26, 26, 26)
                .addGroup(jpnQuanLySanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnQuanLySanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtGiaSanPham)
                        .addComponent(txtTenSanPham)
                        .addComponent(txtMoTa)
                        .addComponent(txtMaSanPham)
                        .addComponent(txtSoLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cbbTenLoai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jpnQuanLySanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnQuanLySanPham2Layout.createSequentialGroup()
                        .addComponent(lblTool)
                        .addGap(80, 80, 80))
                    .addGroup(jpnQuanLySanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jpnQuanLySanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jpnQuanLySanPham2Layout.createSequentialGroup()
                                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jpnQuanLySanPham2Layout.createSequentialGroup()
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblSearch))
                .addContainerGap(54, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnQuanLySanPham2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblQuanLySanPham)
                .addGap(327, 327, 327))
        );
        jpnQuanLySanPham2Layout.setVerticalGroup(
            jpnQuanLySanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLySanPham2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lblQuanLySanPham)
                .addGap(51, 51, 51)
                .addGroup(jpnQuanLySanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnQuanLySanPham2Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(btnSearch))
                    .addGroup(jpnQuanLySanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jpnQuanLySanPham2Layout.createSequentialGroup()
                            .addGroup(jpnQuanLySanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMaSanPham))
                            .addGap(12, 12, 12)
                            .addGroup(jpnQuanLySanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtTenSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTenSanPham))
                            .addGap(12, 12, 12)
                            .addGroup(jpnQuanLySanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblMoTa))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jpnQuanLySanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtGiaSanPham, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblGiaSanPham))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jpnQuanLySanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblSoLuong))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jpnQuanLySanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbbTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblTenLoai)))
                        .addGroup(jpnQuanLySanPham2Layout.createSequentialGroup()
                            .addComponent(lblTool)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jpnQuanLySanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jpnQuanLySanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(lblSearch))))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jpnQuanLySanPham2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jpnQuanLySanPham2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnQuanLySanPham1Layout = new javax.swing.GroupLayout(jpnQuanLySanPham1);
        jpnQuanLySanPham1.setLayout(jpnQuanLySanPham1Layout);
        jpnQuanLySanPham1Layout.setHorizontalGroup(
            jpnQuanLySanPham1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLySanPham1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnQuanLySanPham1Layout.setVerticalGroup(
            jpnQuanLySanPham1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLySanPham1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuQuanLySanPham.setBackground(new java.awt.Color(0, 0, 0));
        jMenuQuanLySanPham.setForeground(new java.awt.Color(255, 255, 255));

        jMenuHome.setForeground(new java.awt.Color(0, 255, 255));
        jMenuHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/HOME20.png"))); // NOI18N
        jMenuHome.setText("Home");
        jMenuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuHomeMouseClicked(evt);
            }
        });
        jMenuQuanLySanPham.add(jMenuHome);

        jMenuSystem.setForeground(new java.awt.Color(255, 255, 255));
        jMenuSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SETTINGS20.png"))); // NOI18N
        jMenuSystem.setText("Hệ thống");
        jMenuQuanLySanPham.add(jMenuSystem);

        jMenuSetting.setForeground(new java.awt.Color(255, 255, 255));
        jMenuSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/TOOL20.png"))); // NOI18N
        jMenuSetting.setText("Cài đặt");
        jMenuQuanLySanPham.add(jMenuSetting);

        jMenuHelf.setForeground(new java.awt.Color(255, 255, 255));
        jMenuHelf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/HELF20.png"))); // NOI18N
        jMenuHelf.setText("Trợ giúp");
        jMenuQuanLySanPham.add(jMenuHelf);

        jMenuInfo.setForeground(new java.awt.Color(0, 255, 0));
        jMenuInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/INFO20.png"))); // NOI18N
        jMenuInfo.setText("Giới thiệu");
        jMenuInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuInfoMouseClicked(evt);
            }
        });
        jMenuQuanLySanPham.add(jMenuInfo);

        jMenuLogOut.setForeground(new java.awt.Color(255, 0, 0));
        jMenuLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/POWER - SHUT DOWN20.png"))); // NOI18N
        jMenuLogOut.setText("Đăng xuất");
        jMenuLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuLogOutMouseClicked(evt);
            }
        });
        jMenuQuanLySanPham.add(jMenuLogOut);

        setJMenuBar(jMenuQuanLySanPham);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnQuanLySanPham1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnQuanLySanPham1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuLogOutMouseClicked
        frmDangNhap frm = new frmDangNhap();
        frm.show();
        this.dispose();
    }//GEN-LAST:event_jMenuLogOutMouseClicked

    private void jMenuHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuHomeMouseClicked
        frmQuanLy frm = new frmQuanLy();
        frm.show();
        this.dispose();
    }//GEN-LAST:event_jMenuHomeMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        LayDuLieu();
        Combobox();
    }//GEN-LAST:event_formWindowOpened

    private void tblQuanLySanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuanLySanPhamMouseClicked
        int ViTri = tblQuanLySanPham.getSelectedRow();
        txtMaSanPham.setText(tblQuanLySanPham.getValueAt(ViTri, 0).toString());
        txtTenSanPham.setText(tblQuanLySanPham.getValueAt(ViTri, 1).toString());
        txtMoTa.setText(tblQuanLySanPham.getValueAt(ViTri, 2).toString());
        txtGiaSanPham.setText(tblQuanLySanPham.getValueAt(ViTri, 3).toString());
        txtSoLuong.setText(tblQuanLySanPham.getValueAt(ViTri, 4).toString());
        String Loai = tblQuanLySanPham.getValueAt(ViTri, 5).toString();
        setSelectedCombobox(Loai);
    }//GEN-LAST:event_tblQuanLySanPhamMouseClicked

    private void tblQuanLySanPhamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblQuanLySanPhamKeyReleased
        int ViTri = tblQuanLySanPham.getSelectedRow();
        txtMaSanPham.setText(tblQuanLySanPham.getValueAt(ViTri, 0).toString());
        txtTenSanPham.setText(tblQuanLySanPham.getValueAt(ViTri, 1).toString());
        txtMoTa.setText(tblQuanLySanPham.getValueAt(ViTri, 2).toString());
        txtGiaSanPham.setText(tblQuanLySanPham.getValueAt(ViTri, 3).toString());
        txtSoLuong.setText(tblQuanLySanPham.getValueAt(ViTri, 4).toString());
        String Loai = tblQuanLySanPham.getValueAt(ViTri, 5).toString();
        setSelectedCombobox(Loai);
    }//GEN-LAST:event_tblQuanLySanPhamKeyReleased

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        String TenSanPham = txtTenSanPham.getText();
        String MoTa = txtMoTa.getText();
        String Gia = txtGiaSanPham.getText();
        String SoLuong = txtSoLuong.getText();

        Object[] obj = cbbTenLoai.getSelectedObjects();
        displaycbbmodel item = (displaycbbmodel) obj[0];
        String Loai = item.DisplayValue.toString();

        if (TenSanPham.equals("")) {
            ThongBao("Tên sản phẩm không được để trống!");
        } else if (TenSanPham.length() < 6) {
            ThongBao("Tên sản phẩm phải lớn hơn 5 ký tự!");
        } else if (Gia.equals("")) {
            ThongBao("Giá sản phẩm không được để trống!");
        } else if (!Duongnxpk00662.KiemTra.KiemTraCoChuaSoKhong(Gia)) {
            ThongBao("Giá sản phẩm bắt buộc phải là số!");
        } else if (Duongnxpk00662.KiemTra.KiemTraKyTu(Gia)) {
            ThongBao("Giá sản phẩm không được < 0!");
        } else if (SoLuong.equals("")) {
            ThongBao("Số lượng sản phẩm không được để trống!");
        } else if (!Duongnxpk00662.KiemTra.KiemTraCoChuaSoKhong(SoLuong)) {
            ThongBao("Số lượng sản phẩm bắt buộc phải là số!");
        } else if (Duongnxpk00662.KiemTra.KiemTraKyTu(SoLuong)) {
            ThongBao("Số lượng sản phẩm không được < 0!");
        } else if (MoTa.equals("")) {
            String CauTruyVan = "insert into SanPham values(N'" + TenSanPham + "',N'" + MoTa + "','" + Gia + "','" + SoLuong + "','" + Loai + "')";
            Duongnxpk00662.ConnectDB.ExcuteQueryUpdateDB(CauTruyVan);
            LayDuLieu();
        } else if (MoTa.length() < 11) {
            ThongBao("Mô tả phải lớn hơn 10 ký tự!");
        } else {
            String CauTruyVan = "insert into SanPham values(N'" + TenSanPham + "',N'" + MoTa + "','" + Gia + "','" + SoLuong + "','" + Loai + "')";
            Duongnxpk00662.ConnectDB.ExcuteQueryUpdateDB(CauTruyVan);
            LayDuLieu();
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String TenSanPham = txtTenSanPham.getText();
        String MoTa = txtMoTa.getText();
        String Gia = txtGiaSanPham.getText();
        String SoLuong = txtSoLuong.getText();
        String MaSanPham = txtMaSanPham.getText();

        Object[] obj = cbbTenLoai.getSelectedObjects();
        displaycbbmodel item = (displaycbbmodel) obj[0];
        String Loai = item.DisplayValue.toString();

        if (MaSanPham.equals("")) {
            ThongBao("Bạn hãy chọn sản phẩm cần sửa!");
        } else if (TenSanPham.equals("")) {
            ThongBao("Tên sản phẩm không được để trống!");
        } else if (TenSanPham.length() < 6) {
            ThongBao("Tên sản phẩm phải lớn hơn 5 ký tự!");
        } else if (Gia.equals("")) {
            ThongBao("Giá sản phẩm không được để trống!");
        } else if (!Duongnxpk00662.KiemTra.KiemTraCoChuaSoKhong(Gia)) {
            ThongBao("Giá sản phẩm bắt buộc phải là số!");
        } else if (Duongnxpk00662.KiemTra.KiemTraKyTu(Gia)) {
            ThongBao("Giá sản phẩm không được < 0!");
        } else if (SoLuong.equals("")) {
            ThongBao("Số lượng sản phẩm không được để trống!");
        } else if (!Duongnxpk00662.KiemTra.KiemTraCoChuaSoKhong(SoLuong)) {
            ThongBao("Số lượng sản phẩm bắt buộc phải là số!");
        } else if (Duongnxpk00662.KiemTra.KiemTraKyTu(SoLuong)) {
            ThongBao("Số lượng sản phẩm không được < 0!");
        } else if (MoTa.equals("")) {
            String CauTruyVan = "update SanPham "
                    + "set TenSanPham = N'" + TenSanPham + "' , MoTa = N'" + MoTa + "', "
                    + "GiaSanPham = '" + Gia + "', SoLuong ='" + SoLuong + "',  MaLoai='" + Loai + "' "
                    + "where MaSanPham =" + MaSanPham;
            Duongnxpk00662.ConnectDB.ExcuteQueryUpdateDB(CauTruyVan);
            LayDuLieu();
        } else if (MoTa.length() < 11) {
            ThongBao("Mô tả phải lớn hơn 10 ký tự!");
        } else {
            String CauTruyVan = "update SanPham "
                    + "set TenSanPham = N'" + TenSanPham + "' , MoTa = N'" + MoTa + "', "
                    + "GiaSanPham = '" + Gia + "', SoLuong ='" + SoLuong + "',  MaLoai='" + Loai + "' "
                    + "where MaSanPham =" + MaSanPham;
            Duongnxpk00662.ConnectDB.ExcuteQueryUpdateDB(CauTruyVan);
            LayDuLieu();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int[] MangViTri = tblQuanLySanPham.getSelectedRows();
        for (int i = 0; i < MangViTri.length; i++) {
            String MaSanPham = tblQuanLySanPham.getValueAt(MangViTri[i], 0).toString();
            String CauTruyVan = "Delete from SanPham where MaSanPham = '" + MaSanPham + "'";
            Duongnxpk00662.ConnectDB.ExcuteQueryUpdateDB(CauTruyVan);
        }
        LayDuLieu();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtMaSanPham.setText("");
        txtTenSanPham.setText("");
        txtMoTa.setText("");
        txtGiaSanPham.setText("");
        txtSoLuong.setText("");
        txtSearch.setText("");
        cbbTenLoai.setSelectedIndex(0);
        LayDuLieu();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String Search = txtSearch.getText();
        String CauTruyVan = "select * from SanPham where TenSanPham like N'%" + Search + "%' or "
                + "MoTa like N'%" + Search + "%'";
        ResultSet rs = Duongnxpk00662.ConnectDB.ExcuteQueryGetTable(CauTruyVan);
        Object[] obj = new Object[]{"Mã Sản Phẩm", "Tên Sản Phẩm", "Mô Tả", "Giá Sản Phẩm", "Số Lượng", "Mã Loại"};
        DefaultTableModel TableModel = new DefaultTableModel(obj, 0);
        tblQuanLySanPham.setModel(TableModel);

        try {
            while (rs.next()) {
                Object[] item = new Object[6];
                item[0] = rs.getInt("MaSanPham");
                item[1] = rs.getString("TenSanPham");
                item[2] = rs.getString("MoTa");
                item[3] = rs.getInt("GiaSanPham");
                item[4] = rs.getInt("SoLuong");
                item[5] = LayTenLoaiDuaVaoMaLoai(rs.getString("MaLoai"));
                TableModel.addRow(item);
            }
        } catch (SQLException ex) {
            ThongBao("Error!\n" + ex);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jMenuInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuInfoMouseClicked
        frmInfo frm = new frmInfo();
        frm.show();
    }//GEN-LAST:event_jMenuInfoMouseClicked

    private void LayDuLieu() {
        String CauTruyVan = "Select * from SanPham";
        ResultSet rs = Duongnxpk00662.ConnectDB.ExcuteQueryGetTable(CauTruyVan);
        Object[] obj = new Object[]{"Mã Sản Phẩm", "Tên Sản Phẩm", "Mô Tả", "Giá Sản Phẩm", "Số Lượng", "Mã Loại"};
        DefaultTableModel TableModel = new DefaultTableModel(obj, 0);
        tblQuanLySanPham.setModel(TableModel);

        try {
            while (rs.next()) {
                Object[] item = new Object[6];
                item[0] = rs.getInt("MaSanPham");
                item[1] = rs.getString("TenSanPham");
                item[2] = rs.getString("MoTa");
                item[3] = rs.getInt("GiaSanPham");
                item[4] = rs.getInt("SoLuong");
                item[5] = LayTenLoaiDuaVaoMaLoai(rs.getString("MaLoai"));
                TableModel.addRow(item);
            }
        } catch (SQLException ex) {
            ThongBao("Error!\n" + ex);
        }
    }

    //Display ComboBoxModel
    private void setSelectedCombobox(String Loai) {
        for (int i = 0; i < cbbTenLoai.getItemCount(); i++) {
            Object obj = cbbTenLoai.getItemAt(i);

            if (obj != null) {
                displaycbbmodel m = (displaycbbmodel) obj;
                if (Loai.equals(m.DisplayMember)) {
                    cbbTenLoai.setSelectedItem(m);
                }
            }
        }
    }

    private void Combobox() {
        String ctv = "Select * from LoaiSanPham";
        ResultSet rs = Duongnxpk00662.ConnectDB.ExcuteQueryGetTable(ctv);
        DefaultComboBoxModel cbbModel = new DefaultComboBoxModel();
        try {
            while (rs.next()) {
                displaycbbmodel item = new displaycbbmodel(rs.getString("TenLoai"), rs.getInt("MaLoai"));
                cbbModel.addElement(item);
            }
            cbbTenLoai.setModel(cbbModel);
        } catch (Exception e) {
            ThongBao("Lỗi ComboBox!" + e);
        }
    }

    private String LayTenLoaiDuaVaoMaLoai(String MaLoai) {
        String TenLoai = "";
        String ctv = "select TenLoai from LoaiSanPham where MaLoai = " + MaLoai;
        ResultSet rs = Duongnxpk00662.ConnectDB.ExcuteQueryGetTable(ctv);
        try {
            while (rs.next()) {
                TenLoai = rs.getString("TenLoai");
            }
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        return TenLoai;
    }

    //Thông báo DiaLog
    private void ThongBao(String NoiDungThongBao) {
        JOptionPane.showMessageDialog(this, NoiDungThongBao);
    }

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
            java.util.logging.Logger.getLogger(frmQuanLySanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmQuanLySanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmQuanLySanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmQuanLySanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmQuanLySanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbbTenLoai;
    private javax.swing.JMenu jMenuHelf;
    private javax.swing.JMenu jMenuHome;
    private javax.swing.JMenu jMenuInfo;
    private javax.swing.JMenu jMenuLogOut;
    private javax.swing.JMenuBar jMenuQuanLySanPham;
    private javax.swing.JMenu jMenuSetting;
    private javax.swing.JMenu jMenuSystem;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnQuanLySanPham1;
    private javax.swing.JPanel jpnQuanLySanPham2;
    private javax.swing.JLabel lblGiaSanPham;
    private javax.swing.JLabel lblMaSanPham;
    private javax.swing.JLabel lblMoTa;
    private javax.swing.JLabel lblQuanLySanPham;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblSoLuong;
    private javax.swing.JLabel lblTenLoai;
    private javax.swing.JLabel lblTenSanPham;
    private javax.swing.JLabel lblTool;
    private javax.swing.JTable tblQuanLySanPham;
    private javax.swing.JTextField txtGiaSanPham;
    private javax.swing.JTextField txtMaSanPham;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtTenSanPham;
    // End of variables declaration//GEN-END:variables
}
