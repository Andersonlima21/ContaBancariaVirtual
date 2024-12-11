import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner para o input do teclado
        Scanner input = new Scanner(System.in);

        // Chamada classe de métodos
        Metodos classMetodos = new Metodos();

        // Inicialização de variáveis
        double saldoAtual = 0;

        // Chamando métodos
        System.out.println(classMetodos.obterMensagem(saldoAtual));

        int opcaoInputada; // Variável declarada antes do loop

        do {
            String[] opcoes = {
                    "------------",
                    "1- Consultar saldos",
                    "2- Receber valor",
                    "3- Transferir valor",
                    "4- Sair"
            };

            for (String opcao : opcoes) {
                System.out.print(opcao + "\n");
            }

            opcaoInputada = input.nextInt(); // Entrada do usuário

            switch (opcaoInputada) {
                case 1:
                    System.out.println(classMetodos.consultarSaldos(saldoAtual));
                    break;
                case 2:
                    double valorEnviado = classMetodos.receberValor(input); // Passando o input para não precisar instanciar toda vez em cada metodo
                    saldoAtual += valorEnviado;
                    System.out.println("Seu novo saldo é de: " + String.format("%.2f", saldoAtual));
                    break;
                case 3:
                    saldoAtual = classMetodos.transferirValor(saldoAtual, input); // Atribuindo o saldo atualizado
                    System.out.println("Seu está em: " + String.format("%.2f", saldoAtual));
                    break;
                case 4:
                    System.out.println("Sistema finalizado!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcaoInputada != 4);

        input.close();
    }
}