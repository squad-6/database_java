package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.ConnectionMySQL;
import acesso_escola.escola;

public class EscolaDAO {
	// create
	public void save(escola Escola) {

		// cria a query
		String sql = "INSERT INTO escola (nome_escola, estado_escola, cidade_escola, tel_escola, cep_escola, numero_escola, email_escola, senha_escola) VALUES (?,?,?,?,?,?,?,?)";
		// faz conexao
		Connection conn = null;
		PreparedStatement pstm = null;

		try {

			// criar um conexão com um banco de dados

			conn = ConnectionMySQL.createConnectionMySQL();

			// criamos uma (prepareStatement) , para execurta uma query

			pstm =  conn.prepareStatement(sql);

			// adiciona os valores que são esperado pela query

			pstm.setString(1, Escola.getNome_escola());
			pstm.setString(2, Escola.getEstado_escola());
			pstm.setString(3, Escola.getCidade_escola());
			pstm.setString(4, Escola.getTel_escola());
			pstm.setString(5, Escola.getCep_escola());
			pstm.setString(6, Escola.getNumero_escola());
			pstm.setString(7, Escola.getEmail_escola());
			pstm.setString(8, Escola.getSenha_escola());

			// executar a query//Executa a sql para inserção dos dados
			pstm.execute();

			System.out.println("Escola salva com sucesso!");
			
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

	//read
	public List<escola> getEscolas() {
		
		//cria a query 
		String sql = "SELECT * FROM escola ";
		
		//faz a lista que recebe as agencias
		List<escola> escola = new ArrayList<escola>();

		Connection conn = null;
		PreparedStatement pstm = null;

		// classe que vai recupera os dados do banco. ***SELECT***
		ResultSet rset = null;
		try {
			//executa a conexão com o banco
			conn = ConnectionMySQL.createConnectionMySQL();
			// executa a query
			pstm = conn.prepareStatement(sql);
			// captura o que foi executado no pstm
			rset = pstm.executeQuery();

		
			while (rset.next()) {

				escola ESCOLA = new escola();

				// recupera o id da escola
				ESCOLA.setId_escolaPK(rset.getInt("id_escola"));

				// recupera o nome da escola
				ESCOLA.setNome_escola(rset.getString("nome_escola"));

				// recupera o estado
				ESCOLA.setEstado_escola(rset.getString("estado_escola"));

				// recupera a Cidade
				ESCOLA.setCidade_escola(rset.getString("cidade_escola"));

				// recupera a Tel
				ESCOLA.setTel_escola(rset.getString("tel_escola"));

				// recupera a Cep
				ESCOLA.setCep_escola(rset.getString("cep_escola"));

				// recupera a numero
				ESCOLA.setNumero_escola(rset.getString("numero_escola"));

				// recupera a email
				ESCOLA.setEmail_escola(rset.getString("email_escola"));

				// recupera a email
				ESCOLA.setSenha_escola(rset.getString("senha_escola"));

				escola.add(ESCOLA);
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {

			try {

				if (rset != null) {
					rset.close();
				}

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

		return escola;

	}
	//update 
public void update1 (escola Escola) { 
		
		String sql = "UPDATE escola SET nome_escola = ? WHERE id_escolaPK= ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try { 
			conn = ConnectionMySQL.createConnectionMySQL();
			
			pstm = conn.prepareStatement(sql);
			
			// adiciona o valor nos parametros
			
			pstm.setInt(1, Escola.getId_escola_PK());
			pstm.setString(1, Escola.getNome_escola());
			pstm.setString(2, Escola.getEstado_escola());
			pstm.setString(3, Escola.getCidade_escola());
			pstm.setString(4, Escola.getTel_escola());
			pstm.setString(5, Escola.getCep_escola());
			pstm.setString(6, Escola.getNumero_escola());
			pstm.setString(7, Escola.getEmail_escola());
			pstm.setString(8, Escola.getSenha_escola());

			//Executa a sql para inserção dos dados
			pstm.execute();
			
		} catch (Exception e) { 
			e.printStackTrace();
		} finally { 
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
	
	//DELETE
	public void deleteById1(int id_escolaPK) { 
		
		String sql = "DELETE FROM escolas WHERE id_escolaPK = ?";
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		try { 
			conn = ConnectionMySQL.createConnectionMySQL();
			
			pstm = (PreparedStatement) conn.prepareStatement(sql);
			
			pstm.setInt(1, id_escolaPK);
			
			pstm.execute();
			
						
		} catch (Exception e) { 
			e.printStackTrace();
		} finally { 
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
	

	public void deleteById(int posicao) {
		// TODO Stub de método gerado automaticamente

	}

	public void update(escola escola1) {
		// TODO Stub de método gerado automaticamente

	}

	public void deleteById_escolaPK(int posicao) {
		// TODO Stub de método gerado automaticamente
		
	}

	public escola[] getEscola() {
		// TODO Stub de método gerado automaticamente
		return null;
	}

}
