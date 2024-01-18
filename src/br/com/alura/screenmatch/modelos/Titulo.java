package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;


public class Titulo implements Comparable<Titulo> {


    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    private int duracaoEmMinutos;//classe public dentro do pacote estruturado.

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }


    public Titulo(TituloOmdb meuTituloOmbdb) {
        this.nome = meuTituloOmbdb.title();
        if (meuTituloOmbdb.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("Não conseguiu converter o ano " +
                    "porque tem mais de 4 caractere.");

        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmbdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmbdb.runtime().substring(0,2));
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme : " + nome);
        System.out.println("Ano de laçamento: "+ anoDeLancamento);//No caso imprime a ficha tecnica //primeiro metodo da nossa classe exibir a ficha tecnica
        System.out.println("Duranção em minutos : " + duracaoEmMinutos);
        System.out.println("Incluido no plano : "+ incluidoNoPlano);
    }
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacao ++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes/ totalDeAvaliacao;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) { //parametro (string nome)
        this.nome = nome;//o nome roxo é o atributo.
    }           
    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public boolean getIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public int getTotalDeAvaliacao(){
        return this.totalDeAvaliacao;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "(nome = " + nome +
                ", anoDeLancamento = " + anoDeLancamento + "," +
                "  duração = " + duracaoEmMinutos + ")";
    }
}

