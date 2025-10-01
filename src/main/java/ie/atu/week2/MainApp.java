//Name: Billy Lis-Murphy
//Date:01/10/2025
//Basic calculator using external class
package ie.atu.week2;


import java.util.Scanner;

public class MainApp {
    static void main()
    {
        Scanner scan = new Scanner(System.in);

        //user inputs 2 numbers
        System.out.println("Please input First number: ");
        int FirstNumber = scan.nextInt();
        System.out.println("Please input Second number: ");
        int SecondNumber = scan.nextInt();

        //creates Calculator object
        BasicCalculator calc = new BasicCalculator();

        //user inputs desired operation
        System.out.println("Choose operation (add,subtract, multiply): ");
        String operation = scan.next();
        int result= switch (operation) {
            case "add" -> calc.add(FirstNumber, SecondNumber);

            case "subtract" -> calc.sub(FirstNumber, SecondNumber);

            case "multiply" -> calc.multiply(FirstNumber,SecondNumber);

            default -> {
                System.out.println("invalid input");
                yield 0;
            }

        };

        //print results
        System.out.println("Results: "+result);
    }
}
