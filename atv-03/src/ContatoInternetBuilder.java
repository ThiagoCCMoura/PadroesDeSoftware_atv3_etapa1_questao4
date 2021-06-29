public class ContatoInternetBuilder extends ContatoBuilder{
    protected Contato contato = new Contato();

    @Override
    void setNome(String nome) {
        contato.setNome(nome);
    }

    @Override
    void setEndereco(String endereco) {

    }

    @Override
    void setTelefone(String telefone) {

    }

    @Override
    void setEmail(String email) {
        contato.setEmail(email);
    }

    @Override
    public Contato getContato() {
        return contato;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + contato.getNome() + '\'' +
                ", email='" + contato.getEmail() + '\'' +
                '}';
    }
}
