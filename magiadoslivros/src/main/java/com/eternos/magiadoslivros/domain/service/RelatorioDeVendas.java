package com.eternos.magiadoslivros.domain.service;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RelatorioDeVendas {
    private Date dataInicio;
    private Date dataFim;

    //gerarRelatorio()  void
}
