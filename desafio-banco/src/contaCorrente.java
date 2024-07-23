
public class contaCorrente extends conta{

    @Override
    public void imprimirExtrato() {
        System.out.println("===extrato conta corrente===");
        super.imprimirinformacoes();
    }
}
