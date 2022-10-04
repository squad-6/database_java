package testedao;

import acesso_escola.doacao;
import dao.DoacaoDAO;

public class teste {
	
public static void main(String[] args) {
        
        DoacaoDAO DoacaoDAO = new DoacaoDAO();
        
        
        doacao Doacao = new doacao();
        Doacao.setItem_doacao("Rian");

        DoacaoDAO.save(Doacao);
    }
}
