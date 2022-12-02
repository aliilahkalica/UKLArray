/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uklarray;

import java.util.Scanner;

/**
 *
 * @author Aliilah
 */
public class UklArray {
public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
      String [][] nama = {{"Adi", "Budi", "Ollie", "Watson"},{"Bagas","Rudi","zeta","Taher"}};
        int [][] nisn = {{1234,5678,1020,1030},{1050,1060,1070,1090}};
         System.out.println("Masukkan NISN: ");
        int pilihan = scan.nextInt();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 4; j++) {
                if(nisn [i][j]==(pilihan)){
                    System.out.println("Nama: "+nama [i][j]);
                    System.out.println("NISN: "+nisn [i][j]);
                    break;
                
//                Scanner scan = new Scanner(System.in);
//                System.out.println("Masukkan nama yang anda inginkan");
//                String pilihan = scan.nextLine();
//                String nama [][] = {{"ollie", "Watson", "Amelia"},{"Beni", "Zea","Taka"}};
//                String kelas [][] = {{"X RPL 2","X RPL 3","X RPL 1"},{"X RPL 5","X RPL 7","X RPL 8"}};
//                for (int z = 0; z < 2; z++) {
//                    for (int x = 0; x < 3; x++) 
//                        if (nama [z][x].equalsIgnoreCase(pilihan)) {
//                            System.out.println("nama: "+nama [z][x]);
//                            System.out.println("kelas: "+kelas[z][x]);
//                            break;
//                            
                        }
                        
                    }
            
        }
    }
   
        }
    

