package duke.projeto.estudos.consultafilmes.app;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import duke.projeto.estudos.consultafilmes.cliente.OmdbClient;
import duke.projeto.estudos.consultafilmes.modelos.Filme;
import duke.projeto.estudos.consultafilmes.modelos.FilmeRecord;
import duke.projeto.estudos.consultafilmes.arquivos.FilmeArquivoWriter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultaFilmesApp {

    private static final String PALAVRA_DE_PARADA = "parar";

    public void executar() throws IOException, InterruptedException {
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        OmdbClient client = new OmdbClient(gson);
        FilmeArquivoWriter writer = new FilmeArquivoWriter(gson, "itens.json");
        List<Filme> filmes = new ArrayList<>();

        Scanner input = new Scanner(System.in);
        String busca = "";

        while (!busca.equalsIgnoreCase(PALAVRA_DE_PARADA)) {
            busca = input.nextLine();
            if (busca.equalsIgnoreCase(PALAVRA_DE_PARADA)) {
                break;
            }

            FilmeRecord filmeRecord = client.buscarPorTitulo(busca);
            System.out.println(filmeRecord);

            try {
                Filme filme = new Filme(filmeRecord);
                System.out.println(filme);
                filmes.add(filme);
            } catch (NumberFormatException e) {
                System.out.println("Deu algum erro!");
                System.out.println(e.getMessage());
            }
        }

        writer.salvar(filmes);
    }
}
