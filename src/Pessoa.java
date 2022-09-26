import java.util.Calendar;

public class Pessoa {
//    QUESTÃO 1
    private String nome;
    private String dataNasci;
    private String altura;

    private Universidade universidade;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasci() {
        return dataNasci;
    }

    public void setDataNasci(String dataNasci) {
        this.dataNasci = dataNasci;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public int calculeIdade(){
        int anoNascimento = Integer.parseInt(getDataNasci().split("/")[2]);
        int anoSistema = Calendar.getInstance().get(Calendar.YEAR);
        return anoSistema - anoNascimento;
    }
    public String informaNome(){
        return getNome();
    }

    public void mostraDados() {

        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de nascimento : " + this.dataNasci);
        System.out.println("Altura: " +this.getAltura());
        this.getNomeUniversidade();
        System.out.println("Se estivesse vivo estaria com  " + calculeIdade() + " anos");

        System.out.println(" - X - ");
        System.out.println("   ");

    }


    public Universidade getUniversidade() {
        return universidade;
    }

    public void setUniversidade(Universidade universidade) {
        this.universidade = universidade;
    }

    public  void getNomeUniversidade(){
        System.out.println(this.getNome() + " trabalha na " + this.getUniversidade().getNome() );
    }



}
