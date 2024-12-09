package task3;

public interface ExampleService {
    @LogExecutionTime
    void performTask();

    void regularTask();
}
