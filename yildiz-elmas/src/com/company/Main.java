import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Elmas yüksekliğini giriniz : ");
        int n = input.nextInt();

        //Elmasın üst kısmı
        for (int i = 1; i <= n; i++) {
            //Boşlukları ekle
            for (int j = 1; j <= n; j++){
                System.out.print("");
            }

            //Yıldızları ekle
            for (int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Elmasın alt kısmı
        for (int i = n - 1; i >= 1; i--){
            //Boşlukları ekle
            for (int j = 1; j <= n - i; j++){
                System.out.print(" ");
            }
            //Yıldızları ekle
            for (int k = 1; k <= 2 * i - 1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}