public class AtribuicoesEx1 {

    static boolean a;
    static boolean b;
    static boolean c;

    public static void main (String[] args) {
        boolean bool = (a = true) || (b = true) && (c = true);
        System.out.print(a + ", " + b + ", " + c);
    }

    //Resultado true, false, false
    // a = true e a primeira condição fica verdadeiro e como é ou(||) não executo o resto
}
