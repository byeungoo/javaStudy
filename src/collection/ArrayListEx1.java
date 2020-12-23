package collection;

import java.util.*;

public class ArrayListEx1 {

    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(5l);
        list1.add(4l);
        list1.add(2l);
        list1.add(0l);
        list1.add(1l);
        list1.add(3l);

        ArrayList list2 = new ArrayList(list1.subList(1,4));
        print(list1, list2);

        Collections.sort(list1); //list1 정렬
        Collections.sort(list2); //list2 정렬
        print(list1, list2);

        list2.add("B");
        list2.add("C");
        list2.add(3, "A");
        print(list1, list2);

        list2.set(3, "AA");  //해당 위치에 객체 저장
        print(list1, list2);

        //list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제
        System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
        print(list1, list2);

        //list2에서 list1에 포함된 객체 삭제
        for(int i= list2.size()-1;i>=0;i--){  //삭제의 경우 제어 변수를 마지막부터 시작해야 원하는 결과를 얻음
            if(list1.contains(list2.get(i)))
                list2.remove(i);
        }
        print(list1, list2);
    }

    static void print(ArrayList list1, ArrayList list2){
        System.out.println("list1 : " + list1);
        System.out.println("list2 : " + list2);
        System.out.println();
    }

}
