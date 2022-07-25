package com.eternos.magiadoslivros.domain.service;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RelatorioDeEstoque {
    private Date dataInicio;
    private Date dataFim;

    //gerarRelatorio()  void

}
