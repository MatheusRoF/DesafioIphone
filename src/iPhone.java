// Importe a interface ReprodutorMusical
import Interfaces.ReprodutorMusical;
import Interfaces.NavegadorInternet;
import Interfaces.AparelhoTelefonico;

public class iPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void reproduzirMusica(String musica) {
        System.out.println("Reproduzindo música: " + musica);
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada");
    }

    @Override
    public void pararMusica() {
        System.out.println("Música parada");
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Ligando para: " + numero);
    }

    @Override
    public void receberLigacao(String numero) {
        System.out.println("Recebendo ligação de: " + numero);
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
    }

    @Override
    public void abrirSite(String url) {
        System.out.println("Abrindo site: " + url);
    }

    @Override
    public void fecharSite() {
        System.out.println("Fechando site");
    }

    @Override
    public void navegar(String url) {
        System.out.println("Navegando para: " + url);
    }
}