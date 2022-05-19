public class Teste {

    public static void main(String[] args) {
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();
        Vendedor vendedor1 = (Vendedor) new Funcionario();
    }
}
