package com.eternos.magiadoslivros.domain.model;

import java.util.Date;

import lombok.Builder;
import lombok.Data;
import lombok.Builder.Default;

@Data
@Builder
public class Venda {
   private Integer idVenda;  
   private Double valorVenda;
   private String enderecoEntrega; 
   private String formaDePgto;
   private Integer parcelas;
   private Date dataVenda;
   private Date dataPagto; 
   private Date dataEntrega;
   @Default
   private Boolean vendaCancelada = false;

   public void cancelarVenda(){
        this.vendaCancelada = true;
   }
}
