package duke.projeto.estudos.colecionaveis.modelos;

import duke.projeto.estudos.colecionaveis.calculos.Avaliacao;

public class Mansao implements Avaliacao {
    private String nome;
    private int id;
    private String raridade;

    public Mansao(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    void exibirPropriedades() {
        System.out.println(nome + ", " + id + ", " + raridade + ".");
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setRaridade(String raridade) {
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
    public int avalia() {
        return 5;
    }
}
