public class CastingEx1 {
    public static void main(String[] args) {
        CastingEx1 s = new GoodSpeak();

        //INSERT CODE HERE
        //Reposta 1: ((Tone)s).up();
        //Reposta 2: ((GoodSpeak)s).up();

    }
}
class GoodSpeak extends CastingEx1 implements Tone{
    public void up(){
        System.out.println("UP UP UP");
    }
}
interface Tone{
    void up();
}