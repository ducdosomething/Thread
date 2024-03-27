package demo2;

/**
 * MyThread
 */
public class MyThread extends Thread {

    String name;

    public MyThread(String name1) {
        this.name = name1;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + " Thread is running..." + 1);
        }
    }
}