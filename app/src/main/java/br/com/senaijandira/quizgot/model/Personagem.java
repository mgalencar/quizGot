package br.com.senaijandira.quizgot.model;

public class Personagem {

    private int id_personagens;
    private String nome_personagem;
    private String genero;
    private String titulo;
    private String casa;
    private String reino;


    public int getId_personagens() {
        return id_personagens;
    }
    public void setId_personagens(int id_personagens) {
        this.id_personagens = id_personagens;
    }
    public String getNome_personagem() {
        return nome_personagem;
    }
    public void setNome_personagem(String nome_personagem) {
        this.nome_personagem = nome_personagem;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getCasa() {
        return casa;
    }
    public void setCasa(String casa) {
        this.casa = casa;
    }
    public String getReino() {
        return reino;
    }
    public void setReino(String reino) {
        this.reino = reino;
    }
}
