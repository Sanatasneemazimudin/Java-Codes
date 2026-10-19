public class threadmethods {
    static class MyThread extends Thread {
        @Override
        public void run() {
            try {
                Thread.sleep(1000);
                System.out.println(
                        "Thread is running."
                );
            }
            catch (InterruptedException e) {
                System.out.println(
                        "Thread interrupted."
                );
            }
        }
    }
    public static void main(String[] args)
            throws InterruptedException {
        MyThread thread =
                new MyThread();
        thread.start();
        thread.join();
        System.out.println(
                "Main thread finished."
        );
    }
}