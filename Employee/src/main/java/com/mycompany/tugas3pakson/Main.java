package com.mycompany.tugas3pakson;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner femboy = new Scanner(System.in);
        int pilihan;
        CleaningService ob = new CleaningService();
        Manager uwog = new Manager();
        Boss bossu = new Boss();
        Employee absen = new Employee();
        System.out.println("data dirimu: \n1. Boss\n2. Manager\n3. Cleaning Service");
        pilihan = femboy.nextInt();
        if (pilihan<1||pilihan>3) {
            System.out.println("data tidak tersedia, males nambahin koding");
            System.exit(0);
        }
        else{
        switch(pilihan){
            case 1:
                bossu.datadiri();
                break;
            case 2:
                uwog.datadiri();
                break;
            case 3:
                ob.datadiri();    
                break;                
        }
        absen.absen(0);
        }
    }
}
