package lambda.ex2;

import java.util.function.IntFunction;

public class FunctionInterfaceEx2 {

    /*
     * java.util.function Interface 예제
     */
    public static void main(String[] args){
        IntFunction intSum = (x) -> x+1;
        System.out.println(intSum.apply(1));
    }

}
