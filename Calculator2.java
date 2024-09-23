public class Calculator2 {
    private int firstNum;
    private int secondNum;

    public void num1(int num) {
        firstNum = num;
    }

    public void num2(int num) {
        secondNum = num;
    }

    public int performSum() {
        Sum sum = new Sum();
        return sum.calculate(firstNum, secondNum);
    }

    public int performSubtract() {
        Subtract subtract = new Subtract();
        return subtract.calculate(firstNum, secondNum);
    }

    public int performMultiply() {
        Multiply multiply = new Multiply();
        return multiply.calculate(firstNum, secondNum);
    }

    public int performDivide() {
        Divide divide = new Divide();
        return divide.calculate(firstNum, secondNum);
    }
}
