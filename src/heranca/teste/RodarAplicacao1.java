package heranca.teste;

public class RodarAplicacao1 {
    public static void main(String[] args) {

        //variavel funcionario
        Funcionario funcionario = new Funcionario();

        //upcast, sempre implicito
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //downcast, sempre explicito
        //Vendedor vendedor1 = (Vendedor) new Funcionario();
        //Gerente gerente1 = (Gerente) new Funcionario();


    }
}
