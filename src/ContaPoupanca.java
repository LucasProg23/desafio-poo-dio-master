public class ContaPoupanca extends Conta {

    @Override
    public String toString() {
        return "Conta Poupança - Saldo: " + getSaldo();
    }
}
