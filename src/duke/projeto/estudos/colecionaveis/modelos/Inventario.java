package duke.projeto.estudos.colecionaveis.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Inventario {
    private final List<Item> itens = new ArrayList<>();

    public void adicionar(Item item) {
        itens.add(item);
    }

    public int tamanho() {
        return itens.size();
    }

    public Item primeiro() {
        return itens.getFirst();
    }

    public void ordenarPorNome() {
        Collections.sort(itens);
    }
}
