package com.eternos.magiadoslivros.domain.model;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "fornecedor")
@Data
@Builder
public class Fornecedor extends Pessoa {
    @Column(name="nomeFantasia")
    private String nomeFantasia;

    @Column(name="razaoSocial")
    private String razaoSocial;

    @Column(name="cnpj")
    private String cnpj;

    @Column(name="insEstadual")
    private String insEstadual;

    //incluirFornecedor()  void
    //atualizarFornecedor()  void
    //consultaFornecedor()  void
    //apagarFornecedor()  void
}
