package q1;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
         PhoneBook book = new PhoneBook();
         while (true){
             System.out.println("1.Nhap so dien thoai");
             System.out.println("2.Tim so dien thoai theo vung");
             System.out.println("3.Hien thi danh sach");
             System.out.println("4.Hien thi tong so dien theo tung vung ");
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
                     break;
                 }
                 case 3:{
                     book.hienThi();
                     break;
                 }
                 case 4:{
                     break;
                 }
                 case 5:{
                     break;
                 }
                 case 0: System.exit(0);
             }
         }
    }
    
}
