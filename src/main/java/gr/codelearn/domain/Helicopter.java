package gr.codelearn.domain;

public class Helicopter implements Vehicle{
    @Override
    public void start() {
        System.out.println("Helicopter starts");
    }

    @Override
    public void stop() {
        System.out.println("Helicopter stops");
    }

    @Override
    public void create() {
        // empty
    }
}
