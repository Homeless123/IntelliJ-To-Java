package day18_GarbageCollection;
/*
1. Create a class named Pizza:
			Attributes:
				1. size
				2. numberOfCheeseTopping
				3. numberOfPepperoniTopping

			Actions:
				calcCost(): returns the total cost of the pizza
				toString(): returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()

		Pizza cost is determined by:
		                S: $10 + $2 per topping
		                M: $12 + $2 per topping
		                L: $14 + $2 per topping

 */
public class Pizza {
    public char size ;
    public int numberOfCheeseTopping , numberOfPepperoniTopping;

    // calculates the total price of the pizza, returns it as double
    public double calcCost(){
       double prize = 0;

       switch (size){
           case 'S':
           case 's':
               prize=10 + 2 *(numberOfCheeseTopping+numberOfPepperoniTopping);
               break;
               case 'M':
                   case 'm':
                       prize = 12 + 2 *(numberOfCheeseTopping+numberOfPepperoniTopping);
                       break;
           case 'L':
               case 'l':
                   prize = 14 + 2 *(numberOfCheeseTopping+numberOfPepperoniTopping);
                   break;
           default:
               System.err.println("Invalid size = "+size);
       }

       return prize;
    }
    public void setInfo(char size,int numberOfCheeseTopping , int numberOfPepperoniTopping ){
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping ;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping ;
    }


    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total price=" + calcCost() +
                '}';
    }


}

