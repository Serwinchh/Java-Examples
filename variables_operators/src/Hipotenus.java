import java.util.Scanner;

public class Hipotenus {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        double a;
        double b;
        System.out.println("Birinci Kenarı Giriniz:");
        a = scanner.nextDouble();
        System.out.println("İkinci Kenarı Giriniz");
        b = scanner.nextDouble();

        double hipo= Math.sqrt((a*a)+(b*b));
        System.out.println("Hipotenüs:"+hipo);
    }
}
