package br.sceweb.modelo;

import java.sql.Connection;
import java.sql.SQLException;

import br.sceweb.servico.FabricaDeConexoes;





import com.mysql.jdbc.PreparedStatement;

public class EmpresaDAO {
	

		public String adiciona(Empresa empresa){
			try(Connection conn = new  FabricaDeConexoes().getConnection()){
				
			}catch(SQLException e){
				throw new RuntimeException(e);
			}
		
		return "Empresa cadastrada com sucesso";
		
		
		
	}

}
