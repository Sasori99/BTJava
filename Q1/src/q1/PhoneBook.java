package q1;

import java.util.ArrayList;
import java.util.Scanner;

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
            System.out.println("1.Nhap so noi vung");
            System.out.println("2.Nhap so quoc te");
            System.out.print("Moi chon: ");
            op = Integer.parseInt(in.nextLine());
            if (op == 1 || op == 2) break;
            else System.out.println("Chi nhap 1 hoac 2");
        }
        System.out.println("=============Danh ba=============");
        for(PhoneNumber p : list)
            System.out.println(p.toString());
        System.out.println("=================================");
    }
    
    public void searchByArea(int area){
        for(PhoneNumber p : list);
    }
}
