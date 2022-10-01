import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sicaklik = input.nextDouble();

        String oneri = (sicaklik<5) ? "kayak" : ((sicaklik>=5 && sicaklik<=15) ? "sinema" : ((sicaklik>15 && sicaklik<=25) ? "piknik" :
                "yüzme"));
        System.out.println(oneri);
    }

}