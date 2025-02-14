// Classe Automóvel.
package fabricaauto;

// Classe pai Automóvel.
public class Automovel {

    // Atributos globais.
    public String cor;
    public String placa;
    public String modelo;
    public int ligado;
    public int emMovimento;

    // Método Ligar.
    // Verifica se o automóvel está desligado e o liga.
    public boolean ligar() {
        if (ligado == 1) {
            // Verificação se está ligado.
            System.out.println("O automóvel já está ligado.");
            return false;
        }
        // Liga o automóvel.
        ligado = 1;
        System.out.println("Ligando automóvel...");
        System.out.println("Automóvel ligado!");
        return true;
    }

    // Método Mover.
    // Verifica se o automóvel está se movendo e o faz mover.
    // Mas para se mover deve estar ligado.
    public boolean mover() {
        if (ligado == 0) {
            // Verificação se está ligado.
            System.out.println("O automóvel está desligado, portanto não pode se mover.");
            return false;
        }
        if (emMovimento == 1) {
            // Verificação se já se encontra em movimento.
            System.out.println("O automóvel já está em movimento.");
            return false;
        }
        // Move o automóvel.
        emMovimento = 1;
        System.out.println("Iniciando movimento...");
        System.out.println("Automóvel se movendo!");
        return true;
    }

    // Método Parar.
    // Verifica se o automóvel está parado e o faz parar.
    public boolean parar() {
        // Verificação se está parado.
        if (emMovimento == 0) {
            System.out.println("Não é possível parar o automóvel, pois ele não está em movimento.");
            return false;
        }
        // Para o automóvel.
        emMovimento = 0;
        System.out.println("Parando automóvel...");
        System.out.println("Automóvel parado!");
        return true;
    }
}
