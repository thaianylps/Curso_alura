import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.stream.LongStream;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("marvel");

        //meuFilme.setNome("marvel");
        meuFilme.setAnoDeLancamento(2000);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);
        System.out.println("Duração do Filme : " + meuFilme.getDuracaoEmMinutos());


        meuFilme.exibeFichaTecnica();//usa os parênteses vazios () porque não temos argumentos no Java, mesmo que uma função ou método não receba nenhuma informação, é necessário usar os parênteses tanto na declaração quanto na invocação/chamada.
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);


        System.out.println("Média de avaliação: " + meuFilme.pegaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.pegaMedia());
        //System.out.println("Total de avaliações: "  + meuFilme.getTotalDeAvaliacao());


        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodioPorTemporada(10);
        lost.setMinutosPorEpisidio(50);
        System.out.println("Duração para maratonar LOST : " + lost.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("Avatar");
        //outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);

        System.out.println("A soma entre os filmes é :  " + calculadora.getTempoTotal());


        Episodio primeiro = new Episodio();
        primeiro.setNumero(1);
        primeiro.setSerie(lost);
        primeiro.setTotalVisualizacoes(300);// vou parar por aqui que minha cabeça frita


        FiltroRecomendacao filtro  = new FiltroRecomendacao();
        filtro.filtra(outroFilme);
        filtro.filtra(primeiro);
        filtro.filtra(meuFilme);

        var filmeDaThay = new Filme("Rei leao");
        filmeDaThay.setDuracaoEmMinutos(200);
        //filmeDaThay.setNome("A fabrica de chocolate");
        filmeDaThay.setAnoDeLancamento(2000);
        filmeDaThay.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(filmeDaThay);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista " + listaDeFilmes.size());
        System.out.println("Nome do primeiro filme " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);
        System.out.println("tostring do  filme " + listaDeFilmes.get(0).toString());

        filmeDaThay.toString();

    }
}
