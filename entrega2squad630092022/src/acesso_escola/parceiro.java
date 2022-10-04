package acesso_escola;

public class parceiro {
	
	// Atributos
	private int id_parceiro;
	private String nome_parceiro;
	private String estado_parceiro;
	private String cidade_parceiro;
	private String email_parceiro;
	private String senha_parceiro;
	private String ramo_atividade_parceiro;
	private String item_parceiro;
	private int id_item_pareceiro;
	private int id_doacaoFK;
	
	// Contrutores
    public parceiro() {
		
	}
	public parceiro(int id_parceiro, String nome_parceiro, String estado_pareceiro, String cidade_parceiro,

			String email_parceiro, String senha_parceiro, String ramo_atividade_parceiro, String item_parceiro,
			int id_item_pareceiro, int id_doacaoFK, String estado_parceiro) {
		super();
		this.id_parceiro = id_parceiro;
		this.nome_parceiro = nome_parceiro;
		this.estado_parceiro = estado_parceiro;
		this.cidade_parceiro = cidade_parceiro;
		this.email_parceiro = email_parceiro;
		this.senha_parceiro = senha_parceiro;
		this.ramo_atividade_parceiro = ramo_atividade_parceiro;
		this.item_parceiro = item_parceiro;
		this.id_item_pareceiro = id_item_pareceiro;
		this.id_doacaoFK = id_doacaoFK;
	}
	
	// Gets e Sets
	public int getId_parceiro() {
		return id_parceiro;
	}
	public void setId_parceiro(int id_parceiro) {
		this.id_parceiro = id_parceiro;
	}
	public String getNome_parceiro() {
		return nome_parceiro;
	}
	public void setNome_parceiro(String nome_parceiro) {
		this.nome_parceiro = nome_parceiro;
	}
	public String getEstado_parceiro() {
		return estado_parceiro;
	}
	public void setEstado_parceiro(String estado_parceiro) {
		this.estado_parceiro = estado_parceiro;
	}
	public String getCidade_parceiro() {
		return cidade_parceiro;
	}
	public void setCidade_parceiro(String cidade_parceiro) {
		this.cidade_parceiro = cidade_parceiro;
	}
	public String getEmail_parceiro() {
		return email_parceiro;
	}
	public void setEmail_parceiro(String email_parceiro) {
		this.email_parceiro = email_parceiro;
	}
	public String getSenha_parceiro() {
		return senha_parceiro;
	}
	public void setSenha_parceiro(String senha_parceiro) {
		this.senha_parceiro = senha_parceiro;
	}
	public String getRamo_atividade_parceiro() {
		return ramo_atividade_parceiro;
	}
	public void setRamo_atividade_parceiro(String ramo_atividade_parceiro) {
		this.ramo_atividade_parceiro = ramo_atividade_parceiro;
	}
	public String getItem_parceiro() {
		return item_parceiro;
	}
	public void setItem_parceiro(String item_parceiro) {
		this.item_parceiro = item_parceiro;
	}
	public int getId_item_pareceiro() {
		return id_item_pareceiro;
	}
	public void setId_item_pareceiro(int id_item_pareceiro) {
		this.id_item_pareceiro = id_item_pareceiro;
	}
	public int getId_doacaoFK() {
		return id_doacaoFK;
	}
	public void setId_doacaoFK(int id_doacaoFK) {
		this.id_doacaoFK = id_doacaoFK;
	}
	
	
	

}
