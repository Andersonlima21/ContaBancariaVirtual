import java.util.Scanner;

public class Metodos {

    public String obterMensagem(double saldoAtual) {
        String nome = "Anderson";
        String tipoConta = "Corrente";

        return "Dados iniciais do cliente:\n" +
                "Nome: " + nome + "\n" +
                "Tipo conta: " + tipoConta + "\n" +
                "Saldo inicial: R$ " + String.format("%.2f", saldoAtual);
    }

    public String consultarSaldos(double saldoAtual) {
        return "Seu saldo atual é de: " + saldoAtual;
    }

    public double receberValor(Scanner input) {
        System.out.println("Qual valor vc deseja enviar ?");
        return input.nextDouble();
    }

    public double transferirValor(double saldoAtual, Scanner input) {
        System.out.println("Qual valor você deseja transferir?");
        double valorParaTransferencia = input.nextDouble();

        if (valorParaTransferencia > saldoAtual) {
            System.out.println("Operação não concluída, o valor da transferência excede o saldo atual!");
            return saldoAtual; // Saldo permanece inalterado
        }

        saldoAtual -= valorParaTransferencia; // Atualiza o saldo
        System.out.println("Transferência de R$ " + String.format("%.2f", valorParaTransferencia) + " realizada com sucesso!");
        return saldoAtual; // Retorna o saldo atualizado
    }

}
