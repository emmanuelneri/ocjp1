public class ConversoesDeTipoEx1 {

    public static void main(String args[]) {
        Float f = null;

        try {
            f = Float.valueOf("12.3");
            String s = f.toString();
            int i = Integer.parseInt(s); // NumberFormatException
            System.out.println("i = "+i);
        } catch(Exception e){
            System.out.println("trouble : "+f); // Resultado: trouble : 12.3
        }
    }
}
