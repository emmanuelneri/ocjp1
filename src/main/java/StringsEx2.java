public class StringsEx2 {

    public static double getSwitch(String str) {
        return Double.parseDouble(str.substring(1, str.length()-1) );
    }

    public static void main(String args []) {
//        switch(getSwitch(args[0])) {  // switch não é compativel com double
//            case 0.0 : System.out.println("Hello");
//            case 1.0 : System.out.println("World"); break;
//            default : System.out.println("Good Bye");
//        }
    }
}