import com.alao.X;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter a number");
//        X x = new X(scanner.nextInt());
        X x = new X(new Scanner(System.in));
//        scanner.nextLine();
        x.x();

//        X x1 = new X(scanner.nextInt());
        X x1 = new X(new Scanner(System.in));
        x1.x1();
    }
}