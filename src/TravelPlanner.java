import java.util.Scanner;

public class TravelPlanner {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        greeting(input);
        timeAndBudget(input);
    }

    public static void greeting(Scanner input) {
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String location = input.nextLine();
        System.out.println("Great! " + location + " sounds like a great trip.");
        }

    public static void timeAndBudget(Scanner input) {
        System.out.print("How many days are you going to be travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning on spending on your trip? ");
        int usd = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String symbol = input.next();
        System.out.print("How many " + symbol + " are there in 1 USD? ");
        double conversion = input.nextDouble();
        System.out.println();
        int hours = days * 24;
        int minutes = hours * 60;
        System.out.println("If you are travelling for " + days + " days, that is the same as " + hours + " hours " +
                "or " + minutes + " minutes.");
        System.out.println("If you are travelling for " + days + " days, that is the same as " + hours + " hours " +
                "or " + minutes + " minutes.");
        double perDay = usd / (1.0 * days);
        System.out.println("If you are going to spend $" + usd + " USD, that means per day you can spend up to $" +
                truncate2Decimal(perDay) + " USD." );
        double converted = usd * conversion;
        double perDayConverted = usd * conversion / days;
        System.out.println("Your total budget in " + symbol + " is " + converted + " " + symbol + ", which " +
                "per day is " + truncate2Decimal(perDayConverted) + " " + symbol + ".");
    }
    
    public static Double truncate2Decimal(Double num) {
        return (int)(num * 100) / 100.0;
    }
}

//greeting, timeandbudget and truncate2Decimal saved as branch1. Time to code: 2 hours


