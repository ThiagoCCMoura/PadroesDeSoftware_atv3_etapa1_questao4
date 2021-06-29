public class Director{

	private String nome;
	private String endereco;
	private String telefone;
	private String email;

	public Director(String nome, String endereco, String telefone, String email){
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.email = email;
	}

	public void fazContatoInternet(ContatoBuilder contatoBuilder){
		contatoBuilder.setNome(this.nome);
		contatoBuilder.setEmail(this.email);
	}

	public void fazContatoTelefone(ContatoBuilder contatoBuilder){
		contatoBuilder.setNome(this.nome);
		contatoBuilder.setTelefone(this.telefone);
	}

	public void fazContatoCompleto(ContatoBuilder contatoBuilder){
		contatoBuilder.setNome(this.nome);
		contatoBuilder.setEndereco(this.endereco);
		contatoBuilder.setTelefone(this.telefone);
		contatoBuilder.setEmail(this.email);
	}
}