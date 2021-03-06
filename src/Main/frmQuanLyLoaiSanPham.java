/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Dimension;
import java.awt.Graphics;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DuongAli
 */
public class frmQuanLyLoaiSanPham extends javax.swing.JFrame {

    String string = "src\\images\\QuanLyLoaiSanPham.png";

    /**
     * Creates new form frmQuanLyLoaiSanPham
     */
    public frmQuanLyLoaiSanPham() {
        initComponents();
        getRootPane().setDefaultButton(btnSearch);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnQuanLyLoaiSanPham1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblQuanlyLoaiSanPham = new javax.swing.JTable();
        jpnQuanLyLoaiSanPham2 = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon(string);
            public void paintComponent(Graphics g) {
                Dimension d = this.getSize();
                g.drawImage(icon.getImage(),0,0,d.width,d.height,null);
                setOpaque(false);
                super.paintComponent(g); }
        };
        lblMaLoai = new javax.swing.JLabel();
        lblMoTa = new javax.swing.JLabel();
        lblTenLoai = new javax.swing.JLabel();
        txtMaLoai = new javax.swing.JTextField();
        txtTenLoai = new javax.swing.JTextField();
        txtMoTa = new javax.swing.JTextField();
        lblQuanLyLoaiSanPham = new javax.swing.JLabel();
        lblTool = new javax.swing.JLabel();
        btnInsert = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        lblSearch = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jMenuQuanLyLoaiSanPham = new javax.swing.JMenuBar();
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

