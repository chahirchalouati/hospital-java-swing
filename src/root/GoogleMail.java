/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package root;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.*;
import java.util.Date;
import java.util.Properties;


/**
 * @author chahir
 */
public class GoogleMail {

    private final String EMAIL = System.getenv("email");
    private final String PASS =  System.getenv("password");
    private final String HOST = System.getenv("host");

    public GoogleMail() {
    }
    public void send(String to, String messageText) {
        try {
            final Properties props = getProps();

            java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
            Session mailSession = Session.getDefaultInstance(props, null);
            mailSession.setDebug(false);
            Message message = getMessage(to, messageText, mailSession);
            senMail(mailSession, message);
        } catch (MessagingException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }


    }

    private void senMail(Session mailSession, Message message) throws MessagingException {
        Transport transport = mailSession.getTransport("smtp");
        transport.connect(HOST, EMAIL, PASS);
        transport.sendMessage(message, message.getAllRecipients());
        transport.close();
    }

    private Message getMessage(String to, String messageText, Session mailSession) throws MessagingException {
        Message message = new MimeMessage(mailSession);
        String from = "HospitalManagement";
        message.setFrom(new InternetAddress(from));
        message.setRecipients(Message.RecipientType.TO, new InternetAddress[]{new InternetAddress(to)});
        String subject = "Creazione nuova password";
        message.setSubject(subject);
        message.setSentDate(new Date());
        message.setText(messageText);
        return message;
    }

    private Properties getProps() {
        Properties props = System.getProperties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", HOST);
        props.put("mail.smtp.port", "587");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.required", "true");
        return props;
    }


}
