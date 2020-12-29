package collection;

import java.util.*;

public class HashSetEx1 {

    public static void main(String[] args) {
        Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};

        Set set = new HashSet();

        for(int i=0;i<objArr.length;i++){
            set.add(objArr[i]);
        }

        System.out.println(set);  // [1, 1, 2, 3, 4]. 1은 서로 자료형이 달라서 2개가 나옴. 순서 유지 x
    }
}
