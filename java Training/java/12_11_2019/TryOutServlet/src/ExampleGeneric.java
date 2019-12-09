import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ExampleGeneric extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		 	arg1.setContentType("text/html");
		   PrintWriter pwriter=arg1.getWriter();
		   pwriter.print("<html>");
		   pwriter.print("<body>");
		   pwriter.print("<h2>Generic Servlet Example</h2>");
		   pwriter.print("<p>Hello world</p>");
		   pwriter.print("</body>");
		   pwriter.print("</html>");
	}

}