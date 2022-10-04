package acesso_escola;

	//create classes
	public class escola {
	  
	    private int id_escola_PK;
	
	    private String nome_escola;
	
	    private String estado_escola;
	   
	    private String cidade_escola;
	  
	    private String tel_escola;
	 
	    private String cep_escola;
	  
	    private String numero_escola;
	 
	    private String email_escola;
	
	    private String senha_escola;
	   
	    private int id_doacaoFK;
	    
	    public escola () {
	        
	    }

		public escola(int id_escola_PK, String nome_escola, String estado_escola, String cidade_escola, String tel_escola,
				String cep_escola, String numero_escola, String email_escola, String senha_escola, int id_doacaoFK) {
			super();
			this.id_escola_PK = id_escola_PK;
			this.nome_escola = nome_escola;
			this.estado_escola = estado_escola;
			this.cidade_escola = cidade_escola;
			this.tel_escola = tel_escola;
			this.cep_escola = cep_escola;
			this.numero_escola = numero_escola;
			this.email_escola = email_escola;
			this.senha_escola = senha_escola;
			this.id_doacaoFK = id_doacaoFK;
		}

		public escola(int id, String nome, String nome2) {
			// TODO Stub de construtor gerado automaticamente
		}

		public int getId_escola_PK() {
			return id_escola_PK;
		}

		public void setId_escola_PK(int id_escola_PK) {
			this.id_escola_PK = id_escola_PK;
		}

		public String getNome_escola() {
			return nome_escola;
		}

		public void setNome_escola(String nome_escola) {
			this.nome_escola = nome_escola;
		}

		public String getEstado_escola() {
			return estado_escola;
		}

		public void setEstado_escola(String i) {
			this.estado_escola = i;
		}

		public String getCidade_escola() {
			return cidade_escola;
		}

		public void setCidade_escola(String cidade_escola) {
			this.cidade_escola = cidade_escola;
		}

		public String getTel_escola() {
			return tel_escola;
		}

		public void setTel_escola(String tel_escola) {
			this.tel_escola = tel_escola;
		}

		public String getCep_escola() {
			return cep_escola;
		}

		public void setCep_escola(String cep_escola) {
			this.cep_escola = cep_escola;
		}

		public String getNumero_escola() {
			return numero_escola;
		}

		public void setNumero_escola(String numero_escola) {
			this.numero_escola = numero_escola;
		}

		public String getEmail_escola() {
			return email_escola;
		}

		public void setEmail_escola(String email_escola) {
			this.email_escola = email_escola;
		}

		public String getSenha_escola() {
			return senha_escola;
		}

		public void setSenha_escola(String senha_escola) {
			this.senha_escola = senha_escola;
		}

		public int getId_doacaoFK() {
			return id_doacaoFK;
		}

		public void setId_doacaoFK(int id_doacaoFK) {
			this.id_doacaoFK = id_doacaoFK;
		}

		public void setName(String string) {
			// TODO Stub de método gerado automaticamente
			
		}

		public void setId_escolaPK(int int1) {
			// TODO Stub de método gerado automaticamente
			
		}

		public static void add(escola escola) {
			// TODO Stub de método gerado automaticamente
			
		}

		public String getId_escolaPK() {
			// TODO Stub de método gerado automaticamente
			return null;
		}
	    
	    
	    
	}