public class HerancaEx4 {

    public static void main(String args[]) {
        A a = new A();
        B1 b1 = new B1();
        B2 b2 = new B2();
        C1 c1 = new C1();
        C2 c2 = new C2();

//      System.out.println(c2 instanceof B2); erro de compilação
        //c2 não extend b2

        System.out.println(c1 instanceof B1); // correto

        System.out.println(a instanceof B1); // falso
        // b1 é uma instancia de A mas a não é uma instancia de B1

//      c1 = a; erro de compilação
        // a recebe c1 mas c1 não recebe a

//      b1 = b2 erro de compilação
        // b1 e b2 não tem relação

    }

}

class A {

}

class B1 extends A {

}

class B2 {

}

class C1 extends B1 {

}

class C2 {

}
