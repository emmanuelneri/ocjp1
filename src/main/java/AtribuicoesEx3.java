class Employee {

    static int i = 10;  {
        i = 15;
        System.out.print(" Employee "+i);
    }
    static { System.out.print(" Employee static "+i); }
}

class Manager extends Employee {
    static {
        i = 45;
        System.out.print(" Manager static ");
    }{
        i = 30;
        System.out.print(" Manager "+i);
    }
}

class Owner extends Manager{
    static { System.out.println("Owner"); }
}

public class AtribuicoesEx3 {
    public static void main(String[] args) {
        Manager m = new Manager();
    }
} // Resultado: Employee static 10 Manager static  Employee 15 Manager 30