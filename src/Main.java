import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1, n2, choose;
        System.out.print("Lütfen Birinci Sayıyı Giriniz : ");
        n1 = scanner.nextInt();
        System.out.print("Lütfen İkinci Sayıyı Griniz : ");
        n2 = scanner.nextInt();
        System.out.println(" 1-Toplama \n 2-Çıkarma \n 3-Çarpma \n 4-Bölme");
        System.out.print("Seçiminiz : ");
        choose = scanner.nextInt();

        if (choose == 1) {
            System.out.println("İki Sayının Toplamı : " + (n1 + n2));
        } else if (choose == 2) {
            System.out.println("İki Sayının Farkı : " + (n1 - n2));
        } else if (choose == 3) {
            System.out.println("İki Sayının Çarpımı : " + (n1 * n2));
        } else if (choose == 4) {
            if (n2 != 0) {
                System.out.println("İki Sayının Bölümü : " + ((double) n1/n2));
            } else {
                System.out.println("Bir Sayı Sıfıra Bölünemez");
            }
        } else {
            System.out.println("Yanlış Seçim");
        }
    }
}
