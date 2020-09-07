package br.com.bandtec.projetoindividual.demo;

public abstract class Personagem {

    private String nome;
    private Integer forca;
    private Integer inteligencia;
    private Integer stamina;
    private Integer mana;

    protected Personagem(String nome, Integer forca, Integer inteligencia, Integer stamina, Integer mana) {
        this.nome = nome;
        this.forca = forca;
        this.inteligencia = inteligencia;
        this.stamina = stamina;
        this.mana = mana;
    }

    public abstract Integer calcularPoder();

    public String getNome() {
        return nome;
    }

    public Integer getForca() {
        return forca;
    }

    public Integer getInteligencia() {
        return inteligencia;
    }

    public Integer getStamina() {
        return stamina;
    }

    public Integer getMana() {
        return mana;
    }
}
