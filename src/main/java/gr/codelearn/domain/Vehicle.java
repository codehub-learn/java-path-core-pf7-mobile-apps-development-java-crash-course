package gr.codelearn.domain;

public interface Vehicle extends Construct{
    int age = 5; // constant
    
    void start();
    void stop();

    // you can take a look at default methods inside interfaces
}
