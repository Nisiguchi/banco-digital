
public class contaPoupanca extends conta {
    
    private static int SEQUENCIAL = 1;

    public contaPoupanca() {
        super.agencia = conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }
    
}
