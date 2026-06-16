import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import duke.projeto.estudos.modelos.Mansao;
import duke.projeto.estudos.modelos.MansaoRecord;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainComRequest {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner input = new Scanner(System.in);
        String busca = "";
        List<Mansao> listaMansoes = new ArrayList<>();

        Gson gson = new GsonBuilder().
                setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!busca.equalsIgnoreCase("parar")) {
            busca = input.nextLine();
            if (busca.equalsIgnoreCase("parar")) {
                break;
            }

        /*
        String[] buscaFormatada = busca.trim().split(" ");
        String buscaFinal = "";


        for (int i = 0; i < buscaFormatada.length; i++) {
            buscaFinal += buscaFormatada[i];
            if (i != buscaFormatada.length - 1) {
                buscaFinal += "+";
            }
        }
        */

            String[] buscaFormatada = busca.trim().toLowerCase().split(" ");
            String buscaFinal = String.join("+", buscaFormatada);

            String endereco = "https://www.omdbapi.com/?t=" + buscaFinal + "&apikey=f73d1f14";


            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println(response.body());

            // Mansao resposta = gson.fromJson(response.body(), Mansao.class);
            MansaoRecord fitaCassete = gson.fromJson(response.body(), MansaoRecord.class);
            System.out.println(fitaCassete);

            try {
                Mansao umaMansao = new Mansao(fitaCassete);
                System.out.println(umaMansao);
                listaMansoes.add(umaMansao);
            } catch (NumberFormatException e) {
                System.out.println("Deu algum erro!");
                System.out.println(e.getMessage());
            }
        }
        FileWriter writer = new FileWriter("itens.json");
        writer.write(gson.toJson(listaMansoes));
        writer.close();
    }
}
