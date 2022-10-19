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

}

