class MyException extends Exception {}

public class ExcecoesEx3{

    public static void main(String[] args)  {

        ExcecoesEx3 tc = new ExcecoesEx3();

        try{
            tc.m1();
        } catch (MyException e){
//            tc.m1(); erro de compilação
             // precisa adiconar throws MyException na assinatura do método Main
        } finally{
            tc.m2();
        }
    }

    public void m1() throws MyException{
        throw new MyException();
    }

    public void m2() throws RuntimeException{
        throw new NullPointerException();
    }
}