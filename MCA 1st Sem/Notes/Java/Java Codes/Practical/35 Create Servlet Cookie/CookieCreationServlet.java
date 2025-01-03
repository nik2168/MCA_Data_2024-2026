import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieCreationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the content type of the response
        response.setContentType("text/html");

        // Create a PrintWriter to send the response to the client
        PrintWriter out = response.getWriter();

        // Create a cookie with name "user" and value "JohnDoe"
        Cookie userCookie = new Cookie("user", "JohnDoe");

        // Set the cookie's expiry time to 1 hour (3600 seconds)
        userCookie.setMaxAge(3600);  // 1 hour expiry time

        // Add the cookie to the response
        response.addCookie(userCookie);

        // Send a response back to the client
        out.println("<html><body>");
        out.println("<h1>Cookie Created!</h1>");
        out.println("<p>Cookie 'user' has been set with value 'JohnDoe'.</p>");
        out.println("<p>Cookie will expire in 1 hour.</p>");
        out.println("</body></html>");
    }
}

// output 
// Cookie Created!
// Cookie 'user' has been set with value 'JohnDoe'
// Cookie will expire in 1 hour 