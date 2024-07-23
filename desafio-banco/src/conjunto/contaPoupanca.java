package conjunto;
public class contaPoupanca extends conta {
    public contaPoupanca(cliente cliente) {
        super(cliente);
    }
 
    @Override
    public void imprimirInformacoes() {
        System.out.println("===extrato conta poupanca===");
        super.imprimirConta();
    }
}

