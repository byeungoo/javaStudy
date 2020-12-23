package collection;

import java.util.*;

public class ArrayListEx2 {

    public static void main(String[] args) {
        final int LIMIT = 10; //자르고자 하는 글자의 개수

        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ";
        int length = source.length();

        //기본 사이즈 10. 크기를 약간 여유있게 잡는다.
        //지정한 크기보다 더 많은 객체를 저장하면 자동적으로 크기가 늘어나지만 이 과정에서 소요 시간이 큼
        //처음에 저장할 데이터의 개수를 잘 고려하여 충분한 용량의 인스턴스를 생성하기
        List list = new ArrayList(length/LIMIT+10);

        for(int i=0;i<length;i++){
            if(i+LIMIT < length){
                list.add(source.substring(i,i+LIMIT));
            } else{
                list.add(source.substring(i));
            }
        }

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }

    }

}
