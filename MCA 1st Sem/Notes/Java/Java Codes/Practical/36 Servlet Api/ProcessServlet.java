import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ProcessServlet extends HttpServlet {

    // Handle GET request
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the content type
        response.setContentType("text/html");

        // Get the PrintWriter to write the response
        PrintWriter out = response.getWriter();

        // Generate HTML response with a form
        out.println("<html><body>");
        out.println("<h2>Enter Your Name</h2>");
        out.println("<form action='process' method='get'>");
        out.println("Name: <input type='text' name='name'/>");
        out.println("<button type='submit'>Submit via GET</button>");
        out.println("</form>");
        out.println("<form action='process' method='post'>");
        out.println("Name: <input type='text' name='name'/>");
        out.println("<button type='submit'>Submit via POST</button>");
        out.println("</form>");
        out.println("</body></html>");
    }    

    // Handle POST request
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Set the content type
        response.setContentType("text/html");

        // Get the PrintWriter to write the response
        PrintWriter out = response.getWriter();

        // Retrieve the name parameter from the form
        String name = request.getParameter("name");

        // Generate HTML response displaying the user's name
        out.println("<html><body>");
        out.println("<h2>Form Submitted via POST</h2>");
        out.println("<p>Hello, " + name + "!</p>");
        out.println("</body></html>");
    }
}


// output
// User data found successfully !
// User data updated successfully !
