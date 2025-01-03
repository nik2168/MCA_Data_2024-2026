import java.io.IOException;
import java.io.PrintWriter;
// import java.servlet.GenericServlet;
import j.

public class DemoServlet{
    
public void service(ServeletRequest req, ServletResponse res) throws IOException, ServletException{
    String name = req.getParameter("username");
    PrintWriter pw = req.getWriter();
    pw.println("<html><body>");
    pw.println("<h1> Welcome "+ name + "</h1>");
    pw.println("</html></body>");
}

}
