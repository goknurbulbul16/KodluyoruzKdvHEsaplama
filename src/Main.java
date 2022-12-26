import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double kdvTutar18 = 0.18 , kdvTutar8 = 0.8, kdvsizTutar ,kdvOran ,kdvliFiyat ;

        System.out.print("Lütfen Fiyat Giriniz: ");
        Scanner input = new Scanner(System.in);
        kdvsizTutar = input.nextDouble();
        System.out.println("KDV'siz Tutar: " +kdvsizTutar);

        double oran = (kdvsizTutar <= 1000) ? kdvsizTutar*kdvTutar18 : kdvsizTutar*kdvTutar8 ;
        System.out.println("KDV Oranınız: " +oran);

        kdvliFiyat = oran+kdvsizTutar;
        System.out.print("KDV'li Fiyat: "+ kdvliFiyat);
    }
}