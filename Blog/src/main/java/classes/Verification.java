package classes;

import java.util.ArrayList;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class Verification {
	ResultSet res;
	Statement stat;
	public String state;
	public Verification(String username,String mdp) {
		
			DBConnect db=new DBConnect();
			Connection connex=db.connecter();
//			PreparedStatement pst=null;
	
			try {
				
				   String req="Select username, mdp from utilsateurs where username='"+username+"' and mdp='"+mdp+"'";
				   stat=connex.createStatement();
				   res=stat.executeQuery(req);
				   boolean trouver=false;
				   if (res.next())
				   {
					   trouver=true;
				   }
				   if(trouver) {
				   		this.state="marina";
				   }
				
			}
			catch(Exception e) {
				e.printStackTrace();
				System.out.println("tsy voavaky");
			}

		
	}
}
