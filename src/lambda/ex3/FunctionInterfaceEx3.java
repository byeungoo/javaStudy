package lambda.ex3;

import java.util.function.BinaryOperator;

public class FunctionInterfaceEx3 {

    /*
     * 동일한 유형의 피 연산자에 대해 연산을 나타내며 피연산자와 동일한 유형의 결과를 생성.
     */
    public static void main(String[] args){
        BinaryOperator stringSum = (x, y) -> x + " " + y;
        System.out.println(stringSum.apply("Welcome", "Goohoon"));
    }

}
