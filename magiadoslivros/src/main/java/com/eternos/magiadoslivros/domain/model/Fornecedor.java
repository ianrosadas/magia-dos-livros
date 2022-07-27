package com.eternos.magiadoslivros.domain.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
@Table(name = "fornecedor")
public class Fornecedor extends Pessoa {
  
    Fornecedor(Integer id, String endereco, String email, String telefone, String observacao) {
        super(id, endereco, email, telefone, observacao);
        //TODO Auto-generated constructor stub
    }

    @Column(name="nome_fantasia")
    private String nomeFantasia;

    @Column(name="razao_social", nullable = false)
    private String razaoSocial;

    @Column(name="cnpj", nullable = false)
    private String cnpj;

    @Column(name="ins_estadual", nullable = false)
    private String insEstadual;

    @Column(name="cpf", nullable = false)
    private String cpf;

    //incluirFornecedor()  void
    //atualizarFornecedor()  void
    //consultaFornecedor()  void
    //apagarFornecedor()  void
}
