package servletPjtApp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ServletDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String Location = null;

    public ServletDemo() {
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String userName= request.getParameter("userName");
		HttpSession session = request.getSession();
		ServletContext context =request.getServletContext();
		if (userName != "" && userName !=null) {
			
					session.setAttribute("savedUserName", userName);
					context.setAttribute("savedUserName", userName);
					
		}
  		out.println("Request parameter has username as " + userName);
		out.println("Session parameter has username as " + (String)  session.getAttribute("savedUserName"));
		out.println("context parameter has username as " + (String)  context.getAttribute("savedUserName"));
		
		
		
		
	} 	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String UserName= request.getParameter("UserName");
		String FullName= request.getParameter("FullName");
		String Profession= request.getParameter("Profession");
		
		out.println("username :"+UserName);
		out.println("fullname :"+FullName);
		out.println("profession :"+Profession);
		
		//String Location= request.getParameter("location");
		
		String[] Location= request.getParameterValues("location");
		
		out.println(" you are at " + Location.length + "places");	
	      for (int i=0;i<Location.length; i++) { 
	    	  out.println("location is "+Location[i]);
	      }
	      
	 */     
	}
	 
}

