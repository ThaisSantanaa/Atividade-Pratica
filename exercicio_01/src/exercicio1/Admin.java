package exercicio1;

public class Admin extends Usuario {
	
	private String nivelAcesso;
	
	public Admin(String nome, String email, String nivelAcesso) throws Exception {
		super(nome, email);
		
		this.nivelAcesso = nivelAcesso;
		
	}
	
	@Override
	public String getDescricao() {
		return super.getDescricao() + "Nível: "  +  nivelAcesso;
	}

}