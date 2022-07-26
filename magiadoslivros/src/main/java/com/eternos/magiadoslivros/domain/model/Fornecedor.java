package com.eternos.magiadoslivros.domain.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Fornecedor extends Pessoa {

    private String nomeFantasia;

    private String razaoSocial;

    private String cnpj;
    
    private String insEstadual;

    //incluirFornecedor()  void
    //atualizarFornecedor()  void
    //consultaFornecedor()  void
    //apagarFornecedor()  void
}
