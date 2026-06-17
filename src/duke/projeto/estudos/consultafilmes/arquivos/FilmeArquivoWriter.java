package duke.projeto.estudos.consultafilmes.arquivos;

import com.google.gson.Gson;
import duke.projeto.estudos.consultafilmes.modelos.Filme;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FilmeArquivoWriter {

    private final Gson gson;
    private final String caminhoArquivo;

    public FilmeArquivoWriter(Gson gson, String caminhoArquivo) {
        this.gson = gson;
        this.caminhoArquivo = caminhoArquivo;
    }

    public void salvar(List<Filme> filmes) throws IOException {
        try (FileWriter writer = new FileWriter(caminhoArquivo)) {
            writer.write(gson.toJson(filmes));
        }
    }
}
