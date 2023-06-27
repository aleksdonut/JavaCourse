package biblioteki.moduly;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class SendMail {
    public static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("poczta.interia.pl");
        email.setSmtpPort(465);
        email.setAuthenticator(new DefaultAuthenticator("java_course_adam@interia.pl", "abcdef123456!@#$%^"));
        email.setSSLOnConnect(true);
        email.setFrom("java_course_adam@interia.pl");
        email.setSubject("Test");
        email.setMsg("Hejka ... :-)");
        email.addTo("java_course_adam@interia.pl");
        System.out.println("Sending mail started!");
        email.send();
        System.out.println("Send");
    }
}
