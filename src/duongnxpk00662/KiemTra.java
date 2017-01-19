/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duongnxpk00662;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DuongAli
 */
public class KiemTra {
    
    //Kiểm Tra Khoảng Trắng
    public boolean KiemTraWhitespace(String TenDangNhap) {
        boolean ketqua = false;
        if (TenDangNhap.replaceAll("(^\\s+|\\s+$|\\s+)", "").length() != TenDangNhap.length()) {
            ketqua = true;
        }
        return ketqua;
    }

    //Kiểm Tra User Có Bị Trùng Không
    public boolean KiemTraUser(String TenDangNhap) {
        boolean ketqua = false;

        String cautruyvan = "select * from TaiKhoan where TenTaiKhoan = N'" + TenDangNhap + "'";
        ResultSet rss = Duongnxpk00662.ConnectDB.ExcuteQueryGetTable(cautruyvan);

        try {
            while (rss.next()) {
                if (rss.getString("TenTaiKhoan").equals(TenDangNhap)) {
                    ketqua = true;
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error!");
        }

        return ketqua;
    }

    //Kiểm Tra Định Dạng Date
    public boolean KiemTraDate(String DateKiemTra) {
        boolean KetQua = false;
        Pattern p = Pattern.compile("\\d{4}-\\d{1,2}-|/\\d{1,2}");
        Matcher m = p.matcher(DateKiemTra);
        KetQua = m.find();
        return KetQua;
    }

    //Kiểm Tra Có Chứa Chữ Không
    public boolean KiemTraCoChuaChuKhong(String ChuoiKiemTra) {
        boolean ketQua = false;
        Pattern p = Pattern.compile(".*[a-zA-Z].*");
        Matcher m = p.matcher(ChuoiKiemTra);
        ketQua = m.find();
        return ketQua;
    }

    //Kiểm Tra Có Chứa Số Không
    public boolean KiemTraCoChuaSoKhong(String ChuoiKiemTra) {
        boolean ketQua = false;
        Pattern p = Pattern.compile("[0-9]");
        Matcher m = p.matcher(ChuoiKiemTra);
        ketQua = m.find();
        return ketQua;
    }
    
    //Kiểm Tra Ký Tự
    public boolean KiemTraKyTu(String ChuoiKiemTra) {
        boolean ketQua = false;
        Pattern p = Pattern.compile("-");
        Matcher m = p.matcher(ChuoiKiemTra);
        ketQua = m.find();
        return ketQua;
    }
}
