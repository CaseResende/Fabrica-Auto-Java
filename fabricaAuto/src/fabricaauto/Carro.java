// Classe Carro.
package fabricaauto;

// Classe Carro filha de Automóvel.
class Carro extends Automovel {

    // Atributos exclusivos da classe Carro.
    public int tetoSolar;
    public int aberto;

    // Método Abrir Fechar.
    // Verifica o estado do carro e o altera para aberto ou fechado.
    public boolean abrirFechar() {
        if (aberto == 0) {
            // Abre o carro.
            aberto = 1;
            System.out.println("Carro aberto.");
        } else {
            // Fecha o carro.
            aberto = 0;
            System.out.println("Carro fechado.");
        }
        return true;
    }
}
