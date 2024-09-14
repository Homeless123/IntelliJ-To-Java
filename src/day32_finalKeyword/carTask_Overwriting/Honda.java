package day32_finalKeyword.carTask_Overwriting;

public class Honda extends Car{
    public Honda( String model, String color, int year, double price) {
        super( model, color, year, price);
    }

    @Override
    public void start() {
        super.start();
    }
}
