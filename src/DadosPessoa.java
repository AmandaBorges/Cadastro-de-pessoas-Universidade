public class DadosPessoa {
//    QUESTÃO 1

    public static void main(String[] args){

        Universidade princeton = new Universidade();
        Universidade cambridge = new Universidade();
        princeton.setNome("Universidade de Princeton");
        cambridge.setNome("Universidade de Cambridge");


        Pessoa einstein = new Pessoa();
        einstein.setNome("Albert Einstein");
        einstein.setUniversidade(princeton);
        einstein.setDataNasci("14/3/1879");
        einstein.setAltura("1.70");
        einstein.mostraDados();
      //  einstein.getNomeUniversidade();

        Pessoa newton = new Pessoa();
        newton.setNome("Isaac Newton");
        newton.setUniversidade(cambridge);
        newton.setDataNasci("4/1/1643");
        newton.setAltura("1.75");
        newton.mostraDados();
     //   newton.getNomeUniversidade();














    }

}
