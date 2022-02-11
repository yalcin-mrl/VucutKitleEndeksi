import java.util.Scanner;
public class vucutEndeksi {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        float boy,kilo,sonuc;
        System.out.println("Boyunuzu metre cinsinden girin?");
        boy = sc.nextFloat();
        System.out.println("Kilonuzu girin?");
        kilo = sc.nextFloat();
        sonuc = kilo /(boy*boy);
        System.out.println("Vücut kitle indeksiniz: "+sonuc);
    }
}
