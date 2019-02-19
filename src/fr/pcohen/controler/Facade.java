package fr.pcohen.controler;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.pcohen.application.Sys;

/**
 * Servlet implementation class Facade
 */
@WebServlet(description = "Main controler", urlPatterns = { "/Facade" })
public class Facade extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private RequestDispatcher disp;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Sys.out("Dans doGet du controleur");
		
		// getting the path
		String path = request.getPathInfo();
		Sys.out("path : "+path);
		
		if (path == null || path.equals("/")) 		{Sys.out("Dans if doHome");doHome(request, response);}
		else {
			request.setAttribute("msgErreur", "404 - URL not found !!! ");
			doHome(request, response);
		}
		
		
	}

	/**
	 * Redirect to /Home Servlet
	 * @param request
	 * @param response
	 * @throws ServletException
	 * @throws IOException
	 */
	private void doHome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Sys.out("In DoHome");
		disp = request.getRequestDispatcher("/Home");
		disp.forward(request,response);
	}	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
