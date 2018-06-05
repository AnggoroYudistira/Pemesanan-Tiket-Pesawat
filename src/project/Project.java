/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

/**
 *
 * @author Samid
 */
import java.util.Scanner;
import java.util.Arrays;

public class Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ongkos = {270000, 480000, 550000, 650000, 575000, 450000};
        String[] waktu = {"30 menit","2 jam 20 menit","3 jam 10 menit","4 jam 35 menit","2 jam 30 menit","1 jam 50 menit"};
        String[] Rute = {"malang-surabaya", "malang-jakarta", "malang-sumatra", "malang-papua", "malang-sulawesi", "malang-ntt"};
        String[] Maskapai = {"Lion Air", "Citilink", "Batik Air", "Air Asia", "Adam Air", "Burung Hantu AirLine"};
        for (int x = 0; x < Maskapai.length; x++) {
            System.out.println((x + 1) + ": " + Maskapai[x]);
        }
        int pilih, milih, tiket, total;
        System.out.print("pilih maskapai : ");
        pilih = sc.nextInt();
        switch (pilih) {
            case 1:
                for (int x = 0; x < Rute.length; x++) {
                    System.out.println((x + 1) + ": " + Rute[x] + "   ( " + waktu[x] + " )");
                }
                System.out.print("pilih rute : ");
                milih = sc.nextInt();
                switch (milih) {
                    case 1:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 2:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 3:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 4:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 5:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 6:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;

                }

                break;
            case 2:
                for (int x = 0; x < Rute.length; x++) {
                    System.out.println((x + 1) + ": " + Rute[x]);
                }
                System.out.print("pilih rute : ");
                milih = sc.nextInt();
                switch (milih) {
                    case 1:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 2:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 3:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 4:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 5:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 6:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;

                }
                break;
            case 3:
                for (int x = 0; x < Rute.length; x++) {
                    System.out.println((x + 1) + ": " + Rute[x]);
                }
                System.out.print("pilih rute : ");
                milih = sc.nextInt();
                switch (milih) {
                    case 1:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 2:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 3:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 4:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 5:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 6:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;

                }
                break;
            case 5:
                for (int x = 0; x < Rute.length; x++) {
                    System.out.println((x + 1) + ": " + Rute[x]);
                }
                System.out.print("pilih rute : ");
                milih = sc.nextInt();
                switch (milih) {
                    case 1:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 2:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 3:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 4:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 5:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 6:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;

                }
                break;
            case 6:
                for (int x = 0; x < Rute.length; x++) {
                    System.out.println((x + 1) + ": " + Rute[x]);
                }
                System.out.print("pilih rute : ");
                milih = sc.nextInt();
                switch (milih) {
                    case 1:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 2:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 3:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 4:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 5:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                    case 6:
                        System.out.print("jumlah tiket : ");
                        tiket = sc.nextInt();
                        total = tiket * ongkos[(milih - 1)];
                        System.out.println("bayar : " + total);
                        break;
                }
                break;
            default:
                System.out.println("inputan salah");
        }
    }
}