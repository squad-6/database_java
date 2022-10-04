package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import Connection.ConnectionMySQL;
import acesso_escola.doacao;

public class DoacaoDAO {

	public void save(doacao Doacao) {

		String sql = "INSERT INTO doacao (id_doacao, item_doacao) VALUES (?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {

			// criar um conexão com um banco de dados

			conn = ConnectionMySQL.createConnectionMySQL();

			// criamos uma (prepareStatement) , para execurta uma query

			pstm = (PreparedStatement) conn.prepareStatement(sql);

			// adiciona os valores que são esperado pela query

			pstm.setInt(1, Doacao.getId_doacao());
			pstm.setString(2, Doacao.getItem_doacao());
			// pstm.setInt(3, Doacao.getId_parceiroFK());
			// pstm.setInt(4, Doacao.getId_escolaFK());

			// executar a query
			pstm.execute();

			System.out.println("Item salvo com sucesso!");
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

	// update
	public void update(doacao Doacao) {

		String sql = "UPDATE doacao SET item_doacao = ? WHERE id_doacao= ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = conn.prepareStatement(sql);

			// adiciona o valor nos parametros

			pstm.setInt(1, Doacao.getId_doacao());
			pstm.setString(1, Doacao.getItem_doacao());

			// Executa a sql para inserção dos dados
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

	// DELETE
	public void deleteById(int id_doacao) {

		String sql = "DELETE FROM doacao WHERE id_doacao = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = (PreparedStatement) conn.prepareStatement(sql);

			pstm.setInt(1, id_doacao);

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

	

	public List<doacao> getDoacao() {

		String sql = "SELECT * FROM doacao";

		List<doacao> doacao = new ArrayList<doacao>(); // escolas

		Connection conn = null;
		PreparedStatement pstm = null;

		// classe que vai recupera os dados do banco. ***SELECT***
		ResultSet rset = null;
		try {
			conn = ConnectionMySQL.createConnectionMySQL();

			pstm = (PreparedStatement) conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			while (rset.next()) {

				doacao Doacao = new doacao();

				// recupera o id da escola
				Doacao.setId_doacao(rset.getInt("id_doacao"));

				// recupera o nome da escola
				Doacao.setItem_doacao(rset.getString("item_doacao"));

				// recupera o estado
				// Doacao.setId_parceiroFK(rset.getInt("id_parceiroFK"));

				// recupera a Cidade
				// Doacao.setId_escolaFK(rset.getInt("id_escolaFK"));

				doacao.add(Doacao);
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
					conn.commit();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		return doacao;

	}

}
