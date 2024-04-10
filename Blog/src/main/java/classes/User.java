package classes;

public class User {
	private String username;
	private String mdp;
	private String email;
	private String tel;
	private String adresse;
	
	public User(String username,String mdp,String email,String tel,String adresse) {
		this.username=username;
		this.mdp=mdp;
		this.email=email;
		this.tel=tel;
		this.adresse=adresse;
	}
	public void presenter() {
		System.out.println(this.username+" "+this.mdp+" "+this.email+" "+this.tel+" "+this.adresse);
	}
	public void setUsername(String usr) {
		this.username=usr;
	}
	public void setmdp(String mdp) {
		this.mdp=mdp;
	}
	public void setemail(String email) {
		this.email=email;
	}
	public void setTel(String settel) {
		this.tel=settel;
	}
	public void setAdresse(String addr) {
		this.adresse=addr;
	}
	public String getUsername() {
		return this.username;
	}
	public String getmdp() {
		return this.mdp;
	}
	public String getemail() {
		return this.email;
	}
	public String getTel() {
		return this.tel;
	}
	public String getAdresse() {
		return this.adresse;
	}
}
