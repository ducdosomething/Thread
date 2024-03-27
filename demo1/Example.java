package demo1;

public class Example {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable("Duc");
        Thread thread1 = new Thread(myRunnable);
        thread1.start();

        MyRunnable myRunnable1 = new MyRunnable("Huy");
        Thread thread2 = new Thread(myRunnable1);
        thread2.start();
    }
}
