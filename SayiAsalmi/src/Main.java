import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");

        int number =scanner.nextInt();
        int remainder=number%2;

        boolean isPrime=true;

        for (int i = 2; i <number ; i++) {

            if(number%i==0){
                isPrime=false;
            }

        }
        if(isPrime){
            System.out.println("sayı asaldır");
        }
        else{
            System.out.println("sayı asal değildir");
        }

    }
}
