package LambdaTask2;

public class Worker {

    @FunctionalInterface
    public interface OnTaskDoneListener {
        void onDone(String result);
    }
    private OnTaskDoneListener callback;

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public void start() {
        for (int i = 0; i < 33; i++) {
            callback.onDone("Task " + i + " is done");
        }
        for (int d = 34; d < 100; d++) {
            callback.onDone("Task " + d + " is done");
        }
    }
    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result);
    }
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }

    public void errorStart() {
        for (int i = 33; i < 34; i++) {
            errorCallback.onError("Task " + i + " is failed");
        }
    }
}
