package Questao04;

public class Cachorro extends Animal{

    public void correr() {
        System.out.println("O cachorro está correndo!");
    }

    @Override
    public void emitirSom() {
        System.out.println("AU-AU");
    }
}


