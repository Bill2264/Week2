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

        BasicCalculator clac = new BasicCalculator();
        int result = clac.add(FirstNumber, SecondNumber);
        System.out.println("Results: "+result);
    }
}
