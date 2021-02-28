package LambdaTask2;

public class Main {
    public static void main(String[] args) {

        Worker.OnTaskDoneListener listener = System.out::println;

        Worker worker = new Worker(listener);
        worker.start();

        Worker.OnTaskErrorListener listener1 = System.out::println;

        Worker errorWorker = new Worker(listener1);
        errorWorker.errorStart();
    }
}
