package com.eternos.magiadoslivros.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

import org.springframework.data.annotation.Id;


@Entity
public class Pessoa {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Integer id;  
    @Column(name="endereco")
    protected String endereco; 
    @Column(name="email")
    protected String email; 
    @Column(name="telefone") 
    protected String telefone;  
    @Column(name="observacao")
    protected String observacao;
}
