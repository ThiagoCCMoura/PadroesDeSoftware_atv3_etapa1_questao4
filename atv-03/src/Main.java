public class Main {

    public static void main(String[] args) {
        Director director  = new Director("Arthur Lima", "Rua 45, 31", "98983064375", "arthur@email.com");

        ContatoBuilder c1 = new ContatoInternetBuilder();
        director.fazContatoInternet(c1);
        System.out.println(c1.toString());


        ContatoBuilder c2 = new ContatoTelefoneBuilder();
        director.fazContatoTelefone(c2);
        System.out.println(c2.toString());

        ContatoBuilder c3 = new ContatoCompletoBuilder();
        director.fazContatoCompleto(c3);
        System.out.println(c3.toString());
    }
}
