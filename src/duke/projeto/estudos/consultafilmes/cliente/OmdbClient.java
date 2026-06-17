package duke.projeto.estudos.consultafilmes.cliente;

import com.google.gson.Gson;
import duke.projeto.estudos.consultafilmes.modelos.FilmeRecord;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class OmdbClient {

    private static final String API_KEY = "f73d1f14";
    private static final String BASE_URL = "https://www.omdbapi.com/";

    private final HttpClient httpClient = HttpClient.newHttpClient();
    private final Gson gson;

    public OmdbClient(Gson gson) {
        this.gson = gson;
    }

    public FilmeRecord buscarPorTitulo(String titulo) throws IOException, InterruptedException {
        String[] palavras = titulo.trim().toLowerCase().split(" ");
        String tituloFormatado = String.join("+", palavras);
        String endereco = BASE_URL + "?t=" + tituloFormatado + "&apikey=" + API_KEY;

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());

        return gson.fromJson(response.body(), FilmeRecord.class);
    }
}
