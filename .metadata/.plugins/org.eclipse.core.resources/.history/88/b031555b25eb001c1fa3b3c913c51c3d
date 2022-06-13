package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
	public static void main(String[] args) throws SQLException {
		
		final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
		final String usuário = "root";
		final String senha = "619195jhow";
		
		Connection conexao = DriverManager.getConnection(url, usuário, senha);
		
		System.out.println("conexão executada com sucesso");
		conexao.close();	
	
	}
}
