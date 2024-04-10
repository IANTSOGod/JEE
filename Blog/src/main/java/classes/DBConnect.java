package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnect {

    private Connection connex;
    private Statement etat = null;

    public DBConnect() {
        try {
            // Chargement du driver JDBC pour MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // En cas d'erreur, afficher un message d'erreur
            System.out.println("Erreur lors du chargement du driver JDBC");
            e.printStackTrace();
        }
        try {
            // Connexion à la base de données "blog" sur localhost avec l'utilisateur "nouvel_utilisateur" et le mot de passe "mot_de_passe"
            connex = DriverManager.getConnection("jdbc:mysql://localhost:3306/blog?0DateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC", "iantsogod", "");
            // Initialisation de l'objet Statement pour exécuter des requêtes SQL
            etat = connex.createStatement();
        } catch (SQLException e) {
            // En cas d'erreur, afficher un message d'erreur
            System.out.println("Erreur lors de la connexion à la base de données");
            e.printStackTrace();
        }
    }

    // Méthode pour obtenir la connexion à la base de données
    public Connection connecter() {
        return connex;
    }
}
