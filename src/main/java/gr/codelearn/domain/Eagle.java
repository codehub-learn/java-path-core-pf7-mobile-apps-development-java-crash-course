package gr.codelearn.domain;

public class Eagle extends Bird{

    private int feathers;

    @Override
    public void fly(){
        System.out.println("*flies in American*");
    }

    public void fly(int seconds){
        System.out.println("*flies for " + seconds + " seconds.");
    }

    public void fly(String seconds){
        System.out.println("*flies for " + seconds + " seconds.");
    }

    public void eagleflies(){
        // empty
    }

    public int getFeathers() {
        return feathers;
    }

    public void setFeathers(int feathers) {
        this.feathers = feathers;
    }
}
