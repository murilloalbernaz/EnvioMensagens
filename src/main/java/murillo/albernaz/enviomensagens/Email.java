/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murillo.albernaz.enviomensagens;


public class Email extends Mensagem {
    private String cc;

    public Email(String cc, String mensagem, String nomeEmitente, String nomeReceptor) {
        super(mensagem, nomeEmitente, nomeReceptor);
        this.cc = cc;
    }

    @Override
    public String toString() {
        return super.toString() + " Email{" + "cc=" + cc + '}';
    }
    
    public String getCc() {
        return cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }
}
