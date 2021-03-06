package com.allianz.shopping.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.allianz.shopping.dao.ProductDAO;
import com.allianz.shopping.dao.ProductDAOImpl;
import com.allianz.shopping.model.Product;

/**
 * Servlet implementation class ProductController
 */
@WebServlet("/ProductController")
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static ProductDAO dao = new ProductDAOImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hi");
		String action = request.getParameter("action");
		
		System.out.println(action);
		if(action != null && action.equals("delete"))
		{
			String id = request.getParameter("id");
			
			System.out.println("Inside deltete if and id" + id);
			
			boolean flag = dao.deleteProduct(Integer.parseInt(id));
			
			System.out.println("Value of flag: " + flag);
			
			if(flag)
			{
				response.sendRedirect("ProductController");
			}
		}
		else if(action != null && action.equals("edit"))
		{
			String id = request.getParameter("id");
			Product product = dao.getproductById(Integer.parseInt(id));
			
			if(product != null)
			{
				RequestDispatcher dispatcher = request.getRequestDispatcher("product.jsp");
				request.setAttribute("product", product);
				dispatcher.forward(request, response);
			}
		}
		else
		{
			List<Product> productList = dao.getAllProducts();
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("productList.jsp");
			request.setAttribute("productList", productList);
			dispatcher.forward(request, response);
		}	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
