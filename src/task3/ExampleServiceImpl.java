package task3;

public class ExampleServiceImpl implements ExampleService {
    @Override
    @LogExecutionTime
    public void performTask(){
        System.out.println("Task performed!");
    }

    @Override
    public void regularTask(){
        System.out.println("Regular task performed!");
    }
}
