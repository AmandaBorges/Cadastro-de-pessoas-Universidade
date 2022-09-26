import java.util.Scanner;

public class CadastroPessoas {
    public static void main(String[] args) {

        Agenda ag = new Agenda();
        int qtdade_pessoas, index;
        String nome;


        System.out.println("Quantas pessoas desejas cadastrar? \n total de cadastro: ");
        Scanner in_teclado = new Scanner(System.in);
        qtdade_pessoas = in_teclado.nextInt();
        ag.quantidade_de_pessoa(qtdade_pessoas);


        for (int i = 0; i < qtdade_pessoas; i++) {
            Agenda.set_armazenaPessoa(i);
        }


        for (int i = 0; i < qtdade_pessoas; i++) {
            Agenda.get_imprimeAgenda(i);
        }


        System.out.println("Digite o nome da pessoa que procuras");
        in_teclado = new Scanner(System.in);
        nome = in_teclado.nextLine();
        int position = Agenda.buscaPessoa(nome);
        if (position >= 0) {
            System.out.println("O " + nome + " se encontra na posisao: " + (position + 1));
        } else {
            System.out.println("o nome desejado nao esta nesta lista");
        }


        System.out.println("Digite o numero de ordem da pessoa na lista: ");
        in_teclado = new Scanner(System.in);
        index = in_teclado.nextInt();
        for (int i = 0; i < qtdade_pessoas; i++) {
            if (i == (index - 1)) {
                Agenda.get_imprimeAgenda(i);
            }
        }


        System.out.println("Digite o numero de ordem da pessoa na lista que deseja remover: ");
        in_teclado = new Scanner(System.in);
        index = in_teclado.nextInt();
        for (int i = 0; i < qtdade_pessoas; i++) {
            if (i == (index - 1)) {
                Agenda.removePessoa(i);
            }
        }


        for (int i = 0; i < qtdade_pessoas; i++) {
            Agenda.get_imprimeAgenda(i);
        }
    }
}
