public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try{
            metodo1();
        }catch(ArithmeticException | NullPointerException | MinhaExcecao ex){
            String msg = ex.getMessage();
            System.out.println("Message: " + msg);
            ex.printStackTrace();
        }

        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao{
        System.out.println("Ini do método 1");
        metodo2();
        System.out.println("Fim do método 1");
    }

    private static void metodo2() throws MinhaExcecao{
        System.out.println("Ini do método 2");
        /*for(int i = 0; i <= 5; i++){
            System.out.println(i);
        }*/
        throw new MinhaExcecao("Deu muito erro");
  //      System.out.println("Fim do método 2");
    }
}