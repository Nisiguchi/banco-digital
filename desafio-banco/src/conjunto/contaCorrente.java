package conjunto;
public class contaCorrente extends conta{

    public contaCorrente(cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirinformacoes() {
        System.out.println("===extrato conta corrente===");
        super.imprimirinformacoes();
    }
}
