package src.contaBancaria;

public class DadosCliente {

    private String nome = "José Maurício";
    private String conta = "Corrente";
    private double saldoEmConta = 500;

    public String impressaoDadosCliente() {
            return "#########################################################\n" +
                "Dados iniciais do cliente:\n" +
                "\n" +
                "Nome: " + this.getNome() + "\n" +
                "Tipo conta: " + this.getConta() + "\n" +
                "Saldo inicial: R$ " + this.getSaldoEmConta() + "\n" +
                "#########################################################\n";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public double getSaldoEmConta() {
        return saldoEmConta;
    }

    public void setSaldoEmConta(double saldoEmConta) {
        this.saldoEmConta += saldoEmConta;
    }
}
