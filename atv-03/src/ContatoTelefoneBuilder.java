public class ContatoTelefoneBuilder extends ContatoBuilder{
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
        contato.setTelefone(telefone);
    }

    @Override
    void setEmail(String email) {
    }

    @Override
    public Contato getContato() {
        return contato;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + contato.getNome() + '\'' +
                ", telefone='" + contato.getTelefone() + '\'' +
                '}';
    }
}
