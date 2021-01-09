package lambda;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class LambdaEx4 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i =0;i<10;i++) {
            list.add(i);
        }

        list.forEach(i -> System.out.print(i+","));  //리스트 순회하면서 람다식 수행. forEach로 모든 요소에 작업 f 수행
        System.out.println();

        //list에서 2 또는 3의 배수 제거
        list.removeIf(x -> x%2 == 0 || x%3 == 0);
        System.out.println(list);

        list.replaceAll(i -> i*10); // list의 각 요소에 10을 곱해준다
        System.out.println(list);

        Map<String, String> map = new HashMap<>();
        map.put("1", "1");
        map.put("2", "2");
        map.put("3", "3");
        map.put("4", "4");

        map.forEach((k, v) -> System.out.print("{" + k + "," + v + "},"));
        System.out.println();

    }

}
