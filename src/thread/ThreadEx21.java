package thread;

public class ThreadEx21 {

    public static void main(String[] args) {
        Runnable r = new RunnableEx21();
        new Thread(r).start(); // ThreadGroup에 의해 참조되므로 gc 대상이 아니다.
        new Thread(r).start(); // ThreadGroup에 의해 참조되므로 gc 대상이 아니다.
    }

    static class Account {
        private int balance = 1000;
        public int getBalance() {
            return balance;
        }

        public synchronized void withdraw(int money) {
            if(balance >= money) {
                try{
                    Thread.sleep(1000);
                    balance -= money;
                } catch (InterruptedException e) {

                }
            }
        }
    }

    static class RunnableEx21 implements Runnable {
        Account acc = new Account();

        @Override
        public void run() {
            while(acc.getBalance() > 0) {
                int money = (int) (Math.random() * 3 + 1) * 100;
                acc.withdraw(money);
                System.out.println("balance:"+acc.getBalance());
            }
        }
    }

}
