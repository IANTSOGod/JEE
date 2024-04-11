package servlet;
import classes.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.*;



public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter p=response.getWriter();
		String username=request.getParameter("username");
		String mdp=request.getParameter("password");
		Verification ver=new Verification(username,mdp);
		if(ver.state=="marina") {
			this.getServletContext().getRequestDispatcher("/content.jsp").forward(request, response);
		}
		else {
			p.append("Login Failed");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter p=response.getWriter();
		String username=request.getParameter("username");
		String mdp=request.getParameter("password");
		String email=request.getParameter("email");
		String tel=request.getParameter("phone");
		String adresse=request.getParameter("adress");
		User usr=new User(username,mdp,email,tel,adresse);
		usr.presenter();
		Create creation=new Create();
		creation.Create_user(usr);
		p.append("<!DOCTYPE html>\n"
				+ "<html>\n"
				+ "<head>\n"
				+ "<meta charset=\"UTF-8\">\n"
				+ "<title>IBLOG</title>\n"
				+ "<link rel=\"stylesheet\" href=\"style.css\">\n"
				+ "</head>\n"
				+ "<body>\n"
				+ "<form method='get' action=\"/Blog/Servlet\">\n"
				+ "	<p class=\"textes\">Username</p>\n"
				+ "	<input type=\"text\" name=\"username\" required class=\"Input\"><br>\n"
				+ "	<p class=\"textes\">Password</p>\n"
				+ "	<input type=\"password\" name=\"password\" required class=\"Input\"><br>\n"
				+ "	Don't have an account ? Create one <a href=\"create_acccount.html\" class=\"lien\">here</a>\n"
				+ "	<input type=\"submit\" value=\"send\" class=\"pseudo-bouton\">\n"
				+ "</form>\n"
				+ "</body>\n"
				+ "</html>");
	}

}

