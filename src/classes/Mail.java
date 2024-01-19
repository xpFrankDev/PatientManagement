package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

public class Mail {

    String sql;
    PreparedStatement pst;
    ResultSet rs;
    int id = 0;
    String usuario, correo, clave="y9wo2didq6";
    String remitente ="info@caps.org.pe";
    public Mail() {
    }

    public Mail(int id, String usuario, String correo) {
        this.id = id;
        this.usuario = usuario;
        this.correo = correo;
    }

    public void enviarCorreo(String destinatario, String asunto, String cuerpo) {
        // Esto es lo que va delante de @gmail.com en tu cuenta de correo. Es el remitente también.
        //Para la dirección nomcuenta@gmail.com
        try {
            Properties props = System.getProperties();
            props.put("mail.smtp.host", "caps.org.pe.com");  //El servidor SMTP de Google
            props.put("mail.smtp.user", remitente);
            props.put("mail.smtp.clave", clave);    //La clave de la cuenta
            props.put("mail.smtp.auth", "true");    //Usar autenticación mediante usuario y clave
            props.put("mail.smtp.starttls.enable", "true"); //Para conectar de manera segura al servidor SMTP
            props.put("mail.smtp.port", "25"); //El puerto SMTP seguro de Google

            Session session = Session.getDefaultInstance(props);
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(remitente));
            message.addRecipients(Message.RecipientType.TO, destinatario);
            message.addRecipients(Message.RecipientType.CC, remitente);
            message.setSubject(asunto);
            cuerpo += "\n\n\nEsta es una cuenta de correo sin supervisión, por favor no responda a este mensaje.";
            message.setText(cuerpo);
            Transport transport = session.getTransport("smtp");
            transport.connect("caps.org.pe", remitente, clave);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
        } catch (MessagingException me) {
            me.printStackTrace();   //Si se produce un error
        }
    }

    

    @Override
    public String toString() {
        return "Mail{" + "id=" + id + ", usuario=" + usuario + ", correo=" + correo + ", clave=" + clave + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    private void cerrar() {
        try {
            if (pst != null) {
                pst.close();
            }
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Mail.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, ex, "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

}
