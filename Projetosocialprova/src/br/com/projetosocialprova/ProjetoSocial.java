package br.com.projetosocialprova;
import javax.swing.JOptionPane;




public class ProjetoSocial {

    public static void main(String[] args) {

        String op = JOptionPane.showInputDialog("(1) Distribuição de Alimentos \n(2) Trabalho Voluntário \n(3) Sair");


        switch (op) {
            case "1":
                DistribuicaoAlimento x = new DistribuicaoAlimento("Flavio Alimento", "Flavio QTDE", "Flavio Descrição","Flavio Endereço", "Flavio Inicio", "Flavio Data FInal");

                x.validarProjeto("Distribuição de Alimentos Flávio");
                JOptionPane.showMessageDialog(null, x.imprimeProjeto());

                break;
            case "2":
                TrabalhoVoluntario y = new TrabalhoVoluntario("Flavio Alimento", 3, "Flavio descrição","Flávio Endereço", "Flavio data Inicio", "Flavio Data Final");
                y.validarProjeto("Flávio Trabalho Voluntario");
                JOptionPane.showMessageDialog(null, y.imprimeProjeto());
                break;
            case "3":
                JOptionPane.showMessageDialog(null, "Tmjjjjj até mais!!!");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Resposta Invalida");
        }


    }

}
