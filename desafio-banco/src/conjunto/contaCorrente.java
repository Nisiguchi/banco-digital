package conjunto;

public class contaCorrente extends conta {
    public contaCorrente(cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirInformacoes() {
        System.out.println("===extrato conta corrente===");
        super.imprimirConta();
    }
}
