
/*A real example of Java Method Overriding
Consider a scenario where Bank is a class that provides functionality to get the rate of interest. However, the rate of interest varies according to banks. For example, SBI, ICICI and AXIS banks could provide 8%, 7%, and 9% rate of interest. */


//In this example(program) three classes (Sbi,Icici,Axis) are overriding the method of a parent class(Bank)
class Bank {
    public int getrateofInterest() {
        return 0;
    }
}

class Sbi extends Bank {
    public int getrateofInterest() {
        return 8;
    }
}

class Icici extends Bank {
    public int getrateofInterest() {
        return 7;
    }
}

class Axis extends Bank {
    public int getrateofInterest() {
        return 9;
    }
}

public class methodoverriding2 {
    public static void main(String[] args) {

        Sbi s = new Sbi();
        Axis a = new Axis();
        Icici i = new Icici();

        System.out.println(a.getrateofInterest());
        System.out.println(i.getrateofInterest());
        System.out.println(s.getrateofInterest());

    }
}
