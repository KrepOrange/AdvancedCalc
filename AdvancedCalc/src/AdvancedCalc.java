import java.util.Scanner;

public class AdvancedCalc {
    static void plus(){
        Scanner sc = new Scanner(System.in);
        int number, result = 0, i = 1;
        while (true) {
            System.out.print(i++ + ". sayı: ");
            number = sc.nextInt();
            if (number == 0)
                break;
            result += number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void minus(){
        Scanner sc = new Scanner(System.in);
        int number, result = 0;
        System.out.print("Kaç sayı gireceksiniz? ");
        int counter = sc.nextInt();

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = sc.nextInt();
            if (i == 1){
                result += number;
                continue;
            }
            result -= number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void multiply(){
        Scanner sc = new Scanner(System.in);
        int number, result = 1, i = 1;

        while (true) {
            System.out.print(i + ". sayı: ");
            number = sc.nextInt();
            if (number == 1)
                break;
            if (number == 0){
                result = 0;
                break;
            }
            result *= number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void divide(){
        Scanner sc = new Scanner(System.in);
        double number, result = 0;
        System.out.print("Kaç adet sayı gireceksiniz? ");
        int counter = sc.nextInt();

        for (int i = 1; i <= counter; i++){
            System.out.print(i + ". sayı: ");
            number = sc.nextDouble();
            if (i == 1) {
                result += number;
                continue;
            }
            else if (number == 0) {
                System.out.print("Bölen olarak 0 giremezsiniz!");
                continue;
            }
            result /= number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void power(){
        Scanner sc = new Scanner(System.in);
        double base, result = 1;
        int exponent;

        System.out.print("Taban sayınızı giriniz: ");
        base = sc.nextDouble();
        System.out.print("Üssü giriniz: ");
        exponent = sc.nextInt();

        for (int i = 1; i <= exponent; i++){
            result *= base;
        }
        System.out.println("Sonuç: " + result);
    }

    static void factorial(){
        Scanner sc = new Scanner(System.in);
        int number, result = 1;

        System.out.print("Faktöriyelini istediğiniz sayıyı giriniz: ");
        number = sc.nextInt();

        if(number != 0) {
            for (int i = 1; i <= number; i++) {
                result *= i;
            }
        }
        System.out.println("Sonuç: " + result);
    }

    static void mod(){
        Scanner sc = new Scanner(System.in);
        int divider, divided;
        double result;

        System.out.print("Bölüneni giriniz: ");
        divided = sc.nextInt();
        System.out.print("Böleni giriniz: ");
        divider = sc.nextInt();

        if(divider != 0) {
            result = divided % divider;
            System.out.println("Sonuç: " + result);
        }else {
            System.out.println("Bölen sayı 0 olamaz!");
        }
    }

    static void rectangle(){
        Scanner sc = new Scanner(System.in);
        int edge1, edge2, perimeterRect, areaRect;

        System.out.print("1. kenarı giriniz: ");
        edge1 = sc.nextInt();
        System.out.print("Uzunluğu farklı olan diğer bir kenarı giriniz: ");
        edge2 = sc.nextInt();

        perimeterRect = 2 * (edge1 + edge2);
        areaRect = edge1 * edge2;

        System.out.println("Dikdörtgenin çevresi: " + perimeterRect + "\nDikdörtgenin alanı: " + areaRect);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int select;
        String menu = """
                \n1- Toplama İşlemi
                2- Çıkarma İşlemi
                3- Çarpma İşlemi
                4- Bölme İşlemi
                5- Üslü Sayı Hesaplama
                6- Faktöriyel Hesaplama
                7- Mod Alma
                8- Dikdörtgen Alan ve Çevre Hesabı
                0- Çıkış Yap""";

        do {
            System.out.print(menu + "\nLütfen bir işlem seçiniz: ");
            select = sc.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    multiply();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    System.out.println("Hesap makinesi kapatılıyor...");
                    break;
                default:
                    System.out.println("Hatalı seçim yaptınız, tekrar deneyiniz!");
            }
        } while (select != 0);
    }
}
