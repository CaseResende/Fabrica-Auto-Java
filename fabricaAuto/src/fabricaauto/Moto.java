// Classe Moto.
package fabricaauto;

// Classe Moto filha de Automóvel.
class Moto extends Automovel {

    // Atributos exclusivos da classe Moto.
    public int freioAbs;
    public int temBau;

    //Método Alarme.
    // Liga o alarme.
    public boolean alarme() {
        System.out.println("Alarme ligado!");
        return true;
    }
}
