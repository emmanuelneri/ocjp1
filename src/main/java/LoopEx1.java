class LoopEx1 {
    public static void main(String args[]){
        int k = 0;
        int m = 0;
        for ( int i = 0; i <= 3; i++){
            k++;
            if ( i == 2){
                // line 1
            }
            m++;
        }
        System.out.println( k + ", " + m );
    }
}

//Respostas:
//Ele irá imprimir 3, 2 quando a linha 1 = break;
//Ele irá imprimir 4, 3, quando a linha 1 = continue;
//Ele irá imprimir 3, 3, quando a linha 1 = i= 4;