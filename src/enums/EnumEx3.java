package enums;

/**
 * 열거형에 추상 메서드 추가
 */

enum Transportation{
    BUS(100){ int fare(int distance){return distance*BASIC_FARE;}},
    TRAIN(150){ int fare(int distance){return distance*BASIC_FARE;}},
    SHIP(100){ int fare(int distance){return distance*BASIC_FARE;}},
    AIRPLANE(300){ int fare(int distance){return distance*BASIC_FARE;}};

    protected final int BASIC_FARE;  //protected로 해야 각 상수에서 접근 가능

    Transportation(int basicFare){
        BASIC_FARE = basicFare;
    }

    public int getBasicFare(){return BASIC_FARE;}

    abstract int fare(int distance);  //거리에 따른 요금 계산

}

class EnumEx3 {

    public static void main(String[] args) {
        System.out.println("BUS fare ="+Transportation.BUS.fare(100));
        System.out.println("TRAIN fare ="+Transportation.TRAIN.fare(100));
        System.out.println("SHIP fare ="+Transportation.SHIP.fare(100));
        System.out.println("AIRPLANE fare ="+Transportation.AIRPLANE.fare(100));
    }

}
