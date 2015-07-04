//O que será impresso pelo seguinte código se for executado com linha de comando: java TestClass -0,50?

public class SwitchEx3{
    public static double getSwitch(String str){
        return Double.parseDouble(str.substring(1, str.length()-1) );
    }
    public static void main(String args []){
//        switch(getSwitch(args[0])){ // erro de compilação
//            case 0.0 : System.out.println("Hello");
//            case 1.0 : System.out.println("World"); break;
//            default : System.out.println("Good Bye");
//        }
    } // Não é possível usar Double em switch
}