package TLOSUNG._390_Kopfrechnen;

import java.util.Random;

public class RandomMathProblem {

    private static final Operator[] operators = Operator.values();
    private static final Random random = new Random();

    public int randomMathProblem() {
        int result;
        while (true) {
            int number1 = random.nextInt(100);
            int number2 = random.nextInt(100);
            Operator operator = randomOperator();
            result = operator.calculate(number1, number2);
            if(checkValid(result)){
                String operatorSymbol = operator.getSymbol();
                printQuestion(operatorSymbol, number1, number2);
                return result;
            }
        }
    }

    private Operator randomOperator() {
        return operators[random.nextInt(operators.length)];
    }

    private boolean checkValid(int result) {
        return result >= 0 && result < 100;
    }

    private void printQuestion(String operator, int number1, int number2) {
        System.out.print("Was ist " + number1 + " " + operator + " " + number2 + "?:  ");
    }
}
