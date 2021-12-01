package gr.codelearn.domain;

public class Car implements Vehicle{
    @Override
    public void start() {
        System.out.println("Car starts");
    }

    @Override
    public void stop() {
        System.out.println("Car stops");
    }

    @Override
    public void create() {
        // empty
    }
}
