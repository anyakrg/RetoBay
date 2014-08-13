package com.epam.retobay.servlet;

import com.epam.retobay.entity.User;

import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Properties;
import java.util.UUID;

public class Register extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String nickName = req.getParameter("nickName");
        String email = req.getParameter("email");
        String birth = req.getParameter("birth");
        String gender = req.getParameter("gender");

        fakeACtionFactory(req);

        req.setAttribute("nickName", nickName);
        req.setAttribute("email", email);
        req.setAttribute("birth", birth);
        req.setAttribute("gender", gender);


        req.getRequestDispatcher("/WEB-INF/hello.jsp").forward(req, resp);
    }

    private void fakeACtionFactory(HttpServletRequest req) {
        String nickName = req.getParameter("nickName");
        String email = req.getParameter("email");
        String birth = req.getParameter("birth");
        String gender = req.getParameter("gender");

        //todo ActionFactory!!!!
        //start Af
        DateFormat df = new SimpleDateFormat("yyyy-mm-dd", Locale.ENGLISH);
        try {
            User u = new User(UUID.randomUUID(),nickName,email, User.MyRole.CLIENT, (gender.equals("M"))? User.Sex.MALE:User.Sex.FEMALE,  df.parse(birth));
            System.out.println("u = " + u.toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        Thread sendEmailThread = new Thread(){
            @Override
            public void run() {
                // Sender's email ID needs to be mentioned
                String from = "task5@gmail.com";

                // Assuming you are sending email from localhost
                String host = "localhost";

                // Get system properties
                Properties properties = System.getProperties();

                // Setup mail server
                properties.setProperty("mail.smtp.host", host);

                // Get the default Session object.
                javax.mail.Session session = javax.mail.Session.getDefaultInstance(properties);

                try{
                    // Create a default MimeMessage object.
                    MimeMessage message = new MimeMessage(session);

                    // Set From: header field of the header.
                    message.setFrom(new InternetAddress(from));

                    // Set To: header field of the header.
                    message.addRecipient(javax.mail.Message.RecipientType.TO,
                            new InternetAddress(email));

                    // Set Subject: header field
                    message.setSubject("This is the Subject Line!");

                    // Now set the actual message
                    message.setText("This is actual message");

                    // Send message
                    Transport.send(message);
                   // System.out.println("Sent message successfully....");
                } catch (AddressException e) {
                    e.printStackTrace();
                } catch (javax.mail.MessagingException e) {
                    e.printStackTrace();
                }
            }
        };

        //end AF
        sendEmailThread.start();
    }
}

