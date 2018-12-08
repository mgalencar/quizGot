package br.com.senaijandira.quizgot.model;

public class Personagem {

    private int id_personagem;
    private String nome_personagem;
    private String genero;
    private String titulo;
    private String casa;
    private String reino;
    private String pergunta;
    private String foto;


    public int getId_personagem() {
        return id_personagem;
    }

    public void setId_personagem(int id_personagens) {
        this.id_personagem = id_personagens;
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

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
