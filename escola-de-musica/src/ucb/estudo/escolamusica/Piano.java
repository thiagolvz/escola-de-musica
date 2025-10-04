package ucb.estudo.escolamusica;

public class Piano extends InstrumentoMusical{
    private int numeroTeclas;

    // Construtor
    public Piano(String nome, String material, int numeroTeclas) {
        super(nome, material);
        this.numeroTeclas = numeroTeclas;
    }

    // Implementação do método abstrato
    @Override
    public void tocar() {
        System.out.println("Tocando uma peça clássica no piano " + getNome() + " com " + numeroTeclas + " teclas.");
        System.out.println("Notas ecoando com harmonia.");
    }

    // Sobrescrita do método afinar
    @Override
    public void afinar() {
        super.afinar();
        System.out.println("Ajustando a tensão das cordas internas do piano.");
    }

    // Sobrescrita do método mostrarInformacoes
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Número de teclas: " + numeroTeclas);
    }

    // Getter (caso queira acessar fora da classe)
    public int getNumeroTeclas() {
        return numeroTeclas;
    }
}