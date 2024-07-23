package conjunto;
import exceptions.SaldoException;

public interface iConta {

    void sacar(double valor) throws SaldoException;

    void depositar(double valor);

    void transferir(double valor, iConta contaDestino) throws SaldoException;

    void imprimirInformacoes();
}
