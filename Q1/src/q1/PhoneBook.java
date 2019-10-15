package q1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PhoneBook {
    ArrayList<PhoneNumber> list;

    public PhoneBook() {
        list = new ArrayList<>();
    }
    
    public void Input(){
        int op;
        Scanner in  = new Scanner(System.in);
        while (true){
            System.out.println("1.Nhap so noi vung");
            System.out.println("2.Nhap so quoc te");
            System.out.print("Moi chon: ");
            op = Integer.parseInt(in.nextLine());
            if (op == 1 || op == 2) break;
            else System.out.println("Chi nhap 1 hoac 2");
        }
        if (op == 1) InputNV();
        else InputQT();
    }
    private PhoneNumber Init(){
        PhoneNumber p = new PhoneNumber();
        Scanner in = new Scanner(System.in);
        int vung;
        String sdt;
        String tmp;
        while (true){
            System.out.print("Nhap ma vung: ");
            tmp = in.nextLine();
            int x = Integer.parseInt(tmp);
            if ((tmp.matches("\\d+")) && (x >= 100) && (x <= 9999)) break;
            System.out.println("Chi nhap day so co 3 hoac 4 chu so");
        }
        vung = Integer.parseInt(tmp);
        while (true){
            System.out.print("Nhap so dien thoai: ");
            sdt = in.nextLine();
         
            if (sdt.matches("\\d+")) break;
            System.out.println("Chi nhap day so");
        }
        p = new PhoneNumber(vung,sdt);
        return p;
    }
    private void InputNV(){
        PhoneNumber p = Init();
        list.add(p);
    }
    
    private void InputQT(){
        int maQG;
        Scanner in = new Scanner(System.in);
        String tmp;
        while (true){
            System.out.print("Nhap ma quoc gia: ");
            tmp = in.nextLine(); 
            if (tmp.matches("\\d+")) break;
            System.out.println("Chi nhap day so");
        }
        maQG = Integer.parseInt(tmp);
        PhoneNumber p = Init();
        list.add(new IntPhoneNumber(maQG,p.getMaVung(),p.getSdt()));
    }
    
    public void hienThi(){
        int op;
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.println("1.Danh ba trong nuoc");
            System.out.println("2.Danh ba quoc te");
            System.out.println("3 danh ba ");
            System.out.print("Moi chon: ");
            op = Integer.parseInt(in.nextLine());
            if (op == 1 || op == 2 || op == 3) break;
            else System.out.println("Chi nhap tu 1 den 3");
        }
        if (op == 1) hienThiNV();
        if (op == 2) hienThiQT();
        if (op == 3) hienThiCaDS();
    }
    
    public void hienThiCaDS(){
        System.out.println("=============Danh ba=============");
        for(PhoneNumber p : list)
            System.out.println(p.toString());
        System.out.println("=================================");
    }
    
    public void hienThiNV(){
        System.out.println("==========Danh ba noi vung==========");
        for(PhoneNumber p : list)
            if (!(p instanceof IntPhoneNumber))  System.out.println(p.toString());
        System.out.println("====================================");
    }
    
    public void hienThiQT(){
        System.out.println("==========Danh ba quoc te===========");
        for(PhoneNumber p : list)
            if (p instanceof IntPhoneNumber)  System.out.println(p.toString());
        System.out.println("====================================");
    }
    
    public void searchByArea(int area){
        System.out.println("Danh sach dien thoai co ma vung " + area + " la:");
        for(PhoneNumber p : list)
            if (p.getMaVung() == area)  System.out.println(p.toString());
    }
    
    private Integer[] phanLoaiVung(){
        Set<Integer> ls = new HashSet<Integer>();
        for(PhoneNumber p : list)
            ls.add(p.getMaVung());
        return ls.toArray(new Integer[ls.size()]);
    }
    
    public void demTheoVung(){
        Integer[] ls = phanLoaiVung();
        for(Integer i:ls){
            int cnt = 0;
            for(PhoneNumber p : list)
                if (p.getMaVung() == i) cnt++;
            System.out.println("So luong so dien thoai co ma vung " + i + " la: " + cnt);
        }
    }
    
    public void timKiemTheoDuoi(String duoi){
        System.out.println("Danh sach dien thoai co duoi " + duoi + " la: ");
        boolean check = true;
        for(PhoneNumber p : list) {
            if (p.getSdt().contains(duoi)) {
                System.out.println(p.toString());
                check = false;
            }
        }
        if (check)System.out.println("Khong ton tai!!!!");
    }
}
    