/**
 * Created by peter on 14/06/2017.
 */
package net.codejava.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

        // read form fields
        String firstname = request.getParameter("firstname");
        String surname = request.getParameter("surname");
        String email = request.getParameter("email");
        String schoolClass = request.getParameter("class");
        String password = request.getParameter("password");

        System.out.println("Vorname: " + firstname);
        System.out.println("Nachname: " + surname);
        System.out.println("E-Mail: " + email);
        System.out.println("Klasse: " + schoolClass);
        System.out.println("Passwort: " + password);

        // do some processing here...

        // get response writer
        PrintWriter writer = response.getWriter();

        // build HTML code
        String htmlRespone = "<html>";
        htmlRespone += "<h3>Vorname: " + firstname + "<br/>";
        htmlRespone += "Nachname: " + surname + "<br/>";
        htmlRespone += "E-Mail: " + email + "<br/>";
        htmlRespone += "Klasse: " + schoolClass + "<br/>";
        htmlRespone += "Passwort: " + password + "</h3>";
        htmlRespone += "</html>";

        // return response
        writer.println(htmlRespone);

    }

}
