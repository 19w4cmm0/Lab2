
package BT.Lab2;


import java.util.Scanner;
public class Menu {
    public static void menu(){
    
    
        System.out.println("#1.Giai phuong trinh bac nhat");
        System.out.println("#2.Giai phuong trinh bac hai");
        System.out.println("#3.Tinh tien dien");
        System.out.println("Chon chuc nang");
        System.out.println("+--------------------------------+");
        Scanner s = new Scanner(System.in);
        int chon = s.nextInt();
        switch(chon){
            case 1:
                System.out.print("a: ");
                float a=s.nextFloat();
                System.out.print("b: ");
                float b=s.nextFloat();
                PhuongTrinh.giaiPhuongTrinhBacNhat(a, b);
                break;
                
            case 2:
                System.out.print("a: ");
                a=s.nextFloat();
                System.out.print("b: ");
                b=s.nextFloat();
                System.out.print("c: ");
                float c=s.nextFloat();
                PhuongTrinh.giaiPhuongTrinhBacHai(a, b, c);
                break;
            case 3:
                TienDien.tinhTienDien();
                break;
            default:
                System.exit(0);
        }
    
}
    public static void main(String[] args)
    {
        System.out.println("+--------------------------------+");
            menu();
    }
}