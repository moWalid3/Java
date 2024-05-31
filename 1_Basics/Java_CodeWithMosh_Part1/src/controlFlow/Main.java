package controlFlow;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // logical operator usefully
        // && - || - !
        boolean isHot = true;
        boolean isCold = false;
        boolean isGood = true;
        System.out.println((isHot || isGood) && !isCold);
    //--------------------------------------------------------------------------------------------
        System.out.println("--------------------------");
    // --------------------------------------------------------------------------------------------
        int temperature = 10;
        if (temperature > 30) {
            System.out.println("Hot day.");
            System.out.println("Drink water");
        }
        else if (temperature > 20)
            System.out.println("Beautiful day");
        else
            System.out.println("Cold day");

    //--------------------------------------------------------------------------------------------
        System.out.println("--------------------------");
    // --------------------------------------------------------------------------------------------

        int income = 120_000;
        boolean hasHighIncome = income > 100_000;
        String className = income > 100_000 ? "First" : "Economy";
        System.out.println(className);

    //--------------------------------------------------------------------------------------------
        System.out.println("--------------------------");
    // --------------------------------------------------------------------------------------------

        // popular interview question

        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int number = 15;//scanner.nextInt();

        if (number % 3 == 0 && number % 5 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);

    //--------------------------------------------------------------------------------------------
        System.out.println("--------------------------");
    // --------------------------------------------------------------------------------------------

        int[] arr = {33,88,99};
        for (int ele : arr)
            System.out.println(ele);

    //--------------------------------------------------------------------------------------------
        System.out.println("--------------------------");
    // --------------------------------------------------------------------------------------------

        myProject();

    }

    public static void myProject() {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);

        int principal;
        while (true) {
            System.out.print("Principal ($1k - $1M): ");
            principal = scanner.nextInt();
            if (principal >= 1_000 && principal <= 1_000_000)
                break;
            System.out.println("Enter a number between 1K and 1M.");
        }

        float annulInterest;
        while (true) {
            System.out.print("Annual interest rate: ");
            annulInterest = scanner.nextFloat();
            if (annulInterest > 0 && annulInterest <= 30)
                break;
            System.out.println("reater than 0 and less than or equal 30.");
        }
        float monthlyInterest = annulInterest / MONTHS_IN_YEAR / PERCENT;

        byte years;
        while(true) {
            System.out.print("Period (Years): ");
            years = scanner.nextByte();
            if (years > 0 && years <= 30)
                break;
            System.out.println("Enter a value between 0 to 30.");
        }
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatting = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: $" + mortgageFormatting);
    }






}
