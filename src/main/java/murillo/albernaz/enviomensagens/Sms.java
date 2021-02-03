/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package murillo.albernaz.enviomensagens;


public class Sms extends Mensagem {
    String ipCelular;

    public Sms(String ipCelular, String mensagem, String nomeEmitente, String nomeReceptor) {
        super(mensagem, nomeEmitente, nomeReceptor);
        this.ipCelular = ipCelular;
    }

    @Override
    public String toString() {
        return super.toString() + " Sms{" + "ipCelular=" + ipCelular + '}';
    }

    public String getIpCelular() {
        return ipCelular;
    }

    public void setIpCelular(String ipCelular) {
        this.ipCelular = ipCelular;
    }
    
    
}
