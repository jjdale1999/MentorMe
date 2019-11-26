//package mentorshipprog;
//import java.util.Properties;
//import java.util.*; 
//import javax.mail.*; 
//import javax.mail.internet.*; 
//import javax.activation.*; 
//import javax.mail.Session; 
//import javax.mail.Transport; 
//import java.io.*;
//
//public class EmailTester{
//    public static void main(String[] args) {
//        // final String email = Settings.get("email");
//        // final String password = Settings.get("pass");
//        
//        Email email = new Email("neishabrown254@gmail.com", "generalms16@gmail.com");
//
//
//
//        Properties prop = new Properties();
//		prop.put("mail.smtp.host", "smtp.gmail.com");
//        prop.put("mail.smtp.port", "465");
//        prop.put("mail.smtp.auth", "true");
//        prop.put("mail.smtp.socketFactory.port", "465");
//        prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//        Session session = Session.getInstance(prop,
//                new javax.mail.Authenticator() {
//                    protected PasswordAuthentication getPasswordAuthentication() {
//                        return new PasswordAuthentication("neishabrown254@gmail.com", "neisha1234");
//                    }
//                });
//
//        try {
//            //MimeMessage object (allows for sending of message object to and from sender and receipent)
//            MimeMessage message = new MimeMessage(session);
//
//            //Set From field. Addition of sender's email to the "From" field.
//            message.setFrom(new InternetAddress(email.getSender()));
//
//            //Set To field. Addition of recipient email to the "To" field.
//            message.addRecipient(Message.RecipientType.TO, new InternetAddress(email.getRecipient()));
//
//            //Sets Subject of email
//            message.setSubject(" Email");
//
//            //Sets Body of email.
//            message.setText("Test");
//
//            // set the timestamp
//            message.setSentDate(new Date());
//
//
//            //Sends email
//            Transport.send(message);
//            System.out.println("Email was sent!");
//
//        } catch(MessagingException e){
//            e.printStackTrace();
//
//        }
//
//
//    }
//}
//
