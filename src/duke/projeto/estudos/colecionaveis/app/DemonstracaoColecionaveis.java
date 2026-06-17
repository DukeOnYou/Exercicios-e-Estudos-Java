package duke.projeto.estudos.colecionaveis.app;

import duke.projeto.estudos.colecionaveis.calculos.Propriedades;
import duke.projeto.estudos.colecionaveis.modelos.Inventario;
import duke.projeto.estudos.colecionaveis.modelos.Item;
import duke.projeto.estudos.colecionaveis.modelos.Sala;

public class DemonstracaoColecionaveis {

    public void executar() {
        Item itemAtual = FabricaDeColecionaveis.criarItem("Chave", 4, true,
                "Raro");
        Sala salaAtual = FabricaDeColecionaveis.criarSala("Gallery", 2, 4, 6,
                true, "Comum");

        itemAtual.exibirPropriedades();
        salaAtual.exibirPropriedades();

        Propriedades propriedades = new Propriedades();
        propriedades.chamaNome(salaAtual);
        propriedades.chamaNome(itemAtual);
        propriedades.filtro(itemAtual);

        Inventario inventario = new Inventario();
        inventario.adicionar(itemAtual);
        inventario.adicionar(FabricaDeColecionaveis.criarItem("Wrench", 6, true, "Incomum"));
        inventario.adicionar(FabricaDeColecionaveis.criarItem("Telescope", 9, false, "Padrão"));

        System.out.println(inventario.tamanho());
        System.out.println(inventario.primeiro().getNome());
        System.out.println(inventario.primeiro());

        inventario.ordenarPorNome();
    }
}
