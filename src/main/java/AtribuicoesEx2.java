public class AtribuicoesEx2 {

    static String str;

    public static void main(String[] args){
        System.out.println(str);
    } // Resultado: null

} // atributos static são inicializados com valores default, no caso da String null
// Se remover o static ocorrerá erro de compilação porque a variavel não foi inicializada
