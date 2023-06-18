/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import Controller.HangHoa;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author cauml
 */
public class QuanLyHangHoaTest {
    @Test
    public void testContructer() throws IllegalAccessException{
        System.out.println("Test contructer hop le");
        HangHoa hh1 = new HangHoa(1, 10, "Bia", "HCM", 20000000, new Date());
    }
    @Test(expected = IllegalAccessException.class)
    public void testContructer_AbNormal() throws IllegalAccessException{
        System.out.println("Test contructer khong hop le");
        HangHoa hh1 = new HangHoa(1, -10, "Bia", "HCM", -200000, new Date());
    } 
    @Test
    public void testThemHangHoa(){
        System.out.println("Them hang hoa");
        HangHoa hh1 = new HangHoa();
        QuanLyHangHoa instance = new QuanLyHangHoa();
        boolean expResult = true;
        boolean result = instance.themHangHoa(hh1);
        assertEquals(expResult, result);
    }
    @Test
    public void testXoaHangHoa() throws IllegalAccessException{
        System.out.println("Xoa hang hoa");
        HangHoa hh1 = new HangHoa(4, 10, "Bia", "HCM", 200000, new Date());
        QuanLyHangHoa instance = new QuanLyHangHoa();
        instance.themHangHoa(hh1);
        int maHang = 4;
        boolean expResult = true;
        boolean result = instance.xoaHangHoa(maHang);
        assertEquals(expResult, result);
    }
    @Test
    public void testSuaHangHoa() throws IllegalAccessException{
        System.out.println("SuaHangHoa");
        HangHoa hh1 = new HangHoa(4, 10, "Bia", "HCM", 2000000, new Date());
        QuanLyHangHoa instance = new QuanLyHangHoa();
        instance.themHangHoa(hh1);
        int maHang = 4;
        HangHoa hh2 = new HangHoa(4, 10, "quanrin", "HCM", 20000, new Date());
        boolean expResult = true;
        boolean result = instance.suaHangHoa(maHang, hh2);
        assertEquals(expResult, result);
    }
    @Test
    public void testLayListHangHoaCoLonSoLuong() throws IllegalAccessException{
        System.out.println("LayList Hang Hoa Co Lon So Luong");
        HangHoa hh1 = new HangHoa(1, 10, "Quan dai", "HCM", 20000, new Date());
        HangHoa hh2 = new HangHoa(2, 12, "Quan dui", "HN", 25000, new Date());
        HangHoa hh3 = new HangHoa(3, 15, "Quan thun", "Hue", 30000, new Date());
        HangHoa hh4 = new HangHoa(4, 14, "Ao thun", "HCM", 50000, new Date());
        QuanLyHangHoa instance = new QuanLyHangHoa();
        instance.themHangHoa(hh1);
        instance.themHangHoa(hh2);
        instance.themHangHoa(hh3);
        instance.themHangHoa(hh4);
        int soLuong = 12;
        ArrayList<HangHoa> expResult = instance.layListHangHaCoLonHonSoLuong(soLuong);
        ArrayList<HangHoa> result = instance.layListHangHaCoLonHonSoLuong(soLuong);
        assertEquals(expResult, result);
    }
    @Test
    public void testSepXepHangHoa() throws IllegalAccessException{
        System.out.println("Sap xep hang hoa");
        HangHoa hh1 = new HangHoa(1, 10, "Quan dai", "HCM", 20000, new Date());
        HangHoa hh2 = new HangHoa(2, 12, "Quan dui", "HN", 25000, new Date());
        HangHoa hh3 = new HangHoa(3, 15, "Quan thun", "Hue", 30000, new Date());
        HangHoa hh4 = new HangHoa(4, 14, "Ao thun", "HCM", 50000, new Date());
        HangHoa hh5 = new HangHoa(5, 10, "Ao rin", "HN", 10000, new Date());
        QuanLyHangHoa instance = new QuanLyHangHoa();
        instance.themHangHoa(hh1);
        instance.themHangHoa(hh2);
        instance.themHangHoa(hh3);
        instance.themHangHoa(hh4);
        instance.themHangHoa(hh5);
        ArrayList<HangHoa> expResult = instance.sapXepHangHoa();
        
        QuanLyHangHoa dsMoi = new QuanLyHangHoa();
        dsMoi.themHangHoa(hh1);
        dsMoi.themHangHoa(hh2);
        dsMoi.themHangHoa(hh3);
        dsMoi.themHangHoa(hh4);
        dsMoi.themHangHoa(hh5);
        
        ArrayList<HangHoa> result = dsMoi.sapXepHangHoa();
        assertEquals(expResult, result);
        
    }
    @Test
    public void testTongTien() throws IllegalAccessException{
        System.out.println("Tong tien");
        HangHoa hh1 = new HangHoa(1, 5, "Quan dai", "HCM", 20000, new Date());
        HangHoa hh2 = new HangHoa(2, 4, "Quan dui", "HN", 25000, new Date());
        HangHoa hh3 = new HangHoa(3, 2, "Quan thun", "Hue", 30000, new Date());
        HangHoa hh4 = new HangHoa(4, 3, "Ao thun", "HCM", 50000, new Date());
        QuanLyHangHoa instance = new QuanLyHangHoa();
        instance.themHangHoa(hh1);
        instance.themHangHoa(hh2);
        instance.themHangHoa(hh3);
        instance.themHangHoa(hh4);
        double expResult = 28000;
        double result = instance.tongTien();
        assertEquals(expResult, result, 0);
    }
    @Test
    public void testGhiDSHH(){
        System.out.println("GhiDSHH");
        String fileName = "D:\\danhsach_hanghoa.txt";
        ArrayList<HangHoa> dshh = null;
        QuanLyHangHoa.ghiDSHH(fileName, dshh);
    }
    @Test
    public void testDocDSHH() throws Exception {
        System.out.println("DocDSHH");
        String fileName = "D:\\danhsach_hanghoa.txt";
        QuanLyHangHoa.docDSHH(fileName);
    }
    
}
