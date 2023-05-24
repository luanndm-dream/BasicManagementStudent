/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import OBJ.DanhSachSinhVien;
import OBJ.SinhVien;

/**
 *
 * @author minhl
 */
public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachSinhVien dssv = new DanhSachSinhVien();
        int luaChon = 0;
        do{
            System.out.println("MENU-------------------");
            System.out.println("1. Add Sinh Vien. \n" 
                    +"2. Print Sinh Vien List. \n"
                    +"3. Kiem Tra DSSV Co Rong Hay Khong. \n"
                    +"4. Lay Ra So Luong Sinh Vien Co Trong Danh Sach. \n"
                    +"5. Lam Rong Danh Sach Sinh Vien. \n"
                    +"6. Kiem Tra Sinh Vien Co Ton Tai Trong Danh Sach Hay Khong = MSSV. \n"
                    +"7. Xoa 1 Sinh Vien = MSSV. \n"
                    +"8. Tim Kiem Tat Ca SV Dua Vao Ten. \n"
                    +"9. Xuat Ra DSSV Theo Diem Tu Cao Den Thap. \n"
                    +"0. Thoat Chuong Trinh"
                    );
            System.out.println("Vui long lua chon chuc nang: ");
            luaChon = sc.nextInt();
            sc.nextLine();
            if(luaChon == 1){
                System.out.println("Nhap MSV: ");
                String maSinhvien = sc.nextLine();
                System.out.println("Nhap Ho va Ten: ");
                String hoVaTen = sc.nextLine();
                System.out.println("Nhap Nam Sinh: ");
                int namSinh = sc.nextInt();
                System.out.println("Nhap Diem Trung Binh: ");
                float diemTrungBinh = sc.nextFloat();
                SinhVien sv = new SinhVien(maSinhvien, hoVaTen, namSinh, diemTrungBinh);
                dssv.themSinhVien(sv);
            }else if(luaChon == 2){
                dssv.inDanhSachSinhVien();
            }else if(luaChon == 3){
                boolean result = dssv.checkEmpty();
                if(result== true){
                    System.out.println("Danh Sach Rong");
                }else{
                    System.out.println("Danh Sach Ko Rong");
                }
            }else if(luaChon == 4){
                System.out.println("So Luong: " + dssv.laySoLuongSinhVien());
            }else if(luaChon == 5){
                System.out.println("Clear!");
                dssv.lamRongDanhSach();
            }else if(luaChon == 6){
                System.out.println("Nhap MSSV: ");
                String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("Sinh Vien co trong danh sach "+ dssv.checkSV(sv));
            }else if(luaChon == 7){
                
                System.out.println("Nhap MSSV: ");
                String maSinhVien = sc.nextLine();
                SinhVien sv = new SinhVien(maSinhVien);
                System.out.println("Da Xoa: "+ dssv.xoaSinhVien(sv));
                
                
            }else if(luaChon == 8){
                System.out.println("Nhap Ten: ");
                String ten = sc.nextLine();
                SinhVien sv = new SinhVien(ten);
                System.out.println("Ket Qua: ");
                dssv.timSinhVien(ten);
            }else if(luaChon == 9){
               dssv.sapXepSinhVienGiamDanTheoDiem();
               dssv.inDanhSachSinhVien();
            } 
            
        }while(luaChon<=10 && luaChon !=0);
    }
    
}
