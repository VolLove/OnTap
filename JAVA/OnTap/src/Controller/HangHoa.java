/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.Date;

/**
 *
 * @author cauml
 */
public class HangHoa {
    private int maHang, soLuong;
    private String tenHang, noiSanXuat;
    private double gia;
    private Date ngaySanXuat;

    public HangHoa(int maHang, int soLuong, String tenHang, String noiSanXuat, double gia, Date ngaySanXuat) throws IllegalAccessError, IllegalAccessException{
        if (maHang <= 0 || tenHang.equals("") || gia <= 0 || noiSanXuat.equals("") || ngaySanXuat.equals("")){
            throw new IllegalAccessException("Tham so khong hop le");
        } else {
            this.maHang = maHang;
            this.soLuong = soLuong;
            this.tenHang = tenHang;
            this.noiSanXuat = noiSanXuat;
            this.gia = gia;
            this.ngaySanXuat = ngaySanXuat;
            }
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getNoiSanXuat() {
        return noiSanXuat;
    }

    public void setNoiSanXuat(String noiSanXuat) {
        this.noiSanXuat = noiSanXuat;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }
    
    public HangHoa(){
        
    }
}
