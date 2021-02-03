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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mensagem m = new MensagemFactory().criarProvedor("email");
        System.out.println(m);
        m = new MensagemFactory().criarProvedor("sms");
        System.out.println(m);
        m = new MensagemFactory().criarProvedor("WhatsApp");
        System.out.println(m);
        m = new MensagemFactory().criarProvedor("notificações");
        System.out.println(m);
    }
    
}
