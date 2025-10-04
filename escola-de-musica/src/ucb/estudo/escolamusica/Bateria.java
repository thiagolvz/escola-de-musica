package ucb.estudo.escolamusica;

public class Bateria extends InstrumentoMusical{
    private int numeroPecas;

    public Bateria(String nome, String material, int numeroPecas) {
        super(nome, material);
        this.numeroPecas = numeroPecas;
    }

    @Override
    public void tocar() {
        System.out.println("Marcando o ritmo da " + super.getNome() + " com " + this.getNumeroPecas());
    }

    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando a tensão das peles dos tambores");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Número de peças: " + getNumeroPecas());
    }

    public int getNumeroPecas() {
        return numeroPecas;
    }
}