package br.com.bandtec.projetoindividual.demo;

public class Orc extends Personagem{

    private String tribo;

    protected Orc(String nome, Integer forca, Integer inteligencia, Integer stamina, Integer mana, String tribo) {
        super(nome, forca, inteligencia, stamina, mana);
        this.tribo = tribo;
    }

    @Override
    public Integer calcularPoder() {
        Integer lvl = 0;

        lvl = (getForca() * (getStamina() + getInteligencia()));
        return lvl;
    }

    public String getTribo() {
        return tribo;
    }
}
