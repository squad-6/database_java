package crud;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import dao.ParceiroDAO;
import acesso_escola.parceiro;

public class ParceirosCrud {

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
			
		//instancia da lista que vai armazenar 
			List<parceiro> parceiro = new ArrayList<parceiro>();
			
			
		//MENU
			
			do {
				System.out.println("--- CRUD PARCEIRO----");
				System.out.println("1 - CADASTRO DE NOME");
				System.out.println("2 - CADASTRO DE ESTADO");
				System.out.println("3 - CADASTRO DE CIDADE");
				System.out.println("4 - CADASTRO DE E-MAIL");
				System.out.println("5 - CADASTRO DE SENHA");
				System.out.println("6 - CADASTRO DE PONTO DE ATIVIDADE");
				System.out.println("0 - SAIR");
				
				opcao = teclado.nextInt();
	            teclado.nextLine();   
				 
		//NAVERGAÇÃO DO CRUD
				switch (opcao){
				case 1:
					//CREATE
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
					
					
					parceiroDAO.save(pa);
					System.out.println("\n***Cadastro**\n");
					break;
				
				case 2:for (parceiro a : ParceiroDAO.getParceiroDAO()) {
					System.out.println("id: "+ a.getId_parceiro() +"nome: " + a.getNome_parceiro());
				}
				
				System.out.println("Passe o Id para exclusão");
				break;
				
				case 3:
					//DELETE 
					System.out.println();
				
				
				// finala
				default:
					System.out.println(opcao != 0 ? "\n Opção é inválida, " + "tente novamente.\n" : "");
					break;
				
		
	}while (opcao != 0);
			teclado.close();
			System.out.println("*Finalizado*");

}// chave static
}// chave class