package duke.projeto.estudos.exceptions;

public class ExemploDeExceptionException extends RuntimeException {
    private final String mensagem;
    public ExemploDeExceptionException(String s) {
        this.mensagem = s;
    }

    public String getMensagem() {
        return mensagem;
    }
}
