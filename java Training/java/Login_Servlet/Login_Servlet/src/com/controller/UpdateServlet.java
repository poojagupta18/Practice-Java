package com.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.UserDaoImpl;
import com.service.UserDAO;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Integer id = Integer.parseInt(request.getParameter("userId"));
		String name = request.getParameter("name");
		String password = request.getParameter("password");
		String username = request.getParameter("username");
		String address = request.getParameter("address");
		HashMap<String, String> hm = new HashMap<String, String>();
	
		
		String chkname = request.getParameter("chkname");
		String chkpassword = request.getParameter("chkpassword");
		String chkusername = request.getParameter("chkusername");
		String chkaddress = request.getParameter("chkaddress");
		
		
		String inputname = request.getParameter("inputname");
		String inputpassword = request.getParameter("inputpassword");
		String inputusername = request.getParameter("inputusername");
		String inputaddress = request.getParameter("inputaddress");
		
		
		
		/*System.out.println("id from broweser : " + id);
		System.out.println("update parameter");
		
		System.out.println("update input for name :" + inputname);
		System.out.println(inputname);
		System.out.println(inputpassword);
		System.out.println(inputusername);
		System.out.println(inputaddress);
		
		System.out.println("Checkbox info:");
		System.out.println(chkname);
		System.out.println(chkpassword);
		System.out.println(chkusername);
		System.out.println(chkaddress);*/
		
		if(chkname != null && (!inputname.equals("") && inputname != null) )
		{
			hm.put("name", inputname);
		}
		if(chkpassword != null && (!inputpassword.equals("") && inputpassword!= null))
		{
			hm.put("password", inputpassword);
		}
		if(chkusername != null && (!inputusername.equals("") && inputusername != null) )
		{
			hm.put("username", inputusername);
		}
		if(chkaddress != null && (!inputaddress.equals("") && inputaddress!= null ) )
		{
			hm.put("address", inputaddress);
		}
		
		System.out.println(hm);
		
		PrintWriter out = response.getWriter();
		
		out.print("<html>"
				+ "<body>"
				+ "Selected User Details : <br>"
				+ "<b> UserId : </b>" + id
				+ "<br>"
				+ "<b>Username : </b>" + username
				+ "<br>"
				+ "<b>Name : </b>" + name
				+ "<br>"
				+ "<b>Password : </b>" + password
				+ "<br>"
				+ "<b>Address : </b>" + address	
				);
			
		
		UserDAO user = new UserDaoImpl();
		
		if(user.update(id, hm))
		{
			out.println("<br>Info updated sucessfully....");
		//	response.sendRedirect("ListUsers.jsp");
			out.println("<br>Info updated sucessfully222....");
			request.getRequestDispatcher("ListUsers.jsp").include(request, response);
			return;
			
			/*
			 * request.getRequestDispatcher("ListUsers.jsp").include(request, response);
			 * return;
			 */
		}
		else
		{
			out.println("<br>Info updated Failed....");
		}
		
		out.print("</body><html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
