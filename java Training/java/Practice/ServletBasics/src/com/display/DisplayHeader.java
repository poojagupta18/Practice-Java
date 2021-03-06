package com.display;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class DisplayHeader
 */
@WebServlet("/DisplayHeader")
public class DisplayHeader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DisplayHeader() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("hello");
		out.println("World");
		
		/*
		 * String username = request.getParameter("username"); out.println("<br>" +
		 * username );
		 * 
		 * String password = request.getParameter("password"); out.println("<br>" +
		 * password );
		 */
		
		out.println("<html>"+"<title>" + "Http Header Request Example" + "</title>"
				+ "<body bgcolor = '#f0f0f0'>"
				+ "<h1 align='center'>" + "Http Header Request Example" + "</h1>"
				+ "<table width='100%' border='1' align='center'>"
				+ "<tr bgcolour='blue'>"
				+ "<th>Header Name</th><th>Header Values</th>"
				+ "</tr>"
				);	
		
		Enumeration headerNames = request.getHeaderNames();
		
		while(headerNames.hasMoreElements())
		{
			String headerName = (String)headerNames.nextElement();
			out.println("<tr><td>"+headerName+"</td>");
			String headerValue = request.getHeader(headerName);
			out.println("<td>"+headerValue+"</td></tr>");
		}
		
		out.println("</table></body></html>");
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
