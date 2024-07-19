package com.teste.testeEkan.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "tb_documento")
@Setter
@Getter
public class Documento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String tipoDocumento;

    @Column
    private String descricao;

    @Column
    private Date dataInclusao;

    @Column
    private Date dataAtualizacao;
    @ManyToOne
    private Beneficiario beneficiario;

}
