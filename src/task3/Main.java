package task3;

public class Main {
    public static void main(String[] args) {
        ExampleService service = new ExampleServiceImpl();
        ExampleService proxyService = (ExampleService) LoggingProxy.createProxy(service);

        proxyService.performTask();
        System.out.println();
        proxyService.regularTask();
    }
}
