import java.util.Scanner;

public class aphle {
    public static void main(String[] args) {
        Scanner w = new Scanner(System.in);
        double KgPerKid=1, maximus=0 , max=0;

        while (KgPerKid > 0 ){
            System.out.println(" enter a number of apples a kid has picked in kg: ");
            KgPerKid = w.nextDouble();

            if(KgPerKid > max){
                max = KgPerKid;
            }

            if(KgPerKid > maximus && KgPerKid<max){
                maximus = KgPerKid;
            }
        }
        System.out.println("the biggest number of apples picked is: " + max + "kg");
        System.out.println("the second biggest number of apples picked is " + maximus + "kg");
    }
}
