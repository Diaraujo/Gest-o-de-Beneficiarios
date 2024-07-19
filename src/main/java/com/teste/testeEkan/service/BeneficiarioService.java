package com.teste.testeEkan.service;

import com.teste.testeEkan.model.Beneficiario;

import java.util.List;

public interface BeneficiarioService {

    List<Beneficiario> listarBeneficiarios();

    Beneficiario cadastrarBeneficiario(Beneficiario beneficiario);

    void removerBeneficiario(Long id);
}
