package demo2;

public class Example {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread("Quang");
        myThread1.start();
        MyThread myThread2 = new MyThread("Thang");
        myThread2.start();
    }
}
