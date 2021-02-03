/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murillo.albernaz.enviomensagens;


public class WhatsApp extends Mensagem {
    private boolean recebido;

    public WhatsApp(boolean recebido, String mensagem, String nomeEmitente, String nomeReceptor) {
        super(mensagem, nomeEmitente, nomeReceptor);
        this.recebido = recebido;
    }

    @Override
    public String toString() {
        return super.toString() + " WhatsApp{" + "recebido=" + recebido + '}';
    }

    public boolean isRecebido() {
        return recebido;
    }

    public void setRecebido(boolean recebido) {
        this.recebido = recebido;
    }
}
