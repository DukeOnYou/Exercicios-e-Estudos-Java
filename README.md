# Exercícios e Estudos Java

Exercícios e acompanhamento de código para meus estudos de Java.

## Estrutura

O código fonte está em `src/duke/projeto/estudos` e organizado em dois exercícios independentes, cada um separado por camada (entrada/organização, modelos, regras e infraestrutura).

### `colecionaveis`
Estudo de herança, polimorfismo e interfaces. Modela itens e salas de uma "mansão" em um jogo fictício.

- `app` — `Main` (ponto de entrada), `DemonstracaoColecionaveis` (executa e mostra o que foi criado) e `FabricaDeColecionaveis` (cria os objetos de exemplo).
- `modelos` — `Mansao` (classe base), `Item` e `Sala` (subclasses), `Inventario` (coleção de itens).
- `calculos` — `Avaliacao` (interface) e `Propriedades` (regras sobre os modelos).

### `consultafilmes`
Estudo de consumo de API REST (OMDb), parsing de JSON com Gson e gravação em arquivo.

- `app` — `MainComRequest` (ponto de entrada) e `ConsultaFilmesApp` (orquestra o loop de busca).
- `cliente` — `OmdbClient`, responsável por montar a URL e chamar a API.
- `arquivos` — `FilmeArquivoWriter`, responsável por salvar o resultado em `itens.json`.
- `modelos` — `Filme` e `FilmeRecord` (representação do filme retornado pela API).
- `exceptions` — `ExemploDeExceptionException`, lançada quando o ano retornado pela API tem um formato inesperado.

## Observações

- `itens.json` na raiz é apenas uma ferramenta didática gerada pelo `MainComRequest`.
- O projeto usa a biblioteca [Gson](https://github.com/google/gson) como dependência externa.
- A chave de API usada em `OmdbClient` está fixa no código apenas para fins de estudo; em um projeto real ela deveria vir de uma variável de ambiente ou arquivo de configuração fora do controle de versão.
