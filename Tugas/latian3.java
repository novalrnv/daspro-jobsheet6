import java.util.Scanner;

public class latian3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String merk, kategori;
        int ukuran;

        System.out.print("Sebutkan Merk : ");
        merk = input.nextLine();
        System.out.print("Sebutkan Kategori : ");
        kategori = input.nextLine();
        System.out.print("Masukkan Ukuran : ");
        ukuran = input.nextInt();

        if(merk.equalsIgnoreCase("specs")){
            if(kategori.equalsIgnoreCase("slip on")) {
                if(ukuran >= 36){
                    if(ukuran <= 40){
                        System.out.println("800.000");
                    }else{
                        System.out.println("Size tidak tersedia!");
                    }
                }else{
                    System.out.println("Size tidak tersedia!");
                }
            }else if(kategori.equalsIgnoreCase("high top")) {
                if(ukuran >= 40){
                    if(ukuran <= 44){
                        System.out.println("1.200.000");
                    }else{
                        System.out.println("Size tidak tersedia!");
                    }
                }else{
                    System.out.println("Size tidak tersedia!");
                }
            }else{
                System.out.println("Kategori tidak tersedia!");
            }
        }else if(merk.equalsIgnoreCase("910")){
            if(kategori.equalsIgnoreCase("woman")) {
                if(ukuran >= 36){
                    if(ukuran <= 41){
                        System.out.println("1.000.000");
                    }else{
                        System.out.println("Size tidak tersedia!");
                    }
                }else{
                    System.out.println("Size tidak tersedia!");
                }
            }else if(kategori.equalsIgnoreCase("man")) {
                if(ukuran >= 41){
                    if(ukuran <= 44){
                        System.out.println("1.800.000");
                    }else{
                        System.out.println("Size tidak tersedia!");
                    }
                }else{
                    System.out.println("Size tidak tersedia!");
                }
            }else{
                System.out.println("Kategori tidak tersedia!");
            }
        }else if(merk.equalsIgnoreCase("ortus")){
            if(kategori.equalsIgnoreCase("kids")) {
                if(ukuran >= 36){
                    if(ukuran <= 40){
                        System.out.println("250.000");
                    }else{
                        System.out.println("Size tidak tersedia!");
                    }
                }else{
                    System.out.println("Size tidak tersedia!");
                }
            }else if(kategori.equalsIgnoreCase("adults")) {
                if(ukuran >= 40){
                    if(ukuran <= 44){
                        System.out.println("1.500.000");
                    }else{
                        System.out.println("Size tidak tersedia!");
                    }
                }else{
                    System.out.println("Size tidak tersedia!");
                }
            }else{
                System.out.println("Kategori tidak tersedia!");
            }
        }else{
            System.out.println("Merk tidak tersedia!");
        }
    }
}