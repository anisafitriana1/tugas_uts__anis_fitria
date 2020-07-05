/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project_srderhana;

import java.util.Scanner;

/**
 *
 * @author OWNER
 */
public class project {

    /**
     * @param args the command line arguments
     */
 
         public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pesan, pilih; 
        String nama;
        System.out.print("siapa nama anda:");
        nama = input.next();
        System.out.print("apa warna kesukaan anda ?");
        nama = input.next();
        
        System.out.print("warna pilihan: \n [1]. biru \n [2]. merah \n [3]. putih");
        System.out.print("\n Masukkan pilihan :");
        pilih = input.nextInt();
        
        
        System.out.println("================");
             Scanner scan = new Scanner(System.in);
        switch(pilih){       
                
            case 1 : 
                System.out.println("Nama :"+nama);
                System.out.println("suka warna biru");
                
                boolean running = true;
            String jawab;
       
            int counter = 0;
            
          while (running) {
              System.out.println("apakah anda menyukai warna biru ?");
              System.out.println("jawab [iya / tidak]");
              
              

              
              jawab = scan.nextLine();
              
        // cek jawabannya, kalau pesan maka berhenti
        if (jawab.equalsIgnoreCase("tidak") ){
            running = false;
        }
        counter++;
          }  
                System.out.println("anda sudah melakukan pemilihn warna biru" + counter );
         
                
                break;
            case 2 :
                System.out.println("Nama :"+nama);
                System.out.println("suka warna merah");
                
                boolean running1 = true;
            String jawab1;
            
            int counter1 = 0;
            
          while (running1) {
            System.out.println("apakah anda menyukai warna mereh?");
            System.out.println("jawab [iya / tidak]");
              
              
              jawab = scan.nextLine();
              
        // cek jawabannya, kalau pesan maka berhenti
        if (jawab.equalsIgnoreCase("tidak") ){
            running1 = false;
        }
        counter1++;
          }  
                System.out.println("anda sudah melakukan pemilihn warna merah" + counter1 );
         
                break;
            case 3 :
                System.out.println("Nama :"+nama);
                System.out.println("suka warna putih");
                
                
                boolean running2 = true;
            String jawab2;
            int counter2 = 0;
            
          while (running2) {
              System.out.println("apakah anda menyukai warna putih"); 
              System.out.println("jawab [iya / tidak]");
              
              
              jawab = scan.nextLine();
              
        // cek jawabannya, kalau pesan maka berhenti
        if (jawab.equalsIgnoreCase("tidak") ){
            running2 = false;
        }
        counter2++;
          }  
                System.out.println("anda sudah melakukn pemilihn warna putih" + counter2 );
         
                     
            break;
            default:
            System.out.println("Maaf warna yng Anda pilih tidk ada");
           
        }       
            
    } 
}
    
    

