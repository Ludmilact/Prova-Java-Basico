package Questao04;

public class Cavalo extends Animal{

    public void correr () {
        System.out.println("O cavalo está correndo!");
    }

    @Override
    public void emitirSom() {
        System.out.println("O cavalo está relinchando!");
    }
}
