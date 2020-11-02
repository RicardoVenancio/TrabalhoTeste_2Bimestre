package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoHSQLDB {

	private static String usuario = "SA";
	private static String senha = "";
	private static String PathBase = "C:\\Users\\ricar\\Desktop\\Trabalho facul\\4_semestre\\ProjetosPrincipais\\ProgProjeto\\Dados\\condominio";
	private static String URL = "jdbc:hsqldb:file:" + PathBase + ";";
	
	public static Connection conectar() {
		try {
			return DriverManager.getConnection(URL, usuario, senha);
		} catch (SQLException e) {
			throw new Error("SQLException");
		}
	}
}
