/*1) super is used to refer immediate parent class instance variabl or we can say data member of a parent class. */
//It is used if parent class and child class have same fields.

class Animal{
    String color= "White";
    
}

class Dog extends Animal{
    String color = "Black";
    public void printColor(){
        System.out.println(color); // prints color of dog class by default
        System.out.println(super.color); // prints color of Animal class
    }
    
}   

public class superkw {
    public static void main(String[] args){
        Dog d = new Dog();
        d.printColor();



    }
}
