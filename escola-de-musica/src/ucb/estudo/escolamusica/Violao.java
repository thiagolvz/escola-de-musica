package ucb.estudo.escolamusica;

public class Violao extends InstrumentoMusical{
    private int numeroCordas;


    public Violao(String nome, String material, int numeroCordas) {
        super(nome, material);
        this.numeroCordas = numeroCordas;
    }


    @Override
    public void tocar() {
        System.out.println("Tocando notas suaves no " + getNome() + " com " + getNumeroCordas() + " cordas.");
        System.out.println("Dedilhando melodia romântica.");
    }


    @Override
    public void afinar() {
        super.afinar(); // Exibe "Afinando o [nome]"
        System.out.println("Ajustando as cordas do violão.");
    }


    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes(); // Exibe nome e material
        System.out.println("Número de cordas: " + getNumeroCordas());
    }

    public int getNumeroCordas() {
        return numeroCordas;
    }
}