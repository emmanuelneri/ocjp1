public class LabelEx3 {

//    public static void main(String[] args){
//        for : for(int i = 0; i< 10; i++){
//            for (int j = 0; j< 10; j++){
//                if ( i+ j > 10 )  break for;
//            }
//            System.out.println( "hello");
//        }
//    } *** erro de compilação for é paralavra reservar

    public static void main(String[] args){
        label : for(int i = 0; i< 10; i++){
            for (int j = 0; j< 10; j++){
                if ( i+ j > 10 )  break label;
            }
            System.out.println( "hello");
        }
    } // resultado: hello 2x
}