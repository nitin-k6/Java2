/*The covariant return type specifies that the return type may vary in the same direction as the subclass.

Before Java5, it was not possible to override any method by changing the return type. But now, since Java5, it is possible to override method by changing the return type if subclass overrides any method whose return type is Non-Primitive but it changes its return type to subclass type */
class A{
    A get(){
        return this;
    }
}

class B{
    B get(){
        return this;
    }
    void message(){
        System.out.println("Covariant retunn type");
    }
}
public class covariantreturntypej {
    public static void main(String[] args){
     new B().get().message();
    }
}

/*As we can see in the above example, the return type of the get() method of A class is A but the return type of the get() method of B class is B. Both methods have different return type but it is method overriding. This is known as covariant return type. */



