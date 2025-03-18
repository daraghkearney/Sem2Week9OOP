package ie.atu.week9sem2;

public class Calculator {

    public int add(int firstNum, int secondNum)
    {
        long result = (long) firstNum + secondNum;
        if(result > Integer.MAX_VALUE)
        {
            throw new IllegalArgumentException("This value is too big");
        }
        return (int) result;
    }

    public int divide(int firstNum, int secondNum) {
        long result = (long) firstNum / secondNum;
        if(result > Integer.MAX_VALUE)
        {
            throw new ArithmeticException("This value is too big");
        }
        return (int) result;
    }
}
