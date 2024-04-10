package classes;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Create {
	public Create() {
	}
	
	public void Create_user(User usr) {
		DBConnect db=new DBConnect();
		Connection connex=db.connecter();
		PreparedStatement pst=null;
		try {
			String sql="INSERT INTO utilsateurs (username,mdp,email,tel,adresse) VALUES (?,?,?,?,?)";
			pst=connex.prepareStatement(sql);
			pst.setString(1, usr.getUsername());
			pst.setString(2, usr.getmdp());
			pst.setString(3, usr.getemail());
			pst.setString(4, usr.getTel());
			pst.setString(5, usr.getAdresse());
			System.out.println(pst);
			pst.executeUpdate();
			System.out.println("insere");
			
		}
		catch(SQLException e)
		{
			System.out.println("non insere");
		}
		
	}
	
	public void Create_article(Article art) {
		DBConnect db=new DBConnect();
		Connection connex=db.connecter();
		PreparedStatement pst=null;
		try {
			String sql="INSERT INTO article (sujet,desciption,nb_jaime,nb_naime) VALUES (?,?,?,?)";
			String s=String.valueOf(art.getN_naime());
			pst=connex.prepareStatement(sql);
			pst.setString(1, art.getSujet());
			pst.setString(2, art.getDescription());
			pst.setString(3, String.valueOf(art.getN_aime()));
			pst.setString(4, s);
			pst.executeUpdate();
			System.out.println("insere");
			
		}
		catch(SQLException e)
		{
			System.out.println("non insere");
		}
		
	}
	
}
