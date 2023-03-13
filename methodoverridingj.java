/*Rules for Java Method Overriding
The method must have the same name as in the parent class
The method must have the same parameter as in the parent class.
There must be an IS-A relationship (inheritance). */

// Java method overriding is mostly used in Runtime Polymorphism
class Vehicle{
void show(){
System.out.println("Vehicle is running");
}
}

class Bike extends Vehicle{
void show(){
    System.out.println("Bike is running"); 
}
}
public class methodoverridingj{
    public static void main(String[] args){
        Bike b = new Bike();
        b.show();

    }
}