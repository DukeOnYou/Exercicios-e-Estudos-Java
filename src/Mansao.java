public class Mansao {
    private String nome;
    private int id;
    private String raridade;


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

}
