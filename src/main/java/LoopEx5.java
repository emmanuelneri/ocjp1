public class LoopEx5 {

    public static void main(String args[]){
        int c = 0;
        boolean flag = true;

        for(int i = 0; i < 3; i++){
            while(flag){
                c++;
                if(i > c || c > 5) flag = false;
            }
        }

        System.out.println(c);// Resultado: 6
        //o while será iterado até que c > 5
        // como c++ está antes do if, então c = 6
    }
}
