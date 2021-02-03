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
public class MensagemFactory {
    public Mensagem criarProvedor(String nomeProvedor){
        Mensagem m = null;
        if(nomeProvedor.equals("email")){
            m = new Email("alguem","ola", "murillo", "joyce");
        }else{
            if(nomeProvedor.equals("sms")){
                m = new Sms("1231231","ola","murillo", "joyce");
            }else{
                if(nomeProvedor.equals("WhatsApp")){
                    m = new WhatsApp(true,"ola","murillo", "joyce");
                }else{
                    if(nomeProvedor.equals("notificações")){
                        m = new Notificacoes(true,"ola","murillo", "joyce");
                    }
                }
            }
        }
        return m;
    };
}
