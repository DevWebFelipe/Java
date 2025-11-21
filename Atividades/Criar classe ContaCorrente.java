import java.util.Date;

public class ContaCorrente {

    // Atributos
    private String numeroConta;
    private String numeroAgencia;
    private String nomeCliente;
    private Date dataNascimento;
    private double saldoConta;

    // Construtor
    public ContaCorrente(String numeroConta, String numeroAgencia, String nomeCliente,
                         Date dataNascimento, double saldoConta) {

        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nomeCliente = nomeCliente;
        this.dataNascimento = dataNascimento;
        this.saldoConta = saldoConta;
    }

    // Métodos
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
            return;
        }

        if (valor > saldoConta) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        saldoConta -= valor;
        System.out.println("Saque realizado. Valor: " + valor);
    }

    public void transferir(double valor, ContaCorrente destino) {
        if (valor <= 0) {
            System.out.println("Valor inválido.");
            return;
        }

        if (valor > saldoConta) {
            System.out.println("Saldo insuficiente.");
            return;
        }

        saldoConta -= valor;
        destino.saldoConta += valor;

        System.out.println("Transferência realizada.");
        System.out.println("Valor: " + valor);
        System.out.println("Para a conta: " + destino.numeroConta);
    }

    public void cancelar(String justificativa) {
        if (justificativa == null || justificativa.equals("")) {
            System.out.println("É necessário informar uma justificativa.");
            return;
        }

        System.out.println("Conta " + numeroConta + " cancelada.");
        System.out.println("Motivo: " + justificativa);
    }

    public void consultarExtrato(Date dataInicio, Date dataFim) {
        System.out.println("Consultando extrato da conta " + numeroConta +
                           " de " + dataInicio + " até " + dataFim);
    }

    public void consultarSaldo() {
        System.out.println("Saldo atual da conta " + numeroConta + ": R$ " + saldoConta);
    }
}
