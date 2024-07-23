
public class contaPoupanca extends conta {

    
    @Override
    public void imprimirExtrato() {
        System.out.println("===extrato conta poupanca===");
        super.imprimirinformacoes();
    }
}

