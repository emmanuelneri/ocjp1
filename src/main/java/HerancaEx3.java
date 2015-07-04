class HerancaEx3 {
    public int getCode(){ return 2;}
}

class AA extends HerancaEx3 {
//    public long getCode(){ return 3;} Erro de compilação
    // não é possível sobrescrever o método getCode da classe pai, porque a assinatura é igual e o retorno é diferente
}

class TestClass {

    public static void main(String[] args) throws Exception {
        HerancaEx3 a = new HerancaEx3();
        HerancaEx3 aa = new AA();
        System.out.println(a.getCode()+" "+aa.getCode());
    }

    public int getCode() {
        return 1;
    }
}
