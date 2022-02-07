// Declaração de pacote
package br.com.caelum.certificacao;

// imports
import java.util.Date;

// Declaração da classe
class Pessoa {
    // conteúdo da classe
    String nome;
    String sobrenome;

    Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return this.nome + this.sobrenome;
    }
}