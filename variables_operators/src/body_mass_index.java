import java.util.Scanner;

public class Body_index {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen Kilonuzu Giriniz:");
        double kilo = scanner.nextDouble();
        System.out.println("Lütfen Boyunuzu Giriniz (Metre Cinsinde):");
        double boy = scanner.nextDouble();
        double body= kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz:"+body);


    }
}