//Quais afirmações podem ser inseridos na linha 1 no código a seguir para tornar o programa de gravação x na saída padrão quando execução?

public class InnerClassEx1 {
    String a = "x";
    static char b = 'x';
    String  c = "x";
    class Inner{
        String  a = "y";
        String  get(){
            String c = "temp";
            // ********* LINHA 1 **************
            //Reposta 1: c = ""+Ex5.b;
            //Reposta 2: c = Ex5.this.a;
            //Reposta 3: c = ""+b;
            return c;
        }
    }

    InnerClassEx1() {
        System.out.println(  new Inner().get()  );
    }

    public static void main(String args[]) {  new InnerClassEx1();  }
}