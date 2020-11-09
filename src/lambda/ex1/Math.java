package lambda.ex1;

/*
 * 함수형 인터페이스 람다 사용 예제 1
 * 2개 이상의 메소드 선언시 오류 발생
 */
@FunctionalInterface
public interface Math {

    int Calc(int first, int second);

}
