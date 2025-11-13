import java.util.Scanner;

public class Mortgagecalculator{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double salary = 0;
        int creditScore = 0;
        boolean hasCriminalRecord = false;
        double loanAmount = 0;

        System.out.println("Enter your monthly salary:");
        while (true) {
            if (input.hasNextDouble()) {
                salary = input.nextDouble();
                break;
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                input.next(); 
            }
        }
        System.out.println("Enter your credit score (0 - 500):");
        while (true) {
            if (input.hasNextInt()) {
                creditScore = input.nextInt();
                if (creditScore >= 0 && creditScore <= 500) {
                    break;
                } else {
                    System.out.println("Credit score must be between 0 and 500.");
                }
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                input.next();
            }
        }
        System.out.println("Do you have a criminal record? (true/false):");
        while (true) {
            if (input.hasNextBoolean()) {
                hasCriminalRecord = input.nextBoolean();
                break;
            } else {
                System.out.println("Invalid input! Please enter 'true' or 'false'.");
                input.next();
            }
        } 
        System.out.println("Enter your desired loan amount:");
        while (true) {
            if (input.hasNextDouble()) {
                loanAmount = input.nextDouble();
                break;
            } else {
                System.out.println("Invalid input! Please enter a numeric value.");
                input.next();
            }
        }
        if (hasCriminalRecord) {
            System.out.println("Loan request denied.");
            System.out.println(" Applicant has a criminal record.");
        } else if (creditScore < 300) {
            System.out.println("Loan request denied.");
            System.out.println("Credit score too low.");
        } else if (loanAmount > (salary * 2)) {
            System.out.println("Loan request denied.");
            System.out.println(" Loan amount must be under 2 times your salary.");
        } else {
            System.out.println("Loan approved!");
            System.out.println("Congratulations! You are eligible for the loan.");
        }

        input.close();
    }
}
