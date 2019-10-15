package q1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
         PhoneBook book = new PhoneBook();
         while (true){
             System.out.println("1.Nhap so dien thoai");
             System.out.println("2.Tim so dien thoai theo vung");
             System.out.println("3.Hien thi danh sach");
             System.out.println("4.Hien thi tong so dien thoai theo tung vung ");
             System.out.println("5.Tim so dien thoai theo duoi");
             System.out.println("0.Exit");
             System.out.print("Moi chon: ");
             int op;
             Scanner in = new Scanner(System.in);
             op = Integer.parseInt(in.nextLine());
             switch(op){
                 case 1:{
                     book.Input();
                     break;
                 }
                 case 2:{
                     System.out.print("Nhap ma vung can tim kiem: ");
                     int mavung = Integer.parseInt(in.nextLine());
                     book.searchByArea(mavung);
                     break;
                 }
                 case 3:{
                     book.hienThi();
                     break;
                 }
                 case 4:{
                     book.demTheoVung();
                     break;
                 }
                 case 5:{
                     String duoi;
                     while (true){
                         System.out.print("Nhap duoi can tim: ");
                         duoi = in.nextLine();
                         if (duoi.matches("\\d+")) break;
                         System.out.println("Chi nhap cac so");
                     }
                     book.timKiemTheoDuoi(duoi);
                     break;
                 }
                 case 0: System.exit(0);
             }
         }
    }
    
}
