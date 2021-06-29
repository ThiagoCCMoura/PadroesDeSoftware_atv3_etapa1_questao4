public abstract class ContatoBuilder{
    abstract void  setNome(String nome);
    abstract void  setEndereco(String endereco);
    abstract void  setTelefone(String telefone);
    abstract void  setEmail(String email);
    public abstract Contato getContato();
}