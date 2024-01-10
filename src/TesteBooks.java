import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class TesteBooks  {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner busca = new Scanner(System.in);
        System.out.println("Busque o livro: ");

        var pesquisa = busca.nextLine();

        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + pesquisa + "&key=AIzaSyDgPK9Z2mX7AXw-YCjDRJSf6VIVGRlUGpM";

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
