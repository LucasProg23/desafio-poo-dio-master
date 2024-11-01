public class Main {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();

        cc.depositar(200);
        System.out.println(cc);

        cc.transferir(50, cp);
        System.out.println("Após transferência de CC para CP:");
        System.out.println(cc);
        System.out.println(cp);
    }
}
