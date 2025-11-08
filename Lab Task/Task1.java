import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Enter the scores of three students:");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();

        double average = (s1 + s2 + s3) / 3;
        System.out.println("Average score: " + average);

        double price = 250.0;
        double discount = 0.15 * price;
        double finalPrice = price - discount;

        System.out.printf("Original price: ", price);
        System.out.printf("Discount: ", discount);
        System.out.printf("Final price after discount: ", finalPrice);

       
        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.printf("Temparature :", celsius, fahrenheit);


        System.out.print("Enter first integer (a): ");
        int a = input.nextInt();
        System.out.print("Enter second integer (b): ");
        int b = input.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);

        input.close();
    }
}
