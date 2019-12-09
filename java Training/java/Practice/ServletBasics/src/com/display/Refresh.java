package com.display;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Refresh
 */
@WebServlet("/Refresh")
public class Refresh extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Refresh() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setIntHeader("Refresh", 5);
		
		response.setContentType("text/html");
		
		Calendar calendar = new GregorianCalendar();
		String am_pm;
		int hour = calendar.get(Calendar.HOUR);
		int minute = calendar.get(Calendar.MINUTE);
		int seconds = calendar.get(Calendar.SECOND);
		
		if(Calendar.AM_PM == 0)
		{
			am_pm = "am";
		}
		else
		{
			am_pm = "pm";
		}
	
		String currentTime = hour + "hours: " + minute + "minute: " + seconds + "seconds: ";
		
		PrintWriter out = response.getWriter();
		String title = "Auto Refresh Header String ";
		out.println("<html>"+"<title>" + title + "</title>"
				+ "<body>"
				+ "<h1>" + title
				+ "</h1>"
				+ "<br>"
				+ "<h2>"
				+ "Current Time is : " + currentTime
				+ "</h2>"
				+ "</body>"
				+ "</html>"
				);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
