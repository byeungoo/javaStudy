package thread;

public class ThreadEx8 {

    /**
     * 멀티코어에서는 쓰레드의 우선순위에 상관없이 작업이 비슷하게 완료됨.
     * @param args
     */
    public static void main(String[] args) {
        ThreadEx8_1 th1 = new ThreadEx8_1();
        ThreadEx8_2 th2 = new ThreadEx8_2();

        th2.setPriority(7);

        System.out.println("Priority of th1(-) : " + th1.getPriority());
        System.out.println("Priority of th2(-) : " + th2.getPriority());
        th1.start();
        th2.start();
    }

    static class ThreadEx8_1 extends Thread {
        @Override
        public void run() {
            for(int i=0; i < 300; i++) {
                System.out.print("-");
                for(int x=0; x < 100000000; x++); // 작업 지연용 for문
            }
        }
    }

    static class ThreadEx8_2 extends Thread {
        @Override
        public void run() {
            for(int i=0; i < 300; i++) {
                System.out.print("|");
                for(int x=0; x < 100000000; x++); // 작업 지연용 for문
            }
        }
    }

}
