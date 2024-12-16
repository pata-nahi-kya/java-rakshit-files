package OOP ;
// Java program to demonstrate the 
// real-world example of Interfaces
// before jdk 1.8
/* we have to initialize all methods in interface otherwise it will show
error*/

/*we must implement all abstract method of interface otherwise it show 
  error */

interface Vehicle {
    
    // all are the abstract methods.
    void changeGear(int a); // public + abstract
    void speedUp(int a); // they by defult become default method
    void applyBrakes(int a);
    void number_of_tyre();
    int number_of_tyre = 2 ; // public + static + final
}

class Bicycle implements Vehicle{
    
    int speed;
    int gear;
    
    // to change gear
    @Override
    public void changeGear(int newGear){
        
        gear = newGear;
    }
    
    // to increase speed
    @Override
    public void speedUp(int increment){
        
        speed = speed + increment;
    }
    
    // to decrease speed
    @Override
    public void applyBrakes(int decrement){
        
        speed = speed - decrement;
    }
    
    public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
    public void number_of_tyre(){
        System.out.println("vehicle have " + number_of_tyre + " tyre");
    }
}

class Bike implements Vehicle {
    
    int speed;
    int gear;
    
    // to change gear
    @Override
    public void changeGear(int newGear){
        
        gear = newGear;
    }
    
    // to increase speed
    @Override
    public void speedUp(int increment){
        
        speed = speed + increment;
    }
    
    // to decrease speed
    @Override
    public void applyBrakes(int decrement){
        
        speed = speed - decrement;
    }
    
    public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
    public void number_of_tyre(){
        System.out.println("vehicle have " + number_of_tyre + " tyre");
    }
    
}
class GFG_interface {
    
    public static void main (String[] args) {
    
        // creating an instance of Bicycle
        // doing some operations
        Bicycle bicycle = new Bicycle();
        bicycle.changeGear(2);
        //bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        
        System.out.println("Bicycle present state :");
        bicycle.printStates();
        bicycle.number_of_tyre();
        
        // creating instance of the bike.
        Bike bike = new Bike();
        bike.changeGear(1);
        //bike.speedUp(4);
        bike.applyBrakes(3);
        
        System.out.println("Bike present state :");
        bike.printStates();
        bike.number_of_tyre();
    }
}
