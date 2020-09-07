package br.com.bandtec.projetoindividual.demo;

public class Elfo extends Personagem {

    private String raca;

    protected Elfo(String nome, Integer forca, Integer inteligencia, Integer stamina, Integer mana, String raca) {
        super(nome, forca, inteligencia, stamina, mana);
        this.raca = raca;
    }

    @Override
    public Integer calcularPoder() {
        Integer lvl = 0;

        lvl = (getInteligencia() * (getMana() + getForca()));
        return lvl;
    }

    public String getRaca() {
        return raca;
    }
}
