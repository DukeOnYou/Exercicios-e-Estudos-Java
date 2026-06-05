public class Main {
    public static void main(String[] args) {
        Item itemAtual = new Item();
        Sala salaAtual = new Sala();

        itemAtual.setNome("Prism Key");
        itemAtual.setId(6);
        itemAtual.setPlayer_has(true);
        itemAtual.setRaridade("Raro");

        salaAtual.setCol(5);
        salaAtual.setRow(4);
        salaAtual.setId(7);
        salaAtual.setNome("Gallery");
        salaAtual.setPlayer_is(true);
        salaAtual.setRaridade("Raro");

        itemAtual.exibirPropriedades();
        salaAtual.exibirPropriedades();
    }
}
