package duke.projeto.estudos.modelos;

public class Item extends Mansao {
    private int quantidadeDeUsosNaSala;
    private boolean player_has;

    public void usosNaSala(int uso) {
        quantidadeDeUsosNaSala += uso;
    }

    public void setPlayer_has(boolean player_has) {
        this.player_has = player_has;
    }

    @Override
    public void exibirPropriedades() {
        System.out.println("Este item é o/a " + getNome() + "e tem raridade " + getRaridade() + ".");
    }
}
