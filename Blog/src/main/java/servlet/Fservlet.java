package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

import classes.DBConnect;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Fservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Fservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
			
			sql="UPDATE article set nb_naime=nb_naime+1 where sujet='"+sujet+"'";
			pst=connex.prepareStatement(sql);
			pst.executeUpdate();							
	}
		catch(SQLException e) {
			System.out.println("pu non trouve");
		}
		this.getServletContext().getRequestDispatcher("/content.jsp").forward(request, response);
	}

}
