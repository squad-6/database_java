package crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import dao.ParceiroDAO;
import acesso_escola.parceiro;

public class parceiroCrud {

	public static void main(String[] args) {

		// Criar instancia do DAO para utilizar os métodos
		ParceiroDAO parceiroDAO = new ParceiroDAO();

		Scanner teclado = new Scanner(System.in);
		int opcao = 0;
		int posicao = 0;
		int id_parceiro = 0;

		String nome_parceiro = "";
		String estado_parceiro = "";
		String cidade_parceiro = "";
		String email_parceiro = "";
		String senha_parceiro = "";
		String ramo_atividade_parceiro = "";
		String item_parceiro = "";

		// instancia da lista que vai armazenar
		List<parceiro> parceiro = new ArrayList<parceiro>();

		// MENU

		do {
			System.out.println("--- CRUD PARCEIRO----");
			System.out.println("1 - CADASTRO DO PARCEIRO");
			System.out.println("2 - CONSULTAR PARCEIRO");
			System.out.println("3 - DELETA PARCEIRO");
			System.out.println("4 - ATUALIZAR PARCEIRO");
			System.out.println("0 - SAIR");

			opcao = teclado.nextInt();
			teclado.nextLine();

			// NAVERGAÇÃO DO CRUD
			switch (opcao) {
			case 1:
				// CREATE
				System.out.println("**CADASTRO DO PARCEIROS");

				System.out.println("DIGITE SEU NOME: ");
				nome_parceiro = teclado.nextLine();

				System.out.println("Digite o estado : ");
				estado_parceiro = teclado.nextLine();

				System.out.println("Digite a cidade : ");
				cidade_parceiro = teclado.nextLine();

				System.out.println("Digite o e-mail: ");
				email_parceiro = teclado.nextLine();

				System.out.println("Digite o senha: ");
				senha_parceiro = teclado.nextLine();

				System.out.println("Cadastre sua atividade : ");
				ramo_atividade_parceiro = teclado.nextLine();

				System.out.println("Cadastre sua adoção : ");
				item_parceiro = teclado.nextLine();

				parceiro pa = new parceiro();

				pa.setNome_parceiro(nome_parceiro);
				pa.setEstado_parceiro(estado_parceiro);
				pa.setCidade_parceiro(cidade_parceiro);
				pa.setEmail_parceiro(email_parceiro);
				pa.setSenha_parceiro(senha_parceiro);
				pa.setRamo_atividade_parceiro(ramo_atividade_parceiro);
				pa.setItem_parceiro(item_parceiro);

				parceiroDAO.save(pa);

				System.out.println("\n***Cadastro**\n");
				break;

			// READ ---> Lista com todos os Parceiros do banco
			// esse dao vem de la de cima
			case 2:
				for (parceiro a : parceiroDAO.getParceiro()) {
					System.out.println("id: " + a.getId_parceiro() + " nome: " + a.getNome_parceiro());
					
				}

				System.out.println("Finalizada");
				break;

			// final do READ

			case 3:
				// DELETE
				System.out.println("Passe o ID para exclusão: ");
				posicao = teclado.nextInt();

				// Remove p escola por ID
				// talvez o erro la de cima---> deleteBy(id_parceiros)
				parceiroDAO.deleteById(posicao);
				System.out.println("Excluíndo");
				break;

			case 4:
				// UPDATE
				System.out.println("Digite o id da Parceiro: ");
				id_parceiro = teclado.nextInt();

				System.out.println("Digite o novo nome da Parceiro: ");
				nome_parceiro = teclado.next();

				parceiro parceiroNw = new parceiro(id_parceiro, nome_parceiro, estado_parceiro, cidade_parceiro,
						email_parceiro, senha_parceiro, ramo_atividade_parceiro, item_parceiro, 0, 0, null);
				parceiroDAO.Update(parceiroNw);
				break;

			// finala
			default:
				System.out.println(opcao != 0 ? "\n Opção é inválida, " + "tente novamente.\n" : "");
				break;
			}
		} while (opcao != 0);
		teclado.close();
		System.out.println("*Finalizado*");

	}// chave static
}// chave class