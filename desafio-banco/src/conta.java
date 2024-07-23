
public abstract class conta implements iConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    public conta() {
        this.agencia = conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    protected int agencia;
    protected int numero;
    protected double saldo;

    @Override
    public void sacar(double valor) {
        this.saldo = saldo - valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo = saldo + valor;
    }

    @Override
    public void transferir(double valor, iConta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getConta() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirinformacoes() {
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %2f", this.saldo));
    }
    
}
