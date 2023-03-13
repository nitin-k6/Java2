/*The super keyword can also be used to invoke parent class method. It should be used if subclass contains the same method as parent class. In other words, it is used if method is overridden. */

//-------------Important------>
// Used when method is overriden

class Animal{
    void showBreed(){
        System.out.println("Breed");
    }
}

class Dog extends Animal{
    void showBreed(){
    System.out.println("Goldenretriever");
}
    void eat(){
        System.out.println("Eating");
    }
    void bark(){
        System.out.println("Barking");
    }
    
    void work(){
        super.showBreed();
        
    }

}

public class superkw2 {
    public static void main(String[] args){
        Dog d = new Dog();
        // d.showBreed(); //  I will Goldenretriever coz of method overriding
         d.work();
/*In the above example Animal and Dog both classes have showBreed() method if we call showBreed() method from Dog class, it will call the showBreed() method of Dog class by default because priority is given to local.

To call the parent class method, we need to use super keyword. */

    } 
}
