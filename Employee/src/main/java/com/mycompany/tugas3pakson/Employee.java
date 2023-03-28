package com.mycompany.tugas3pakson;

import java.util.Scanner;

public class Employee {
    Scanner absensi = new Scanner(System.in);
    int nip;
    String name;
    boolean status;
    int gaji=3000000;
    int bonus=10000000;
    int potongan=100000;
    int waktukerja;
    int lembur = 200000;
    
    
    public int totalgaji(){
        System.out.println("Waktu Kerja\t\t\t: "+waktukerja+" Jam");
        if (waktukerja<8) {
            gaji-=potongan;
            System.out.println("Potongan Kurang Waktu Kerja\t: "+potongan);
        }
        else if (waktukerja>12){
            gaji+=lembur;
            System.out.println("Bonus Lembur\t\t\t: "+lembur);
        }
        if (status==true) {
            gaji+=bonus;
            System.out.println("Bonus Menikah\t\t\t: "+bonus);
        }
        System.out.println("Total Gaji\t\t\t: " + gaji);
        return gaji;
    }
    
    public void datadiri(){
        System.out.println("NIP\t\t\t\t: "+nip+"\nNama\t\t\t\t: "+name);
        if (status==true) {
            System.out.println("Status\t\t\t\t: Sudah Menikah");
        }
        else if(status==false){
            System.out.println("Status\t\t\t\t: Belum Menikah");
        }
    } 
    public void datadiri(int gajiposisi){
        gaji+=gajiposisi;
        totalgaji();
    }
 
    public void absen(int pilih){
        System.out.println("Hari Ini Belum Abseh Kehadiran\n1. Hadir\n2. Tidak Hadir");
        pilih = absensi.nextInt();
        if (pilih<1||pilih>2) {
            System.out.println("apa coba");
            System.exit(0);
        }
        if (pilih==1) {
            System.out.println("Absen Berhasil (Hadir)");
        }
        else {
            System.out.println("Absen Berhasil (Tidak Hadir)");
        }
    }
    
}
