import java.util.Scanner;

public class Pemilihan2Percobaan212 {
    public static void main(String[] args) {
        Scanner duabelas = new Scanner(System.in);
        int pilihanmenu;
        String member;
        double diskon, harga, totalbayar;

        System.out.println("-------------------------");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("-------------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bunding (Ricebowl + Ice Tea)");
        System.out.println("-------------------------------------");
        System.out.print("masukkan angka dari menu yang dipilih = ");
        pilihanmenu = duabelas.nextInt();
        duabelas.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = duabelas.nextLine();
        System.out.println("-------------------------------------");

        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihanmenu == 1){
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            }else if(pilihanmenu == 2){
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            }else if(pilihanmenu == 3){
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            }else{
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            totalbayar = harga - (harga * diskon);
            System.out.println("Total bayar setelah diskon = " + totalbayar);
        }
        else if (member.equalsIgnoreCase("n")) {
            if (pilihanmenu == 1){
                harga = 14000;
                System.out.println("Harga ricebowl = " + harga);
            }else if(pilihanmenu == 2){
                harga = 3000;
                System.out.println("Harga ice tea = " + harga);
            }else if(pilihanmenu == 3){
                harga = 15000;
                System.out.println("Harga bundling = " + harga);
            }else{
                System.out.println("Masukkan pilihan menu dengan benar");
                return;
            }

            System.out.println("Total bayar = " + harga);
        }else{
            System.out.println("Member tidak valid");
        }
        System.out.println("-------------------------------------");
    }
}