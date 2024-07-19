package com.teste.testeEkan.service;

import com.teste.testeEkan.model.Documento;

import java.util.List;

public interface DocumentoService {

    List<Documento> listarDocumentosPorBeneficiario(Long beneficiarioId);

    Documento cadastrarDoc(Documento documento);
}
