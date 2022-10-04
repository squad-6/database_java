package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import Connection.ConnectionMySQL;
import acesso_escola.parceiro;

public class ParceiroDAO {
	
	// METODO SAVE
	public void save(parceiro parceiro) {

		String sql = "INSERT INTO parceiro  (nome_parceiro, estado_parceiro, cidade_parceiro,email_parceiro,senha_parceiro,ramo_atividade_parceiro,item_parceiro) VALUES \r\n"
				+ "(?,?,?,?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// criar um conexão com um banco de dados
			conn = ConnectionMySQL.createConnectionMySQL();

			// criamos uma (prepareStatement) , para execurta uma query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			// adiciona os valores que são esperado pela query
			pstm.setString(1, parceiro.getNome_parceiro());
			pstm.setString(2, parceiro.getEstado_parceiro());
			pstm.setString(3, parceiro.getCidade_parceiro());
			pstm.setString(4, parceiro.getEmail_parceiro());
			pstm.setString(5, parceiro.getSenha_parceiro());
			pstm.setString(6, parceiro.getRamo_atividade_parceiro());
			pstm.setString(7, parceiro.getItem_parceiro());
			// executar a query
			pstm.execute();

			System.out.println("contato salvo com sucesso!");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			// fecha conexões

			try {
				if (pstm != null) {
					pstm.close();
				}

				if (conn != null) {
					conn.close();
				}

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
	// METODO READ
	public List<parceiro> getParceiro() {

		String sql = "SELECT * FROM parceiro ";

		List<parceiro> parceiro = new ArrayList<parceiro>();

		Connection conn = null;
		PreparedStatement pstm = null;
		// classe que vai recupera os dados do banco. ***SELECT***
		ResultSet rset = null;
		try {

			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = (PreparedStatement) conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {

				parceiro parceiros = new parceiro();

				parceiros.setId_parceiro(rset.getInt("id_parceiro"));
				parceiros.setNome_parceiro(rset.getString("nome_parceiro"));
				parceiros.setEstado_parceiro(rset.getString("estado_parceiro"));
				parceiros.setCidade_parceiro(rset.getString("cidade_parceiro"));
				parceiros.setEmail_parceiro(rset.getString("email_parceiro"));
				parceiros.setSenha_parceiro(rset.getString("senha_parceiro"));
				parceiros.setRamo_atividade_parceiro(rset.getString("ramo_atividade_parceiro"));
				parceiros.setItem_parceiro(rset.getString("item_parceiro"));

				parceiro.add(parceiros);
			}

			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				
				try {
					if(rset != null) {
						rset.close();
					}
					if(pstm != null) {
						pstm.close();
					}
					if (conn != null) {
						conn.close();
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
			}// chave ** finally**
		
		return parceiro;

	}
	// METODO UPDATE
	
	public void Update (parceiro parceiro)  {
		
		String sql = "UPDATE parceiro SET nome_parceiro = ?, estado_parceiro = ?, cidade_parceiro = ?,email_parceiro = ?,senha_parceiro = ?,ramo_atividade_parceiro = ?,item_parceiro = ? "+
	"WHERE id_parceiro = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//criar conexão com banco
			conn = ConnectionMySQL.createConnectionMySQL();
			// criar a classe para executar o Query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			//add valores atualizados
			pstm.setString(1, parceiro.getNome_parceiro());
			pstm.setString(2, parceiro.getEstado_parceiro());
			pstm.setString(3, parceiro.getCidade_parceiro());
			pstm.setString(4, parceiro.getEmail_parceiro());
			pstm.setString(5, parceiro.getSenha_parceiro());
			pstm.setString(6, parceiro.getRamo_atividade_parceiro());
			pstm.setString(7, parceiro.getItem_parceiro());
			
			//qual é o ID que deseja atualizar
			pstm.setInt(8, parceiro.getId_parceiro());
			
			//Executar a query
			pstm.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				
				if(pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			}catch (Exception e) {
				e.printStackTrace();
			}
		}

	}//final do update
	
	// METODO DELETE
	
	public void deleteById (int id_parceiro) {
		
		String sql = "DELETE  FROM parceiro WHERE id_parceiro = ? ";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try {
			//criar conexão com banco
			conn = ConnectionMySQL.createConnectionMySQL();
			// criar a classe para executar o Query
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			pstm.setInt(1, id_parceiro);
			
			pstm.execute();
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if (pstm != null) {
				pstm.close();
			} 	if (conn != null) {
				conn.close();
			}
				
			}catch (Exception e) {
				e.printStackTrace();
			}
			
		}
	}
}

