package duke.projeto.estudos.modelos;

import com.google.gson.annotations.SerializedName;
import duke.projeto.estudos.exceptions.ExemploDeExceptionException;
import duke.projeto.estudos.calculos.Avaliacao;

public class Mansao implements Avaliacao {
    private String nome;
    private int id;
    private String raridade;

    private float runtime;
    private int year;

    public Mansao(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public Mansao(MansaoRecord fitaCassete) {
        this.nome = fitaCassete.title();
        this.runtime = Float.parseFloat(fitaCassete.runtime().substring(0, 3));
        if (fitaCassete.year().length() > 4) {
            throw new ExemploDeExceptionException("Não foi possível converter o ano devido ao tamanho da string.");
        }
        this.year = Integer.parseInt(fitaCassete.year());
    }

    void exibirPropriedades() {
        System.out.println(nome + ", " + id + ", " + raridade + ".");

    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setId (int id) {
        this.id = id;
    }
    public void setRaridade (String raridade) {
        this.raridade = raridade;
    }


    public String getNome() {
        return nome;
    }
    public String getRaridade() {
        return raridade;
    }
    public int getId() {
        return id;
    }


    @Override
    public int avalia() { return 5; }

    @Override
    public String toString() {
        return "(" + this.getNome() + ", " + "ano - " + this.year +
                ", " + "duração - " + this.runtime;
    }
}
