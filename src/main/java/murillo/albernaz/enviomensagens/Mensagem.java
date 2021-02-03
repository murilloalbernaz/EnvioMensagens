/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murillo.albernaz.enviomensagens;

/**
 *
 * @author murillo
 */
public abstract class Mensagem {
    private String mensagem;
    private String nomeEmitente;
    private String nomeReceptor;

    public Mensagem(String mensagem, String nomeEmitente, String nomeReceptor) {
        this.mensagem = mensagem;
        this.nomeEmitente = nomeEmitente;
        this.nomeReceptor = nomeReceptor;
    }

    @Override
    public String toString() {
        return "Mensagem{" + "mensagem=" + mensagem + ", nomeEmitente=" + nomeEmitente + ", nomeReceptor=" + nomeReceptor + '}';
    }

    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getNomeEmitente() {
        return nomeEmitente;
    }

    public void setNomeEmitente(String nomeEmitente) {
        this.nomeEmitente = nomeEmitente;
    }

    public String getNomeReceptor() {
        return nomeReceptor;
    }

    public void setNomeReceptor(String nomeReceptor) {
        this.nomeReceptor = nomeReceptor;
    }
    
    
}
