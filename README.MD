Sistema Bancário em Java

Este é um projeto simples de um sistema bancário desenvolvido em Java. Ele permite aos usuários realizar operações bancárias básicas, como consultar saldo, receber valores e transferir valores. O sistema é executado no terminal e utiliza a classe Scanner para interagir com o usuário.

Funcionalidades

Consultar saldo: Verifique o saldo atual da conta.

Receber valor: Adicione valores ao saldo da conta.

Transferir valor: Realize transferências, com validação para evitar transferências superiores ao saldo.

Sair: Finalize o sistema.

Estrutura do Projeto

├── Main.java         // Contém a lógica principal do programa
├── Metodos.java      // Contém os métodos para realizar as operações bancárias

Como Executar

Certifique-se de ter o JDK instalado.

Clone este repositório:

git clone https://github.com/seuusuario/seurepositorio.git

Navegue até o diretório do projeto:

cd seurepositorio

Compile os arquivos Java:

javac Main.java Metodos.java

Execute o programa:

java Main

Exemplo de Uso

Ao iniciar o programa, você verá o seguinte menu:

Dados iniciais do cliente:
Nome: Anderson
Tipo conta: Corrente
Saldo inicial: R$ 0.00
------------
1- Consultar saldos
2- Receber valor
3- Transferir valor
4- Sair

Fluxo Básico

Escolha uma opção digitando o número correspondente.

Siga as instruções para realizar a operação desejada.

O programa continuará exibindo o menu até que a opção 4- Sair seja selecionada.