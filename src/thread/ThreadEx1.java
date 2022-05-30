package thread;

public class ThreadEx1 {

    public static void main(String[] args) {
        ThreadEx1_1 t1 = new ThreadEx1_1();
        t1.setName("Extends Thread");
        Runnable r = new ThreadEx1_2();
        Thread t2 = new Thread(r); // 생성자 Thread(Runnable target)
        t2.setName("Runnable Thread");

        t1.start();
        t2.start();
    }

    static class ThreadEx1_1 extends Thread {
        @Override
        public void run() {
            for(int i=0;i < 5; i++) {
                System.out.println(getName()); // 조상 Thread의 getName 호출
            }
        }
    }

    static class ThreadEx1_2 implements Runnable {
        @Override
        public void run() {
            for(int i=0;i < 5; i++) {
                System.out.println(Thread.currentThread().getName()); // 현재 실행중인 Thread 이름 출력
            }
        }
    }
}
