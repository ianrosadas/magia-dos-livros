package com.eternos.magiadoslivros.domain.model;

public enum Genero {
    MASCULINO("Masculino"),
    FEMININO("Feminino"),
    HOMOSSEXUAL("Homossexual"),
    BISSEXUAL("Bissexual"),
    PANSSEXUAL("Panssexual"),
    TRANSSEXUAL("Transsexual"),
    INDEFINIDO("Indefinido");

    private String descricao;

    Genero (String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}