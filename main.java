import java.util.Scanner;

public class Main {



    public static void main(String[] args) {

        float Armut = 2.14f;
        float Elma = 3.67f;
        float Domates = 1.11f;
        float Muz = 0.95f;
        float Patlican = 5.00f;
        float kg, toplam;
        Scanner input = new Scanner(System.in);
        System.out.print("Kac kilo Armut? :");
        kg = input.nextFloat();
        Armut *= kg;
        System.out.print("Kac kilo Elma? :");
        kg = input.nextFloat();
        Elma *= kg;
        System.out.print("Kac kilo Domates? :");
        kg = input.nextFloat();
        Domates *= kg;
        System.out.print("Kac kilo Muz? :");
        kg = input.nextFloat();
        Muz *= kg;
        System.out.print("Kac kilo Patlican? :");
        kg = input.nextFloat();
        Patlican *= kg;
        toplam = Armut + Elma + Domates + Muz + Patlican;
        System.out.println("Toplam = " + toplam);


    }
}
