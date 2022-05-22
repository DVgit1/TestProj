import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe x: ");
        int x = scanner.nextInt();
        if(x%3==0){
            System.out.print("fizz");
        }
        if(x%5==0){
            System.out.print("buzz");
        }
    }
}
