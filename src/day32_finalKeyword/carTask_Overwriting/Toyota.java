package day32_finalKeyword.carTask_Overwriting;

public class Toyota extends Car{
    public Toyota( String model, String color, int year, double price) {
        super( model, color, year, price);
    }

    @Override
    public void start() {
        super.start();
    }
}
/*
 1. Toyota
                	start(): "Press the brake and twist the key to ignition"
 */
