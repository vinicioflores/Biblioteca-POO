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
     * @param correoFuente: correo desde el cual se envía el correo.
     * @param password: contraseña del correoFuente.
     * @param rutaArchivo: ruta del archivo adjunto (si hay).
     * @param nombreArchivo: nombre del archivo adjunto.
     * @param destinatario: a quien se enviará el correo.
     * @param asunto: asunto del correo (si hay).
     * @param mensaje: mensaje del correo (información de citas).
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
    
    // Función que envía el email
    public boolean sendMail(){
        try {//Intenta enviar el correo.
            Properties propiedad = new Properties();//Setting la propiedad.
            propiedad.put("mail.smtp.host", "smtp.gmail.com");//Host del correo, gmail.
            propiedad.setProperty("mail.smtp.starttls.enable", "true");//TLS (Transport Layer Security) si está disponible.
            propiedad.setProperty("mail.smtp.port", "587");//Puerto de gmail para envío de correos.
            propiedad.setProperty("mail.smtp.user", usuarioCorreo);//Usuario
            propiedad.setProperty("mail.smtp.auth", "true");//Si requiere password (en este caso sí requiere).

            Session session = Session.getDefaultInstance(propiedad, null);//Instancia de sesión
            //session.setDebug(true); // Muestra en consola toda la informacón del envío.
            BodyPart texto = new MimeBodyPart(); // Instancia de la clase para construir mensaje.
            texto.setText(mensajeCorreo); // Se le añade el texto.

            // Entra en este código si se necesita adjuntar un archivo 
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
             * Parámetro: protocolo a usar, en este caso smtp por ser el de gmail. 
             */
            
            // Transporte para enviar el correo 
            Transport transporte = session.getTransport("smtp"); // "smtp" porque es gmail
            transporte.connect(usuarioCorreo, password); //Obtenemos la conexión de la cuenta
            transporte.sendMessage(message, message.getAllRecipients());//Enviamos el mensaje.
            transporte.close();//Se cierra la conexión.
            return true;
        }
        catch (Exception envio) {//Si el envío no es exitoso.
            //envio.printStackTrace();
            throw new RuntimeException(envio);
            //return false;
        }        
    }
    
    public static void main(String[] args){ 
        Mailman envio = new Mailman("robacz0695@hotmail.com","Asunto","Prueba de la biblioteca para mandar un email");
        if (envio.sendMail()){
            JOptionPane.showMessageDialog(null,"El correo se envió correctamente");
        }else{
            JOptionPane.showMessageDialog(null,"El correo no se envió correctamente");
        }
    }

}