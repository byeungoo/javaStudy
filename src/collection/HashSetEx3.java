package collection;

import java.util.*;

class HashSetEx3 {

    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add("abc");
        set.add("abc");
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        System.out.println(set);  //[abc, David:10, David:10]   값이 같아도 서로 다른것으로 인식
    }

}

class Person{
    String name;
    int age;

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name + ":" + age;
    }

}
