package bt4;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();
        System.out.println("Enter c:");
        int c = scanner.nextInt();
        try {

            if (a < 0 || b < 0 || c < 0 || a + b <= c || b + c <= a || a + c <= b){
                throw new IllegalTriangleException();
            }else System.out.println(a + " " + b + " " + c + " là 3 cạnh của tam giác");
        } catch (IllegalTriangleException e) {
            System.out.println(a + " " + b + " " + c + " không phải là 3 cạnh của tam giác");
        }
    }
}
