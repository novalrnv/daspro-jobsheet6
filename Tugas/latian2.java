import java.util.Scanner;

public class latian2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenisbuku;
        int jumlahbuku;
        double diskon = 0;

        System.out.print("Sebutkan jenis buku : ");
        jenisbuku = input.nextLine();
        System.out.print("Masukkan jumlah buku : ");
        jumlahbuku = input.nextInt();

        if(jenisbuku.equalsIgnoreCase("kamus")){
            diskon = 0.1;
            if(jumlahbuku > 2)
                diskon += 0.02;
        }else if(jenisbuku.equalsIgnoreCase("novel")){
            diskon = 0.09;
            if((jumlahbuku >= 3))
                diskon += 0.08;
        }else{
            if(jumlahbuku > 3)
                diskon = 0.05;
        }

        System.out.println("Total Diskon = " + (int) (diskon*100) + "%");
    }
}