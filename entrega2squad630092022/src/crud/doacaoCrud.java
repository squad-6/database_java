package crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import acesso_escola.doacao;
import dao.DoacaoDAO;
 

public class doacaoCrud {

	public static void main(String[] args) {

		DoacaoDAO doacaoDAO = new DoacaoDAO();

		Scanner s = new Scanner(System.in);
		int opcao = 0;
		int posicao = 0;
		int id_doacao = 0;
		String item_doacao = "";

		do {
			System.out.println("=== CRUD DOAÇÕES ===");
			System.out.println("1 - Cadastrar item da doação");
			System.out.println("2 - Consultar item doado");
			System.out.println("3 - Atualizar item doado");
			System.out.println("4 - Deletar item doado");
			System.out.println("5 - Buscar por id");
			System.out.println("0 - Sair");
			opcao = s.nextInt();
			s.nextLine();
			
			List<doacao> doacao = new ArrayList<doacao>();
			
			switch (opcao) {
			
			case 1:
				// CREATE
				System.out.println("**Cadastrar Item**");
                System.out.println("Digite o nome do item: ");
                item_doacao = s.nextLine();
                doacao Doacao = new doacao();
                Doacao.setId_doacao(id_doacao);
                Doacao.setItem_doacao(item_doacao);
                doacaoDAO.save(Doacao);
                System.out.println("\n***Cadastrado**\n");
                break;
                
                
			case 2:
				// READ
				for (doacao a : doacaoDAO.getDoacao()) {
					System.out.println("Id_doacao: " + a.getId_doacao() + " Item_doacao: " + a.getItem_doacao() + "\n");
				}
				break;
				
			case 3:
				// UPDATE
				System.out.println("Digite o id da doação: ");
				posicao = s.nextInt();
				s.nextLine();
				System.out.println("Digite o nome da doação: ");
				item_doacao = s.nextLine();

				doacao a2 = new doacao(posicao, item_doacao);
				doacaoDAO.update(a2);
				System.out.println("Atualizado \n");
				break;
				
			case 4:
				// DELETE
				
				System.out.println("Digite o id para a exclusão: ");
				posicao = s.nextInt();

				// Remove o escola por ID
				doacaoDAO.deleteById(posicao);
				System.out.println("*Escola excluída*");
				break;
				
			
				
			default:
				System.out.println(opcao != 0 ? "Opcao invalida, digite novamente." : "");
				break;
			}
			} while (opcao != 0);

			System.out.println("Sistema finalizado");
			s.close();
		
	
	}
		
}
	

