/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BT.Lab2;

import java.util.Scanner;
public class TienDien {
    public static void tinhTienDien(){
        float soDien;
        float tienDien;
        Scanner scanner = new Scanner(System.in);
        System.out.print("so dien= ");
        soDien = scanner.nextFloat();
        if(soDien<=50)
        {
            tienDien=soDien*1000;
        }
        else
        {
            tienDien=50*1000+(soDien-50)*1200;
        }
        System.out.printf("Tien dien: %f", tienDien);
        
    }
    public static void main(String[] args) {
        tinhTienDien();
        
    }
    
}

    

