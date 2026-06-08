package duke.projeto.estudos.modelos;

public class Sala extends Mansao {
    private boolean playerIs;
    private int row;
    private int col;


    public void setRow(int row) {
        this.row = row;
    }
    public void setCol(int col) {
        this.col = col;
    }
    public void setPlayerIs(boolean playerIs) {
        this.playerIs = playerIs;
    }


    public int getRow() {
        return row;
    }
    public boolean isPlayerIs() {
        return playerIs;
    }
    public int getCol() {
        return col;
    }

    @Override
    public void exibirPropriedades() {
        System.out.println("Esta sala é a " + getNome() + "e tem raridade " + getRaridade() + ".");
    }
}
