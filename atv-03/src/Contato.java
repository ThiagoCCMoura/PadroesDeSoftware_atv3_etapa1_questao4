public class Contato {

    private String nome;
    private String endereco;
    private String telefone;
    private String email;

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEmail() {
        return email;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    protected void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
