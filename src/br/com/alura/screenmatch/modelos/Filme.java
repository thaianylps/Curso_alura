package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {

    private String diretor;

    public Filme(String nome, int anoDelancamento) {
        super(nome, anoDelancamento);

        // this.setNome(nome);//inicia o atributo
    }

    public String getDiretor() {
   return diretor;
 }

    public void setDiretor(String diretor) {
   this.diretor = diretor;
 }

    @Override
    public int getClassificao() {
        return (int) pegaMedia()/ 2;
    }//poder fazer a implementação.


    @Override
    public String toString() {  //Precisa começar com toString (toString foi reecristo para chamar cada um dos elementos)
        return "Filme: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}

