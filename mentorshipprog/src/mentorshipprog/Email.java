package mentorshipprog;
import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
//import javax.net.ssl.SSLSession;
import javax.activation.*;
import javax.mail.Session;
import javax.mail.Transport; 

public class Email{

    //Attributes
    private String recipient;
    private String sender; 
    private String host;
    private Properties properties;
    private Properties mailServer;
    private Session session;
    


    public Email(String sender, String recipient){
        this.recipient = recipient;
        this.sender = sender;
        this.host = null;
        // this.session =session;
    }

    //Sets receiepent of email
    public void setRecipient(String recipient){
        this.recipient = recipient;
    }

    //Gets receipent of email
    public String getRecipient(){
        return this.recipient;
    }

    //Sets sender of email
    public void setSender(String sender){
        this.sender = sender;
    }

    //Gets the sender of email
    public String getSender(){
        return this.sender;
    }

    //Sets host to localhost
    public void setHost(String localhost){
        this.host = localhost;
    }

    //Gets localhost
    public String getHost(){
        return this.host;
    }

    //Gets the system properties
    public Properties getProperties(){
        return this.properties;
    }

    //Not sure about the mail server, re the setting and getting of such
    //Setting up of mail server
    public void setMailServer(Properties mailServer){
        this.mailServer = properties; 

    }
    //Getting mail server
    public Properties getMailServer(){
        return this.mailServer;
    }
    
    //


}