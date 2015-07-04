
public class Operacoes1 {

    public static void main(String[] args){
        int expr1 = 3 + 5 * 9 - 7; // primeiro executa a multiplicacao
        int expr2 = 3 + (5 * 9) - 7; // mesmo cenário que o acima
        int expr3 = 3 + 5 * (9 - 7); // primeiro executa o que está dentro do parenteses
        int expr4 = (3 + 5) * 9 - 7; // primeiro executa o que está dentro do parenteses, depois a multiplicacao

        System.out.println(expr1); //41
        System.out.println(expr2); //41
        System.out.println(expr3); // 13
        System.out.println(expr4); // 65
    }

}
