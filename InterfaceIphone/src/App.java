public class App {
    public static void main(String[] args) throws Exception {
        ReprodutorMusical musica = new ReprodutorMusical();
        musica.tocar();
        musica.pausar();
        musica.selecionarMusica("red hot");

        AparelhoTelefonico celular = new AparelhoTelefonico();
        celular.ligar("8599990626");
        celular.atender();
        celular.iniciarCorreioVoz();

        NavegadorInternet navega = new NavegadorInternet();
        navega.exibirPagina("xyz");
        navega.adicionarNovaAba();
        navega.atualizarPagina();
    }
}
