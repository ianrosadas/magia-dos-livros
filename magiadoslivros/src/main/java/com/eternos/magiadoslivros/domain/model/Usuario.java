package com.eternos.magiadoslivros.domain.model;

import java.util.Date;

import com.eternos.magiadoslivros.domain.model.Perfil;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Usuario {
    private String r;
    private Genero genero;
    private Perfil perfil;
    private Boolean doador;
    private Date dataDeNas;
    private Date dataDeCadastro;
    

    //incluirUsuario()  void
    //atualizarUsuario()  void
    //consultaUsuario()  void
    //apagarUsuario()  void
}
