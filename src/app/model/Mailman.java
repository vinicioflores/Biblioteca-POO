package app.model;

import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;


public class Mailman {
    
    private String usuarioCorreo = "sarasvatinoreply@gmail.com";
    private String password = "NOsarasvatiReplyjbasdv654";
    
    private String rutaArchivo;
    private String nombreArchivo;
    
    private String destinatarioCorreo;
    private String asuntoCorreo;
    private String mensajeCorreo;
    
    /**
     * 
     * @param correoFuente: correo desde el cual se env�a el correo.
     * @param password: contrase�a del correoFuente.
     * @param rutaArchivo: ruta del archivo adjunto (si hay).
     * @param nombreArchivo: nombre del archivo adjunto.
     * @param destinatario: a quien se enviar� el correo.
     * @param asunto: asunto del correo (si hay).
     * @param mensaje: mensaje del correo (informaci�n de citas).
     */
    
    // Este es el constructor que se usa cuando se trata de enviar un correo con un archivo adjunto
    public Mailman(String rutaArchivo, String nombreArchivo, String destinatario, String asunto,String mensaje) {
        this.rutaArchivo = rutaArchivo;
        this.nombreArchivo = nombreArchivo;
        this.destinatarioCorreo = destinatario;
        this.asuntoCorreo = asunto;
        this.mensajeCorreo = mensaje;
    }

    // Este constructor es para enviar mails pero sin un archivo adjunto
    public Mailman(String destinatario,String asunto,String mensaje){//Con asunto
        this("","",destinatario,asunto,mensaje);
    }    
    
    // Funci�n que env�a el email
    public boolean sendMail(){
        try {//Intenta enviar el correo.
            Properties propiedad = new Properties();//Setting la propiedad.
            propiedad.put("mail.smtp.host", "smtp.gmail.com");//Host del correo, gmail.
            propiedad.setProperty("mail.smtp.starttls.enable", "true");//TLS (Transport Layer Security) si est� disponible.
            propiedad.setProperty("mail.smtp.port", "587");//Puerto de gmail para env�o de correos.
            propiedad.setProperty("mail.smtp.user", usuarioCorreo);//Usuario
            propiedad.setProperty("mail.smtp.auth", "true");//Si requiere password (en este caso s� requiere).

            Session session = Session.getDefaultInstance(propiedad, null);//Instancia de sesi�n
            //session.setDebug(true); // Muestra en consola toda la informac�n del env�o.
            BodyPart texto = new MimeBodyPart(); // Instancia de la clase para construir mensaje.
            texto.setText(mensajeCorreo); // Se le a�ade el texto.

            // Entra en este c�digo si se necesita adjuntar un archivo 
            BodyPart adjunto = new MimeBodyPart();//Se
            if (!rutaArchivo.equals("")){
                 adjunto.setDataHandler(
                    new DataHandler(new FileDataSource(rutaArchivo)));
                adjunto.setFileName(nombreArchivo);                
            }

            MimeMultipart multiParte = new MimeMultipart();
            multiParte.addBodyPart(texto);
            if (!rutaArchivo.equals("")){
                multiParte.addBodyPart(adjunto);
            }

            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress("prograpoo01"));
            message.addRecipient(
                Message.RecipientType.TO,
                new InternetAddress(destinatarioCorreo));
                message.setSubject(asuntoCorreo);
            message.setContent(multiParte);
            
            /**
             * Clase Transport
             * Par�metro: protocolo a usar, en este caso smtp por ser el de gmail. 
             */
            
            // Transporte para enviar el correo 
            Transport transporte = session.getTransport("smtp"); // "smtp" porque es gmail
            transporte.connect(usuarioCorreo, password); //Obtenemos la conexi�n de la cuenta
            transporte.sendMessage(message, message.getAllRecipients());//Enviamos el mensaje.
            transporte.close();//Se cierra la conexi�n.
            return true;
        }
        catch (Exception envio) {//Si el env�o no es exitoso.
            //envio.printStackTrace();
            throw new RuntimeException(envio);
            //return false;
        }        
    }
    
    public static void main(String[] args){ 
        Mailman envio = new Mailman("robacz0695@hotmail.com","Asunto","Prueba de la biblioteca para mandar un email");
        if (envio.sendMail()){
            JOptionPane.showMessageDialog(null,"El correo se envi� correctamente");
        }else{
            JOptionPane.showMessageDialog(null,"El correo no se envi� correctamente");
        }
    }

}