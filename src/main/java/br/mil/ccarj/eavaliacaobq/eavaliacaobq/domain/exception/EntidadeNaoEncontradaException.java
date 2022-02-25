package br.mil.ccarj.eavaliacaobq.eavaliacaobq.domain.exception;

public class EntidadeNaoEncontradaException extends RuntimeException {
    public EntidadeNaoEncontradaException(String msg){
        super(msg);
    }
}