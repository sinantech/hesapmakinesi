import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        String islemler = "1-Toplama\n"
                +"2-Çıkarma\n"
                +"3-Çarpma\n"
                +"4-Bölme\n";
        System.out.print(islemler);
        System.out.println("************************************");
        System.out.print("İşlemi Seç Oç : ");
        String islem = scanner.nextLine();
        int n1;
        int n2;

            switch (islem) {
                case "1" :
                    System.out.print("İlk Sayı : ");
                    n1 = scanner.nextInt();
                    System.out.print("ikinci Sayı : ");
                    n2 = scanner.nextInt();
                    System.out.println("Toplam" + (n1+n2));
                    break;
                case "2" :
                    System.out.print("İlk Sayı : ");
                    n1 = scanner.nextInt();
                    System.out.print("ikinci Sayı : ");
                    n2 = scanner.nextInt();
                    System.out.println("Fark" + (n1-n2));
                    break;
                case "3" :
                    System.out.print("İlk Sayı : ");
                    n1 = scanner.nextInt();
                    System.out.print("ikinci Sayı : ");
                    n2 = scanner.nextInt();
                    System.out.println("Çarpım" + (n1*n2));
                    break;
                case "4" :
                    System.out.print("İlk Sayı : ");
                    n1 = scanner.nextInt();
                    System.out.print("ikinci Sayı : ");
                    n2 = scanner.nextInt();
                    System.out.println("Bölüm : " + (double) n1/n2);
                    if (n2 == 0) {
                        System.out.println("Bir Sayı Sıfıra Bölünemez");
                    }
                    break;

                default :
                    System.out.println("Yanlış seçim OÇ");


            }








    }
}
