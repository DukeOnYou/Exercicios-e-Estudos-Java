package duke.projeto.estudos.modelos;

public class Item extends Mansao {
    private int quantidadeDeUsosNaSala;
    private boolean playerHas;

    public void usosNaSala(int uso) {
        quantidadeDeUsosNaSala += uso;
    }
    public void setPlayerHas(boolean playerHas) {
        this.playerHas = playerHas;
    }

    @Override
    public void exibirPropriedades() {
        System.out.println("Este item é o/a " + getNome() + "e tem raridade " + getRaridade() + ".");
    }
}
