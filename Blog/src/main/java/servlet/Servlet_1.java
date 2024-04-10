package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import classes.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.io.PrintWriter;


public class Servlet_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet_1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sujet=request.getParameter("sujet");
		String desciption=request.getParameter("desciption");
		Article cs=new Article(sujet,desciption,0,0);
		Create cr=new Create();
		try {
			cr.Create_article(cs);
		}
		catch (Exception e) {
			System.out.println("erreur lc : "+e);
		}
		
		this.getServletContext().getRequestDispatcher("/content.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sujet=request.getParameter("id");
		PrintWriter p=response.getWriter();
		String sql="";
		DBConnect db=new DBConnect();
		Connection connex=db.connecter();
		PreparedStatement pst=null;
		try {
			
			sql="UPDATE article set nb_jaime=nb_jaime+1 where sujet='"+sujet+"'";
			pst=connex.prepareStatement(sql);
			pst.executeUpdate();							
	}
		catch(SQLException e) {
			System.out.println("pu non trouve");
		}
		this.getServletContext().getRequestDispatcher("/content.jsp").forward(request, response);
		
	}

}
