import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);

        System.out.print("Mesafe (KM):");
        int distance=input.nextInt();
        if (distance<0){
            System.out.print("Hatalı veri girdiniz!");
            return;
        }
        System.out.print("Yaşınız:");
        int age=input.nextInt();
        if (age<0){
            System.out.print("Hatalı veri girdiniz!");
            return;
        }
        System.out.print("Yolculuk tipi (1:Tek yön, 2:Gidiş-Dönüş):");
        int travelType= input.nextInt();
        if (travelType !=1 && travelType !=2){
            System.out.print("Hatalı veri girdiniz!");
            return;
        }
        double basePrice=distance*0.10;
        double totalPrice=basePrice;

        if(age<12){
            totalPrice *=0.5;
        }else if (age>=12 && age<=24){
            totalPrice *=0.9;
        }else if (age>=65){
            totalPrice *=0.7;
        }
        if (travelType ==2){
            totalPrice *=0.8;
        }

        System.out.printf("Toplam Tutar: %.2f TL", totalPrice);

    }
}