package com.eternos.magiadoslivros.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;

@Entity
@Table(name = "livro")
@Data
@Builder
public class Livro {
    @Id
    @Column(name="idLivro")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idLivro;
    @Column(name="tagEstoque")
    private String tagEstoque;
    @Column(name="descricao")
    private String descricao;
    @Column(name="isbn")
    private String isbn;
    @Column(name="quantLivros")
    private Integer quantLivros;
    @Column(name="valorRecebimento")
    private Double valorRecebimento;
    @Column(name="valorVenda")
    private Double valorVenda;

    //incluirLivro()  void
    //atualizarLivro()  void
    //apagarLivro()  void
    //consultaLivro()  void
}
