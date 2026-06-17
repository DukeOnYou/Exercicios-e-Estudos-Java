package duke.projeto.estudos.colecionaveis.app;

import duke.projeto.estudos.colecionaveis.modelos.Item;
import duke.projeto.estudos.colecionaveis.modelos.Sala;

public class FabricaDeColecionaveis {

    public static Item criarItem(String nome, int id, boolean playerHas, String raridade) {
        Item item = new Item(nome, id);
        item.setPlayerHas(playerHas);
        item.setRaridade(raridade);
        return item;
    }

    public static Sala criarSala(String nome, int id, int col, int row,
                                 boolean playerIs, String raridade) {
        Sala sala = new Sala(nome, id);
        sala.setCol(col);
        sala.setRow(row);
        sala.setPlayerIs(playerIs);
        sala.setRaridade(raridade);
        return sala;
    }


}
