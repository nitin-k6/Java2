
/*The super keyword can also be used to invoke the parent class constructor */

class Animal{
 Animal(){
    System.out.println("I am Animal");
 }
}

class Dog extends Animal{

Dog(){
 super();
 System.out.println("Now it's doggo");

}
}

public class superkw3 {
    public static void main(String[] args){
        Dog d = new Dog();

    }
}
// super() is added in each class constructor automatically by compiler if there is no super() or this().