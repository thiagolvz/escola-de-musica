package ucb.estudo.escolamusica;

public abstract class InstrumentoMusical {
    protected String nome;
    protected String material;

    public InstrumentoMusical(String nome, String material) {
        this.nome = nome;
        this.material = material;
    }


    public abstract void tocar();


    public void afinar() {
        System.out.println("Afinando o " + getNome());
    }


    public void mostrarInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Material: " + getMaterial());
    }


    public String getNome() {
        return nome;
    }

    public String getMaterial() {
        return material;
    }
}