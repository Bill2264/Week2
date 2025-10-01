package ie.atu.week2;

import java.lang.classfile.instruction.LineNumber;

public class BasicCalculator {
    public BasicCalculator() {
    }

    //adds two numbers together
    public int add(int FirstNum, int SecondNum)
    {
        return FirstNum + SecondNum;
    }

    //subtract two numbers
    public int sub(int FirstNum, int SecondNum)
    {
        return FirstNum - SecondNum;
    }

    //multiply two numbers
    public int multiply(int FirstNum, int SecondNum)
    {
        return FirstNum * SecondNum;
    }

    //divide two numbers
    public int divide(int FirstNum, int SecondNum)
    {
        //ensure not dividing by zero
        if(SecondNum != 0)
        {
            return FirstNum / SecondNum;
        }
        else
        {
            System.out.println("Cannot Divide by 0");
            return 0;
        }
    }
}
