package atividades;

public class ProgressaoAritmetica {
    int primeiroTermo=2;
    int razao=3;
    int termoAtual=this.primeiroTermo;

    public int proximoTermo() {
        int armazenamentoTermo = this.termoAtual;
        this.termoAtual += this.razao;
        return armazenamentoTermo;
    }
}