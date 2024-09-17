package day35_polymorphism.transportationTask;

public interface Electric extends AutoPark,AutoPilot{
    void charge(); // abstract method to be implemented in subclasses
}
