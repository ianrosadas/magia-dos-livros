package com.eternos.magiadoslivros.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Livro {
    private Integer idLivro;
    private String tagEstoque;
    private String descricao;
    private String isbn;
    private Integer quantLivros;
    private Double valorRecebimento;
    private Double valorVenda;

    //incluirLivro()  void
    //atualizarLivro()  void
    //apagarLivro()  void
    //consultaLivro()  void
}
