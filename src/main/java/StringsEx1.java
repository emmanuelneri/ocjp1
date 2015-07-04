
public class StringsEx1 {

    public static void main(String args []) {
        String s = "MINIMUM";
        System.out.println(s.substring(4, 7)); //1  Resultado: MUM      
        System.out.println(s.substring(5)); //2    Resultado: UM       
        System.out.println(s.substring(s.indexOf('I', 3))); //3  Resultado: IMUM         
        System.out.println(s.substring(s.indexOf('I', 4))); //4  Resultado: StringIndexOutOfBoundsException     
    }

}
