package conjunto;
import exceptions.SaldoException;

public abstract class conta implements iConta {
    private static final Integer AGENCIA_PADRAO = 1;
    private static Integer SEQUENCIAL = 1;

    protected Integer agencia;
    protected Integer numero;
    protected double saldo;
    protected cliente cliente;

    public conta(cliente cliente) {
        this.cliente = cliente;
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) throws SaldoException {
        if (valor > saldo) {
            throw new SaldoException();
        }

        saldo -= valor;
    }

    @Override
    public void transferir(double valor, iConta contaDestino) throws SaldoException {
        this.sacar(valor);

        contaDestino.depositar(valor);
    }

    protected void imprimirConta() {
        System.out.printf("titular: %s\n", this.cliente.getNome());
        System.out.printf("agencia: %s\n", getAgencia());
        System.out.printf("numero: %s\n", getNumero());
        System.out.printf("saldo: %s\n", getSaldo());
    }

    public Integer getAgencia() {
        return agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }
}
