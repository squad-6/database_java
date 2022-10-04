package acesso_escola;


public class doacao {
		private int id_doacao;
		private String item_doacao;
		
		public doacao () {
	        
	    }
		
		public doacao(int id_doacao, String item_doacao) {
			this.id_doacao = id_doacao;
			this.item_doacao = item_doacao;
		}

		public int getId_doacao() {
			return id_doacao;
		}

		public void setId_doacao(int id_doacao) {
			this.id_doacao = id_doacao;
		}

		public String getItem_doacao() {
			return item_doacao;
		}

		public void setItem_doacao(String item_doacao) {
			this.item_doacao = item_doacao;
		}
		
		@Override
		public String toString() {
			return "Autores [id_doacao=" + id_doacao + ", item_doacao=" + item_doacao + "]";
		}

		public static void add(doacao doacao) {
			// TODO Auto-generated method stub
			
		}
	    
	    
	    
}
