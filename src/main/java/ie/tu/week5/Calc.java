package ie.tu.week5;

public class Calc {
    private int total;

    public Calc()
    {
        total = 0;
    }

    public Calc(int startingValue)
    {
        if(startingValue > 5){
            total = startingValue;
        }

        else{
            throw new IllegalArgumentException("This is not a valid number");
        }
    }


    public int add(int firstNumber, int secondNumber) {
        total = firstNumber + secondNumber;
        return total;
    }

    public int subtract(int firstNumber, int secondNumber)
    {
        total = firstNumber - secondNumber;
        return total;
    }

    public int multiply(int firstNumber, int secondNumber)
    {
        total = firstNumber * secondNumber;
        return total;
    }

    public int divide(int firstNumber, int secondNumber)
    {
        if(firstNumber == 0 || secondNumber == 0)
        {
            throw new IllegalArgumentException("This Number is not Valid");
        }
        else
        {
            total = firstNumber / secondNumber;
        }
        return total;
    }


}

