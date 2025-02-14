/** ACQA Programação Orientada à objetos
 * Aluno - Carlos André Resende Belo
 * RA - 1151110-1
 * Abril 2023
 */

/* Decidi criar um menu para cadastrar e verificar os dados dos automóveis. */
 /* E outro menu para testar os métodos que não só verificam, como alteram os estados dos automóveis. */
// Pacote fabricaAuto.
package fabricaauto;

// Importação da classe Scanner.
import java.util.Scanner;

// Classe principal do programa da Fábrica Auto.
public class FabricaAuto {

    // Classe principal.
    public static void main(String[] args) {

        // Inicialização da variável menu.
        int menu = 0;

        // Definindo a entrada de dados pelo teclado com a classe Scanner.
        Scanner teclado = new Scanner(System.in);

        // Menu principal para escolha entre carro e moto.
        while (menu != 3) {
            System.out.println("-------- Central de Cadastro --------");
            System.out.println("1 - Carro");
            System.out.println("2 - Moto");
            System.out.println("3 - Sair");
            System.out.println("-------------------------------------");
            System.out.print("Digite sua escolha: ");
            menu = teclado.nextInt();
            teclado.nextLine();

            // Carro.
            if (menu == 1) {
                System.out.println("Cadastro de Carro:");
                System.out.println("");

                // Cor.
                System.out.print("Digite a cor do carro: ");
                String cor = teclado.nextLine();

                // Placa.
                System.out.print("Digite a placa do carro: ");
                String placa = teclado.nextLine();

                // Modelo.
                System.out.print("Digite o modelo do carro: ");
                String modelo = teclado.nextLine();

                // Ligado.
                System.out.print("O carro está ligado? Digite 1 para sim ou 0 para não: ");
                int ligado = teclado.nextInt();

                // Em Movimento.
                System.out.print("O carro se encontra em movimento? Digite 1 para sim ou 0 para não: ");
                int movimento = teclado.nextInt();

                // Teto Solar.
                System.out.print("O carro possui teto solar? Digite 1 para sim ou 0 para não: ");
                int teto = teclado.nextInt();

                // Aberto.
                System.out.println("O carro se encontra aberto? Digite 1 para sim ou 0 para não: ");
                int aberto = teclado.nextInt();

                // Limpa a última escolha de inteiros (notei que causa uma escolha automática no próximo menu se não limpar).
                teclado.nextLine();

                // Cria uma nova instância para o Carro e insere os valores coletados.
                // Carro identificado como carro1.
                Carro carro1 = new Carro();
                carro1.cor = cor;
                carro1.placa = placa;
                carro1.modelo = modelo;
                carro1.ligado = ligado;
                carro1.emMovimento = movimento;
                carro1.tetoSolar = teto;
                carro1.aberto = aberto;

                // Exibe todos os dados coletados do Carro.
                System.out.println("");
                System.out.println("Dados cadastrados:");
                System.out.println("Cor: " + carro1.cor);
                System.out.println("Placa: " + carro1.placa);
                System.out.println("Modelo: " + carro1.modelo);
                System.out.println("Ligado: " + carro1.ligado);
                System.out.println("Em movimento: " + carro1.emMovimento);
                System.out.println("Teto solar: " + carro1.tetoSolar);
                System.out.println("Aberto: " + carro1.aberto);

                // Realiza a verificação de todos os métodos.
                // Inicialização da variável para o menu.
                int opcao = 0;

                // Menu.
                while (opcao != 5) {
                    System.out.println("");
                    System.out.println("-------------------------------------");
                    System.out.println("Verifique os métodos");
                    System.out.println("1 - ligar()");
                    System.out.println("2 - mover()");
                    System.out.println("3 - parar()");
                    System.out.println("4 - abrirFechar()");
                    System.out.println("5 - Sair");
                    System.out.println("-------------------------------------");
                    System.out.print("Opção: ");
                    opcao = teclado.nextInt();

                    // Limpa a última escolha.
                    teclado.nextLine();

                    if (opcao == 1) {
                        // Verifica o método ligar().
                        System.out.println("Verificando o ligar: ");
                        carro1.ligar();
                        System.out.println("");

                    } else if (opcao == 2) {
                        // Verifica o método mover().
                        System.out.println("Verificando o mover: ");
                        carro1.mover();
                        System.out.println("");

                    } else if (opcao == 3) {
                        //Verifica o método parar().
                        System.out.println("Verificando o parar: ");
                        carro1.parar();
                        System.out.println("");

                    } else if (opcao == 4) {
                        // Verifica o método abrirFechar().
                        System.out.println("Verificando o abrirFechar: ");
                        carro1.abrirFechar();
                        System.out.println("");

                    } else if (opcao == 5) {
                        // Finaliza o menu.
                        System.out.println("Saindo...");
                        System.out.println("");

                    } else {
                        // Validação da escolha
                        System.out.println("Escolha inválida!");
                    }
                }

            } // Moto.
            else if (menu == 2) {
                System.out.println("Cadastro de Moto:");
                System.out.println("");

                // Cor.
                System.out.print("Digite a cor da moto: ");
                String cor = teclado.nextLine();

                // Placa.
                System.out.print("Digite a placa da moto: ");
                String placa = teclado.nextLine();

                // Modelo.
                System.out.print("Digite o modelo da moto: ");
                String modelo = teclado.nextLine();

                // Ligado.
                System.out.print("A moto está ligada? Digite 1 para sim ou 0 para não: ");
                int ligado = teclado.nextInt();

                // Movimento.
                System.out.print("A moto está em movimento? Digite 1 para sim ou 0 para não: ");
                int movimento = teclado.nextInt();

                // Freio.
                System.out.print("A moto possui freio abs? Digite 1 para sim ou 0 para não: ");
                int freio = teclado.nextInt();

                // Baú.
                System.out.print("A moto possui baú? Digite 1 para sim ou 0 para não: ");
                int bau = teclado.nextInt();

                // Cria uma nova instância para a Moto e insere os valores coletados.
                // Moto identificado como moto1.
                Moto moto1 = new Moto();
                moto1.cor = cor;
                moto1.placa = placa;
                moto1.modelo = modelo;
                moto1.ligado = ligado;
                moto1.emMovimento = movimento;
                moto1.freioAbs = freio;
                moto1.temBau = bau;

                // Exibe todos os dados coletados da Moto.
                System.out.println("");
                System.out.println("Dados cadastrados:");
                System.out.println("Cor: " + moto1.cor);
                System.out.println("Placa: " + moto1.placa);
                System.out.println("Modelo: " + moto1.modelo);
                System.out.println("Ligado: " + moto1.ligado);
                System.out.println("Em movimento: " + moto1.emMovimento);
                System.out.println("Freio ABS: " + moto1.freioAbs);
                System.out.println("Tem baú: " + moto1.temBau);

                // Realiza a verificação de todos os métodos.
                // Inicialização da variável para o menu.
                int opcao = 0;

                // Menu.
                while (opcao != 5) {
                    System.out.println("");
                    System.out.println("-------------------------------------");
                    System.out.println("Verifique os métodos");
                    System.out.println("1 - ligar()");
                    System.out.println("2 - mover()");
                    System.out.println("3 - parar()");
                    System.out.println("4 - alarme()");
                    System.out.println("5 - Sair");
                    System.out.println("-------------------------------------");
                    System.out.print("Opção: ");
                    opcao = teclado.nextInt();

                    // Limpa a última escolha.
                    teclado.nextLine();

                    if (opcao == 1) {
                        // Verifica o método ligar().
                        System.out.println("Verificando o ligar: ");
                        moto1.ligar();
                        System.out.println("");

                    } else if (opcao == 2) {
                        // Verifica o método mover().
                        System.out.println("Verificando o mover: ");
                        moto1.mover();
                        System.out.println("");

                    } else if (opcao == 3) {
                        //Verifica o método parar()
                        System.out.println("Verificando o parar: ");
                        moto1.parar();
                        System.out.println("");

                    } else if (opcao == 4) {
                        // Verifica o método alarme().
                        System.out.println("Verificando o alarme: ");
                        moto1.alarme();
                        System.out.println("");

                    } else if (opcao == 5) {
                        // Finaliza o menu.
                        System.out.println("Saindo...");
                        System.out.println("");

                    } else {
                        // Validação da escolha.
                        System.out.println("Escolha inválida!");
                    }
                }

            } // Sair do menu principal.
            else if (menu == 3) {
                System.out.println("Encerrando o programa...");
                break;

            } // Validação da escolha no menu principal.
            else {

                System.out.println("Escolha inválida");
            }
        }
    }
}
