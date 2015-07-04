class InterfaceEx1 implements I1, I2{

    public void m1() { System.out.println("Hello"); }

    public static void main(String[] args){
        InterfaceEx1 tc = new InterfaceEx1();
        ( (I1) tc).m1();
    }
}
interface I1{
    int VALUE = 1;
    void m1();
}

interface I2{
    int VALUE = 2;
    void m1();
}
