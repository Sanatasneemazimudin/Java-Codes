public class runableinterface {
    static class MyTask
            implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(
                        "Task: " + i
                );
            }
        }
    }
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread =
                new Thread(task);
        thread.start();
    }
}