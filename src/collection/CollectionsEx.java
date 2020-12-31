package collection;

import java.util.*;
import static java.util.Collections.*;

public class CollectionsEx {

    public static void main(String[] args) {
        List list = new ArrayList();
        System.out.println(list);

        addAll(list, 1,2,3,4,5);
        System.out.println(list);

        rotate(list, 2);
        System.out.println(list);

        swap(list, 0, 2);  //첫 번쨰와 세 번째를 교환(swap)
        System.out.println(list);

        shuffle(list);
        System.out.println(list);

        sort(list);
        System.out.println(list);

        sort(list, reverseOrder());
        System.out.println(list);

        int idx = binarySearch(list, 3);
        System.out.println("index of 3 = " + idx);

        System.out.println("max = " + max(list));
        System.out.println("min = " + min(list));
        System.out.println("min = " + max(list, reverseOrder()));

        fill(list, 9);
        System.out.println("list="+list);

        //list와 같은 크기의 새로운 list 생성 및 2로 채움. 단 결과는 변경 불가
        List newList = nCopies(list.size(), 2);
        System.out.println("newList = " + newList);

        copy(list, newList);
        System.out.println("newList="+newList);
        System.out.println("list="+list);

        replaceAll(list, 2, 1);
        System.out.println("list=" + list);

        Enumeration e = enumeration(list);
        ArrayList list2 = list(e);

        System.out.println("list2="+list2);

    }

}
