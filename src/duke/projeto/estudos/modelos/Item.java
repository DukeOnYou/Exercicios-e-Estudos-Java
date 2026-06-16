package duke.projeto.estudos.modelos;

import java.util.Collections;

public class Item extends Mansao implements Comparable<Mansao> {
    private int quantidadeDeUsosNaSala;
    private boolean playerHas;

    public Item(String nome, int id) {
        super(nome, id);
    }

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

    @Override
    public int compareTo(Mansao o) {
        return this.getNome().compareTo(o.getNome());
    }
}
