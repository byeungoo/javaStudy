package lambda.ex1;

public class FunctionalInterfaceEx1 {

    /*
     * 함수형 인터페이스 람다 사용 예제1
     */
    public static void main(String[] args){
        Math plusLambda = (first, second) -> first + second;
        System.out.println(plusLambda.Calc(4,2));

        Math minusLambda = (first, second) -> first - second;
        System.out.println(minusLambda.Calc(4, 2));
    }

}
