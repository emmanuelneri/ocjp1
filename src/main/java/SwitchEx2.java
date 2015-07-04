class SwitchEx2{
    public static void main(String args[]){
        int k = 9, s = 5;
        switch(k){
            default :
                if( k == 10) { s = s*2; }
                else{ // entra no else
                    s = s+4; // 5+4
                    break;
                }
            case 7 : s = s+3;
        }
        System.out.println(s); // 9
    }
}
