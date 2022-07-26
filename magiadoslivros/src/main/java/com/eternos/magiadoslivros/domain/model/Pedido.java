package com.eternos.magiadoslivros.domain.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.Builder;
import lombok.Data;
import lombok.Builder.Default;

@Entity
@Table(name = "pedido")
@Data
@Builder
public class Pedido {
   @Id
   @Column(name="idVenda")
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer idVenda;
   @Column(name="valorVenda", nullable = false)  
   private Double valorVenda;
   @Column(name="enderecoEntrega")
   private String enderecoEntrega;
   @Column(name="formaDePgto") 
   private String formaDePgto;
   @Column(name="parcelas")
   private Integer parcelas;
   @Column(name="dataVenda")
   private Date dataVenda;
   @Column(name="dataPgto")
   private Date dataPgto;
   @Column(name="dataEntrega") 
   private Date dataEntrega;
   @Default
   private Boolean vendaCancelada = false;

   public void cancelarVenda(){
        this.vendaCancelada = true;
   }
}
