/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murillo.albernaz.enviomensagens;


public class Notificacoes extends Mensagem {
    public boolean aberta;

    public Notificacoes(boolean aberta, String mensagem, String nomeEmitente, String nomeReceptor) {
        super(mensagem, nomeEmitente, nomeReceptor);
        this.aberta = aberta;
    }

    @Override
    public String toString() {
        return super.toString() + " Notificacoes{" + "aberta=" + aberta + '}';
    }

    public boolean isAberta() {
        return aberta;
    }

    public void setAberta(boolean aberta) {
        this.aberta = aberta;
    }
}
