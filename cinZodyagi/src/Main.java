import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int dogumYili,cinZodyagi;
        Scanner input=new Scanner(System.in);

        System.out.print("Hangi yılda doğdunuz : ");
        dogumYili=input.nextInt();

        cinZodyagi=dogumYili%12;

        switch (cinZodyagi){

            case 0:
                System.out.println("Çin Zodyağına göre Maymın burcusunuz.");
                break;

            case 1:
                System.out.println("Çin Zodyağına göre Horoz burcusunuz.");
                break;

            case 2:
                System.out.println("Çin Zodyağına göre Köpek burcusunuz.");
                break;

            case 3:
                System.out.println("Çin Zodyağına göre Domuz burcusunuz.");
                break;

            case 4:
                System.out.println("Çin Zodyağına göre Fare burcusunuz.");
                break;

            case 5:
                System.out.println("Çin Zodyağına göre Öküz burcusunuz.");
                break;

            case 6:
                System.out.println("Çin Zodyağına göre Kaplan burcusunuz.");
                break;

            case 7:
                System.out.println("Çin Zodyağına göre Tavşan burcusunuz.");
                break;

            case 8:
                System.out.println("Çin Zodyağına göre Ejderha burcusunuz.");
                break;

            case 9:
                System.out.println("Çin Zodyağına göre Yılan burcusunuz.");
                break;

            case 10:
                System.out.println("Çin Zodyağına göre At burcusunuz.");
                break;

            case 11:
                System.out.println("Çin Zodyağına göre Koyun burcusunuz.");
                break;
        }
    }
}