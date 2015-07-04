import java.util.* ;

public class ListEx1{

    public static void main(String args[]){
        List s1 = new ArrayList( );
        s1.add("a");
        s1.add("b");
        s1.add(1, "c");
        List s2 = new ArrayList(  s1.subList(1, 1) ); // retorna Lista vazia por isso não tem alteração
        s1.addAll(s2);
        System.out.println(s1); // Resultado: [a, c, b]
    }
}
