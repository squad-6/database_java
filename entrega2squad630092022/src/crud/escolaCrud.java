package crud;

// CRUD

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import dao.EscolaDAO;
import acesso_escola.escola;

public class escolaCrud {

	public static void main(String[] args) {

		// Cria instancia do DAO para utilizar os métodos
		EscolaDAO escolaDAO = new EscolaDAO();

		Scanner input = new Scanner(System.in);

		// Setar as variáveis de navegação
		int opcao = 0;
		int posicao = 0;
		int id_escolaPK = 0;
		String nome_escola = "";
		String estado_escola = "";
		String cidade_escola = "";
		String tel_escola = "";
		String cep_escola = "";
		String numero_escola = "";
		String email_escola = "";
		String senha_escola = "";
		
		
		// Instancia da lista que vai armazenar

		List<escola> escola = new ArrayList<escola>();
		
		// MENU
		do {
			System.out.println("--- CRUD ESCOLA ---");
			System.out.println("1 - Cadastro Escola");
			System.out.println("2 - Consulta de Escola");
			System.out.println("3 - Delete de Escola");
			System.out.println("4 - Atualizar de Escola");
			System.out.println("0 - Sair");

			opcao = input.nextInt();
			input.nextLine();		

			// NAVEGAÇÃO DO CRUD
			switch (opcao) {
			case 1:
				// CREATE
				System.out.println("**Cadastrar Escola**");
				
				System.out.println("Digite o nome: ");
				nome_escola = input.nextLine();
				
				System.out.println("Digite o estado : ");
				estado_escola = input.nextLine();
		
				System.out.println("Digite a cidade : ");
				cidade_escola = input.nextLine();
	
				System.out.println("Digite o telefone com DD : ");
				tel_escola = input.nextLine();
				
				
				System.out.println("Digite o cep: ");
				cep_escola = input.nextLine();
				
				System.out.println("Digite o numero: ");
				numero_escola = input.nextLine();
				
				System.out.println("Digite o email: ");
				email_escola = input.nextLine();
				
				System.out.println("Cadastre sua senha : ");
				senha_escola = input.nextLine();
			
		
				escola ESCOLA1 = new escola();

				ESCOLA1.setNome_escola(nome_escola);
				ESCOLA1.setEstado_escola(estado_escola);
				ESCOLA1.setCidade_escola(cidade_escola);
				ESCOLA1.setTel_escola(tel_escola);
				ESCOLA1.setCep_escola(cep_escola);
				ESCOLA1.setCep_escola(numero_escola);
				ESCOLA1.setEmail_escola(email_escola);
				ESCOLA1.setSenha_escola(senha_escola);
	

				escolaDAO.save(ESCOLA1);

				System.out.println("\n***Cadastrado**\n");
				break;

			case 2:
                // READ
				//Lista com todos os autores do banco
				
                for (escola a : escolaDAO.getEscolas()) {
                    System.out.println("Id: " + a.getId_escolaPK() + " Nome: " + a.getNome_escola()
                    +  "Id: " + a.getEstado_escola() +"Id: " + a.getTel_escola() +"Id: " + a.getCep_escola() +"Id: " + a.getNumero_escola() +   
                    a.getEmail_escola() +a.getSenha_escola() +"\n");
                }
          						
				System.out.println("*Consulta Finalizada*");
				break;
				
			
			case 3:
				// DELETE
				
				System.out.println("Passe o ID para exclusão: ");
				posicao = input.nextInt();

				// Remove o escola por ID
				
				escolaDAO.deleteById_escolaPK(posicao);
				System.out.println("*Escola excluída*");
				break;
				
			
			case 4:
				// UPDATE
				System.out.println("Digite o id da escola: ");
				id_escolaPK = input.nextInt();
			
				System.out.println("Digite o novo nome da escola: ");
				nome_escola = input.nextLine();
					
				escola escolanew = new escola(id_escolaPK, nome_escola, estado_escola );
				escolaDAO.update(escolanew);
				break;
			default:
				System.out.println(opcao != 0 ? "\n Opção é inválida, " + "tente novamente.\n" : "");
				break;
			}
		} while (opcao != 0);
		input.close();
		System.out.println("*Finalizado*");

	}
}
