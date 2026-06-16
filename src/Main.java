import duke.projeto.estudos.calculos.Propriedades;
import duke.projeto.estudos.modelos.Item;
import duke.projeto.estudos.modelos.Sala;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Item itemAtual = new Item("Prism Key", 6);
        Sala salaAtual = new Sala("Gallery", 7);

        itemAtual.setPlayerHas(true);
        itemAtual.setRaridade("Raro");

        salaAtual.setCol(5);
        salaAtual.setRow(4);
        salaAtual.setPlayerIs(true);
        salaAtual.setRaridade("Raro");

        itemAtual.exibirPropriedades();
        salaAtual.exibirPropriedades();

        Propriedades propriedadesAtual = new Propriedades();
        propriedadesAtual.chamaNome(salaAtual);
        propriedadesAtual.chamaNome(itemAtual);

        propriedadesAtual.filtro(itemAtual);

        Item eightKey = new Item("Chave da Sala 8", 6767);
        Item wrench = new Item("Wrench", 3);

        eightKey.setRaridade("Comum");
        eightKey.setPlayerHas(false);

        wrench.setRaridade("Incomum");
        wrench.setPlayerHas(true);


        ArrayList<Item> listaDeItens = new ArrayList<>();
        listaDeItens.add(itemAtual);
        listaDeItens.add(eightKey);
        listaDeItens.add(wrench);

        System.out.println(listaDeItens.size());
        System.out.println(listaDeItens.get(0).getNome());
        System.out.println(listaDeItens.getFirst());

        Collections.sort(listaDeItens);
    }
}
