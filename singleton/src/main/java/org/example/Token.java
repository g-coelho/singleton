package org.example;

public class Token {
    private Token() {};
    private static final Token instance = new Token();
    public static Token getInstance() {
        return instance;
    }

    private String sequencia;

    public String getTokenSequencia() {
        return sequencia;
    }

    public void setTokenSequencia(String tokenSequencia) {
        this.sequencia = tokenSequencia;
    }

}

