public class ExcecoesEx2 {

    static String s = "";

    public static void m0(int a, int b) {
        s += a;
        m2();
        m1(b);
    }

    public static void m1(int i) {
        s += i;
    }

    public static void m2() {
        throw new NullPointerException("aa");
    }

    public static void m() {
        m0(1, 2);
        m1(3);
    }

    public static void main(String args[]) {
        try {
            m();
        } catch (Exception e) {
        }
        System.out.println(s); // Resultado: 1
    }

    //o método m() é executado
    //o método m0(1, 2) é executado
    // s = 1;
    //o método m2() é executado
    // é lançado e exceção NullPointerException
    // por está dentro de um bloco try/catch a exceção cai no catch
    // é executado System.out.println(s)
    // imprime 1
}
