public class ContaCorrente extends Conta {

    @Override
    public String toString() {
        return "Conta Corrente - Saldo: " + getSaldo();
    }
}
