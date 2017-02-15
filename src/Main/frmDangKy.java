/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author DuongAli
 */
public class frmDangKy extends javax.swing.JFrame {

    String string = "src\\images\\DangKy.png";

    /**
     * Creates new form frmDangKy
     */
    public frmDangKy() {
        initComponents();
        getRootPane().setDefaultButton(btnSignUp);
    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupSex = new javax.swing.ButtonGroup();
        jplSignUp = new javax.swing.JPanel(){
            ImageIcon icon = new ImageIcon(string);
            public void paintComponent(Graphics g) {
                Dimension d = this.getSize();
                g.drawImage(icon.getImage(),0,0,d.width,d.height,null);
                setOpaque(false);
                super.paintComponent(g); }
        };
        lblUserName = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        lblPassWord = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        lblBirthday = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        txtBirthday = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        cbxCheckSignUp = new javax.swing.JCheckBox();
        btnSignUp = new javax.swing.JButton();
        txtPassWord = new javax.swing.JPasswordField();
        lblRetypePassword = new javax.swing.JLabel();
        txtRetypePass = new javax.swing.JPasswordField();
        lblDangKy = new javax.swing.JLabel();
        btnExit = new javax.swing.JButton();
        RdoBtnMale = new javax.swing.JRadioButton();
        RdoBtnFemale = new javax.swing.JRadioButton();
        lblSex = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jplSignUp.setBackground(new java.awt.Color(0, 0, 0));

        lblUserName.setForeground(new java.awt.Color(240, 240, 240));
        lblUserName.setText("Tên Đăng Nhập");

        txtUserName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lblPassWord.setForeground(new java.awt.Color(240, 240, 240));
        lblPassWord.setText("Mật Khẩu");

        lblFullName.setForeground(new java.awt.Color(240, 240, 240));
        lblFullName.setText("Tên Người Dùng");

        lblAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblAddress.setText("Địa Chỉ");

        lblBirthday.setForeground(new java.awt.Color(255, 255, 255));
        lblBirthday.setText("Ngày Sinh");

        lblPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblPhone.setText("Số Điện Thoại");

        txtFullName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtBirthday.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        txtPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        cbxCheckSignUp.setBackground(new java.awt.Color(0, 0, 0));
        cbxCheckSignUp.setForeground(new java.awt.Color(255, 255, 255));
        cbxCheckSignUp.setText("Đã đọc và chấp nhận điều khoản dịch vụ");

        btnSignUp.setBackground(new java.awt.Color(0, 0, 0));
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/dangky.png"))); // NOI18N
        btnSignUp.setText("Đăng Ký");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        txtPassWord.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        txtPassWord.setCaretColor(new java.awt.Color(0, 0, 153));

        lblRetypePassword.setForeground(new java.awt.Color(240, 240, 240));
        lblRetypePassword.setText("Nhập Lại Mật Khẩu");

        txtRetypePass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        lblDangKy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDangKy.setForeground(new java.awt.Color(240, 240, 240));
        lblDangKy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/NOTEPAD.png"))); // NOI18N
        lblDangKy.setText("ĐĂNG KÝ");

        btnExit.setBackground(new java.awt.Color(0, 0, 0));
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/RAPID SHARE.png"))); // NOI18N
        btnExit.setText("Thoát");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        RdoBtnMale.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroupSex.add(RdoBtnMale);
        RdoBtnMale.setForeground(new java.awt.Color(255, 255, 255));
        RdoBtnMale.setSelected(true);
        RdoBtnMale.setText("Nam");

        RdoBtnFemale.setBackground(new java.awt.Color(0, 0, 0));
        buttonGroupSex.add(RdoBtnFemale);
        RdoBtnFemale.setForeground(new java.awt.Color(255, 255, 255));
        RdoBtnFemale.setText("Nữ");

        lblSex.setForeground(new java.awt.Color(255, 255, 255));
        lblSex.setText("Gới Tính");

        javax.swing.GroupLayout jplSignUpLayout = new javax.swing.GroupLayout(jplSignUp);
        jplSignUp.setLayout(jplSignUpLayout);
        jplSignUpLayout.setHorizontalGroup(
            jplSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplSignUpLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jplSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSex)
                    .addComponent(lblPhone)
                    .addComponent(lblAddress)
                    .addComponent(lblBirthday)
                    .addComponent(lblFullName)
                    .addComponent(lblUserName)
                    .addComponent(lblRetypePassword)
                    .addComponent(lblPassWord))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jplSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jplSignUpLayout.createSequentialGroup()
                        .addComponent(btnSignUp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnExit))
                    .addGroup(jplSignUpLayout.createSequentialGroup()
                        .addComponent(RdoBtnMale)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(RdoBtnFemale))
                    .addGroup(jplSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblDangKy)
                        .addComponent(txtBirthday, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                        .addComponent(txtFullName)
                        .addComponent(txtRetypePass)
                        .addComponent(txtPassWord)
                        .addComponent(txtUserName)
                        .addComponent(txtAddress)
                        .addComponent(txtPhone))
                    .addComponent(cbxCheckSignUp))
                .addGap(24, 24, 24))
        );
        jplSignUpLayout.setVerticalGroup(
            jplSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jplSignUpLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lblDangKy)
                .addGap(28, 28, 28)
                .addGroup(jplSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassWord)
                    .addComponent(txtPassWord, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRetypePassword)
                    .addComponent(txtRetypePass, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jplSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFullName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBirthday, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblBirthday))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jplSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPhone))
                .addGap(15, 15, 15)
                .addGroup(jplSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RdoBtnMale)
                    .addComponent(RdoBtnFemale)
                    .addComponent(lblSex))
                .addGap(18, 18, 18)
                .addComponent(cbxCheckSignUp)
                .addGap(7, 7, 7)
                .addGroup(jplSignUpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExit)
                    .addComponent(btnSignUp))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jplSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jplSignUp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        String TenDangNhap = txtUserName.getText();
        String PassWord = txtPassWord.getText().trim();
        String RetypePass = txtRetypePass.getText().trim();
        String FullName = txtFullName.getText();
        String Birthday = txtBirthday.getText();
        String Address = txtAddress.getText();
        String Phone = txtPhone.getText();
        int Sex = 1;

        if (TenDangNhap.equals("")) {
            ThongBao("Tên đăng nhập không được để trống!", "Lỗi Tên Đăng Nhập", 2);
        } else if (TenDangNhap.length() < 6) {
            ThongBao("Tên đăng nhập phải lớn hơn 5 ký tự!", "Lỗi Tên Đăng Nhập", 2);
        } else if (Duongnxpk00662.KiemTra.KiemTraWhitespace(TenDangNhap)) {
            ThongBao("Tên đăng nhập không được nhập dấu cách!", "Lỗi Tên Đăng Nhập", 2);
        } else if (Duongnxpk00662.KiemTra.KiemTraUser(TenDangNhap)) {
            ThongBao("Tên đăng nhập đã được sử dụng!", "Lỗi Tên Đăng Nhập", 2);
        } else if (PassWord.equals("")) {
            ThongBao("Mật khẩu không được để trống!", "Lỗi mật khẩu", 2);
        } else if (PassWord.length() < 6) {
            ThongBao("Mật khẩu nhập phải lớn hơn 5 ký tự!", "Lỗi Mật Khẩu", 2);
        } else if (!Duongnxpk00662.KiemTra.KiemTraCoChuaChuKhong(PassWord)) {
            ThongBao("Mật khẩu thiếu chữ\nBạn phải nhập chữ và số!", "Lỗi Mật Khẩu", 2);
        } else if (!Duongnxpk00662.KiemTra.KiemTraCoChuaSoKhong(PassWord)) {
            ThongBao("Mật khẩu thiếu số\nBạn phải nhập chữ và số!", "Lỗi Mật Khẩu", 2);
        } else if (!RetypePass.equals(PassWord)) {
            ThongBao("Mật khẩu không trùng khớp!", "Lỗi Nhập Lại Mật Khẩu", 2);
        } else if (FullName.equals("")) {
            ThongBao("Tên người dùng không được để trống!", "Lỗi Tên Người Dùng", 2);
        } else if (!Duongnxpk00662.KiemTra.KiemTraCoChuaChuKhong(FullName)) {
            ThongBao("Tên người dùng không được chứa số!", "Lỗi Tên Người Dùng", 2);
        } else if (FullName.length() < 6) {
            ThongBao("Tên người dùng phải lớn hơn 5 ký tự", "Lỗi Tên Người Dùng", 2);
        } else if (Birthday.equals("")) {
            ThongBao("Ngày sinh không được để trống!", "Lỗi Ngày Sinh", 2);
        } else if (!Duongnxpk00662.KiemTra.KiemTraCoChuaSoKhong(Birthday)) {
            ThongBao("Ngày sinh bắt buộc phải là số!", "Lỗi Ngày Sinh", 2);
        } else if (!Duongnxpk00662.KiemTra.KiemTraDate(Birthday)) {
            ThongBao("Lỗi cú pháp!\nĐiền theo mẫu sau: Năm/Tháng/Ngày\nVí Dụ: 2016/05/31", "Lỗi Ngày Sinh", 2);
        } else if (Address.equals("")) {
            ThongBao("Địa chỉ không được để trống", "Lỗi Địa Chỉ", 2);
        } else if (cbxCheckSignUp.isSelected() == false) {
            ThongBao("Bạn phải chấp nhận điều khoản dịch vụ!", "Lỗi Check", 2);
        } else if (Duongnxpk00662.KiemTra.KiemTraWhitespace(Phone)) {
            ThongBao("Số điện thoại không được nhập khoảng trắng!", "Lỗi Số Điện Thoại", 2);
        } else if (Phone.equals("") && RdoBtnFemale.isSelected() == true) {
            Sex = 0;
            String CauTruyVan = "insert into TaiKhoan values (N'" + TenDangNhap + "',N'" + PassWord + "',3)"
                    + "insert into KhachHang values (N'" + FullName + "','" + Sex + "','" + Birthday + "',N'" + Address + "','" + Phone + "')";
            ThongBao("Đăng ký thành công!", "Đăng Ký", 2);
            Duongnxpk00662.ConnectDB.ExcuteQueryUpdateDB(CauTruyVan);
            frmDangNhap frm = new frmDangNhap();
            frm.show();
            this.dispose();
        } else if (Phone.equals("") && RdoBtnFemale.isSelected() == false) {
            ThongBao("Đăng ký thành công!", "Đăng Ký", 2);
            String CauTruyVan = "insert into TaiKhoan values (N'" + TenDangNhap + "',N'" + PassWord + "',3)"
                    + "insert into KhachHang values (N'" + FullName + "','" + Sex + "','" + Birthday + "',N'" + Address + "','" + Phone + "')";
            Duongnxpk00662.ConnectDB.ExcuteQueryUpdateDB(CauTruyVan);
            frmDangNhap frm = new frmDangNhap();
            frm.show();
            this.dispose();
        } else if (!Duongnxpk00662.KiemTra.KiemTraCoChuaSoKhong(Phone)) {
            ThongBao("Số điện thoại bắt buộc phải là số!", "Lỗi Số Điện Thoại", 2);
        } else if (Phone.length() < 10 || Phone.length() > 11) {
            ThongBao("Số điện thoại phải từ 10-11 chữ số!", "Lỗi Số Điện Thoại", 2);
        } else if (cbxCheckSignUp.isSelected() == false) {
            ThongBao("Bạn phải chấp nhận điều khoản dịch vụ!", "Lỗi Check", 2);
        } else if (!Phone.equals("") && RdoBtnFemale.isSelected() == true) {
            Sex = 0;
            String CauTruyVan = "insert into TaiKhoan values (N'" + TenDangNhap + "',N'" + PassWord + "',3)"
                    + "insert into KhachHang values (N'" + FullName + "','" + Sex + "','" + Birthday + "',N'" + Address + "','" + Phone + "')";
            ThongBao("Đăng ký thành công!", "Đăng Ký", 2);
            Duongnxpk00662.ConnectDB.ExcuteQueryUpdateDB(CauTruyVan);
            frmDangNhap frm = new frmDangNhap();
            frm.show();
            this.dispose();
        } else {
            ThongBao("Đăng ký thành công!", "Đăng Ký", 2);
            String CauTruyVan = "insert into TaiKhoan values (N'" + TenDangNhap + "',N'" + PassWord + "',3)"
                    + "insert into KhachHang values (N'" + FullName + "','" + Sex + "','" + Birthday + "',N'" + Address + "','" + Phone + "')";
            Duongnxpk00662.ConnectDB.ExcuteQueryUpdateDB(CauTruyVan);
            frmDangNhap frm = new frmDangNhap();
            frm.show();
            this.dispose();
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        frmDangNhap frm = new frmDangNhap();
        frm.show();
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    //Thông báo DiaLog
    private void ThongBao(String NoiDungThongBao, String TieuDeThongBao, int icon) {
        JOptionPane.showMessageDialog(this, NoiDungThongBao, TieuDeThongBao, icon);
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
            java.util.logging.Logger.getLogger(frmDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmDangKy.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmDangKy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RdoBtnFemale;
    private javax.swing.JRadioButton RdoBtnMale;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnSignUp;
    private javax.swing.ButtonGroup buttonGroupSex;
    private javax.swing.JCheckBox cbxCheckSignUp;
    private javax.swing.JPanel jplSignUp;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBirthday;
    private javax.swing.JLabel lblDangKy;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblPassWord;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblRetypePassword;
    private javax.swing.JLabel lblSex;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBirthday;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JPasswordField txtPassWord;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JPasswordField txtRetypePass;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
