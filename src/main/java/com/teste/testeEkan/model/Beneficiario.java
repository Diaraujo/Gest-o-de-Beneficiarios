package com.teste.testeEkan.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.Date;

@Entity
@Table(name = "tb_beneficiario")
@Setter
@Getter
public class Beneficiario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @NotNull
    private String nome;

    @Column
    private String telefone;

    @Column
    private Date dataNascimento;

    @Column
    private Date dataInclusao;

    @Column
    private Date dataAtualização;


    
}