        jpnQuanLyLoaiSanPham1.setBackground(new java.awt.Color(0, 0, 0));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        tblQuanlyLoaiSanPham.setBackground(new java.awt.Color(0, 0, 0));
        tblQuanlyLoaiSanPham.setForeground(new java.awt.Color(0, 255, 255));
        tblQuanlyLoaiSanPham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Mã Loại", "Tên Loại", "Mô Tả"
            }
        ));
        tblQuanlyLoaiSanPham.setSelectionBackground(new java.awt.Color(222, 222, 222));
        tblQuanlyLoaiSanPham.setSelectionForeground(new java.awt.Color(22, 22, 22));
        tblQuanlyLoaiSanPham.setShowVerticalLines(false);
        tblQuanlyLoaiSanPham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblQuanlyLoaiSanPhamMouseClicked(evt);
            }
        });
        tblQuanlyLoaiSanPham.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tblQuanlyLoaiSanPhamKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tblQuanlyLoaiSanPham);

        jpnQuanLyLoaiSanPham2.setBackground(new java.awt.Color(0, 0, 0));

        lblMaLoai.setForeground(new java.awt.Color(255, 255, 255));
        lblMaLoai.setText("Mã Loại");

        lblMoTa.setForeground(new java.awt.Color(255, 255, 255));
        lblMoTa.setText("Mô Tả");

        lblTenLoai.setForeground(new java.awt.Color(255, 255, 255));
        lblTenLoai.setText("Tên Loại");

        txtMaLoai.setEditable(false);
        txtMaLoai.setBackground(new java.awt.Color(51, 51, 51));
        txtMaLoai.setForeground(new java.awt.Color(204, 255, 255));

        txtTenLoai.setBackground(new java.awt.Color(0, 0, 0));
        txtTenLoai.setForeground(new java.awt.Color(204, 255, 255));

        txtMoTa.setBackground(new java.awt.Color(0, 0, 0));
        txtMoTa.setForeground(new java.awt.Color(204, 255, 255));

        lblQuanLyLoaiSanPham.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblQuanLyLoaiSanPham.setForeground(new java.awt.Color(255, 255, 255));
        lblQuanLyLoaiSanPham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/NOTEPAD.png"))); // NOI18N
        lblQuanLyLoaiSanPham.setText("Quản Lý Loại Sản Phẩm");

        lblTool.setForeground(new java.awt.Color(255, 255, 255));
        lblTool.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/TOOL.png"))); // NOI18N
        lblTool.setText("TOOL");

        btnInsert.setBackground(new java.awt.Color(0, 0, 0));
        btnInsert.setForeground(new java.awt.Color(204, 255, 255));
        btnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/them.png"))); // NOI18N
        btnInsert.setText("Thêm");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(0, 0, 0));
        btnDelete.setForeground(new java.awt.Color(204, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/xoa.png"))); // NOI18N
        btnDelete.setText("Xóa");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(0, 0, 0));
        btnReset.setForeground(new java.awt.Color(204, 255, 255));
        btnReset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/taomoi.png"))); // NOI18N
        btnReset.setText("Tạo Mới");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(0, 0, 0));
        btnUpdate.setForeground(new java.awt.Color(204, 255, 255));
        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/sua.png"))); // NOI18N
        btnUpdate.setText("Sửa");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        lblSearch.setForeground(new java.awt.Color(255, 255, 255));
        lblSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tim.png"))); // NOI18N
        lblSearch.setText("Tìm Kiếm");

        txtSearch.setBackground(new java.awt.Color(0, 0, 0));
        txtSearch.setForeground(new java.awt.Color(204, 255, 255));

        btnSearch.setBackground(new java.awt.Color(0, 0, 0));
        btnSearch.setForeground(new java.awt.Color(204, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tim.png"))); // NOI18N
        btnSearch.setText("Tìm");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnQuanLyLoaiSanPham2Layout = new javax.swing.GroupLayout(jpnQuanLyLoaiSanPham2);
        jpnQuanLyLoaiSanPham2.setLayout(jpnQuanLyLoaiSanPham2Layout);
        jpnQuanLyLoaiSanPham2Layout.setHorizontalGroup(
            jpnQuanLyLoaiSanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyLoaiSanPham2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jpnQuanLyLoaiSanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnQuanLyLoaiSanPham2Layout.createSequentialGroup()
                        .addComponent(lblTool)
                        .addGap(125, 125, 125))
                    .addGroup(jpnQuanLyLoaiSanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jpnQuanLyLoaiSanPham2Layout.createSequentialGroup()
                            .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jpnQuanLyLoaiSanPham2Layout.createSequentialGroup()
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(60, 60, 60)
                .addGroup(jpnQuanLyLoaiSanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSearch)
                    .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                    .addComponent(lblSearch))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnQuanLyLoaiSanPham2Layout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addGroup(jpnQuanLyLoaiSanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMaLoai)
                    .addComponent(lblTenLoai)
                    .addComponent(lblMoTa))
                .addGap(26, 26, 26)
                .addGroup(jpnQuanLyLoaiSanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txtTenLoai, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaLoai, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpnQuanLyLoaiSanPham2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(lblQuanLyLoaiSanPham)))
                .addGap(78, 78, 78))
        );
        jpnQuanLyLoaiSanPham2Layout.setVerticalGroup(
            jpnQuanLyLoaiSanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyLoaiSanPham2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(lblQuanLyLoaiSanPham)
                .addGap(48, 48, 48)
                .addGroup(jpnQuanLyLoaiSanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMaLoai))
                .addGap(12, 12, 12)
                .addGroup(jpnQuanLyLoaiSanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTenLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTenLoai))
                .addGap(12, 12, 12)
                .addGroup(jpnQuanLyLoaiSanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMoTa))
                .addGroup(jpnQuanLyLoaiSanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnQuanLyLoaiSanPham2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lblTool))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnQuanLyLoaiSanPham2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSearch)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpnQuanLyLoaiSanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpnQuanLyLoaiSanPham2Layout.createSequentialGroup()
                        .addGroup(jpnQuanLyLoaiSanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpnQuanLyLoaiSanPham2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jpnQuanLyLoaiSanPham2Layout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jpnQuanLyLoaiSanPham2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jpnQuanLyLoaiSanPham2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnQuanLyLoaiSanPham1Layout = new javax.swing.GroupLayout(jpnQuanLyLoaiSanPham1);
        jpnQuanLyLoaiSanPham1.setLayout(jpnQuanLyLoaiSanPham1Layout);
        jpnQuanLyLoaiSanPham1Layout.setHorizontalGroup(
            jpnQuanLyLoaiSanPham1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyLoaiSanPham1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnQuanLyLoaiSanPham1Layout.setVerticalGroup(
            jpnQuanLyLoaiSanPham1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnQuanLyLoaiSanPham1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jMenuQuanLyLoaiSanPham.setBackground(new java.awt.Color(0, 0, 0));
        jMenuQuanLyLoaiSanPham.setForeground(new java.awt.Color(255, 255, 255));

        jMenuHome.setForeground(new java.awt.Color(0, 255, 255));
        jMenuHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/HOME20.png"))); // NOI18N
        jMenuHome.setText("Home");
        jMenuHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuHomeMouseClicked(evt);
            }
        });
        jMenuQuanLyLoaiSanPham.add(jMenuHome);

        jMenuSystem.setForeground(new java.awt.Color(255, 255, 255));
        jMenuSystem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/SETTINGS20.png"))); // NOI18N
        jMenuSystem.setText("Hệ thống");
        jMenuQuanLyLoaiSanPham.add(jMenuSystem);

        jMenuSetting.setForeground(new java.awt.Color(255, 255, 255));
        jMenuSetting.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/TOOL20.png"))); // NOI18N
        jMenuSetting.setText("Cài đặt");
        jMenuQuanLyLoaiSanPham.add(jMenuSetting);

        jMenuHelf.setForeground(new java.awt.Color(255, 255, 255));
        jMenuHelf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/HELF20.png"))); // NOI18N
        jMenuHelf.setText("Trợ giúp");
        jMenuQuanLyLoaiSanPham.add(jMenuHelf);

        jMenuInfo.setForeground(new java.awt.Color(0, 255, 0));
        jMenuInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/INFO20.png"))); // NOI18N
        jMenuInfo.setText("Giới thiệu");
        jMenuInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuInfoMouseClicked(evt);
            }
        });
        jMenuQuanLyLoaiSanPham.add(jMenuInfo);

        jMenuLogOut.setForeground(new java.awt.Color(255, 0, 0));
        jMenuLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/POWER - SHUT DOWN20.png"))); // NOI18N
        jMenuLogOut.setText("Đăng xuất");
        jMenuLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuLogOutMouseClicked(evt);
            }
        });
        jMenuQuanLyLoaiSanPham.add(jMenuLogOut);

        setJMenuBar(jMenuQuanLyLoaiSanPham);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnQuanLyLoaiSanPham1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnQuanLyLoaiSanPham1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    }//GEN-LAST:event_formWindowOpened

    private void tblQuanlyLoaiSanPhamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblQuanlyLoaiSanPhamMouseClicked
        int ViTri = tblQuanlyLoaiSanPham.getSelectedRow();
        txtMaLoai.setText(tblQuanlyLoaiSanPham.getValueAt(ViTri, 0).toString());
        txtTenLoai.setText(tblQuanlyLoaiSanPham.getValueAt(ViTri, 1).toString());
        txtMoTa.setText(tblQuanlyLoaiSanPham.getValueAt(ViTri, 2).toString());
    }//GEN-LAST:event_tblQuanlyLoaiSanPhamMouseClicked

    private void tblQuanlyLoaiSanPhamKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblQuanlyLoaiSanPhamKeyReleased
        int ViTri = tblQuanlyLoaiSanPham.getSelectedRow();
        txtMaLoai.setText(tblQuanlyLoaiSanPham.getValueAt(ViTri, 0).toString());
        txtTenLoai.setText(tblQuanlyLoaiSanPham.getValueAt(ViTri, 1).toString());
        txtMoTa.setText(tblQuanlyLoaiSanPham.getValueAt(ViTri, 2).toString());
    }//GEN-LAST:event_tblQuanlyLoaiSanPhamKeyReleased

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        String TenLoai = txtTenLoai.getText();
        String MoTa = txtMoTa.getText();
        String CauTruyVan = "insert into LoaiSanPham values (N'" + TenLoai + "',N'" + MoTa + "')";
        if (TenLoai.equals("")) {
            ThongBao("Tên loại không được để trống!");
        } else if (MoTa.equals("")) {
            Duongnxpk00662.ConnectDB.ExcuteQueryUpdateDB(CauTruyVan);
            LayDuLieu();
        } else if (MoTa.length() < 11) {
            ThongBao("Mô tả phải lớn hơn 10 ký tự!");
        } else if (!MoTa.equals("")) {
            Duongnxpk00662.ConnectDB.ExcuteQueryUpdateDB(CauTruyVan);
            LayDuLieu();
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int[] MangViTri = tblQuanlyLoaiSanPham.getSelectedRows();
        for (int i = 0; i < MangViTri.length; i++) {
            String MaLoai = tblQuanlyLoaiSanPham.getValueAt(MangViTri[i], 0).toString();
            String CauTruyVan = "Delete from LoaiSanPham where MaLoai = " + MaLoai;
            Duongnxpk00662.ConnectDB.ExcuteQueryUpdateDB(CauTruyVan);
        }
        LayDuLieu();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String TenLoai = txtTenLoai.getText();
        String MoTa = txtMoTa.getText();
        String MaLoai = txtMaLoai.getText();
        String CauTruyVan = "Update LoaiSanPham Set TenLoai = N'" + TenLoai + "', MoTa = N'" + MoTa + "' where MaLoai = '"+MaLoai+"'";
        if (TenLoai.equals("")) {
            ThongBao("Tên loại không được để trống!");
        } else if (MoTa.equals("")) {
            Duongnxpk00662.ConnectDB.ExcuteQueryUpdateDB(CauTruyVan);
            LayDuLieu();
        } else if (MoTa.length() < 11) {
            ThongBao("Mô tả phải lớn hơn 10 ký tự!");
        } else if (!MoTa.equals("")) {
            Duongnxpk00662.ConnectDB.ExcuteQueryUpdateDB(CauTruyVan);
            LayDuLieu();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        txtMaLoai.setText("");
        txtTenLoai.setText("");
        txtMoTa.setText("");
        txtSearch.setText("");
        LayDuLieu();
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        String Search = txtSearch.getText();
        String CauTruyVan = "select * from LoaiSanPham where TenLoai like N'%" + Search + "%' or MoTa like N'%" + Search + "%'";
        if (!Search.equals("")) {
            ResultSet rs = Duongnxpk00662.ConnectDB.ExcuteQueryGetTable(CauTruyVan);
            Object[] obj = new Object[]{"Mã Loại", "Tên Loại", "Mô Tả"};
            DefaultTableModel TableModel = new DefaultTableModel(obj, 0);
            tblQuanlyLoaiSanPham.setModel(TableModel);

            try {
                while (rs.next()) {
                    Object[] item = new Object[3];
                    item[0] = rs.getInt("MaLoai");
                    item[1] = rs.getString("TenLoai");
                    item[2] = rs.getString("MoTa");
                    TableModel.addRow(item);
                }
            } catch (SQLException ex) {
                ThongBao("Lỗi Lấy Dữ Liệu!\n" + ex);
            }
        } else {
            ThongBao("Bạn Muốn Tìm Gì?\nHãy Nhập Vào Ô Tìm Kiếm ^^!");
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void jMenuInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuInfoMouseClicked
        frmInfo frm = new frmInfo();
        frm.show();
    }//GEN-LAST:event_jMenuInfoMouseClicked

    private void LayDuLieu() {
        String CauTruyVan = "Select * from LoaiSanPham";
        ResultSet rs = Duongnxpk00662.ConnectDB.ExcuteQueryGetTable(CauTruyVan);
        Object[] obj = new Object[]{"Mã Loại", "Tên Loại", "Mô Tả"};
        DefaultTableModel TableModel = new DefaultTableModel(obj, 0);
        tblQuanlyLoaiSanPham.setModel(TableModel);

        try {
            while (rs.next()) {
                Object[] item = new Object[3];
                item[0] = rs.getInt("MaLoai");
                item[1] = rs.getString("TenLoai");
                item[2] = rs.getString("MoTa");
                TableModel.addRow(item);
            }
        } catch (SQLException ex) {
            ThongBao("Lỗi Lấy Dữ Liệu!\n" + ex);
        }
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
            java.util.logging.Logger.getLogger(frmQuanLyLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmQuanLyLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmQuanLyLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmQuanLyLoaiSanPham.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmQuanLyLoaiSanPham().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JMenu jMenuHelf;
    private javax.swing.JMenu jMenuHome;
    private javax.swing.JMenu jMenuInfo;
    private javax.swing.JMenu jMenuLogOut;
    private javax.swing.JMenuBar jMenuQuanLyLoaiSanPham;
    private javax.swing.JMenu jMenuSetting;
    private javax.swing.JMenu jMenuSystem;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnQuanLyLoaiSanPham1;
    private javax.swing.JPanel jpnQuanLyLoaiSanPham2;
    private javax.swing.JLabel lblMaLoai;
    private javax.swing.JLabel lblMoTa;
    private javax.swing.JLabel lblQuanLyLoaiSanPham;
    private javax.swing.JLabel lblSearch;
    private javax.swing.JLabel lblTenLoai;
    private javax.swing.JLabel lblTool;
    private javax.swing.JTable tblQuanlyLoaiSanPham;
    private javax.swing.JTextField txtMaLoai;
    private javax.swing.JTextField txtMoTa;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenLoai;
    // End of variables declaration//GEN-END:variables
}
