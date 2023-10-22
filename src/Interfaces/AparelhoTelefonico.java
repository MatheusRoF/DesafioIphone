package Interfaces;

public interface AparelhoTelefonico {
    void fazerLigacao(String numero);
    void receberLigacao(String numero);
    void enviarMensagem(String numero, String mensagem);
}