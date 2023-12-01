package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipaComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("marvel", 2000);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Avatar",2023);
        outroFilme.avalia(10);
        var filmeDaThay = new Filme("Rei leao",2000);
        filmeDaThay.avalia(15);
        Serie lost = new Serie("Lost",2000);

        Filme f1 = filmeDaThay;//treinar depois mudando aqui Um objeto novo só é criado com new. Nesta linha não tem new, então não foi criado nenhum objeto. 99% das vezes é assim.
//Isso são variáveis de referência, que é o que usamos para chegar até um objeto.
        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(filmeDaThay);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);
        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificao() >2) {//podemos nos deparar com esse tipo de codig legado
                System.out.println("Classificação " + filme.getClassificao());

            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Leo");
        buscaPorArtista.add("thay");
        buscaPorArtista.add("lucas");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);//metodo estatico
        System.out.println("Depois da ordenação ");
        System.out.println(buscaPorArtista);//ele vai ordenar
        System.out.println("Lista de titulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);
    }
}
//(collections)Ele ordenou os títulos em ordem alfabética. Não exibiu o nome da série, mas ele sabe que é a Lost. Então, nós conseguimos definir um critério para ordenação dos títulos.