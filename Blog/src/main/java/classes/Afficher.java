package classes;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Afficher {
	ArrayList<Article> lcc;
	public Afficher() {
		
	}
	public ArrayList<Article> listerArticle()
	{
		lcc=new ArrayList<Article>();
		DBConnect db=new DBConnect();
		Connection connex=db.connecter();
		PreparedStatement pst=null;
		try
		{
			String sql="SELECT * FROM article";
			pst=connex.prepareStatement(sql) ;
			ResultSet res= pst.executeQuery() ;
			while(res.next()){
				lcc.add(new Article(res.getString("sujet"),res.getString("desciption"),res.getInt("nb_jaime"),res.getInt("nb_naime")));
			}
		}
		catch(SQLException e)
		{
			System.out.println("misy erreur ny liste");
			e.printStackTrace();
		}
		return lcc;
	}
}
