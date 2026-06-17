package duke.projeto.estudos.consultafilmes.modelos;

import duke.projeto.estudos.consultafilmes.exceptions.ExemploDeExceptionException;

public class Filme {
    private String nome;
    private float runtime;
    private int year;

    public Filme(FilmeRecord fitaCassete) {
        this.nome = fitaCassete.title();
        this.runtime = Float.parseFloat(fitaCassete.runtime().substring(0, 3));
        if (fitaCassete.year().length() > 4) {
            throw new ExemploDeExceptionException("Não foi possível converter o ano devido ao tamanho da string.");
        }
        this.year = Integer.parseInt(fitaCassete.year());
    }

    public String getNome() {
        return nome;
    }
    public float getRuntime() {
        return runtime;
    }
    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "(" + this.getNome() + ", " + "ano - " + this.year +
                ", " + "duração - " + this.runtime;
    }
}
