package Questao04;

/*
Prova Técnica Java - Base.
Aluna: Ludmila Custódio Timóteo.
Data: 22/07/2022

Questão 04

Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e comportamentos (observe a tabela),
 utilize os seus conhecimentos e distribua as características de forma que tudo o que for comum a todos os animais
 fique na classe Animal:
 *imagem no arquivo*
 */
public abstract class Animal {

    private String nome = "";
    private int idade = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract void emitirSom();
}
