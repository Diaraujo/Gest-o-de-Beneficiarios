package com.teste.testeEkan.serviceImpl;

import com.teste.testeEkan.model.Documento;
import com.teste.testeEkan.repository.DocumentoRepository;
import com.teste.testeEkan.service.DocumentoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@RequiredArgsConstructor
@Transactional
public class DocumentoServiceImpl implements DocumentoService {

    //Nota: o lombok faz a injeção de depencias exlcuindo a necessidade do uso do @AutoWired
    private final DocumentoRepository documentoRepository;

    @Override
    public List<Documento> listarDocumentosPorBeneficiario(Long beneficiarioId) {
        return documentoRepository.findByBeneficiarioId(beneficiarioId);
    }

    @Override
    public Documento cadastrarDoc(Documento documento) {
        return documentoRepository.save(documento);
    }


}
