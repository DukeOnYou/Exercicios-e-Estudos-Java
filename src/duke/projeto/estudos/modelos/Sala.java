package duke.projeto.estudos.modelos;

public class Sala extends Mansao {
    private boolean player_is;
    private int row;
    private int col;

    public void setRow(int row) {
        this.row = row;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public void setPlayer_is(boolean player_is) {
        this.player_is = player_is;
    }

    public int getRow() {
        return row;
    }

    public boolean isPlayer_is() {
        return player_is;
    }

    public int getCol() {
        return col;
    }

    @Override
    public void exibirPropriedades() {
        System.out.println("Esta sala é a " + getNome() + "e tem raridade " + getRaridade() + ".");
    }
}
