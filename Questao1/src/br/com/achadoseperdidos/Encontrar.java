package br.com.achadoseperdidos;

public class Encontrar {

    public static void main(String[] args) {

        Usuario usuario = new Usuario("Flávio", "flavioemail@gmail.com", "12356789");
        AchadoPerdido achadoPerdido = new AchadoPerdido("priemeirolivroflavio", "uma descrição qualquer", "flavio1", "não devolvido");
        achadoPerdido.buscarTitulo("Flavio Livro");
        achadoPerdido.visualizarDetalhes();
    }
}

