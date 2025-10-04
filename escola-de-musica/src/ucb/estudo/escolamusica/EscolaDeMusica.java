package ucb.estudo.escolamusica;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class EscolaDeMusica {

    public static void main(String[] args) {
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        System.out.println("Iniciar a orquestra");

        // Criando um array com instrumentos
        InstrumentoMusical[] banda = new InstrumentoMusical[4];

        banda[0] = new Violao("Violão Clássico", "Madeira", 6);
        banda[1] = new Piano("Piano de Cauda", "Madeira e metal", 88);
        banda[2] = new Bateria("Bateria Acústica", "Madeira e metal", 5);
        banda[3] = new Saxofone("Saxofone", "Latão", "Alto");

        EscolaDeMusica em = new EscolaDeMusica();
        em.apresentar(banda);
    }

    // Método para apresentar os instrumentos
    public void apresentar(InstrumentoMusical[] banda) {
        for (InstrumentoMusical instrumento : banda) {
            instrumento.tocar();
            instrumento.afinar();
            instrumento.mostrarInformacoes();
            System.out.println("-----");
        }
    }
}