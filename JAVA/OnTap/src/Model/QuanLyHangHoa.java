/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import Controller.HangHoa;

/**
 *
 * @author cauml
 */
public class QuanLyHangHoa {
    public ArrayList<HangHoa> listHangHoa;
    
    public QuanLyHangHoa(){
        this.listHangHoa = new ArrayList<HangHoa>();
    }
    public boolean themHangHoa(HangHoa hangHoa){
        return listHangHoa.add(hangHoa);
    }
    public boolean xoaHangHoa(int maHang){
        for(HangHoa hangHoa : listHangHoa){
            if(hangHoa.getMaHang() == maHang){
                listHangHoa.remove(hangHoa);
                return true;
            }
        }
        return false;
    }
    public boolean suaHangHoa(int maHang, HangHoa hh){
        for(int i = 0; i < listHangHoa.size(); i++){
            if(listHangHoa.get(i).getMaHang() == maHang){
                listHangHoa.set(i, hh);
                return true;
            }
        }
        return false;
    }
    public ArrayList<HangHoa> layListHangHaCoLonHonSoLuong(int soLuong){
        ArrayList<HangHoa> listHangHoaSoLuong = (ArrayList<HangHoa>) listHangHoa.clone();
        listHangHoaSoLuong.clear();
        for(HangHoa hangHoa : listHangHoa){
            if(hangHoa.getSoLuong() > soLuong){
                listHangHoaSoLuong.add(hangHoa);
            }
        }
        return listHangHoaSoLuong;
    }
    public ArrayList<HangHoa> sapXepHangHoa(){
        ArrayList<HangHoa> listSapXep = (ArrayList<HangHoa>) listHangHoa.clone();
        Collections.sort(listSapXep, new Comparator<HangHoa>(){
            @Override
            public int compare(HangHoa h1, HangHoa h2) {
                double donGia = (h1.getGia() * h1.getSoLuong());
                double donGia2 = (h2.getGia() * h2.getSoLuong());
                var noiSanXuat = h1.getNoiSanXuat().compareTo(h2.getNoiSanXuat());
                if(noiSanXuat != 0){
                    return noiSanXuat;
                } else {
                    var donGiaCompare = Double.compare(donGia, donGia2);
                    return donGiaCompare;
                }
            }
            
        });
        return listSapXep;
    }
    public double tongTien(){
        double total = 0;
        for(HangHoa hangHoa : listHangHoa){
            total += (hangHoa.getGia() * hangHoa.getSoLuong());
        }
        return total;
    }
    public static void ghiDSHH(String fileName, ArrayList<HangHoa> dshh){
        try {
            File f = new File(fileName);
            FileWriter fr = new FileWriter(f);
            for(int i = 0; i < dshh.size(); i++){
                if(i == dshh.size() - 1){
                    fr.write(dshh.get(i).toString());
                } else {
                    fr.write(dshh.get(i).toString() + "\n");
                }
            }
            fr.close();
        } catch (Exception e) {
            System.out.println("Loi ghi file " + e);
        }
    }
    public static void docDSHH(String fileName) throws FileNotFoundException, IOException{
        File f = new File(fileName);
        FileReader fis = new FileReader(f);
        BufferedReader br = new BufferedReader(fis);
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
    }
    public String hienThi(){
        return listHangHoa.toString();
    }
}
